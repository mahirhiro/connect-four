package connectFour.view.buttons;

import connectFour.controller.ButtonTwoAction;
import connectFour.model.GameBoard;

import javax.swing.*;
import java.awt.*;

public class ButtonColumnTwo extends JMenuItem {
    private void setButtonProperties() {
        setPreferredSize(new Dimension(110, 27));
        setVerticalTextPosition(AbstractButton.CENTER);
        setHorizontalTextPosition(AbstractButton.CENTER);
        setToolTipText("Add a vertex");
    }

    public ButtonColumnTwo(GameBoard board){
        super(new ButtonTwoAction(board));
        setButtonProperties();
    }
}
