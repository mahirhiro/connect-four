package connectFour.controller;

import connectFour.model.GameBoard;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.Observable;
import java.util.Observer;

public class ButtonThreeAction extends AbstractAction implements Observer {

    private GameBoard board;

    public ButtonThreeAction(GameBoard board) {
        super("Column 3");
        this.board = board;

    }

    @Override
    public void update(Observable o, Object arg) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Column 3");
    }
}
