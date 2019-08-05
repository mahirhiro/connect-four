package connectFour.controller;

import connectFour.model.GameBoard;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.Observable;
import java.util.Observer;

public class ButtonFiveAction extends AbstractAction implements Observer {

    private GameBoard board;

    public ButtonFiveAction(GameBoard board) {
        super("Column 5");
        this.board = board;

    }

    @Override
    public void update(Observable o, Object arg) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Column 5");

        int i = 5;
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
    }
}
