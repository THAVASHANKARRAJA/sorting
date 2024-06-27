public class Practice {
    public static void main(String[] args) {
        int arr[]= {6,5,3,4,2,1};
        mergesort(arr);
        for(int x:arr)System.out.print(x+" ");

    }

    public static void mergesort(int arr[]){
        int size = arr.length;
        if(size<2) return;
        int mid = size/2;
        int left[]= new int[mid];
        int right[]=new int[size-mid];
        for(int i=0;i<mid;i++){
            left[i]=arr[i];
        }

        for(int i=mid;i<size;i++){
            right[i-mid]=arr[i];
        }
        mergesort(left);
        mergesort(right);

        combine(arr,left,right);
    }
    public static void combine(int arr[],int left[],int right[]){
        int i=0,j=0,k=0;
        while(i<left.length && j<right.length){
            if(left[i]<right[j]){
                arr[k++]=left[i++];
            }
            else {
                arr[k++]=right[j++];
            }
        }

        while(i<left.length){
            arr[k++]=left[i++];
        }
        while(j<right.length) arr[k++]=right[j++];

    }
}
