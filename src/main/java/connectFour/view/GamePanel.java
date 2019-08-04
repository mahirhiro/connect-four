package connectFour.view;

import connectFour.model.Board;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Observable;
import java.util.Observer;

public class GamePanel extends JPanel implements Observer {

    public GamePanel(Board board) {
        board.addObserver(this);

        setVisible(true);
        setOpaque(true);
    }

    public GamePanel() {
    }

    @Override
    public void update(Observable o, Object arg) {
        repaint();
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
        paintImage(g);

    }

}
