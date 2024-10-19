import java.util.*;
import java.util.Arrays;
import java.util.Collections;

public class Sorting {

    public static void bubblesort(int arr[]){
        for( int turn = 0; turn<arr.length-1; turn++){
            for(int j =0; j<arr.length-1-turn; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void bubblesortdesc(int arr[]){
        for( int turn = 0; turn<arr.length-1; turn++){
            for(int j =0; j<arr.length-1-turn; j++){
                if(arr[j]<arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void printarr(int arr[]){
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    public static void Selectionsort(int arr[]){
        for(int i =0; i<arr.length-1; i++){
            int minpos = i; 
            for(int j = i+1; j<arr.length; j++){
                if(arr[minpos]> arr[j]){
                    minpos = j;
                }
            }
            int temp = arr[minpos];
            arr[minpos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void Selectionsortdesc(int arr[]){
        for(int i =0; i<arr.length-1; i++){
            int minpos = i; 
            for(int j = i+1; j<arr.length; j++){
                if(arr[minpos]< arr[j]){
                    minpos = j;
                }
            }
            int temp = arr[minpos];
            arr[minpos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void countingsort(int[] arr){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            largest = Math.max(largest, arr[i]);
        }

        int count[] = new int[largest+1];
        for(int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }
    
        int j=0;
        for(int i=0; i<count.length; i++){
            while(count[i] > 0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void insertionsort(int arr[]){
        for(int i=1; i<arr.length; i++){
            int curr = arr[i];
            int prev = i-1;
            while(prev >=0 && arr[prev] > curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }
    }
    public static void insertionsortdesc(int arr[]){
        for(int i=1; i<arr.length; i++){
            int curr = arr[i];
            int prev = i-1;
            while(prev >=0 && arr[prev] < curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }
    }
    public static void main(String[] args) {
        // int numbers[] = {5, 4, 1, 3, 2};
        // bubblesort(numbers);
        // printarr(numbers);
            
        //Integer arr[] = {5, 4, 1, 3, 2};
        //insertionsort(arr);
        //Arrays.sort(arr);                                                              // inbuilt sorting 
        //Arrays.sort(arr, 0, 3);                                        // inbuilt sorting between elements 
        //Arrays.sort(arr, Collections.reverseOrder());
        //printarr(arr);
        // int arr[] = {1, 4, 1, 3, 2, 4, 3, 7};
        // countingsort(arr);
        // printarr(arr);
        int arr[] = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
        //bubblesortdesc(arr);
        //Selectionsortdesc(arr);
        insertionsortdesc(arr);
        printarr(arr);
        
    }
}
