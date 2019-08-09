package connectFour.controller;

import connectFour.model.GameBoard;
import connectFour.view.GamePanel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.Observable;
import java.util.Observer;

public class ButtonTwoAction extends AbstractAction implements Observer {

    private GameBoard board;
    private GamePanel panel;

    private int times = 6;

    public ButtonTwoAction(GameBoard board, GamePanel panel) {
        super("Column 2");
        this.board = board;
        this.panel = panel;

    }

    @Override
    public void update(Observable o, Object arg) {
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Column 6");
        times--;
        board.setBoard(1);
        board.printAll();
        board.endTurn();
        fixEnabled();
        panel.checkWinner();
    }

    private void fixEnabled(){
        if (times == 0){
            setEnabled(false);
        } else{
            setEnabled(true);
        }
    }
}
