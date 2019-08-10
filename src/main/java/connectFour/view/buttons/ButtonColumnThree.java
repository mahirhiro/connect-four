package connectFour.view.buttons;

import connectFour.controller.ButtonThreeAction;
import connectFour.model.GameBoard;
import connectFour.view.GamePanel;

import javax.swing.*;
import java.awt.*;

public class ButtonColumnThree extends JMenuItem {
    private void setButtonProperties() {
        setPreferredSize(new Dimension(110, 27));
        setVerticalTextPosition(AbstractButton.CENTER);
        setHorizontalTextPosition(AbstractButton.CENTER);
        setToolTipText("Column 3");
    }

    public ButtonColumnThree(GameBoard board, GamePanel panel){
        super(new ButtonThreeAction(board,panel));
        setButtonProperties();
    }
}
