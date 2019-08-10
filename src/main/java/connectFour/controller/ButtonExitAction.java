package connectFour.controller;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.Observable;
import java.util.Observer;

public class ButtonExitAction extends AbstractAction implements Observer {

    public ButtonExitAction() {
        super("Exit");
    }

    @Override
    public void update(Observable o, Object arg) {
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Quit");
        System.exit(0);
    }

}
