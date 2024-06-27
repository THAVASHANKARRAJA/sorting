public class Bubblesort {
    public static void main(String[] args) {
        
        int arr[]={20,10,1,100,2000};
        int n = arr.length-1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                  
                }
            
            }
        }

        for(int x:arr){
            System.out.print(x+" ");
        }
    }
}
