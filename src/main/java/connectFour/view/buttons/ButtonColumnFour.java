package connectFour.view.buttons;

import connectFour.controller.ButtonFourAction;
import connectFour.model.GameBoard;
import connectFour.view.GamePanel;

import javax.swing.*;
import java.awt.*;

public class ButtonColumnFour extends JMenuItem {
    private void setButtonProperties() {
        setPreferredSize(new Dimension(110, 27));
        setVerticalTextPosition(AbstractButton.CENTER);
        setHorizontalTextPosition(AbstractButton.CENTER);
        setToolTipText("Column 4");
    }

    public ButtonColumnFour(GameBoard board, GamePanel panel){
        super(new ButtonFourAction(board,panel));
        setButtonProperties();
    }
}
