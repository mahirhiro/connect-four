package connectFour.view.buttons;

import connectFour.controller.ButtonFiveAction;
import connectFour.controller.ButtonOneAction;
import connectFour.model.GameBoard;

import javax.swing.*;
import java.awt.*;

public class ButtonColumnFive extends JMenuItem {
    private void setButtonProperties() {
        setPreferredSize(new Dimension(110, 27));
        setVerticalTextPosition(AbstractButton.CENTER);
        setHorizontalTextPosition(AbstractButton.CENTER);
        setToolTipText("Add a vertex");
    }

    public ButtonColumnFive(GameBoard board){
        super(new ButtonFiveAction(board));
        setButtonProperties();
    }
}
