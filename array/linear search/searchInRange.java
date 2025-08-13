public class searchInRange{
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8};
        int target=5;
        int res=searchInRange(arr,target,2,4);
        System.out.println(res);
    }
     
     static int searchInRange(int[] arr,int target, int start, int end){
        if(arr.length==0){
            return -1;
        }
        for (int i = start; i < end; i++) {
            int element=arr[i];
            if(element==target){
                return i;
            }
        }
return -1;
     }
}