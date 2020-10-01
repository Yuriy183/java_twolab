public class SquarePrism extends Square implements IFigure {

    private int height;

    public SquarePrism(int side, int height) {
        super(side);
        this.height = height;
    }

    private double diagonalSidePlane() {
        return Math.sqrt(Math.pow(this.side, 2) + Math.pow(this.height, 2));
    }

    public double Volume() {
        return super.calcSquare() * height;
    }

    @Override
    public int calcSquare() {
        return (4 * side * height) + (2 * super.calcSquare());
    }

    @Override
    public double calcDiagonal() {
        return Math.sqrt(Math.pow(diagonalSidePlane(), 2) + Math.pow(side, 2));
    }

    @Override
    public int calcPerimeter() {
        return 2 * super.calcPerimeter() + 4 * height;
    }

    @Override
    public String toString() {
        return "Side: " + side + '\n' +
                "Height: " + height + '\n' +
                "Volume: " + Volume() + '\n' +
                "Square: " + calcSquare() + '\n' +
                "Perimeter: " + calcPerimeter() + '\n' +
                "Diagonal: " + calcDiagonal();
    }
}