public class Triangle {
    double base;
    double height;
    double sideLengthA;
    double sideLengthB;
    double sideLengthC;

    public Triangle(double base, double height, double sideLengthA, double sideLengthB, double sideLengthC) {
        this.base = base;
        this.height = height;
        this.sideLengthA = sideLengthA;
        this.sideLengthB = sideLengthB;
        this.sideLengthC = sideLengthC;
    }

    public double findArea() {
        return (this.base = this.height) / 2;
    }
}
