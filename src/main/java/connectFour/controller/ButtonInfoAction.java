package connectFour.controller;

import connectFour.view.GamePanel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.Observable;
import java.util.Observer;

public class ButtonInfoAction extends AbstractAction implements Observer {
    private GamePanel panel;
    public ButtonInfoAction(GamePanel panel) {
        super("Objective");
        this.panel = panel;
    }

    @Override
    public void update(Observable o, Object arg) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        panel.displayInformation();
    }
}
