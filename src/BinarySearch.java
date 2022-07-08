public class BinarySearch {
    public static int binarySearch(int arr[], int n, int k){
        int low = 0;
        int high = n-1;
        while(low<=high){
            int mid = (high + low)/2;
            if(arr[mid]== k){
                return mid;
            }
            else if(arr[mid]< k){
                low = mid +1;
            }else{
                high = mid-1;
            }
        }return -1;
    }

    public static void main(String[] args) {

    }
}
