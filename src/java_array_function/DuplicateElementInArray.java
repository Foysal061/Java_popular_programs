package java_array_function;
//Find the duplicate element in the given array. [1, 5, 2, 2, 3, 4, 3, 5, 2, 6, 7, 9, 8, 5]

import java.util.HashMap;

public class DuplicateElementInArray {
    public static void main(String[] args) {
        int[] array = {1, 5, 2, 2, 3, 4, 3, 5, 2, 6, 7, 9, 8, 5};
        HashMap<Integer, Integer> countMap = new HashMap<Integer, Integer>();
        for (int arrayElement : array) {
            Integer value = countMap.get(arrayElement);
            if (value != null) {
                countMap.put(arrayElement,value+1);
            }else{
                countMap.put(arrayElement,1);
            }
        }
        for (Integer key : countMap.keySet()){
            if (countMap.get(key) > 1){
                System.out.println(""+key);
            }
        }
    }
}
