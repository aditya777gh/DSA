/* 4. Reverse an array */
import java.util.*;
class r04{

    public static int[] revArr(int i, int[] nums){
        int n=nums.length;
        if(i>=n/2){
            return nums;
        }
        int temp=nums[i];
        nums[i]=nums[n-i-1];
        nums[n-i-1]=temp;
        return revArr(i+1, nums);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] nums={1,2,3,4,5};
        System.out.println("reversed array is : " +Arrays.toString( revArr(0, nums)) );
    }
}
/*
reversed array is : [5, 4, 3, 2, 1]
*/