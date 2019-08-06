package connectFour.view.buttons;

import connectFour.controller.ButtonSixAction;
import connectFour.model.GameBoard;
import connectFour.view.GamePanel;

import javax.swing.*;
import java.awt.*;

public class ButtonColumnSix extends JMenuItem {
    private void setButtonProperties() {
        setPreferredSize(new Dimension(110, 27));
        setVerticalTextPosition(AbstractButton.CENTER);
        setHorizontalTextPosition(AbstractButton.CENTER);
        setToolTipText("Add a vertex");
    }

    public ButtonColumnSix(GameBoard board, GamePanel panel){
        super(new ButtonSixAction(board,panel));
        setButtonProperties();
    }
}
