class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int merg[]=new int [nums1.length+nums2.length];
        System.arraycopy(nums1,0,merg,0,nums1.length);
        System.arraycopy(nums2,0,merg,nums1.length,nums2.length);
        Arrays.sort(merg);
        if(merg.length%2==0)
        {
            return (merg[merg.length/2]+merg[merg.length/2-1])/2.0;
        }else{
            return merg[merg.length/2];
         }
   
        
    }
}