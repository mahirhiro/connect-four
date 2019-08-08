package connectFour.view;

import connectFour.model.Checker;
import connectFour.model.GameBoard;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.EventListener;
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
        String fileName = "production/production/connectFour/textures/Connect4Board.png";
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
        //drawCenteredCircle(g);
        paintCheckers(g);
        paintImage(g);
    }

    private void paintCheckers(Graphics g) {
        char[][] board = this.board.getBoard();
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                if (board[i][j] == 'X') {
                    g.setColor(Color.ORANGE);
                    g.fillOval(j*80, i*80, 60, 60);
                } else if (board[i][j] == 'O') {
                    g.setColor(Color.RED);
                    g.fillOval(j*80, i*80, 60, 60);
                }
                /* Swapping the 2d board dimensions will greatly improve this method. You will be able to break when
                * the top of a column has been reached, and the fillOval method will only need to be written once. */
            }
        }
    }

    public void drawCenteredCircle(Graphics g) {
        /* for (Checker checker: board.getCheckers()) {
            g.setColor(board.getCheckerColor());
            g.fillOval((int)checker.getX(), (int)checker.getY(), (int)checker.getWidth(), (int)checker.getHeight());
        }
         */
    }

    public void checkWinner() {
        if (board.boardRowChecker() || board.boardColumnChecker() || board.boardAscendingDiagonalCheck()) {
            JOptionPane.showMessageDialog(null, tips, "Game over", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    @Override
    public void update(Observable o, Object arg) {
        repaint();
    }
}
