// Last updated: 7/9/2026, 3:14:03 PM
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> mylist = new ArrayList<>();
        for(int num : nums1){
            mylist.add(num);
        }
        for(int num : nums2){
            mylist.add(num);
        }
        Collections.sort(mylist);
        int n = mylist.size();
        if (n % 2 == 1) {
            return mylist.get(n / 2);
        } else {
            return (mylist.get(n / 2 - 1) + mylist.get(n / 2)) / 2.0;
        }
    }
}