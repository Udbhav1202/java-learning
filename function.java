import java.util.*;
public class function {
    public static void sumoftwonumbers(int num1 , int num2) {
        int sum = num1+num2;
        System.out.println("Sum is : " + sum);       
    }
    //product of two numbers
    public static float productofanb(float a , float b) {
        float product = a*b;
        return product;
    }
    //factorial
    public static int factorial(int n) {
        int f = 1;
        if (n==0) {
            System.out.println(n);
        }
        
        for (int i = 1; i<=n; i++) {
           
            f = f*i;
        }
        return f;
        
    }
    public static boolean isPalindrome(int x) {
        int rev = 0;
        int ox = x;
        while(x <=0){
            int rem = x%10;
            rev = rev*10+rem;
            x = x/10;
        }
        System.out.println(rev);
        if(rev == ox){
            System.out.println("true");
            return true;
        }
        else{
            System.out.println("false");
            return false;
        }
    }
    // check if a number is prime or not
    public static boolean isPrime(int n) {
        boolean isPrime = true;
        for(int i =2; i<=n-1; i++){
            if(n%i==0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
    // primes in range 
    public static void primesinrange(int n){
        for(int i = 2; i<=n; i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    // coversion Binary to decimal

    public static void bintodec(int binNum){
        int num =binNum;
        int LD;
        int pow =0;
        int dec =0;
        while(binNum>0){
            LD =binNum%10;
            dec =LD*(int)Math.pow(2, pow)+dec;
            binNum = binNum/10;
            pow++;
        }
        System.out.println("Decimal of " + num+ " = "+dec);
    }
    // binomial coefficient

    public static int BC(int n, int r) { 
        int a =1;
        for (int i =1; i<=n; i++) {
            a = a*i;
        }
        int b =1;
        for (int j = 1; j<=r; j++) {
            b = b*j;
        }
        int d = n-r;
        int c =1;
        for (int k = 1; k<=d; k++) {
            c = c*k;
        }
        int bico = a/(b*c);
        return bico;

        /*int A = factorial(n);
        int B = factorial(r);
        int C = factorial(n-r);
        int BBCC = A/(B*C);
        return BBCC;*/ // 
    }
    public static void avgofthreenum(int a, int b, int c){
        int avg =0;
        avg = (a+b+c)/3;
        System.out.println("avg of 3 num = " + avg);
    }
    public static void isEven(int a){
        if (a%2==0){
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
    //sum of digits in integer
    public static void digitsum(int a){
        int sum = 0;
        int LD = 0;
        while (a>0) {
            LD = a%10;
            a = a/10;
            sum = LD+sum;
        }
        System.out.println(sum);
    }
    // Decimal to binary converter
    public static void decTobin(int num){
        int mynum = num;
        int rem = 0;
        int pow = 0;
        int bin = 0;
        while(num >0){
            rem = num%2;
            bin = bin+rem*(int)Math.pow(10, pow);
            num=num/2;
            pow++;
        }
        System.out.print("Binary for of " +mynum+ " = " +bin);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // float a = sc.nextFloat();
        // float b = sc.nextFloat();
        // float prod =productofanb(a , b);
        // System.out.println("product of a and b = " + prod);   
        // prod =productofanb(10 , 30);    
        // System.out.println("product of a and b = " + prod);

        // int n =4;
        // factorial(a);
        
        
        // System.out.println(factorial(5));
        // System.out.println(BC(5, 2));

        // int a =sc.nextInt();
        // int b =sc.nextInt();
        // int n =sc.nextInt();
        
        // double sum;
        // for (int i = 0; i<=n; i++) {
        //     sum = a+Math.pow(2, i)*b;
        //     int value = (int)(a+sum);
        //     System.out.print(value + " ");
            
        // }
        // System.out.println();

        //System.out.println(factorial(0));
        
        //primesinrange(100); // prime numbers betww

        //bintodec(10110110); // binary to decimal
        
        //decTobin(7); //Decimal to binary
        //avgofthreenum(4, 5, 6);
        //isEven(15);
        //digitsum(4321);
        isPalindrome(-123);
        
    }
}  

    

    


