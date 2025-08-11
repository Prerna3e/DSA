import java.util.Arrays;
public class Swap{
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,0};
        swap(arr,1,4);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int index1, int index4){
        int temp=arr[index1];
        arr[index1]=arr[index4];
        arr[index4]=temp;
    }
}