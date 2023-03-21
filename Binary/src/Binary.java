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
}


