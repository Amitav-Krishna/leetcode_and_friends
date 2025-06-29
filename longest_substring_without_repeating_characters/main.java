import java.util.HashSet;
import java.util.Set;

class Solution {
    public int lengthOfLongestSubstring(String s) {
	    Set<int> char_set = new HashSet<>();        
	    int left = 0;
	    int max_len = 0;
	    for(int right = 0; right <= s.length; right++) {
		    while (char_set.contains(s[right])) {
			    char_set = char_set.remove(s[left]);
			    left = left + 1
				}
		    char_set.add(s[right]);
		    max_len = Math.max(max_len, right-left + 1);
	    }

    }
}
