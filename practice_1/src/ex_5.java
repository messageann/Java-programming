public class ex_5 {
    public static void main(String[] args) {
        int a = 4;
        System.out.println("Factorial of " + a + " is " + Fac(a));
    }

    public static long Fac(int x)
    {
        long fac = 1;
        for (int i = 1; i<=x; i++) fac *= i;
        return fac;
    }
}
