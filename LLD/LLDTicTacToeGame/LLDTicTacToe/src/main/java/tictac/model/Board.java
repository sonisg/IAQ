package tictac.model;

public class Board {

    public PlayingPiece[][] grid;

    public Board(int size) {
        if (size < 3) {
            throw new IllegalArgumentException("Board size must be at least 3x3");
        }

        grid = new PlayingPiece[size][size];
        initializeBoard();
    }

    public void placePiece(PlayingPiece piece, int row, int col) {
        if (isValidMove(row, col)) {
            grid[row][col] = piece;
        }
    }

    public PlayingPiece getPiece(int row, int col) {
        return grid[row][col];
    }

    private boolean isValidMove(int row, int col) {
        return row >= 0 && row < grid.length && col >= 0 && col < grid[0].length && grid[row][col] == null;
    }

    private void initializeBoard() {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                grid[i][j] = null;
            }
        }
    }

    public int getBoardSize() {
        return grid.length;
    }





    }


