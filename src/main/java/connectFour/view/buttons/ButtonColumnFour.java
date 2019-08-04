package connectFour.view.buttons;

import connectFour.controller.ButtonFourAction;
import connectFour.model.GameBoard;

import javax.swing.*;
import java.awt.*;

public class ButtonColumnFour extends JMenuItem {
    private void setButtonProperties() {
        setPreferredSize(new Dimension(110, 27));
        setVerticalTextPosition(AbstractButton.CENTER);
        setHorizontalTextPosition(AbstractButton.CENTER);
        setToolTipText("Add a vertex");
    }

    public ButtonColumnFour(GameBoard board){
        super(new ButtonFourAction(board));
        setButtonProperties();
    }
}
