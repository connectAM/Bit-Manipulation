public class OddOrEven {
    public static void checkOddOrEven(int n)
    {
        int bitmask = 1;
        if((n & bitmask) == 1)
        {
            System.out.println("Odd Number!");
        }
        else{
            System.out.println("Even Number!");
        }
    }

    public static void main(String[] args) {
        checkOddOrEven(3);
        checkOddOrEven(8);
        checkOddOrEven(7678);
    }
}
