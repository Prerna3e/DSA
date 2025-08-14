public class maxWealth{
    public static void main(String[] args) {
        int[][] arr={
            {1,5},
            {7,3},
            {8,9}
        };
        System.out.println(maxiumumWealth(arr));
    }

    static int maxiumumWealth(int[][] num){
        // int ans=Integer.MIN_VALUE;
        // for (int i = 0; i < num.length; i++) {
        //     int sum=0;
        //     for (int j = 0; j < num[i].length; j++) {
        //         sum+=num[i][j];
        //     }
        //     if(sum>ans){
        //         ans=sum;
        //     }
        // }
        // return ans;

        int ans=Integer.MIN_VALUE;
        for(int[] nums:num){
            int sum=0;
            for (int numes:nums){
                sum+=numes;
            }
            if(sum>ans){
                ans=sum;
            }
        }
        return ans;
    }
}