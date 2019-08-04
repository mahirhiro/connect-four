package connectFour.view.buttons;

import javax.swing.*;
import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class ButtonColumnOne extends JMenuItem {
    private void setButtonProperties() {
        setPreferredSize(new Dimension(110, 27));
        setVerticalTextPosition(AbstractButton.CENTER);
        setHorizontalTextPosition(AbstractButton.CENTER);
        setToolTipText("Add a vertex");
    }

    public ButtonColumnOne(){
        super("Button1");
        setButtonProperties();
    }
}
