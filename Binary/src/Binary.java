import java.util.ArrayList;
import java.util.Collections;
public class Binary {
    public static void main(String args[]) {
        ArrayList<Integer> numList = new ArrayList<Integer>();
        numList.add(5);
        numList.add(4);
        numList.add(25);
        numList.add(2);
        numList.add(14);
        numList.add(87);
        numList.add(56);
        System.out.println(numList);
        Collections.sort(numList);
        System.out.println(numList);
        int target = 25;
        int location = binarySearch(numList, target);
        System.out.println("The target was found at index " + location);
        int[] listToSort = {7, 8, 5 ,4, 9, 2};
        System.out.println("\n\nOriginal list");
        for(int n: listToSort){
            System.out.print(n + " ");
        }
        selectionSort(listToSort);
        int[] listToSort2 = {5, 8, 1, 3 ,9, 6};
        System.out.println("\n Sorted List");
        for(int n:listToSort){
            System.out.print(n + " ");
        }
        System.out.println("\n\nOriginal list");
        for(int n: listToSort2){
            System.out.print(n + " ");
        }
        insertionSort(listToSort2);
        System.out.println("\n Sorted List");
        for(int n:listToSort2){
            System.out.print(n + " ");
        }

    }
        //write the binary search to look for 25
    public static double calculateMedian(ArrayList<Integer> numList){
            if(numList.size() == 1){
                return numList.get(0);
            }
            else if(numList.size() == 2){
                return (numList.get(0)+numList.get(1))/2.0;
            }
            else if(numList.size()%2 == 0){
                return (numList.get(numList.size()/2)+numList.get(numList.size()/2-1))/2;
            }
            else if(numList.size()%2 == 1){
                return numList.get((int)numList.size()/2);
            }
            return 0;

    }
        /*public static int binarySearch(ArrayList<Integer> numList, int target){
            ArrayList<Integer> newList = numList;
        for(int i = 0; i< newList.size(); i++){
            System.out.println(calculateMedian(newList));
            System.out.println("hello");
                    System.out.println(target);
                    System.out.println(calculateMedian(newList) == target);
            if(calculateMedian(newList) == target){
                for(int p = 0; p < numList.size(); p++){
                    if(numList.get(p) == calculateMedian(newList)) {
                        return p;
                    }
                }
            }
            else if(calculateMedian(newList) < target){
                int count = 0;
                for(int j = (((int)newList.size()+1)/2)-1; j >= 0 ; j--){
                    newList.remove(j);
                }
            }
            else{
                for(int k = newList.size()-1; k >= (((int)newList.size()+1)/2)-1; k--){
                    newList.remove(k);
                }
            }
        }
        return -1;
    }
*/
    public static int binarySearch(ArrayList<Integer> givenList, int target){
        int low = 0;
        int high = givenList.size()-1;

        while(low <= high){
            int mid = (low +high)/2;
            if(givenList.get(mid) == target){
                return mid;
            }
            else if(givenList.get(mid) < target){
                low = mid + 1;
            }
            else if(givenList.get(mid) >  target){
                high = mid - 1;
            }
        }
        return -1;
    }
    public static void selectionSort(int[] arr){
        int len = arr.length;

        for(int i = 0; i < len - 1; i++){
            int min = i;
            for(int j = i+1; j< len; j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
    public static void insertionSort(int[] arr){
        int len = arr.length;
        for(int i = 1; i < len; i++){
            int key = arr[i];
            int j = i -1;
            while(j>=0 && arr[j] > key){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                j--;
            }

        }
    }
}


