package model;

public abstract class ModelOfNum {
    double realNum;

    public ModelOfNum(double realNum) {
        this.realNum = realNum;
    }

    public double getRealNum() {
        return realNum;
    }

    public void setRealNum(double realNum) {
        this.realNum = realNum;
    }
}
