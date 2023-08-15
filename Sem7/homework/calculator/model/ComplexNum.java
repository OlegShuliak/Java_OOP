package model;

public class ComplexNum extends ModelOfNum {

    double imaginaryNum;
    public ComplexNum(double realNum, double imaginaryNum) {
        super(realNum);
        this.imaginaryNum = imaginaryNum;
    }

    public double getImaginaryNum() {
        return imaginaryNum;
    }

    public void setImaginaryNum(double imaginaryNum) {
        this.imaginaryNum = imaginaryNum;
    }

    @Override
    public String toString() {
        return "(" + super.getRealNum() + ") + (" + imaginaryNum + "i)";
    }
}
