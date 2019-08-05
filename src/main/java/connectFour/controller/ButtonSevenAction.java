package connectFour.controller;

import connectFour.model.GameBoard;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.Observable;
import java.util.Observer;

public class ButtonSevenAction extends AbstractAction implements Observer {

    private GameBoard board;
    private int times = 6;

    public ButtonSevenAction(GameBoard board) {
        super("Column 7");
        this.board = board;

    }

    @Override
    public void update(Observable o, Object arg) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Column 7");

        int i = 5;
        times--;

        while(true){
            if (board.getBoard()[i][6] == 'X' || board.getBoard()[i][6] == 'O'){
                i--;
            } else{
                break;
            }
        }
        board.setArrayPosition(i,6);
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
