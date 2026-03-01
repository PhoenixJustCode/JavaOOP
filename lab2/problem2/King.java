package lab2.problem2;

public class King extends Piece {
    public King(Position pos) {
        super(pos);
    }

    @Override
    public boolean isLegalMove(Position b) {
        if (!b.isValid()) return false;
        int rowDiff = Math.abs(pos.getRow() - b.getRow());
        int colDiff = Math.abs(pos.getCol() - b.getCol());
        return rowDiff <= 1 && colDiff <= 1;
    }

    @Override
    public String toString() { return "K"; }
}
