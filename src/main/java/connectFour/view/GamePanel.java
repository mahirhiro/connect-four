package connectFour.view;

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
    private String option;
    private static final int WIDTH = 66;
    private static final int HEIGHT = 66;
    private static final int X_ADJUSTMENT = 17;
    private static final int Y_ADJUSTMENT = 8;

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
        paintCheckers(g);
        //drawCenteredCircle(g);
        paintImage(g);
    }

    private void paintCheckers(Graphics g) {
        char[][] board = this.board.getBoard();
        for (int i = 0; i < this.board.getBoardHeight(); i++) {
            for (int j = 0; j < this.board.getBoardWidth(); j++) {
                if (board[i][j] == 'X') {
                    option = "orange";
                    g.drawImage( getPicture(),j*90 + X_ADJUSTMENT, i*80 + Y_ADJUSTMENT, WIDTH, HEIGHT,null);
                } else if (board[i][j] == 'O') {
                    option = "red";
                    g.drawImage( getPicture(),j*90 + X_ADJUSTMENT, i*80 + Y_ADJUSTMENT, WIDTH, HEIGHT,null);
                }
                /* Swapping the 2d board dimensions will greatly improve this method. You will be able to break when
                * the top of a column has been reached, and the fillOval method will only need to be written once. */
            }
        }
    }

    private BufferedImage getPicture() {
        String fileName;
        if (option.equals("red")) {
            fileName = "production/production/connectFour/textures/red.png";
        } else {
            fileName = "production/production/connectFour/textures/orange.png";
        }
        BufferedImage texture = null;
        try {
            File imgFile = new File(fileName);
            texture = ImageIO.read(imgFile);
        } catch (IOException ioe) {
            System.err.println("Could not load " + fileName);
        }
        return texture;
    }

    public void drawCenteredCircle(Graphics g) {
        /* for (Checker checker: board.getCheckers()) {
            g.setColor(board.getCheckerColor());
            g.fillOval((int)checker.getX(), (int)checker.getY(), (int)checker.getWidth(), (int)checker.getHeight());
        }
         */
    }

    public void checkWinner() {
        if (board.boardRowChecker() || board.boardColumnChecker() || board.boardAscendingDiagonalCheck() || board.boardDecendingDiagonalCheck()) {
            JOptionPane.showMessageDialog(null, tips, "Game over", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    @Override
    public void update(Observable o, Object arg) {
        repaint();
    }
}
