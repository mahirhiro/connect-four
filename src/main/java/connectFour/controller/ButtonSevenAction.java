package connectFour.controller;

import connectFour.model.GameBoard;
import connectFour.view.GamePanel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.Observable;
import java.util.Observer;

public class ButtonSevenAction extends AbstractAction implements Observer {

    private GameBoard board;
    private GamePanel panel;
    private int times = 6;

    public ButtonSevenAction(GameBoard board, GamePanel panel) {
        super("Column 7");
        this.board = board;
        this.panel = panel;
        panel.checkWinner();

    }

    @Override
    public void update(Observable o, Object arg) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Column 7");

        times--;
        board.setBoard(6);
        board.printAll();
        board.endTurn();
        fixEnabled();
        board.boardRowChecker();
        panel.playMusic("coinDrop");
        if(panel.checkWinner()){
            panel.setMessage(panel.getMessage()+board.getCheckerColor()+ " won the game!");
            panel.messageDisplay();
        }
        if(times == 0){
            board.drawChecker(1);
        }
    }

    private void fixEnabled(){
        if (times == 0){
            setEnabled(false);
        } else{
            setEnabled(true);
        }
    }
}
