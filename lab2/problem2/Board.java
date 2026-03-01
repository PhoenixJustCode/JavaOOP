package lab2.problem2;

public class Board {
    private Piece[][] grid;

    public Board() {
        grid = new Piece[9][9];
    }

    public void setPiece(Piece p) {
        Position pos = p.getPosition();
        grid[pos.getRow()][pos.getCol() - 'a' + 1] = p;
    }

    public boolean movePiece(Position from, Position to) {
        Piece p = grid[from.getRow()][from.getCol() - 'a' + 1];
        if (p != null && p.isLegalMove(to)) {
            grid[to.getRow()][to.getCol() - 'a' + 1] = p;
            grid[from.getRow()][from.getCol() - 'a' + 1] = null;
            p.move(to);
            return true;
        }
        return false;
    }

    public void display() {
        System.out.println("  a b c d e f g h");
        for (int r = 8; r >= 1; r--) {
            System.out.print(r + " ");
            for (int c = 1; c <= 8; c++) {
                Piece p = grid[r][c];
                if (p == null) System.out.print(". ");
                else System.out.print(p + " ");
            }
            System.out.println(r);
        }
        System.out.println("  a b c d e f g h");
    }
}
