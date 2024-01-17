import tictac.model.Board;
import tictac.model.Player;
import tictac.model.PlayingPiece;
import tictac.model.PlayingPieceO;
import tictac.model.PlayingPieceX;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TicTacToeGame{
        private Board board;
        private List<Player> players;
        private Player currentPlayer;

        public TicTacToeGame(List<Player> players, int boardSize) {
            this.board = new Board(boardSize);
            this.players = new ArrayList<Player>(players);
            this.currentPlayer = players.get(0);
        }

        public void play() {
            boolean gameWon = false;

            while (!gameWon) {
                printBoard();
                makeMove();

                gameWon = isGameWon();
                if (!gameWon && isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    break;
                }
                if(!gameWon){
                    switchPlayer();
                }
            }

            printBoard();
            System.out.println(currentPlayer.getName() + " wins!");
        }

        private void printBoard() {
            System.out.println("-------------");
            for (int i = 0; i < board.getBoardSize(); i++) {
                System.out.print("| ");
                for (int j = 0; j < board.getBoardSize(); j++) {
                    PlayingPiece piece = board.getPiece(i, j);
                    System.out.print((piece != null ? piece.playingPieceType : ' ') + " | ");
                }
                System.out.println();
                System.out.println("-------------");
            }
        }

        private void makeMove() {
            Scanner scanner = new Scanner(System.in);

            System.out.println(currentPlayer.getName() + "'s turn");
            System.out.print("Enter row (0 to " + (board.getBoardSize() - 1) + "): ");
            int row = scanner.nextInt();

            System.out.print("Enter column (0 to " + (board.getBoardSize() - 1) + "): ");
            int col = scanner.nextInt();

            board.placePiece(currentPlayer.getPlayingPiece(), row, col);
        }

        private boolean isGameWon() {
            PlayingPiece piece = currentPlayer.getPlayingPiece();

            // Check rows, columns, and diagonals for a win
            for (int i = 0; i < board.getBoardSize(); i++) {
                if ((board.getPiece(i, 0) == piece &&
                        board.getPiece(i, 1) == piece &&
                        board.getPiece(i, 2) == piece) ||
                        (board.getPiece(0, i) == piece &&
                                board.getPiece(1, i) == piece &&
                                board.getPiece(2, i) == piece)) {
                    return true;
                }
            }

            return (board.getPiece(0, 0) == piece &&
                    board.getPiece(1, 1) == piece &&
                    board.getPiece(2, 2) == piece) ||
                    (board.getPiece(0, 2) == piece &&
                            board.getPiece(1, 1) == piece &&
                            board.getPiece(2, 0) == piece);
        }

        private boolean isBoardFull() {
            for (int i = 0; i < board.getBoardSize(); i++) {
                for (int j = 0; j < board.getBoardSize(); j++) {
                    if (board.getPiece(i, j) == null) {
                        return false;
                    }
                }
            }
            return true;
        }

        private void switchPlayer() {
            int currentPlayerIndex = players.indexOf(currentPlayer);
            currentPlayer = players.get((currentPlayerIndex + 1) % players.size());
        }

        public static void main(String[] args) {
            List<Player> players = new ArrayList<Player>();
            players.add(new Player("Player 1", new PlayingPieceX()));
            players.add(new Player("Player 2", new PlayingPieceO()));

            TicTacToeGame game = new TicTacToeGame(players, 3); // You can set the board size here
            game.play();
        }


}