import java.util.Arrays;
import java.util.Random;

public class ex_4 {
    public static void main(String[] args) {
        //Math.random()
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++)
            arr[i] = 0 + (int) (Math.random() * 100);
        System.out.print("Math.random() massive: ");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        Arrays.sort(arr);
        System.out.print("\nSort: ");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");

        //class Random
        var rand = new Random();
        for (int i = 0; i < arr.length; i++)
            arr[i] = rand.nextInt(100);
        System.out.print("\n\nclass Random massive: ");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        Arrays.sort(arr);
        System.out.print("\nSort: ");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        }
    }
