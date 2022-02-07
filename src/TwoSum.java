import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] res=new int[2];
        HashMap<Integer,Integer> hmap=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(hmap.containsKey(nums[i])){
                res[0]=hmap.get(nums[i]);
                res[1]=i;
                break;
            }
            else
                hmap.put(target-nums[i],i);
        }
        return res;
    }

    public static void main(String[] args) {
        TwoSum ob=new TwoSum();
        int[] nums={2,7,11,15};
        int res[]=ob.twoSum(nums,9);
        System.out.println(res[0]+" "+res[1]);
    }
}
