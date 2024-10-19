
public class StudentClass {
    public static class Car { // class
        String name;
        int price;
        String type;
    }
    // creating a datatype with multiple attributes
    public static class Stu { //class || 
        String name; // attributes
        int rno; // attributes
        double percent; // attributes
        final String schoolname = "BBps"; // final keyword isme value nhi change kar skte main funcn me initialize karke toh iss liye use hota hai
        static int numberofstudents; //// static class ko represent karta hai 
        public Stu(){ // constructer default
        }        
        public Stu(String naam, int roll, double per) { // constructor
            name = naam;
            rno = roll;
            percent = per;
            numberofstudents++;
        }
        public int getrno(){ // this is getter after privating a attribute we can use it only in the same class so we created a getter funcn in the same class where we call that attribute and in main funcn if we want use that attribute then we need to call that particular funcn just as i used below
            return rno;
        }
        public void setrno(int roll) { //setter 
            rno = roll;
        }        
    }  
    public static void change(Stu c) {
        c.name = "rohan";
        return;
    }
    public static void main (String[] args) {
        
        //Stu x = new Stu("ud", 9, 98.5); //(object) creating a dabba in which i have 3 boxes for name roll no and percentage and the box name is x
        // System.out.println(x.name + " " + x.percent + " " + x.rno); // in here jaise maine usse comment kar diya sare attributes ko kuch default values hoti hai wo apne aap print ho jati hai jaise null 0 0.0 aur niche change funcn ka use kiya hai jisne naya input name liya to usne wo new input print kara diya hai name wale me baki me default values hai
        //updation
        // change(x);
        // System.out.println(x.name + " " + x.percent + " " + x.rno);

        // access modifiers 
            //public - all packages// if we use this on the starting of a attributes then we can use that attribute in all packages 
            //private - same class // isse use karne par hum sirf uss class ke andar hi uss attribute ko use kar skte hai uske bhr khin nhi
            // default - same package // isse hum same package ke andar use kar kar skte hai same package ki different file ke andar use kar sakte import ke through
         
        // getters and setters // funcn of a class
        //System.out.println(x.getrno());
        // x.setrno(70);
        // System.out.print(x.getrno()); // setter is use for seting the value and if we want to use that value we use getter to use that value

        // this keyword is used for 
        // public void setrno(int rno) { //setter 
        //     rno = rno; // here argument and attribute name is same so java assumes that both are arguments so for solving this mistake we use "this" keyword to pointing out that this rno is attribute
        // }
        //===========
        // public void setrno(int rno) { //setter 
        //     this.rno = rno;
        // }
        Stu x = new Stu("ud", 9, 98.5); //(object) creating a dabba in which i have 3 boxes for name roll no and percentage and the box name is x
        System.out.println(x.numberofstudents);
        Stu S1 = new Stu("udbhav",70, 90.0); // agr humne constructer bnaya hai toh hume usse initialize karna padega jaisa constructor humne bnaya upar x wale object pe error aa rha tha kyonki maine initialize nhi kiya tha toh usse initalize karna jaruri hai        
        System.out.println(S1.numberofstudents);
        Stu S2 = new Stu("rohan", 54, 97.4);
        System.out.println(S2.numberofstudents);

        







        
        




        

    }

}
