public class Quicksort{
    public static void main(String[] args) {
        int arr[]= {6,5,3,2,1,4};
        sortalgo(arr, 0, arr.length-1);
        for(int x:arr)System.out.print(x+" ");
    }
    public static void sortalgo(int arr[],int low,int high){
      if(low>=high) return;
      int pivot = arr[high];

      int left = low,right=high;
      while(left<right){

        while(left<right &&arr[left]<=pivot ){
            left++;

        }
        while(left<right && arr[right]>=pivot){
            right--;
        }
        swap(arr, left, right);
      }
      swap(arr, left, high);
      sortalgo(arr, low, left-1);
      sortalgo(arr, left+1, high);
      

    }
    public static void swap(int arr[],int i,int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}