package calc;

import model.ComplexNum;


public final class ComplexCalculator implements Calculable<ComplexNum>{

    private ComplexNum t1;
    private ComplexNum t2;

    public ComplexCalculator(ComplexNum t1, ComplexNum t2) {
        this.t1 = t1;
        this.t2 = t2;
    }

    public ComplexCalculator() {
    }

    @Override
    public ComplexNum sum(ComplexNum t1, ComplexNum t2) {
        double real = t1.getRealNum() + t2.getRealNum();
        double imaginary = t1.getImaginaryNum() + t2.getImaginaryNum();
        ComplexNum result = new ComplexNum(real, imaginary);
       // System.out.println(String.format("Результат: (%s) + (%s) = %s", t1, t2, result));
        return result;
    }

    @Override
    public ComplexNum diff(ComplexNum t1, ComplexNum t2) {
        double real = t1.getRealNum() - t2.getRealNum();
        double imaginary = t1.getImaginaryNum() - t2.getImaginaryNum();
        ComplexNum result = new ComplexNum(real, imaginary);
        // System.out.println(String.format("Результат: (%s) - (%s) = %s", t1, t2, result));
        return result;
    }

    @Override
    public ComplexNum mult(ComplexNum t1, ComplexNum t2) {
        double real = (t1.getRealNum()* t2.getRealNum())+(t1.getImaginaryNum()* t2.getImaginaryNum()*(-1));
        double imaginary = (t1.getRealNum()* t2.getImaginaryNum())+(t2.getRealNum()* t1.getImaginaryNum());
        ComplexNum result = new ComplexNum(real, imaginary);
       // System.out.println(String.format("Результат: (%s) * (%s) = %s", t1, t2, result));
        return result;
    }

    @Override
    public ComplexNum div(ComplexNum t1, ComplexNum t2) {
        double real = (t1.getRealNum()* t2.getRealNum())+(t1.getImaginaryNum()* t2.getImaginaryNum()/(Math.sqrt(t2.getRealNum())-(Math.sqrt(t2.getImaginaryNum())*(-1))));
        double imaginary = (t1.getRealNum()* t2.getImaginaryNum()*(-1))+(t2.getRealNum()* t1.getImaginaryNum()/(Math.sqrt(t2.getRealNum())-(Math.sqrt(t2.getImaginaryNum())*(-1))));
        ComplexNum result = new ComplexNum(real, imaginary);
       // System.out.println(String.format("Результат: (%s) / (%s) = %s", t1, t2, result));
        return result;
    }
}
