class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        max_len = 0
        for i in range(0, len(s)):
            print(i)
            for j in range(len(s)):
                if max_len == i:
                    continue;
                sub_str = s[j:1+i+j]
                characters = set(sub_str)
                if len(characters) == len(sub_str) and len(sub_str) > max_len:
                    max_len = len(sub_str);
                    print(max_len, sub_str)
                    continue;
                
        if len(s) != 0 and max_len == 0:
            max_len = 1;
        return max_len 
test_case = Solution();
x = test_case.lengthOfLongestSubstring('abcabcbb')
print(x)
