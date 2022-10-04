public class Point {
    private int X;
    private int Y;

    public Point(int x, int y) {
        X = x;
        Y = y;
    }

    public Point(int side) {
        X = side;
        Y = side;
    }

    public Point() {
        X = 0;
        Y = 0;
    }

    public int getX() {
        return X;
    }

    public int getY() {
        return Y;
    }

    public void setX(int x) {
        X = x;
    }

    public void setY(int y) {
        Y = y;
    }

    public String coordinate() {
        return "(" + X + "," + Y + ")";
    }

    public String quadrant() {
        if (X == 0 && Y == 0) {
            return "Origin";
        }
        if (X == 0 || Y == 0) {
            return "On an axis";
        }
        if (Y > 0) {
            if (X > 0) {
                return "I";
            } else {
                return "II";
            }
        } else {
            if (X < 0) {
                return "III";
            } else {
                return "IV";
            }
        }
    }
}
