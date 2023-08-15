package calc;


import model.ModelOfNum;

public interface Calculable <T extends ModelOfNum> {
    T sum(T t1, T t2);
    T diff(T t1, T t2);
    T mult(T t1, T t2);
    T div(T t1, T t2);

}
