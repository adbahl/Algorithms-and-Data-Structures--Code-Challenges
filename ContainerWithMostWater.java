/**
 * Created by arvind on 7th March 2019.
 * Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of line i is at
 * (i, ai) and (i, 0). Find two lines, which together with x-axis forms a container, such that the container contains the most water.
    Note: You may not slant the container and n is at least 2.
 *
 */
// Brute force requires time complexity as O(Nsquare)
// Following code requires time complexity of O(n) and space complexity of O(1).
public class ContainerWithMostWater {

    public static void main (String []args){

        int [] heights = {1,8,6,2,5,4,8,3,7};

        //this is not required as it is given that the value of n is at least 2;
        if (heights.length <=1){
            System.out.println(0);
            //System.exit(0);
            return;
        }

        int max = 0;
        int left = 0;
        int right = heights.length -1;

        while (left < right){
            int vHeight = Math.min(heights[left], heights[right] );
            max = Math.max(max, vHeight*(right -left));

            if (heights[left]< heights[right]){
                left++;
            }
            else{
                right--;
            }
        }

        System.out.println("The output is " + max);
    }



}
