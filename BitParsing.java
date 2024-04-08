//import java.util.ArrayList;
import java.util.List;

public class BitParsing {
    public static int getBit(int n, int i)
    {
            int bitmask = 1<<i;
            if((n & bitmask) == 0)
            {
                return 0;
            }
            else{
                return 1;
            }
    }
    public static int setIthBit(int n, int pos)
    {
        int bitMask = 1<<pos;
        return n | bitMask;
    }

    public static int clearIthBit(int n, int pos){
        int bitMask = ~(1<<pos);
        return n & bitMask;
    }
    // 11111111(all 1s) = (-1) = ~0
    public static int clearLastIBits(int n, int pos)
    {
        int bitMask = ((-1)<<pos); // or bitMask = ((~0)<<pos)
        return (n & bitMask);
    }
    public static int updateIthBit(int n, int pos, int newbit)
    {
        n = clearIthBit(n,pos);
        int bitmask = newbit<<pos;
        return n | bitmask;
        
    }
    public static int singleInteger(List<Integer> lst)
    {
        int xor = 0;
        //List<Integer> ls1 = new ArrayList<>();
        for (int i=0;i<lst.size();i++)
        {
            xor ^= lst.get(i);
        }
        return xor;
    }
    public static void main(String[] args) {
        System.out.println("Bit @ 2nd position : "+getBit(6,2)); //1
        System.out.println("After setting bit @ 2nd position the no. is : "+setIthBit(10,2)); //14
        System.out.println("After clearing the ith bit the no is : "+clearIthBit(10,1));//8
        System.out.println("After clearing i bits the no. is : "+clearLastIBits(15,2)); //12
        System.out.println("Updating bit = "+updateIthBit(10,2,1)); //14
        List<Integer> lst = List.of(2,2,4,5,6,4,5);
        System.out.println(singleInteger(lst));
    }

}
