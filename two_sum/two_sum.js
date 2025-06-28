/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function (nums, target) {
  var map = new Map();
  for (let i = 0; i < nums.length; i++) {
    if (map.get((target - nums[i])) != null) {
      return [i, map.get(target - nums[i])]
    }
    else {
      map.set(nums[i], i)
    }
  }
};
console.log(twoSum([3, 4, 9, 6, 4], 8 ))