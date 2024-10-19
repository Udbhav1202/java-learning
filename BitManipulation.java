


public class BitManipulation {
    public static void isoddeven(int num){
        int bitmask = 1;
        if((num & bitmask)==0){
            System.out.println("even number");
        }else{
            System.out.println("odd number");
        }
    }

    public static int getIthBit(int n , int i){
        int bitMask = 1<<i;
        if((n & bitMask) ==  0){
            return 0;
        }
        else {
            return 1;
        }
    }

    public static int setIthBit(int n, int i){
        int bitMask = 1<<i;
        return n | bitMask;
    }

    public static int clearIthbit(int n, int i){
        int bitMask = ~(1<<i);
        return i & bitMask;
    }

    public static int updateIthBit(int n, int i, int newBit){
        // if(newBit ==0){
        //     return clearIthbit(n, i);
        // }
        // else {
        //     return setIthBit(n, i);
        // }

        n =clearIthbit(n, i);
        int bitMask = newBit<<i;
        return n | bitMask;
    }

    public static int clearLastIBits(int n, int i){
        int bitMask = -1<<i;
        return n & bitMask;

    }

    public static int clearRangeOfBits(int n, int i, int j){
        int a =((~0)<<(j+1));
        int b = (1<<i)-1;
        int bitMask = a | b;
        return n & bitMask;
    }

    public static boolean powerOf2(int n){
        if(n<=0){
            return false;
        }
        return (n&(n-1))==0;
    }

    public static int countSetBits(int n){
        // for representing a number in binary we need (log n + 1) bits
        int count = 0;
        while(n>0){
            if((n&1)!=0){
                count++;
            }
            n = n>>1;
        }
        return count;
    }
    
    public static void main(String[] args) {
        //isoddeven(10);
        //System.out.println(getIthBit(10, 2));
        //System.out.println(setIthBit(10, 2));
        // System.out.println(clearIthbit(10, 2));
        //System.out.println(clearRangeOfBits(10, 2, 4));
        System.out.println(powerOf2(0));
    }
}
