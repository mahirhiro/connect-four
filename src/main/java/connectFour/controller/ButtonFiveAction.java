package connectFour.controller;

import connectFour.model.GameBoard;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.Observable;
import java.util.Observer;

public class ButtonFiveAction extends AbstractAction implements Observer {

    private GameBoard board;
    private int times = 6;

    public ButtonFiveAction(GameBoard board) {
        super("Column 5");
        this.board = board;
    }

    @Override
    public void update(Observable o, Object arg) {
        fixEnabled();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Column 5");

        int i = 5;
        times--;

        while(true){
            if (board.getBoard()[i][4] == 'X' || board.getBoard()[i][4] == 'O'){
                i--;
            } else{
                break;
            }
        }
        board.setArrayPosition(i,4);
        board.printAll();
        board.endTurn();
        fixEnabled();
    }
    private void fixEnabled(){
        if (times == 0){
            setEnabled(false);
        } else{
            setEnabled(true);
        }
    }
}
