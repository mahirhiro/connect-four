package connectFour.view.buttons;

import connectFour.controller.ButtonExitAction;

import javax.swing.*;
import java.awt.*;

public class ButtonExit extends JMenuItem {
    private void setButtonProperties() {
        setPreferredSize(new Dimension(110, 27));
        setVerticalTextPosition(AbstractButton.CENTER);
        setHorizontalTextPosition(AbstractButton.CENTER);
        setToolTipText("Exit");
    }

    public ButtonExit(){
        super(new ButtonExitAction());
        setButtonProperties();
    }
}
