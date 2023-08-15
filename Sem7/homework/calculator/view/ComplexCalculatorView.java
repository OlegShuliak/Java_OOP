package view;

import calc.Calculable;
import calc.ComplexCalculator;
import model.ComplexNum;

import java.util.Scanner;

public class ComplexCalculatorView {
    private final Calculable <ComplexNum> calculator;

    public ComplexCalculatorView(Calculable <ComplexNum> calculator) {
        this.calculator = calculator;
    }

    public void run(){
        while (true){
            Double real1 = promptDouble("Введите действительную часть комплексного числа:");
            Double imaginary1 = promptDouble("Введите мнимую часть комплексного числа:");
            ComplexNum firstNum = new ComplexNum(real1, imaginary1);
            while (true){
                String operation = prompt("Выберите операцию (+, -, *, /) : ");
                if (operation.equals("+")){
                    Double real2 = promptDouble("Введите действительную часть слогаемого комплексного числа:");
                    Double imaginary2 = promptDouble("Введите мнимую часть слогаемого комплексного числа:");
                    ComplexNum secondNum = new ComplexNum(real2, imaginary2);
                    System.out.println(String.format("Результат: (%s) + (%s) = (%s)", firstNum, secondNum, calculator.sum(firstNum, secondNum)));
                    break;
                }
                if (operation.equals("-")){
                    Double real2 = promptDouble("Введите действительную часть вычитаемого комплексного числа:");
                    Double imaginary2 = promptDouble("Введите мнимую часть вычитаемого комплексного числа:");
                    ComplexNum secondNum = new ComplexNum(real2, imaginary2);
                    System.out.println(String.format("Результат: (%s) - (%s) = (%s)", firstNum, secondNum, calculator.diff(firstNum, secondNum)));
                    break;
                }
                if (operation.equals("*")){
                    Double real2 = promptDouble("Введите действительную часть комплексного числа множителя:");
                    Double imaginary2 = promptDouble("Введите мнимую часть комплексного числа множителя:");
                    ComplexNum secondNum = new ComplexNum(real2, imaginary2);
                    System.out.println(String.format("Результат: (%s) * (%s) = (%s)", firstNum, secondNum, calculator.mult(firstNum, secondNum)));
                    break;
                }
                if (operation.equals("/")){
                    Double real2 = promptDouble("Введите действительную часть комплексного числа делителя:");
                    Double imaginary2 = promptDouble("Введите мнимую часть комплексного числа делителя:");
                    ComplexNum secondNum = new ComplexNum(real2, imaginary2);
                    System.out.println(String.format("Результат: (%s) / (%s) = (%s)", firstNum, secondNum, calculator.div(firstNum, secondNum)));
                    break;
                }
            }
            String cmd = prompt("Еще посчитать (Y/N)?");
            if (cmd.equalsIgnoreCase("Y")){
                continue;
            }
            break;
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private Double promptDouble(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return Double.parseDouble(in.nextLine());
    }
}
