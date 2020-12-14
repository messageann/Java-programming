public class Complex {
    private int Re;
    private int Im;

    Complex(int re, int im) {
        Re = re;
        Im = im;
    }

    public int getRe() {
        return Re;
    }

    public int getIm() {
        return Im;
    }

    public void sumWith(Complex z2) {
        Re+= z2.getRe();
        Im+= z2.getIm();
    }

    @Override
    public String toString() {
        return Re + "+i" + Im;
    }
}
