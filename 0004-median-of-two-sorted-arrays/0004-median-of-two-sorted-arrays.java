class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n= nums1.length;
        int m = nums2.length;
        ArrayList<Integer> arr = new ArrayList<>();
        double ans =0;
        for(int i = 0; i<n;i++){
            arr.add(nums1[i]);
        }
        for(int j = 0; j<m;j++){
            arr.add(nums2[j]);
        }
        Collections.sort(arr);
        if((m+n)%2 == 0){
            ans = (arr.get((m + n) / 2) + arr.get(((m + n) / 2) - 1)) / 2.0;
        }
        else{
            ans = arr.get(((m + n) / 2));
        }
        return ans;
    }
}