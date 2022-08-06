import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,1,2,3,3};
        int n = nums.length;
        if (n == 0) {
            System.out.println(0);
        }
        else {
            int i = 0;
            for (int j = 0; j <= n - 1; j++) {
                if (nums[i] != nums[j]) {
                    i++;
                    nums[i] = nums[j];
                }
            }
            System.out.println(i + 1);
            System.out.println("Nums: "+Arrays.toString(nums));
        }
    }
}