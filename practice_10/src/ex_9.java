public class ex_9 {
    public static void main(String[] args) {
        System.out.println(Count(2,5));
    }

    public static int Count(int zeros,int ones)
    {
        if(zeros == 0) return 1;
        else if(zeros == 1) return ones+1;
        else if(zeros>1 && ones ==0) return 0;
        else return (Count(zeros-1, ones-1) + Count(zeros,ones-1));
    }
}