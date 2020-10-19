import java.util.Scanner;

public class ex_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n%2 != 0 && CheckPrime(n, 3)) System.out.print("YES");
        else System.out.print("NO");
    }

    public static boolean CheckPrime(int num, int divider){
        if(divider>Math.sqrt(num)) return true;
        else if(num%divider == 0) return false;
        else return CheckPrime(num, divider+=2);
    }
}
