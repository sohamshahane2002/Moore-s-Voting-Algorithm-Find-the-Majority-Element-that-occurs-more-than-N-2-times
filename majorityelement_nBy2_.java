//Better Solution
package MajorityElement_nBY2;
import java .util.*;
public class majorityelement_nBy2_ {
    public static int majelement(int arr[]){
        int n = arr.length;
        HashMap <Integer,Integer> mpp = new HashMap<Integer,Integer>();

        for(int i = 0 ; i < n ;i++){                                //storing the elements with its occurnce:
            int value = mpp.getOrDefault(arr[i], 0);
            mpp.put(arr[i], value + 1);
        }
        for (Map.Entry<Integer, Integer> it : mpp.entrySet()) {
            if (it.getValue() > (n / 2)) {
                return it.getKey();
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {5, 5, 1, 5, 1, 5, 5, 1, 1, 5, 4, 5, 1 ,5, 1};
        System.out.println("The majority element is : " + majelement(arr));
    }
    
}
