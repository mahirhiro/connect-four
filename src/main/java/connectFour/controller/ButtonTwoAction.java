package connectFour.controller;

import connectFour.model.GameBoard;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.Observable;
import java.util.Observer;

public class ButtonTwoAction extends AbstractAction implements Observer {

    private GameBoard board;

    public ButtonTwoAction(GameBoard board) {
        super("Column 2");
        this.board = board;

    }

    @Override
    public void update(Observable o, Object arg) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Column 6");

        int i = 5;
        while(true){
            if (board.getBoard()[i][1] == 'X' || board.getBoard()[i][1] == 'O'){
                i--;
            } else{
                break;
            }
        }
        board.setArrayPosition(i,1);
        board.printAll();
        board.endTurn();
    }
}
