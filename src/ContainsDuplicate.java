import java.util.HashSet;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hset=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(!hset.add(nums[i]))
                return true;
            hset.add(nums[i]);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums={1,1,1,3,3,4,3,2,4,2};
        ContainsDuplicate ob=new ContainsDuplicate();
        System.out.println(ob.containsDuplicate(nums));
    }
}
