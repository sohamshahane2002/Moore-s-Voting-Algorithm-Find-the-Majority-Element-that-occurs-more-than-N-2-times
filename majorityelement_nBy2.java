//Brute force solution
package MajorityElement_nBY2;
public class majorityelement_nBy2 {
    public static int majelement(int arr[]){
        int n = arr.length;
        int cnt = 0 ;
        for (int i = 0 ; i< n; i++){
            for(int j = 0 ; j < n ; j++){
                if (arr[i] == arr[j]){
                    cnt++;
                }
            }
        if(cnt > (n/2))
            return arr[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]= {2, 2, 1, 1, 1, 2, 2};
        System.out.println("The majority element is : " + majelement(arr));

    }
}
