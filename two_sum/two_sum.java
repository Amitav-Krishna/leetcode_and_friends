import java.util.HashMap
class Solution {
	public int[] twoSum(int[] nums, int target) {
		HashMap<Integer, Integer> testedNumbers = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (testedNumbers.containsKey((target - nums[i]) == true) {
				return [i, testedNumbers.get((target - nums[i]))]
			}
			testedNumbers.put((target - nums[i], i);
		}
	}
}
