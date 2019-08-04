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

    public GamePanel(GameBoard board) {
        board.addObserver(this);

        setVisible(true);
        setOpaque(true);
        setBackground(new Color(0,0,128));
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

      //  for (Checker checker: board.getCheckers()) {
            g.setColor(Color.red);
            g.fillOval(103, 85, 75, 75);
       // }
    }


    @Override
    public void update(Observable o, Object arg) {
        repaint();
    }
}
