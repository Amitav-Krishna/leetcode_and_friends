class Solution:
    def checkForRepeatingCharacters(self, s: str) -> bool:
        characters = set(s)
        print(characters)
        if len(s) == len(characters):
            return False
        return True

test_case = Solution();
x = test_case.checkForRepeatingCharacters('aabcd')
print(x)
