package connectFour.view.buttons;

import connectFour.controller.ButtonSevenAction;
import connectFour.model.GameBoard;
import connectFour.view.GamePanel;

import javax.swing.*;
import java.awt.*;

public class ButtonColumnSeven extends JMenuItem {
    private void setButtonProperties() {
        setPreferredSize(new Dimension(110, 27));
        setVerticalTextPosition(AbstractButton.CENTER);
        setHorizontalTextPosition(AbstractButton.CENTER);
        setToolTipText("Column 7");
    }

    public ButtonColumnSeven(GameBoard board, GamePanel panel){
        super(new ButtonSevenAction(board,panel));
        setButtonProperties();
    }
}
