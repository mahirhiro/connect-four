package connectFour.controller;

import connectFour.model.GameBoard;
import connectFour.view.GamePanel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.Observable;
import java.util.Observer;

public class ButtonThreeAction extends AbstractAction implements Observer {

    private GameBoard board;
    private GamePanel panel;

    private int times = 6;

    public ButtonThreeAction(GameBoard board, GamePanel panel) {
        super("Column 3");
        this.board = board;
        this.panel = panel;
        panel.checkWinner();

    }

    @Override
    public void update(Observable o, Object arg) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Column 3");
        times--;
        board.setBoard(2);
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
