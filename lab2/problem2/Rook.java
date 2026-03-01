package lab2.problem2;

public class Rook extends Piece {
    public Rook(Position pos) {
        super(pos);
    }

    @Override
    public boolean isLegalMove(Position b) {
        if (!b.isValid()) return false;
        return pos.getRow() == b.getRow() || pos.getCol() == b.getCol();
    }

    @Override
    public String toString() { return "R"; }
}
