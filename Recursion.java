
public class Recursion {
    public static void printDec(int n){
        if(n==1){
            System.out.print(n);
            return;
        }
        System.out.print(n+" ");
        printDec(n-1);
    }

    public static void printInc(int n){
        if(n==1){
            System.out.print(n);
            return;
        }
        printInc(n-1);
        System.out.print(" "+n);
    }

    public static void IndexOcurr(int[] arr, int i, int key){

        if(i==arr.length){
            return;
        }

        if(arr[i]==key){
            System.out.print(i+" ");
        }
        IndexOcurr(arr, i+1, key);
    }

    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        return n*factorial(n-1);

    }

    public static int sumOfNnum(int n){
        if(n==1){
            return 1;
        }
        int snm1 = sumOfNnum(n-1);
        int sum = n+sumOfNnum(n-1);
        return sum;
    }

    public static int fibonacci(int n){
        if(n==1 || n==0){
            return n;
        }
        int fibo = fibonacci(n-1)+fibonacci(n-2);
        return fibo;
    }

    public static boolean checkSort(int[] arr, int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }

        return checkSort(arr, i+1);
    }

    public static int firstOcurrence(int arr[], int i, int target){
        if(i==arr.length-1){
            return -1;
        }
        if(target==arr[i]){
            return i;
        }
        return firstOcurrence(arr, i+1, target);
    }

    public static int lastOcurrence(int arr[], int i, int target){
        if(i==arr.length){
            return -1;
        }
        int  isFound = lastOcurrence(arr, i+1, target);
        if(isFound==-1 && arr[i] == target){
            return i;
        }
        return isFound;
    }

    public static int PowerN(int x, int n){
        if(n==0){
            return 1;
        }
        // int ponm1 = PowerN(x, n-1);
        // int pow = x*ponm1;
        return x*PowerN(x, n-1);
    }

    public static int  OptimizePowerN(int a, int n){
        if(n==0){
            return 1;
        }
        int halfpower = OptimizePowerN(a, n/2);
        int halfpowerSq = halfpower*halfpower;
        if(n%2!=0){
            halfpowerSq = a*halfpowerSq;
        }
        return halfpowerSq;
    }

    public static int TilingProblem(int n){
        if(n==0 || n==1){
            return 1;
        }
        int fnm1 = TilingProblem(n-1);

        int fnm2 = TilingProblem(n-2);

        return fnm1+fnm2;
    }

    public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean map[]){
        if(idx== str.length()){
            System.out.println(newStr);
            return;
        }
        char currchar = str.charAt(idx);
        if(map[currchar-'a']==true){
            removeDuplicates(str, idx+1, newStr, map);
        }
        else{
            map[currchar-'a']= true;
            removeDuplicates(str, idx+1, newStr.append(currchar), map);
        }
    }   

    public static int friendsPairing(int n){
        if(n==1 || n==2){
            return n;
        }
        // int fnm1 = friendsPairing(n-1);
        // int fnm2 = friendsPairing(n-2);
        // int pairWays = (n-1)* fnm2;
        // int totWays = fnm1+pairWays;
        // return totWays;

        return friendsPairing(n-1)+(n-1)*friendsPairing(n-2);
    }

    public static void printBinStrings(int n, int lastplace, String str){
        if(n==0){
            System.out.println(str);
            return;
        }
        printBinStrings(n-1, 0, str+"0");
        if(lastplace==0){
            printBinStrings(n-1, 1, str+"1");
        }
    }

    public static int RangeSum(int s, int e){
        if(e==s){
            return s;
        }
        return e+RangeSum(s, e-1);
    }

    public static long  RangeProd(int s, int e){
        if(e==s){
            return s;
        }
        return e*RangeProd(s, e-1);
    }

    public static void CallOutString(int n){
        String[] num = {"zero","one","two","three","four","five","six","seven","eight","nine"};

        if(n==0){
            return;
        }
        int LD = n%10;
        CallOutString(n/10);
        System.out.print(num[LD]+" ");
    }

    public static int LenghtOfString(String str, int i, int len){
        if(i==str.length()){
            return len++;
        }
        return LenghtOfString(str, i+1, len+1);
    }

    public static void main(String[] args) {
        System.out.println(LenghtOfString("", 0, 0));
       
    }
}
