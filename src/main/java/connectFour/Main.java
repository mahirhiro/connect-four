package connectFour;

import connectFour.view.GameFrame;
import javax.swing.*;


class Main {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, UnsupportedLookAndFeelException, InstantiationException {
        UIManager.setLookAndFeel(
                UIManager.getCrossPlatformLookAndFeelClassName());
        new GameFrame();
    }
}
