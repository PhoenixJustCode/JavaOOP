package lab2.problem2;

public class Position {
    private int row;
    private char col;

    public Position(char col, int row) {
        this.col = Character.toLowerCase(col);
        this.row = row;
    }

    public int getRow() { return row; }
    public char getCol() { return col; }

    public boolean isValid() {
        return row >= 1 && row <= 8 && col >= 'a' && col <= 'h';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position = (Position) o;
        return row == position.row && col == position.col;
    }

    @Override
    public String toString() {
        return "" + col + row;
    }
}
