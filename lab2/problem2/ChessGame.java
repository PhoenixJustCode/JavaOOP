// Run: javac lab2/problem2/*.java && java lab2.problem2.ChessGame
package lab2.problem2;

public class ChessGame {
    public static void main(String[] args) {
        Board board = new Board();
        
        board.setPiece(new Rook(new Position('a', 1)));
        board.setPiece(new Knight(new Position('b', 1)));
        board.setPiece(new Bishop(new Position('c', 1)));
        board.setPiece(new Queen(new Position('d', 1)));
        board.setPiece(new King(new Position('e', 1)));
        board.setPiece(new Pawn(new Position('a', 2)));

        System.out.println("Initial Board:");
        board.display();

        System.out.println("\nMoving Pawn to a3...");
        if (board.movePiece(new Position('a', 2), new Position('a', 3))) {
            System.out.println("Move successful!");
        } else {
            System.out.println("Invalid move!");
        }
        board.display();

        System.out.println("\nTrying illegal move for Rook to b2...");
        if (board.movePiece(new Position('a', 1), new Position('b', 2))) {
            System.out.println("Move successful!");
        } else {
            System.out.println("Invalid move!");
        }
        board.display();
    }
}
