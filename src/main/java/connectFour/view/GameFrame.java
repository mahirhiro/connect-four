package connectFour.view;

import connectFour.model.Board;
import connectFour.view.buttons.*;

import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame{

    public GameFrame() {

        JToolBar jtb = new JToolBar();
        jtb.setFloatable(false);
        jtb.setRollover(true);
        jtb.add(new ButtonColumnOne());

        for(int i = 0; i < 6; i++){
            jtb.add(new ButtonColumnOne());
        }

        Board board = new Board();
        GamePanel panel = new GamePanel(board);
        /* adding the buttons for the toolbar */
        this.add(jtb,BorderLayout.PAGE_START);
        this.getContentPane().add(panel);

        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setPreferredSize(new Dimension(640, 530));
        this.setResizable(true);
        this.pack();
        this.setLocationRelativeTo (null); // Center on screen.
        this.setVisible(true);
    }


}
