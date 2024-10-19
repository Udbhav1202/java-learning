import java.util.*;

public class Array {
    
    public static void update(int marks[], int nonChangable){
        nonChangable = 10;
        for(int i = 0; i<marks.length; i++){
            marks[i] = marks[i]+1;
        }
    }

    public static int linearsearch(int numbers[], int key){
        for(int i=0; i<numbers.length; i++) {
            if(numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static int getlargest(int numbers[]){
        int largest = Integer.MIN_VALUE;     // -infinity
        for(int i = 0; i<numbers.length; i++){ // iss method me humne largest ko -infinity se initialize kiya hai 
            if(numbers[i] > largest){  // jisse hum bad me index i ke number ko compare kara rhe hai toh jo number bada hua usko largest me update kara rhe hai
                largest = numbers[i];
            }   
        }
        return largest;

        // by in built functin===============================================================================

        // int[] numbers = {10, 4, 7, 20, 15};

        // // Find the largest number in the array
        // int largestNumber = Arrays.stream(numbers).max().orElse(Integer.MIN_VALUE);

        // System.out.println("Largest number in the array: " + largestNumber);

    }

    public static int getsmallest(int numbers[]) {
        int smallest = Integer.MAX_VALUE;     // +infinity
        for(int i = 0; i<numbers.length; i++){ // iss method me humne smallest ko +infinity se initialize kiya hai smallest ko index i ke num se compare kara diya jo chhota hua usko smallest me store kara diya
            if(numbers[i] < smallest){
                smallest = numbers[i];
            }   
        }
        return smallest;
    }

    

    public static void reverse(int numbers[]){
        int F = 0;                       //humne yhn F(first) ko 0 se initialize kiya
        int L = numbers.length-1;        //l(last) ko numbers.length-1 se kiya kyonki array ki counting 0 se shuru hoti hai aur array ke length ki counting 1 se shuru hoti hai
        
        while(F < L){                    //F < L mtlab loop tab tak chalega jab tak ki F L se chhota hai
            int temp = numbers[L];       // ab L yani numbers.length-1 index pe jo element hoga usse temporary storage me store kara denge
            numbers[L] = numbers[F];     // ab last index empty ho gya hai toh whn hum first(0) index pe jo value hai usse last pe store kara denge
            numbers[F] = temp;           // aur ab first empty hai usme temp me jo element store karaya hai usse first me store kar denge
            F++;                          // ab F = 0 hai is increase kardenge by 1 index ko increase karenge uss index ke value ko nhi
            L--;                         // ab L = numbers.length-1 hai isse decrease kardenge by 1 yhn bhi index ko decrease kar rhe uske element ko nhi
        }
    }

    public static void pairsinarray(int numbers[]){
        for(int i =0; i<=numbers.length-1; i++){
            for(int j = i+1; j<=numbers.length-1; j++){
                System.out.print("(" +numbers[i]+ "," + numbers[j]+ ") ");
            }
            System.out.println();
        }
    }

    public static void printSubarrays(int numbers[]){  // not understand the full logic of this code do a dry run of this code on pen paper to understand the code
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int i =0; i<numbers.length; i++){
            for(int j = i; j<numbers.length; j++){
                for(int k = i; k<=j; k++){
                    System.out.print(numbers[k] + " ");
                    sum = sum + numbers[k];
                    if (sum>max){
                        max = sum;
                    }
                } 
                System.out.print("         //  Sum of subarray is : " + sum);
                System.out.println();              
                sum =0;
            }
            System.out.println();        
        }
        System.out.println("Maximum sum is : " + max);   
    }

    public static void maxsubarraysum(int numbers[]){
        int currsum = 0;
        int max = Integer.MIN_VALUE;
        for(int i =0; i<numbers.length; i++){
            int start = i;
            for(int j = i; j<numbers.length; j++){
                int end =j;
                currsum = 0;
                for(int k = start; k<=end; k++){
                    currsum = currsum + numbers[k];
                } 
                System.out.println(currsum);
                if (currsum>max){
                    max = currsum;
                }                 
            }           
        }  
        System.out.println("max sum = " + max);  
    }

    public static void maxsubarrsumkadane(int numbers[]){
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        for(int i = 0; i<numbers.length; i++){
            currsum = currsum + numbers[i];
            if(currsum<0){
                currsum = 0;
            }
            /*if(currsum>maxsum){          // ye mera logic tha but isko math ke funcn se easily kiya ja skta hai
                maxsum = currsum;
            }*/
            maxsum = Math.max(currsum, maxsum);
        }
        System.out.println("Max subarray sum is : "+maxsum);
    }

    public static int binarysearch(int numbers[], int key){
        int start = 0;                     //nitialize start as 0, which is the index of the first element in the array.
        int end = numbers.length-1;        //Initialize end as the index of the last element in the array.
        while(start <= end){               // While start is less than or equal to end, do the following:
            int mid = (start + end) /2;    // Calculate the mid index as the average of start and end.
            if(numbers[mid] == key){       //Check if the element at index mid is equal to key. If it is, return mid
                return mid;
            }
            if(numbers[mid] < key) {       // if the element at index mid is less than key, update start to mid + 1.
                start = mid+1;
            } else {                       // If the element at index mid is greater than key, update end to mid - 1.
                end = mid -1;
            }  
        }
        return -1;                          //If the loop exits without finding the key, return -1, indicating that the key is not present in the array.
    }

    public static boolean atleasttwice(int num[]){
        for(int i = 0; i<num.length; i++){           // phle ek loop chalaya jo ki ek element ko lega phir usko compare karayega ki koi same toh nhi hai
            for(int j =i+1; j<num.length; j++){        // ye loop compare karega previous wale loop me jo element nikala hai usse 
                if(num[i]==num[j]){                      //isme num[i] ke element ko num[j] se compare karayenge
                    return true;                       // agr same hoga toh true return kar dega
                }
            }
        }
        return false;
    }

    public static int keyfindinrotatedarr(int arr[], int k, int target){
        int F = 0;
        int L = arr.length-1;
        while(F<=L){
            int temp = arr[F];
            arr[F] = arr[L];
            arr[L] = temp;
            F++;
            L--;
        }
        int first =0;
        int last = k;
        while (first<=last) {
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;
        }
        int str = k+1;
        int end = arr.length-1;
        while(str<=end){
            int temp = arr[end];
            arr[end] = arr[str];
            arr[str] = temp;
            str++;
            end--;
        }
        int l = arr.length;
        for(int i=0; i<l; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
    

    public static int trappedrainwater(int height[]){
        int n = height.length;
        int leftmax[] = new int[n];
        leftmax[0] = height[0];
        for(int i = 1; i<n; i++){
            leftmax[i] = Math.max(height[i], leftmax[i-1]);
        }
        int rightmax[] = new int[n];
        rightmax[n-1] = height[n-1];
        for(int i =n-2; i>=0; i--){
            rightmax[i] = Math.max(height[i], rightmax[i+1]);
        }
        int trappedwater = 0;
        for(int i=0; i<n; i++){
            int waterlevel = Math.min(leftmax[i], rightmax[i]);
            trappedwater += waterlevel - height[i];
        }
        return trappedwater;
    }

    public static int buyAndsellStocks(int prices[]){
        int buyprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for(int i=0; i<prices.length; i++){
            if(buyprice < prices[i]){
                int profit = prices[i] - buyprice;
                maxprofit = Math.max(maxprofit, profit);
            }else {
                buyprice = prices[i];
            }
        }

        return maxprofit;
    }
    public static int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int n =hours.length;
        int count =0;
        for(int i=0; i<n; i++){
            if(hours[i]>=target){
                count++;
            }
        }
        return count;
        
    }

    public static int sumofcubes(int M, int N){
        int total=0;
        if(M>N){
            return 0;
        }
        else{
            for(int i=M; i<=N; i++){
                total+=Math.pow(i, 3);
            }
        }
        return total;
    }

    public static int finalValueAfterOperations(String[] operations) {
        int x=0;
        for(int i=0; i<operations.length; i++){
            if("--X".equals(operations[i]) || "X--".equals(operations[i])){     // .equals(operations[i])  is used to compare the given string just like we use == with integers 
                x--;
                
            }
            else{
                x++;
                
            }
        }
        return x;
    }
    

    public static boolean isPalindrome(int x) {
        int ox= x;
        int rev =0;
        if(x<0 || x%10==0 ){
            return false;
        }
        else if(x==0){
            return true;
        }
        else{
            while(x!=0){
                int LD = x%10;
                rev = (rev*10)+LD;
                x = x/10;
            }
            System.out.println(rev);
        }
        
        
        return ox==rev;
        
    }


    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int marks[] = new int[50];                                      // in this i create a array with size of 50 
         // in upper we only defined the array size so java automatic intialize this array to 0, 0, 0, 0,
        //int numbers[]= {1, 2, 3};                                      // in here i create a array with the values so java automatic identify the size of array so here array size is 3 because i put 3 values
        //String fruits[]= {"apple", "mango", "orange"};                 // this is an array of 3 size and the type of array is string
        
        // input/output-------------------------------------------------------------------------------------------------------------------------------------------

        // int marks[] = new int[100];
        // Scanner sc = new Scanner(System.in);

        /*marks[0] = sc.nextInt(); // phy
        marks[1] = sc.nextInt(); // chem
        marks[2] = sc.nextInt(); // math

        System.out.println("phy : " + marks[0]);
        System.out.println("chem : " + marks[1]);
        System.out.println("math : " + marks[2]);*/

        // update and change values-------------------------------------------------------------------------------------------------------------------------------

        //marks[2] = 100;                                      // update and change the value we can do in an array
        //marks[2] = marks[2]+1;                                // updating an array value after this index 2 value will be hundread
        //System.out.println("math : " + marks[2]);

        //performing mathematical operation-----------------------------------------------------------------------------------------------------------------------

        //int percentage = (marks[0] + marks[1] + marks[2]) / 3;
        //System.out.println("percentage = " + percentage+ "%");                    // we can perform mathematical formulas and also we can update the values and change them

        // length of an array--------------------------------------------------------------------------------------------------------------------------------------

        //System.out.println("length of array = " + marks.length);               // with this we find the length of an array

        // arrays as function arguments----------------------------------------------------------------------------------------------------------------------------

        /*int marks[] = {97, 98, 99};
        int nonChangable = 5;
        update(marks, nonChangable); // array call by reference pe work karta hai hum function se arrays ki value update kar skte hai 
        System.out.println(nonChangable);
        //print our marks
        for(int i =0; i<marks.length; i++){
            System.out.print(marks[i]+ " ");
        }*/

        // linear search--------------------------------------------------------------------------------------------------------------------------------------------

        /*int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
        int key = 10;

        int index = linearsearch(numbers, key);
        if (index == -1){
            System.out.println("Not found");
        }
        else {
            System.out.println("key is at index : " + index);
        }*/
        
        // largest number -------------------------------------------------------------------------------------------------------------------------------------------

        /*int numbers [] = {1, 2, 6, 3, 5};
        System.out.println("Largest number is : " + getlargest( numbers));
        System.out.println("Smallest number is : " + getsmallest(numbers));*/

        // binary search---------------------------------------------------------------------------------------------------------------------------------------------

        /*int numbers[] = {1, 3, 4, 5, 6, 8, 9, 11, 13, 15, 16, 19, 20, 23, 26, 28, 30};
        int key = 13;
        System.out.println("index for key is : " +binarysearch(numbers, key));*/

        //reverse an array---------------------------------------------------------------------------------------------------------------------------------------------------

        /*int numbers[] = {1, 2, 3, 4, 5};
        reverse(numbers);                          // ab yhn par uss function ko call lagaya hai aur usne reverse kar diya hai array ko
        for(int i = 0; i<numbers.length; i++){     // ab array ko ek sath print karane ke liye hum ye loop chala rhe hai
            System.out.print(numbers[i]+ " ");
        }
        System.out.println();*/
        
        // pairs in array-----------------------------------------------------------------------------------------------------------------------------------------------------

        /*int numbers[] = {2, 4, 6, 8, 10};
        pairsinarray(numbers);*/

        //total numbers of pairs formula is = n(n-1)/2 where n is number of element in an array

        // print subarrays----------------------------------------------------------------------------------------------------------------------------------------------------

        //int numbers[] = {1, 3};
        //printSubarrays(numbers);
        //total no of subarrays are n(n+1)/2

        //max of subarray sum---------------------------------------------------------------------------------------------------------------------------------------------------------

        //maxsubarraysum(numbers);

        // max subarraynsum by kadanes ----------------------------------------------------------------------------------------------------------------------------------------------

        //int numbers[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        //int numbers[] = {2, 4, 6, 8, 10};
        //maxsubarrsumkadane(numbers);
        
        // int height[] = {4, 2, 0, 6, 3, 2, 5};
        // int TW = 0;
        // for(int i = 0; i<height.length; i++){
        //     for(int j = i; j)
        // }

        //*********************************************************************************************************************************************************************************/
        // trapping rain water problem*****************************************************************************************************************************************************
        // ********************************************************************************************************************************************************************************
       
        //int height[] = {1,8,6,2,5,4,8,3,7};
        //System.out.println(trappedrainwater(height));

        //int prices[] = {7, 1, 5, 3, 6, 4};
        //System.out.println(buyAndsellStocks(prices));
        
        // int num[] = {1, 2, 3, 7};
        // System.out.println(atleasttwice(num));
        
        //int arr[] = {0, 1, 2, 4, 5, 6, 7};
        //System.out.println(keyfindinrotatedarr(arr, 3, 4));
        //int nums[] = {2, 7, 11, 15};
       
        // int M =sc.nextInt();
        // int N =sc.nextInt();

        // System.out.println(sumofcubes(M, N));

        //System.out.println(isPalindrome(6580));

        // int sum =0;
        // int wal = sc.nextInt();
        // int chi = sc.nextInt();
        // for(int i =1; i<=wal; i++){
        //     for(int j=1; j<=i; j++){
        //         chi=chi-j;
        //         if((chi-j)<0 || (chi<j)){
        //             break;
        //         }
        //     }
        // }
        // System.out.println(chi);
        // for(int i=1; i<=wal; i++){      
        // }

        int[] nums = {1,3};
        for(int i=0; i<nums.length; i++){
            System.out.println(nums[i]);
            for(int j=i; j<nums.length; j++){
                System.out.println(nums[j]);
            }
            System.out.println();
        }
        
        
            
        
        
    }
}

