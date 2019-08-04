package connectFour.model;

import java.awt.*;
import java.util.Observable;
import java.util.Observer;

public class GameBoard extends Observable implements Observer {

    public Color getCheckerColor() {
        return checkerColor;
    }

    public void setCheckerColor(Color checkerColor) {
        this.checkerColor = checkerColor;
    }

    private Color checkerColor = Color.BLACK;

    public char[][] getBoard() {
        return board;
    }

    public void setBoard(char[][] board) {
        this.board = board;
    }

    private char[][] board = new char[6][7];

    public GameBoard() {
        for (int i = 0; i < 6; i++){
            for(int j = 0; j < 7; j++){
                System.out.println();
            }
        }
    }

    @Override
    public void update(Observable o, Object arg) {

    }
}
