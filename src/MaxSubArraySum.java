public class MaxSubArraySum {
    //Kadane's Algo
    public int maxSubArray(int[] nums) {
        int sum=0,maxSum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            maxSum=Math.max(sum,maxSum);
            if(sum<0)
                sum=0;
        }
        return maxSum;
    }

    public static void main(String[] args) {
        MaxSubArraySum ob=new MaxSubArraySum();
        int[] nums={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(ob.maxSubArray(nums));
    }
}
