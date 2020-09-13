public class ex_1 {
    public static void main(String[] args) {
        int[] arr = new int[100];
        for(int i =0; i<arr.length; i++) arr[i] = i;

        long sum = 0;
        for(int i =0; i<arr.length; i++) sum += arr[i];
        System.out.println("For loop sum: " + sum);

        int i = 0;
        sum = 0;
        while(i < arr.length) {
            sum += arr[i];
            i++;
        }
        System.out.println("While loop sum: " + sum);

        i = 0;sum = 0;
        do {
            sum += arr[i];
            i++;
        } while(i < arr.length);
        System.out.println("Do while loop sum: " + sum);
    }
}
