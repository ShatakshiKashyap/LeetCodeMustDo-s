public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int len=nums.length;
        int l2rP[]=new int[len];
        int r2lP[]=new int[len];
        int result[]=new int[len];
        l2rP[0]=nums[0];
        for(int i=1;i<len;i++)
            l2rP[i]=l2rP[i-1]*nums[i];
        r2lP[len-1]=nums[len-1];
        for(int i=len-2;i>=0;i--)
            r2lP[i]=r2lP[i+1]*nums[i];

        result[len-1]=l2rP[len-2];
        result[0]=r2lP[1];
        for(int i=len-2;i>0;i--){
            result[i]=l2rP[i-1]*r2lP[i+1];
        }

        return result;
    }

    public static void main(String[] args) {
        ProductOfArrayExceptSelf ob=new ProductOfArrayExceptSelf();
        int[] nums={1,2,3,4};
        int[] res=ob.productExceptSelf(nums);

        for(int n:res)
            System.out.print(n+" ");
    }
}
