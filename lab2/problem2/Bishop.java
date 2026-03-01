package lab2.problem2;

public class Bishop extends Piece {
    public Bishop(Position pos) {
        super(pos);
    }

    @Override
    public boolean isLegalMove(Position b) {
        if (!b.isValid()) return false;
        return Math.abs(pos.getRow() - b.getRow()) == Math.abs(pos.getCol() - b.getCol());
    }

    @Override
    public String toString() { return "B"; }
}
