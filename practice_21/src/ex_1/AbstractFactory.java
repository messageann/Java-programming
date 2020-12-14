package ex_1;

public class AbstractFactory implements IAbstractFactory{
    public Complex createNumber(int re, int im){
        return new Complex(re, im);
    }
    public String getNumber(Complex z){
            return z.getRe() + "+i" + z.getIm();
    }
}
