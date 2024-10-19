import java.util.ArrayList;

public class MyArrayList {

    public static boolean PairSum2(ArrayList<Integer> list, int target){
        int bp =-1;
        int n = list.size();
        for(int i=0; i<list.size(); i++){
            if(list.get(i)>list.get(i+1)){
                bp = i;
                break;
            }
        }
        int lp = bp+1;
        int rp = bp;

        while(lp != rp){
            //case 1
            if(list.get(lp) + list.get(rp)== target){
                lp = (lp+1)%n;

            }else{
                //case 3
                rp = (n+rp-1)%n;
            }

        }
        return false;
    }
    public static void main(String[] args) {
        // ArrayList<Integer> list = new ArrayList<>();
        // //Add element
        // list.add(2);
        // list.add(5);
        // list.add(9);
        // list.add(3);
        // list.add(6);

        // list.add(1, 18);

        // System.out.println(list.size());  

        // System.out.println(list);

        // Get element
        // int element = list.get(2);
        // System.out.println(element);

        //Delete element
        // list.remove(2);
        // System.out.println(list);

        //set
        // list.set(2,10);
        // System.out.println(list);

        //contains
        /*System.out.println(list.contains(1));
        System.out.println(list.contains(18));*/

        // for(int i=list.size()-1; i>=0; i--){
        //     System.out.print(list.get(i)+" ");
        // }
         
        // int max = Integer.MIN_VALUE;
        // for(int i=0; i<list.size(); i++){
        //     if(list.get(i)>max){
        //         max = list.get(i);
        //     }
        // }
        // System.out.println(max);

        // int idx1 = 1;
        // int idx2 = 3;
        // int temp = list.get(idx1);
        // list.set(idx1, list.get(idx2));
        // list.set(idx2,  temp);
        // System.out.println(list);

        // System.out.println(list);
        // Collections.sort(list);  //ascending order
        // System.out.println(list);
        // Collections.sort(list, Collections.reverseOrder());  // descending order
        // System.out.println(list);

        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1); list.add(2); list.add(3); list.add(4); list.add(5);
        mainList.add(list);

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(2); list3.add(4); list3.add(6); list3.add(8); list3.add(10);
        mainList.add(list3); 

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(3); list1.add(6); list1.add(9); list1.add(12); list1.add(15);
        mainList.add(list1);
        
        for(int i=0; i<mainList.size(); i++){
            ArrayList<Integer> currList = mainList.get(i);
            for(int j =0; j<currList.size(); j++){
                System.out.print(currList.get(j)+" ");
            }
            System.out.println();
        }
    } 
}
