package connectFour.view;

import connectFour.model.GameBoard;
import connectFour.view.buttons.*;

import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame{

    public GameFrame() {

        JToolBar jtb = new JToolBar();
        jtb.setFloatable(false);
        jtb.setRollover(true);

        GameBoard board = new GameBoard();
        GamePanel panel = new GamePanel(board);

        jtb.add(new ButtonColumnOne(board));
        jtb.add(new ButtonColumnTwo(board));
        jtb.add(new ButtonColumnThree(board));
        jtb.add(new ButtonColumnFour(board));
        jtb.add(new ButtonColumnFive(board));
        jtb.add(new ButtonColumnSix(board));
        jtb.add(new ButtonColumnSeven(board));


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
