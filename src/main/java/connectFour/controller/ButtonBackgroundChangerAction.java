package connectFour.controller;

import connectFour.model.GameBoard;
import connectFour.view.GamePanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.Observable;
import java.util.Observer;

public class ButtonBackgroundChangerAction extends AbstractAction implements Observer {

    private GameBoard board;
    private GamePanel panel;
    private Color color;

    public ButtonBackgroundChangerAction(GameBoard board, GamePanel panel) {
        super("Change Background Color");
        this.board = board;
        this.panel = panel;
    }

    @Override
    public void update(Observable o, Object arg) {
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Changing background color");
        color = panel.askNewColor();
        board.setSbg(color);
    }

}
