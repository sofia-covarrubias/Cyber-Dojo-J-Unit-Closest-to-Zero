import java.util.Arrays;

public class ClosestToZero {

    public static int answer(int[] nums) {
        
        if (nums.length == 1)
        {
            return nums[0];
        }
        
        if (nums.length == 0)
        {
            return 0;
        }
        
        int[][] numsAbsVal = new int[nums.length][nums.length];
        
        // populate first and second row of 2d array
        for (int i = 0; i < nums.length; i++){
            numsAbsVal[0][i] = nums[i];
            numsAbsVal[1][i] = Math.abs(nums[i]);  
        }
        
        // actually sort 2d array based on absVal 2nd row
        int tempRow1;
        int tempRow2;
        for (int i = 0; i < nums.length-1; i++) {
            if(numsAbsVal[1][i] > numsAbsVal[1][i+1]) {
                tempRow1 = numsAbsVal[0][i];
                tempRow2 = numsAbsVal[1][i];
                numsAbsVal[0][i] = numsAbsVal[0][i+1];
                numsAbsVal[1][i] = numsAbsVal[1][i+1];
                numsAbsVal[0][i+1] = tempRow1;
                numsAbsVal[1][i+1] = tempRow2;
                i =-1;
            }
        }
        
        // check how many of the first row in the beginning is the same absolute value [-1 , 1, -1, -1, 1, 2, 3, 5]
        int leastAbsVal = Math.abs(numsAbsVal[1][0]);
        int count = 0;
        
        for (int i = 0; i < nums.length; i++){
            if (numsAbsVal[1][i] == leastAbsVal){
                count++;
            }
        }
        
        boolean isPosTrue = false;
        boolean isNegTrue = false;
        for (int i = 0; i < count; i++){
            if (numsAbsVal[0][i] > 0) {
                isPosTrue = true;
            }
            else if (numsAbsVal[0][i] < 0){
                isNegTrue = true;
            }
        }
        
        int answer = leastAbsVal;
        
        if (isPosTrue == true) {
            answer = leastAbsVal;
        }
        if (isPosTrue == false && isNegTrue == true){
            answer = (leastAbsVal * (-1));
        }
        
        return answer;

    }
}
