/**
 * Created by Arvind Bahl on 16/3/2019.
 *  There are two sorted arrays nums1 and nums2 of size m and n respectively.

    Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).

    You may assume nums1 and nums2 cannot be both empty.
 *
 */
// Time Complexity of following code is O(Log(min(x,y))) and space complexity is O(1).

public class Median_Sorted_2_Arrays {

    public double medianArray(int []nums1, int [] nums2){

        if (nums1.length> nums2.length){
            medianArray(nums2, nums1);
        }

        int x = nums1.length;
        int y = nums2.length;
        int low =0;
        int high =x;

        while (low<=high){

           int partitionx = (low +high)/2;
           int partitiony = ((x+y+1)/2 - partitionx);

           int maxleftX = (partitionx==0) ? Integer.MIN_VALUE: nums1[partitionx-1];
           int minrightX = (partitionx ==x) ? Integer.MAX_VALUE : nums1[partitionx];
           int maxleftY = (partitiony ==0) ? Integer.MIN_VALUE : nums2[partitiony-1];
           int minrightY = (partitiony ==y) ? Integer.MAX_VALUE : nums2[partitiony];

           if (maxleftX< minrightY && maxleftY <minrightX){
               if((x+y)%2==0){

                   return ((double)(Math.max(maxleftX, maxleftY)+Math.min(minrightX, minrightY))/2);
               }
                else{

                   return Math.max(maxleftX, maxleftY);
               }
           }

           else{
               if (maxleftX>minrightY){

                   high=partitiony-1;
               }
               else{
                   low =partitionx+1;
               }
           }

        }
        return 0.0;
    }

    public static void main(String[] args){

        Median_Sorted_2_Arrays sampletest1 = new Median_Sorted_2_Arrays();
        int[] nums1 = {1, 3};
        int [] nums2 = {2};
        System.out.println("The median is " + sampletest1.medianArray(nums1, nums2));

        Median_Sorted_2_Arrays sampletest2 = new Median_Sorted_2_Arrays();
        int [] nums3  = {1, 2};
        int [] nums4 = {3, 4};
        System.out.println("The median is " + sampletest2.medianArray(nums3, nums4));

        System.out.println("reached end");

    }
}
