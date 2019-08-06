package connectFour.model;

import java.awt.*;
import java.util.*;
import java.util.List;

public class GameBoard extends Observable implements Observer {

    private boolean playerTurn;
    private char[][] board = new char[BOARD_HEIGHT][BOARD_WIDTH];
    private List<Checker> checkers = new ArrayList<>();

    private static final int BOARD_WIDTH = 7;
    private static final int BOARD_HEIGHT = 6;

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    private int row = 6;

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    private int col = -1;

    public GameBoard() {
        this.playerTurn = true; // Player begins by default... for now
    }

    public void setArrayPosition(int row, int col) {
        if (playerTurn) {
            board[row][col] = 'X';
        } else {
            board[row][col] = 'O';
        }
    }

    public void printAll() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(board[i][j]);

            }
            System.out.println();
        }
    }

    public char[][] getBoard() {
        return board;
    }

    /*  Do you ever start a game with checkers already in place?
    public GameBoard(List<Checker> checkers) {
        this.checkers = checkers;
    }  */

    /**
     * End a turn by flipping the boolean that represents whose turn it is.
     */
    public void endTurn() {
        this.playerTurn = !playerTurn;
    }

    /**
     * Get whether it is the player's turn.
     *
     * @return playerTurn which is true if it is the player's turn.
     */
    public boolean isPlayerTurnI() {
        return playerTurn;
    }

    public Color getCheckerColor() {
        if (this.playerTurn) {
            return Color.RED;
        }
        return Color.ORANGE;
    }

    public void setCheckerColor(Color checkerColor) {
        this.checkerColor = checkerColor;
    }

    private Color checkerColor = Color.BLACK;


    public void setBoard(char[][] board) {
        this.board = board;
    }

    public void addChecker(Checker checker) {
        checker.add(checker);
        refresh();
    }

    public void refresh() {
        setChanged();
        notifyObservers();
    }

    @Override
    public void update(Observable o, Object arg) {
        refresh();
    }

    public List<Checker> getCheckers() {
//        Checker c = new Checker();
//        this.checkers.add(c);
        return checkers;
    }

    private int count = 0;
    private int count2 = 0;

    //    public boolean boardRowChecker(){
//        for(int i = 5; i > 0; i--){
//            for (int j = 0; j < 7; j++){
//                if (board[i][j] == 'X') {
//                    count++;
//                }
//                else if (board[i][j] == 'O'){
//                    count2++;
//                }
//                else if (count == 4 || count2 == 4){
//                    return true;
//                }
//                else {
//                    count = 0;
//                    count2 = 0;
//                }
//            }
//        }
//        return false;
//    }
    public boolean boardRowChecker() {
        for (int i = 0; i < BOARD_HEIGHT; i++) {
            for (int j = 0; j < BOARD_WIDTH - 3; j++) {
                if (this.board[i][j] == 'X' && this.board[i][j + 1] == 'X' && this.board[i][j + 2] == 'X' && this.board[i][j + 3] == 'X') {
                    return true;
                } else if (this.board[i][j] == 'O' && this.board[i][j + 1] == 'O' && this.board[i][j + 2] == 'O' && this.board[i][j + 3] == 'O') {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean boardColumnChecker() {
        for (int j = 0; j < BOARD_WIDTH; j++) {
            for (int i = 0; i < BOARD_HEIGHT - 3; i++) {
                if (this.board[i][j] == 'X' && this.board[i + 1][j] == 'X' && this.board[i + 2][j] == 'X' && this.board[i + 3][j] == 'X') {
                    return true;
                } else if (this.board[i][j] == 'O' && this.board[i + 1][j] == 'O' && this.board[i + 2][j] == 'O' && this.board[i + 3][j] == 'O') {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean boardAscendingDiagonalCheck() {
        for (int i = 3; i < BOARD_WIDTH-1; i++) {
            for (int j = 0; j < BOARD_HEIGHT-3; j++) {
                if (this.board[i][j] == 'X' && this.board[i-1][j+1] == 'X' && this.board[i-2][j+2] == 'X' && this.board[i-3][j+3] == 'X')
                    return true;
                }
            }
        return false;
    }
}
