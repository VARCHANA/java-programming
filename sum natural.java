public class SumNatural {

    public static void main(String[] args) {

        int num = 3, sum = 0;

        for(int i =2; i <= num; ++i)
        {
            // sum = sum + i;
            sum += i;
        }

        System.out.println("Sum = " + sum);
    }
}