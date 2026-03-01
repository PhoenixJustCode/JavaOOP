package lab2.problem2;

public class Queen extends Piece {
    public Queen(Position pos) {
        super(pos);
    }

    @Override
    public boolean isLegalMove(Position b) {
        if (!b.isValid()) return false;
        int rowDiff = Math.abs(pos.getRow() - b.getRow());
        int colDiff = Math.abs(pos.getCol() - b.getCol());
        return pos.getRow() == b.getRow() || pos.getCol() == b.getCol() || rowDiff == colDiff;
    }

    @Override
    public String toString() { return "Q"; }
}
