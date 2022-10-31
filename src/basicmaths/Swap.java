package basicmaths;

public class Swap {

    static void swap(int[] arr,int s,int e){
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
    }

    static void reverse(int arr[]){
        int start = 0;int end = arr.length-1;        
        while(start<end){
            swap(arr, start, end);
            start++;end--;
        }

    }
    static int maxVal(int arr[]){
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max)
            max = arr[i];
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {1,22,3,4,5,6};
//      reverse(arr);
//      System.out.println(Arrays.toString(arr));
//      swap(arr, 1, 3);
        System.out.println(maxVal(arr));
        
    }
}