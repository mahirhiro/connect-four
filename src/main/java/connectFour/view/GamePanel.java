package connectFour.view;

import connectFour.model.Checker;
import connectFour.model.GameBoard;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Observable;
import java.util.Observer;

public class GamePanel extends JPanel implements Observer {

    private GameBoard board;
    public JLabel checkerLabel = null;

    private String tips = ("Winner winner chicken dinner!");

    public GamePanel(GameBoard board) {
        board.addObserver(this);
        this.board = board;
        setVisible(true);
        setOpaque(true);
        setBackground(new Color(0,0,128));
        board.printAll();
        board.boardRowChecker();
    }

    public GamePanel() {

    }

    /* painting the background image */

    private void paintImage(Graphics g){
        BufferedImage texture = null;
        String fileName = "target/production/connectFour/Connect4Board.png";
        try {
            File imgFile = new File(fileName);
            texture = ImageIO.read(imgFile);
        } catch (IOException ioe) {
            System.err.println("Could not load " + fileName);
        }
        g.drawImage(texture, 0, 0, null);
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        drawCenteredCircle(g);
        paintImage(g);

    }
    public void drawCenteredCircle(Graphics g) {
        for (Checker checker: board.getCheckers()) {
            g.setColor(board.getCheckerColor());
            g.fillOval((int)checker.getX(), (int)checker.getY(), (int)checker.getWidth(), (int)checker.getHeight());
        }
    }

    public void checkWinner(){
        if (board.boardRowChecker()){
            JOptionPane.showMessageDialog(null,tips,"Game over",JOptionPane.INFORMATION_MESSAGE);
        }else if(board.boardColumnChecker()){
            JOptionPane.showMessageDialog(null,tips,"Game over",JOptionPane.INFORMATION_MESSAGE);
        }
    }


    @Override
    public void update(Observable o, Object arg) {
        repaint();
    }
}
