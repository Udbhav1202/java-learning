import java.util.ArrayList;
import java.util.Stack;
public class StackB {
    static class StackK{
        static ArrayList<Integer> list = new ArrayList<>();
        public static boolean isEmpty(){
            return list.isEmpty();
        }

        //push
        public static void push(int data){
            list.add(data);
        }

        //pop
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }

        //peek
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return list.get(list.size()-1);
        }
    }

    public static String revString(String str){
        Stack<Character> s = new Stack<>();
        int idx = 0;
        while(idx < str.length()){
            s.push(str.charAt(idx));
            idx++;
        }
        StringBuilder result = new StringBuilder("");
        while(!s.isEmpty()){
            char curr = s.pop();
            result.append(curr);
        }

        return result.toString();
    }

    public static void pushAtBottom(Stack<Integer> s, int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    public static void printStack(Stack<Integer> s){
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }

    public static void reverseStack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s, top);
    }

    public static void stockSpan(int[] stocks, int[] span){
        Stack<Integer> s = new Stack<>();
        span[0] = 1;
        s.push(0);
        
        for(int i=1; i<stocks.length; i++){
            int currPrice = stocks[i];
            while(!s.isEmpty() && currPrice > stocks[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                span[i] = i+1;
            }
            else{
                int prevHigh = s.peek();
                span[i] = i-prevHigh;
            }

            s.push(i);
        }

        
    }

    public static boolean validParantheses(String str){
        Stack<Character> s = new Stack<>();
        
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            //opening
            if(ch == '(' || ch == '{' || ch == '['){
                s.push(ch);
            }else{
                if(s.isEmpty()){
                    return false;

                }
                if((s.peek() == '(' && ch == ')')
                    || (s.peek() == '{' && ch == '}')
                    || (s.peek() == '[' && ch == ']')){
                        s.pop();
                    }
                    else{
                        return false;
                    }
                }
        }
        if(s.isEmpty()){
            return true;
        }
        else{
            return false;
        }
            
    }

    public static boolean isDuplicate(String str){
        Stack<Character> s = new Stack<>();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            
            if(ch == ')'){
                int count = 0;
                while((s.peek() != '(')){
                    s.pop();
                    count++;
                }
                if(count < 1){
                    return true;
                }
                else{
                    s.pop();
                }
            }
            else{
                s.push(ch);
            }
            

        }
        return false;
    }

    public static int largestAreaInHistogram(int[] arr){
        Stack<Integer> s = new Stack<>();
        int maxArea = 0;
        int[] NSL = new int[arr.length];
        int[] NSR = new int[arr.length];
        //next smaller right
        for(int i=arr.length-1; i>=0; i--){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }

            if(s.isEmpty()){
                NSR[i] = arr.length;
            }
            else{
                NSR[i] = s.peek();
            }
            s.push(i);
        }
        
        //next smaller left
        s = new Stack<>();
        for(int i=0; i<arr.length; i++){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }

            if(s.isEmpty()){
                NSL[i] = -1;
            }
            else{
                NSL[i] = s.peek();
            }
            s.push(i);
        }
        //current area : width = j-i-1 = NSR[i]-NSL[i]-1
        for(int i=0; i<arr.length; i++){
            //area = height*(j-i-1);
            int area = arr[i]*(NSR[i]-NSL[i]-1);
            if(area > maxArea){
                maxArea = area;
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        // int[] stocks = {100, 80 , 60, 70 , 60, 85, 100};
        // int[] span = new int[stocks.length];

        // stockSpan(stocks, span);

        // for(int i=0; i<span.length; i++){ 
        //     System.out.println(span[i]+ " ");
        // }

        //======================================================next greater element code============================================================================================
        // int arr[] = {6,8,0,1,3};
        // Stack<Integer> s = new Stack<>();
        // int nxtGreater[] = new int[arr.length];

        // for(int i=arr.length-1; i>=0; i--){
        //     while(!s.isEmpty() && arr[s.peek()] <= arr[i]){
        //         s.pop();
        //     }

        //     if(s.isEmpty()){
        //         nxtGreater[i] = -1;
        //     }
        //     else{
        //         nxtGreater[i] = arr[s.peek()];
        //     }

        //     s.push(i);
        // }

        // for(int i=0; i<nxtGreater.length; i++){
        //     System.out.print(nxtGreater[i] + " ");
        // }
        //====================================================================================================================================================

        // String str = "((a+b)+(c+d))";
        // System.out.println(isDuplicate(str));

        int arr[] = {2,4};
        System.out.println(largestAreaInHistogram(arr));

    }
} 
