package connectFour.view.buttons;

import connectFour.controller.ButtonTwoAction;
import connectFour.model.GameBoard;
import connectFour.view.GamePanel;

import javax.swing.*;
import java.awt.*;

public class ButtonColumnTwo extends JMenuItem {
    private void setButtonProperties() {
        setPreferredSize(new Dimension(110, 27));
        setVerticalTextPosition(AbstractButton.CENTER);
        setHorizontalTextPosition(AbstractButton.CENTER);
        setToolTipText("Column 2");
    }

    public ButtonColumnTwo(GameBoard board, GamePanel panel){
        super(new ButtonTwoAction(board,panel));
        setButtonProperties();
    }
}
