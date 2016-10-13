package Model;

import java.util.List;

/**
 * Created by JoseLlorens on 12/10/2016.
 */
public abstract class Piece {
    public static final int WHITE = 0;
    public static final int BLACK = 1;

    String name;
    int value;
    int x;
    int y;
    int color;

    public abstract List<Board> posMov(Board board);
    public abstract String toString();

    public int getColor() {
        return color;
    }

    public int getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public abstract boolean equals(Object o);
}
