import java.util.ArrayList;
import java.util.List;

class Solution {
	public List<Integer> findMedianSortedArrays(int[] nums1, int[] nums2) {
		List<Integer> array = new ArrayList<>();
		for (int i = 0; i < nums1.length; i++) {
			array.add(nums1[i]);
		}
		for (int j = 0; j < nums2.length; j++) {
			array.add(nums2[j]);
		}
		return array;
	}
	public static void main(String[] args){
		Solution test = new Solution();
		List<Integer> test_done = test.findMedianSortedArrays(new int[]{2, 5}, new int[]{4});
		System.out.println(test_done);
	}

}


