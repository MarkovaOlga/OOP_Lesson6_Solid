package solid.srp;

public class Square {

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    private int side;

    public Square(int side) {
        this.side = side;
    }

    public int getArea() {
        return side * side;
    }

    public void zoom(float zoom) {
        side = (int) (side * zoom);
    }


}
