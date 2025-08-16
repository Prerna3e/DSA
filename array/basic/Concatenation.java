import java.util.Arrays;  
//leetcode
public class Concatenation {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int[] result = getConcatenation(nums);

        System.out.println(Arrays.toString(result));
    }

    static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] lala = new int[n * 2];
        for (int i = 0; i < n; i++) {
            lala[i] = nums[i];
            lala[i + n] = nums[i];
        }
        return lala;
    }
}
