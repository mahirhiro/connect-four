package connectFour.view.buttons;

import connectFour.controller.ButtonSevenAction;
import connectFour.model.GameBoard;

import javax.swing.*;
import java.awt.*;

public class ButtonColumnSeven extends JMenuItem {
    private void setButtonProperties() {
        setPreferredSize(new Dimension(110, 27));
        setVerticalTextPosition(AbstractButton.CENTER);
        setHorizontalTextPosition(AbstractButton.CENTER);
        setToolTipText("Add a vertex");
    }

    public ButtonColumnSeven(GameBoard board){
        super(new ButtonSevenAction(board));
        setButtonProperties();
    }
}
