package connectFour.view.buttons;

import connectFour.controller.ButtonOneAction;
import connectFour.model.GameBoard;
import connectFour.view.GamePanel;

import javax.swing.*;
import java.awt.*;

public class ButtonColumnOne extends JMenuItem {
    private void setButtonProperties() {
        setPreferredSize(new Dimension(110, 27));
        setVerticalTextPosition(AbstractButton.CENTER);
        setHorizontalTextPosition(AbstractButton.CENTER);
        setToolTipText("Column 1");
    }

    public ButtonColumnOne(GameBoard board, GamePanel panel){
        super(new ButtonOneAction(board,panel));
        setButtonProperties();
    }
}
