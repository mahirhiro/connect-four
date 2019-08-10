package connectFour.view.buttons;

import connectFour.controller.ButtonBackgroundChangerAction;
import connectFour.controller.ButtonExitAction;
import connectFour.controller.ButtonFiveAction;
import connectFour.model.GameBoard;
import connectFour.view.GamePanel;

import javax.swing.*;
import java.awt.*;

public class ButtonBackgroundChanger extends JMenuItem {
    private void setButtonProperties() {
        setPreferredSize(new Dimension(170, 27));
        setVerticalTextPosition(AbstractButton.CENTER);
        setHorizontalTextPosition(AbstractButton.CENTER);
        setToolTipText("Color changer");
    }

    public ButtonBackgroundChanger(GameBoard board,GamePanel panel){
        super(new ButtonBackgroundChangerAction(board,panel));
        setButtonProperties();
    }
}
