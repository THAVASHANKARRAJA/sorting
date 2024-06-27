public class Selectionsort{
    public static void main(String[] args) {
        int arr[] = {13,46,24,52,20,9};
        sort(arr,arr.length);
        for(int x:arr){
            System.out.print(x+" ");
        }

    }

    public static void sort(int arr[],int n){
        for(int i=0;i<n;i++){
            int min = arr[i];
            int k =i;
            for(int j=i;j<arr.length;j++){
                if(min>arr[j]){
                    min =arr[j];
                    k=j;
                }

                
            }
            int temp = arr[i];
            arr[i]=arr[k];
            arr[k]=temp;
        }
        return;
    }
}