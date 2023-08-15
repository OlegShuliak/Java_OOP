import calc.Calculable;
import calc.ComplexCalculator;
import log.ComplexCalculatorLogger;
import log.Logger;
import model.ComplexNum;
import view.ComplexCalculatorView;

public class Program {
    public static void main(String[] args) {
        Calculable<ComplexNum> calculator = new ComplexCalculatorLogger(new ComplexCalculator(), new Logger());
        ComplexCalculatorView calculatorView = new ComplexCalculatorView(calculator);
        calculatorView.run();
    }
}
