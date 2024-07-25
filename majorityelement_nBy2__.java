//Optimal Solution && Moore's voting Algorithm
package MajorityElement_nBY2;
public class majorityelement_nBy2__ {
        public static int majElement(int arr[]){
        int n = arr.length;
        int element = 0 ;
        int cnt = 0;

        for (int i =  0 ; i< n ; i++){
            if(cnt == 0){
                cnt = 1;
                element = arr[i];
            }
            else if (element == arr[i]){
                cnt ++;
            }
            else{
                cnt --;
            }
        }
        int cnt1 = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == element) 
                cnt1++;
        }
        if (cnt1 > (n / 2)) 
        return element;
        return -1;
    }
    public static void main(String args[]) {
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        int ans = majElement(arr);
        System.out.println("The majority element is: " + ans);
    }
}
