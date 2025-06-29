class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        char_set = set()
        left = 0;
        max_len = 0

        for right in range(len(s)):
            while s[right] in char_set:
                char_set.remove(s[left]);
                left += 1;
                print(right);
                print(s[right]);
                print(left);
                print(s[left]);
            char_set.add(s[right]);
            max_len = max(max_len, right - left + 1)
        return max_len;


test_case = Solution();
x = test_case.lengthOfLongestSubstring('abcabb')
print(x)
