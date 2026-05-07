class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       int[] ar = new int[m+n];
        for(int i=0; i<m;i++){
            ar[i] = nums1[i];
        }
        for(int j=0; j<n;j++){
            ar[m+j] = nums2[j];
        }
        Arrays.sort(ar);
        for(int k=0; k<m+n;k++){
            nums1[k] = ar[k];
        }
    }
}