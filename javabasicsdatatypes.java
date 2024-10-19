import java.util.*; //ek package hai ye isse humne import kiya hai package ka name hai util (aur ye line use hi karni hai agr sacnner use karna hai toh mtlb kuch bhi input lena hai toh )

public class javabasicsdatatypes {
      public static void main(String args[]) { 
        Scanner sc = new Scanner(System.in); //scanner is a class sc is a object of a scanner class output ke liye system.out likhte hai waise hi input ke liye system.in likhte hai
        // scanner ka kam hota hai different diff funcn ka use karke diff diff datatypes ko capture karna aur unko variable me store karana
        
        // byte b = 8;
        //System.out.println(b);
        //char ch = 'a';
        // System.out.println(ch);
        // boolean var = false;
        // float price = 10.5;
        // int num = 25;
        // System.out.println(num);
        // long
        // double
        // short n = 240;

        // sum of a and b----------------------------------------------------

       /*int a = 25;
       int b = 25;
       int sum = a + b;
       System.out.println(sum);*/

       //input in java-----------------------------------------------------

       // String input = sc.next();  //next is a type of taking input in java aur isme ek word hi print hoga space ke bad ka print nhi hoga ek bar try karke dekh le udbhav srivastava input deke
       // System.out.println(input); 

       //String name = sc.nextLine(); // nextLine funcn space ke bad ka bhi print karane ke liye hota hai
       //System.out.println(name);

       //int number = sc.nextInt(); // number nextInt ke through store hua number ke andar aur print hua number ke through 
       // System.out.println(number);

       //float price = sc.nextFloat();
       //System.out.println(price);

       // sum of a and b with using input by user----------------------------------

       /*int inputA = sc.nextInt();
       int inputB = sc.nextInt();
       int sum = inputA + inputB;
       int product = inputA * inputB;
       System.out.println(sum);
       System.out.println(product);*/

       // area of a circle----------------------------------------------------------
      
       /*float rad = sc.nextFloat();
       float area = 3.14f * rad * rad;
       System.out.println(area);*/ //( byte <short <int <float <long < double ) ye hai increasing order size ka

       //type casting-------------------------------------------------------

       /*float a = 25.12f;
       int b = (int) a; // type casting me isne float ke value me se decimal ke bad ke value ko hata diya hai isne round off nhi kiya hai iska aur aage braces me int likha hai malb hum forcefully conversion kara rhe hai
       System.out.println(b);

       char ch = 'a'; //har character ko ek ek num assign kiya gya hai jaise a ko 97 iske bad jo aayega usko assign kiya hue no ka aage ke num milega jaie b a ke bad aata hai toh 97 ke bad 98 aata hai toh b ka 98 hai
       int num = ch;
       System.out.println(num);*/

       /*char ch1 = 'a'; // in this program i assign to char variable and every char has a number so the sum of these two char is 195 a = 97 and b = 98 
       char ch2 = 'b'; // a + b = 195
       int sum = ch1 + ch2;
       System.out.println(sum);*/ 
 
       // type promotion in expressions-----------------------------------------------------------
      
       //char a = 'a';
       //System.out.println((int)(a));

       /*short a = 5;
      byte b = 25;
      char c = 'c'; // java ne short byte char ko int me convert kar diya hai jabki yhn kli bhi int variable nhi hai aur maine yhn type casting ki hai byte bt pe jisse ispe error nhi aa rha hai agr mai type casting na krta toh lossy conversion int to byte 
      byte bt = (byte) (a + b + c);
      System.out.println(bt);*/

      /*int a = 10;
      float b = 20.25f;
      long c = 25;
      double d = 30;
      double ans = a + b + c + d; // ye double hai RHS aur LHS bhi double hai toh conversion ho gya hai agr LHS me mai agr int kar dunga toh lossy conversion error aa jayegi kyonki java charon variable me se jo sbse bda tha usme unhe convert kar diya hai toh sare variabla double me convert ho gye hai
      System.out.println(ans);*/
      














       



       
        
    }
}