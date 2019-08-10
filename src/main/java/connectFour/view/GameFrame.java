package connectFour.view;

import connectFour.model.Checker;
import connectFour.model.GameBoard;
import connectFour.view.buttons.*;

import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame{

    public GameFrame() {

        JToolBar jtb = new JToolBar();
        JMenuBar jmb = new JMenuBar();
        jtb.setFloatable(false);
        jtb.setRollover(true);

        GameBoard board = new GameBoard();
        GamePanel panel = new GamePanel(board);

        JMenu file = new JMenu("File");
        JMenu about = new JMenu("About");

        file.add(new ButtonBackgroundChanger(board,panel));
        file.add(new ButtonExit());
        about.add(new ButtonInfo(panel));
        jmb.add(file);
        jmb.add(about);

        jtb.add(new ButtonColumnOne(board,panel));
        jtb.add(new ButtonColumnTwo(board,panel));
        jtb.add(new ButtonColumnThree(board,panel));
        jtb.add(new ButtonColumnFour(board,panel));
        jtb.add(new ButtonColumnFive(board,panel));
        jtb.add(new ButtonColumnSix(board,panel));
        jtb.add(new ButtonColumnSeven(board,panel));


        /* adding the buttons for the toolbar */
        this.add(jtb,BorderLayout.PAGE_START);
        this.setJMenuBar(jmb);
        this.getContentPane().add(panel);
        this.setTitle("CONNECT 4");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setPreferredSize(new Dimension(722, 683));
        this.setResizable(true);
        this.pack();
        this.setResizable(false);
        this.setLocationRelativeTo (null); // Center on screen.
        this.setVisible(true);
    }


}
