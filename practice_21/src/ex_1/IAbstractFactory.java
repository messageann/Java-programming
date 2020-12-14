package ex_1;

public interface IAbstractFactory {
    Complex createNumber(int re, int im);
    String getNumber(Complex z);
}
