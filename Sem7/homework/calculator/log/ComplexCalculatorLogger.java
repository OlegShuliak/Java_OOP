package log;

import calc.Calculable;
import model.ComplexNum;

public class ComplexCalculatorLogger implements Calculable <ComplexNum> {

    private Calculable calcForLog;
    private Loggable log;

    public ComplexCalculatorLogger(Calculable calcForLog, Loggable log) {
        this.calcForLog = calcForLog;
        this.log = log;
    }


    @Override
    public ComplexNum sum(ComplexNum t1, ComplexNum t2) {
        ComplexNum result = (ComplexNum) calcForLog.sum(t1, t2);
        log.logMessage(String.format("Вызван метод SUM для комплесных чисел: %s + %s = %s", t1, t2, result));
        return result;
    }

    @Override
    public ComplexNum diff(ComplexNum t1, ComplexNum t2) {
        ComplexNum result = (ComplexNum) calcForLog.diff(t1, t2);
        log.logMessage(String.format("Вызван метод DIFF для комплесных чисел: %s - %s = %s", t1, t2, result));
        return result;
    }

    @Override
    public ComplexNum mult(ComplexNum t1, ComplexNum t2) {
        ComplexNum result = (ComplexNum) calcForLog.mult(t1, t2);
        log.logMessage(String.format("Вызван метод MULT для комплесных чисел: %s * %s = %s", t1, t2, result));
        return result;
    }

    @Override
    public ComplexNum div(ComplexNum t1, ComplexNum t2) {
        ComplexNum result = (ComplexNum) calcForLog.div(t1, t2);
        log.logMessage(String.format("Вызван метод DIV для комплесных чисел: %s / %s = %s", t1, t2, result));
        return result;
    }
}
