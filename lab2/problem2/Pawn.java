package lab2.problem2;

public class Pawn extends Piece {
    public Pawn(Position pos) {
        super(pos);
    }

    @Override
    public boolean isLegalMove(Position b) {
        if (!b.isValid()) return false;
        int rowDiff = b.getRow() - pos.getRow();
        int colDiff = Math.abs(b.getCol() - pos.getCol());
        return (rowDiff == 1 && colDiff == 0) || (rowDiff == 1 && colDiff == 1);
    }

    @Override
    public String toString() { return "P"; }
}
