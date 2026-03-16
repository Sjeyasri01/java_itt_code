class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i=0,j=0,k=0;
        int m=nums1.length;
        int n=nums2.length;
        int[] mergedarr= new int[m+n];
        while(i<m && j<n){
            if(nums1[i]<nums2[j]){
                mergedarr[k++]=nums1[i++];
            }
            else{
                mergedarr[k++]=nums2[j++];
            }
        }
        while(i<m){
            mergedarr[k++]=nums1[i++];
        }
        while(j<n){
            mergedarr[k++]=nums2[j++];
        }
        int l=mergedarr.length;
        int idx;
        double med;
        if(l%2==0){
            idx=l/2;
            med=(mergedarr[idx]+mergedarr[idx-1])/2.0;
        }
        else
        {
            idx=l/2;
            med=mergedarr[idx];
        }
        return med;
    }

}
        
