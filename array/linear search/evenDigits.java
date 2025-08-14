public class evenDigits{
    public static void main(String[] args) {
        int[] arr={12,123,145,1345,12,-1234};
        System.out.println(findNumbers(arr));
    }

    static int findNumbers(int[] nums){
        int count=0;
        for(int num:nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }

//fn to check whether a number contains even no. or not
    static boolean even(int num){
        int numberofDigits=digit(num);
        // if(numberofDigits%2==0){
        //     return true;
        // }
        // return false;

        return numberofDigits%2==0;
    }

//shortcut to find no. of digits
static int digit2(int num){
    if(num<0){
            num = num * -1;
        }
    return (int)(Math.log10(num))+1;
}



//count no. of digits in a no.
    static int digit(int num){

        //for - 
        if(num<0){
            num = num * -1;
        }

        if(num==0){
            return 1;
        }

        int count=0;
        while(num>0){
            count++;
            num/=10;
        }
        return count;
    }
}