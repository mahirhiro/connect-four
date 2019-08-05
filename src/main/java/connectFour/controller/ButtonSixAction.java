package connectFour.controller;

import connectFour.model.GameBoard;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.Observable;
import java.util.Observer;

public class ButtonSixAction extends AbstractAction implements Observer {

    private GameBoard board;
    private int times = 6;

    public ButtonSixAction(GameBoard board) {
        super("Column 6");
        this.board = board;

    }

    @Override
    public void update(Observable o, Object arg) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Column 6");

        int i = 5;
        times--;

        while(true){
            if (board.getBoard()[i][5] == 'X' || board.getBoard()[i][5] == 'O'){
                i--;
            } else{
                break;
            }
        }
        board.setArrayPosition(i,5);
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
