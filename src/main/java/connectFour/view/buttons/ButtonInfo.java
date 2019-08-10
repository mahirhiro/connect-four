package connectFour.view.buttons;

import connectFour.controller.ButtonExitAction;
import connectFour.controller.ButtonFiveAction;
import connectFour.controller.ButtonInfoAction;
import connectFour.model.GameBoard;
import connectFour.view.GamePanel;

import javax.swing.*;
import java.awt.*;

public class ButtonInfo extends JMenuItem {
    private void setButtonProperties() {
        setPreferredSize(new Dimension(110, 27));
        setVerticalTextPosition(AbstractButton.CENTER);
        setHorizontalTextPosition(AbstractButton.CENTER);
        setToolTipText("Information");
    }

    public ButtonInfo(GamePanel panel){
        super(new ButtonInfoAction(panel));
        setButtonProperties();
    }
}
