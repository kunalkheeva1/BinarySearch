// back log of this search is that, we can apply it only on the sorted arrays
public class BinarySearch {
   // binary search method
    public static int binarySearch(int arr[], int n, int k){

        // take two pointers one for the first and other for the last index
        int low = 0;
        int high = n-1;

        // until both the pointers meet
        while(low<=high){
            // take a mid pointer
            int mid = (high + low)/2;
            // if the element at the mid pointer is target, then return mid
            if(arr[mid]== k){
                return mid;
            }
            // else for smaller case move your lwo pointer next to mid
            else if(arr[mid]< k){
                low = mid +1;
            }
            // and high to the lesser than mid
            else{
                high = mid-1;
            }

            // if nothing applies return -1
        }return -1;
    }

    public static void main(String[] args) {

    }
}
