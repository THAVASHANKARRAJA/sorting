public class Mergesort {
    public static void main(String[] args) {
        int nums[]={10,9,8,7,6,5,4,3,2,1};
        for(int x:nums)System.out.print(x+" ");
        merge(nums);
        System.out.println("After sorting");
        for(int x:nums) System.out.print(x+" ");

        
    }
    public static void merge(int[] nums){
            int len = nums.length;
            if(len<2) return ;
            int mid = len/2;
            int left[]=new int[mid];
            int right[]= new int[len-mid];
            for(int i=0;i<mid;i++) left[i]=nums[i];
            for(int i=mid;i<len;i++)right[i-mid]=nums[i];
            merge(left);
            merge(right);
            last(nums, left, right);
            return;

    }

    public static void last(int[] nums,int [] left,int[] right){
        int i=0,j=0,k=0;
        while(i<left.length && j<right.length){
            if(left[i]<right[j]){
                nums[k++]=left[i++];
            }
            else{
            nums[k++]=right[j++];
            }
        }
        while(i<left.length){
            nums[k++]=left[i++];
        }
        while(j<right.length){
            nums[k++]=right[j++];
        }

    }
}
