import java.util.*;
public class patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*pattern question================================
        * 
        **
        ***
        ****
         
        for (int line =1; line<=4; line++) {
            for (int star =1; star<=line; star++) {
                System.out.print("*");
            }
            System.out.println();
        }*/

        //=================================================
        /*
        ****
        ***
        **
        * 
        */
        
        /*int n = 4;
        for (int line =1; line<=n; line++ ) {
            for (int star =1; star<=n-line+1; star++) {
                System.out.print("*");
            }
            System.out.println();
        }*/

        /*
        1
        12
        123
        1234
        */
        
        /*for (int line =1; line<=4; line++ ) {
            for (int v =1; v<=line; v++) {
                System.out.print(v);
           }
            System.out.println();
        }*/
        
        //=========================================================

        /*int n = 4;
        
        char ch = 'A';
        for (int line = 1; line<=n; line++){
            for (int chars = 1; chars<=line; chars++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }*/
        
    }
    
}
