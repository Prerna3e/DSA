public class Max{
public static void main(String[] args) {
    int[] arr={1,76,2345,87,2435,235,234775};
    System.out.println(maxRange(arr,1,4));
}

// static int max(int[] arr){
//     int max=arr[0];
//     for(int i=0;i<arr.length;i++){
//         if(max<arr[i]){
//             max=arr[i];
//         }
//     }
//     return max;
// }

static int maxRange(int[] arr,int start,int end){
    if(arr.length==0){
        return -1;
    }
int max=arr[start];
for (int i = 0; i <= end; i++) {
     if(max<arr[i]){
            max=arr[i];
        }
}
return max;
}
}