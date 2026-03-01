package lab2.problem2;

public abstract class Piece {
    protected Position pos;

    public Piece(Position pos) {
        this.pos = pos;
    }

    public abstract boolean isLegalMove(Position b);

    public void move(Position b) {
        if (isLegalMove(b)) {
            this.pos = b;
        }
    }

    public Position getPosition() {
        return pos;
    }
}
