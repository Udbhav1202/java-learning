import java.util.*;
public class coditionalstatements {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        //====================conditional statements===================//

        /*int age = 15;
        if (age>=18) {
            System.out.println("drive, vote");
        }
        else {
            System.out.println("not an adult");
        }*/

        //----------------------------------------------

        /*int age = sc.nextInt();
        if (age>=18) {
            System.out.println("he/she is eligble for voting");
        }
        if (age > 13 && age < 18) {
            System.out.println("teenager");
        }
        else {
            System.out.println("he is not eligble for voting");
        }*/

        //---------------------------------------------------

        /*int A = sc.nextInt();
        int B = sc.nextInt();
        if (A > B) {
            System.out.println("A is greater than B");
        }
        if (A==B) {
            System.out.println("A and B are equal");
        }
        else {
            System.out.println("B is greater than A");
        }*/

        /*int A = sc.nextInt();
        
        //-----------------print if a num is odd or even

        if (A%2 == 0 ) {
            System.out.println("even");
        }
        else {
            System.out.println("odd");
        }*/

        //============else if statements================

        /*int Age = sc.nextInt();
        if (Age >= 18) {
            System.out.println("adult");
        } 
        else if (Age <=18 && Age>=13) {
            System.out.println("Teenager");
        }
        else {
            System.out.println("no answer");
        }*/

       // ======================================================
        // int[] marks = new int[3];
        // marks[0] = 97;
        // marks[1] = 96;
        // marks[2] = 93;
        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);
        // for(int i=0; i<3; i++){
        //     System.out.println(marks[i]);
        // }


        // int size = sc.nextInt();
        // int numbers[] = new int[size];
        // //input in array
        // for(int i=0; i<size; i++ ) {
        //     numbers[i] = sc.nextInt();
        // }
        // for(int i=0; i<size; i++) {
        //     System.out.println(numbers[i]);
        // }

        // int size = sc.nextInt();
        // int numbers[] = new int[size];
        // for (int i=0; i<size; i++) {
        //     numbers[i] = sc.nextInt();
        // }
        // int x = sc.nextInt();
        // for(int i=0; i<numbers.length; i++){
        //     if(numbers[i] == x) {
        //         System.out.println("x found at index : " + i);
        //     }
        // }


        // Income tax calculator=======================================================================


            // int TI = sc.nextInt();
            // int D = sc.nextInt();
            // int GS = TI-D;
            // int ftot = GS*20/100;
            // int otl = GS*30/100;
            // if (GS < 500000) {
            //     System.out.println("no income tax");
            // }
            // else if (GS >= 500000 && GS < 1000000) {
            //     System.out.println(ftot);
            // }
            // else {
            //     System.out.println(otl);
            // }  


            //========================largest of 3=========================


            // int A = sc.nextInt();
            // int B = sc.nextInt();
            // int C = sc.nextInt();
            // if (A >= B &&  A>= C) {
            //     System.out.println("A is the largest- " + A);
            // }
            // else if (B >= C ) {
            //     System.out.println("B is the largest- " + B);
            // }
            // else {
            //     System.out.println("C is the largest- " + C);
            // }

            //==================================ternary operator===============================
            
            // int A = sc.nextInt();
            // int B = sc.nextInt();
            // int larger = (A >= B)?A:B; // this is ternary operator syntax 
            // System.out.println(larger);

            //===========pass or fail==========//

            // int marks = sc.nextInt();
            
            // String result = (marks>=33)?"pass":"fail";
            // System.out.println(result);

            // ===========switch statements=============//


            // int num = 4;
            // switch (num) {
            //     case 1 : System.out.println("FAIL");
            //                 break;
            //     case 2 : System.out.println("PASS");
            //                 break;
            //     default : System.out.println("Absent");
            // }

            // // ============================================calculator===================================================//


            // System.out.println("Enter A : ");
            // double A = sc.nextDouble();
            // System.out.println("Enter B : ");
            // double B = sc.nextDouble();

            // //\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\


            // //\\\\\\\\\\\\\\\\\\\{my code}\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
            // //String operations = "operation : " + "sum : 1, " + "sub : 2, " + "div : 3, " + "mul : 4, " + "modulo : 5, ";
            // //System.out.println(operations);
            // // ye upar ki meri thinking thi isko short tarike se bhi kiya ja skta haijo ki niche hai
            // // int opr = sc.nextInt();
            // // switch (opr) {
            // //     case 1 : System.out.println(A+B);
            // //                 break;
            // //     case 2 : System.out.println(A-B);
            // //                 break;
            // //     case 3 : System.out.println(A/B);
            // //                 break;
            // //     case 4 : System.out.println(A*B);
            // //                 break;
            // //     case 5 : System.out.println(A%B);
            // //                 break;
            // //     default : System.out.println("error");
            // // }

            // //\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\


            //\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\[ma'am ka code]\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
            // System.out.println("Enter operation : ");
            // char opr = sc.next().charAt(0);
            // System.out.println("Result : ");

            // switch(opr) {
            //     case '+' : System.out.println(A+B);
            //                 break;
            //     case '-' : System.out.println(A-B);
            //                 break;
            //     case '*' : System.out.println(A*B);
            //                 break;
            //     case '/' : System.out.println(A/B);
            //                 break;
            //     case '%' : System.out.println(A%B);
            //                 break;
            //     default : System.out.println("Error");
            //}

            //====================================================practice question======================================================//
            // question 1============================================

            
            /*int number = sc.nextInt();
            if (number >= 0) {
                System.out.println("Positive");
            }
            else {
                System.out.println("Negative");
            }*/

            // question 2=============================================

            /*double temp = sc.nextDouble();
            if (temp >= 100) {
                System.out.println("You have a fever");
            }
            else {
                System.out.println("You don't have a fever");
            }*/

            // question 3====================================================

            /*int day = sc.nextInt();
            switch (day) {
                case 1 : System.out.println("Monday");
                            break;
                case 2 : System.out.println("Tuesday");
                            break;
                case 3 : System.out.println("wednesday");
                            break;
                case 4 : System.out.println("Thursday");
                            break;
                case 5 : System.out.println("Friday");
                            break;
                case 6 : System.out.println("Saturday");
                            break;
                case 7 : System.out.println("Sunday");
                            break;
                default : System.out.println("Error");
            }*/

            // question 5=====================================================
            
            /*int year = sc.nextInt();
            if (year%4==0) {
                System.out.println("Leap year");
            }
            else if (year%400==0) {
                System.out.println("Leap year");
            }
            else {
                System.out.println("not a leap year");
            }*/

            // int num = sc.nextInt();
            // if(num>=1)
            // {
            // if (num % 2==0){
            //     System.out.println("this is even number");
            // }
            // else
            //     System.out.println("this is odd number");
        
            // }
        
            // else 
            // System.out.println("Invalid number");
            // }
    
                // int n=sc.nextInt();
                // if(n<10)
                // {
                //     int a=0;
                //     int b=1;
                //     int c=0;
                //     System.out.print(a+" "+b);
                //     for(int i=1;i<=n-2;i++)
                //     {
                //         c=a+b;
                //         a=b;
                //         b=c;
                //         System.out.print(" "+ b);
                //     }

                // }
                // else 
                // System.out.println("Invalid number");
                
                
                
                
        
















        
         




    }
}

