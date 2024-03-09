class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0,j=0;
        Set<Integer> set= new HashSet<>();
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j]){
                set.add(nums1[i]);
                System.out.println(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i]<nums2[j]){
                i++;
            }
            else{
                j++;
            }
        }
        int[] arr = new int[set.size()];

        int index = 0;

        for( Integer x: set ) {
        arr[index++] = x; //note the autounboxing here
        }
        return arr;
    }
}
