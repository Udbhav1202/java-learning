import java.util.*;

public class loopsflowcontrol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //loop=========================================================
        
        /*int i = 0;
        while (i<100) {
            System.out.println("hello world");
            i++;
        }*/

        //print no 1 to 10============================================

        /*int i = 1;
        while(i<=10) {
            System.out.println(i);
            i++;
        }*/

        //print no 1 to n (user input)=========================================
        
        /*int n = sc.nextInt();
        int i = 1;
        while (i<=n) {
            System.out.println(i);
            i++;
        }*/

        // sum of first n natural no=========================================================

        /*int n = sc.nextInt();
        int sum = 0;
        int i = 1 ;
        while (i<=n) {
            sum = sum + i;
            i++;
            
        }
        System.out.println(sum);*/

        //for loop===========================================================================
        
        //int i =0;
        /*for(int i =0; i<=10; i++) {
            System.out.println("hello world");
        }*/

        //square pattern=====================================================================

        /*for(int i = 1; i<=4; i++) {
            System.out.println("****");
        }*/

        // reverse the number=====================================

        /*int n = sc.nextInt(); //ye maine khud nhi solve kiya hai iska soln dekha hai maine toh isko kabhi dubara karna 
        int ld = 0;
        while (n > 0) {
            ld = n%10;
            n = n/10;
            System.out.print(ld);
        }*/

        //reverse the number and store in n ==============================================
        /*int n = sc.nextInt();
        int ld = 0;
        int rn = 0;
        while (n > 0) {
            ld = n%10;
            rn = (rn*10) + ld;
            n = n/10;
        }
        System.out.print(rn);*/

        //========================================do while loop===================================//

        /*int i = 0;
        do{
            System.out.println("hello world");
            i++;
        }while(i <=10);*/

        //keep entering num till users enters a multiple of 10=======================

        /*do{
            System.out.print("enter your number : ");
            int a = sc.nextInt();
            if(a % 10 ==0){
                break;
            }
            System.out.println(a);
        }while(true);*/

        //display all numbers entered by user except multiples 0f 10=========================

        /*do{
            System.out.print("Enter your number: ");
            int a = sc.nextInt();
            if (a % 10 ==0){
                continue;
            }
            System.out.println(a);
        }while(true);*/

        // prctice sheet of loops=============================================================

        /*System.out.println("*For random number press 1* " + " *for a range of numbers press 2* ");
        int choice =sc.nextInt();
        if (choice==1) {
            int oddsum = 0;
            int evensum = 0;
            int option;
            do {
                int num = sc.nextInt();

                if (num%2==0) {
                    evensum = evensum + num;
                } else {
                    oddsum = oddsum+ num;
                }
                System.out.print("For More press 1 if not then press 2: ");
                option = sc.nextInt();

            } while(option == 1);
            System.out.println("Even number sum: " + evensum);
            System.out.println("Even number odd: " + oddsum);
        }
        else if (choice==2) {
            int odd = 0;
            int even = 0;
            System.out.print("Enter the starting number of set: ");
            int SD = sc.nextInt();
            System.out.print("Enter the End number of set: ");
            int ED = sc.nextInt();
            for (int i = SD - 1; i<=ED; i++) {
                if (i%2==0) {
                even = even +i;
                }else if (i%2==1) {
                odd = odd +i;
                }
            }
            System.out.println("Sum of even numbers: " + even);
            System.out.println("Sum of odd numbers: " + odd);
        }*/
        //================================================================================

        /*int N = sc.nextInt();
        int M = 1;
        int T;
        while (M<=10){
            T=N*M;
            System.out.println(N + "*" + M + "=" + T);
            M++;
        }*/
        
        /*int i = 0;
        while (i < 5) {
            System.out.println("i = " + i);
            i++;
        }
        System.out.println("i after the loop = " + i);*/
        


       sc.close();    
    }
}
