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
        System.out.println(location);
    }
        //write the binary search to look for 25
        public static double calculateMedian(ArrayList<Integer> numList){

            if(numList.size()%2 == 0){
                return (numList.get(numList.size()/2)+numList.get(numList.size()/2-1))/2;
            }
            else if(numList.size()%2 == 1){
                return numList.get(numList.size()/2);
            }
            return 0;

    }
        public static int binarySearch(ArrayList<Integer> numList, int target){
            ArrayList<Integer> newList = numList;
        for(int i = 0; i< newList.size(); i++){
            if(newList.get(0) == target){
                for(int p = 0; p < numList.size(); p++){
                    if(numList.get(p) == newList.get(0)) {
                        return p;
                    }
                }
            }
            else if(calculateMedian(newList) < target){
                for(int j = 0; j < (newList.size()+1)/2 ; j++){
                    newList.remove(j);
                }
            }
            else{
                for(int k = newList.size()-1; k > (newList.size()+1)/2; k--){
                    newList.remove(k);
                }
            }
        }
        return -1;
    }

    }


