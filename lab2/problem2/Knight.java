package lab2.problem2;

public class Knight extends Piece {
    public Knight(Position pos) {
        super(pos);
    }

    @Override
    public boolean isLegalMove(Position b) {
        if (!b.isValid()) return false;
        int rowDiff = Math.abs(pos.getRow() - b.getRow());
        int colDiff = Math.abs(pos.getCol() - b.getCol());
        return (rowDiff == 2 && colDiff == 1) || (rowDiff == 1 && colDiff == 2);
    }

    @Override
    public String toString() { return "N"; }
}
