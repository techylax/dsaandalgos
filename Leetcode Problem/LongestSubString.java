// * The above solution requires at most 2n steps.
// * In fact, it could be optimized to require only n steps.
// * We could define a mapping of the characters to its index.
// * Then we can skip the characters immediately when we found a repeated character.
// *
// * The reason is that if s[j] have a duplicate in the range [i, j)with index j',
// * we don't need to increase i little by little. We can skip all the elements in the range [i, j']
// * and let i to be j' + 1 directly.
// *
// * Complexity Analysis
// * Time complexity : O(n). Index j will iterate n times.
// * Space complexity : O(min(m, n)). Same as the previous approach.
// */
class Solution {
   public int lengthOfLongestSubstring(String s) {
       int n = s.length(), ans = 0;
       // current index of character
       Map<Character, Integer> map = new HashMap<>();
       // try to extend the range [i, j]
       for (int j = 0, i = 0; j < n; j++) {
           if (map.containsKey(s.charAt(j))) {
               i = Math.max(map.get(s.charAt(j)), i);
           }
           ans = Math.max(ans, j - i + 1);
           map.put(s.charAt(j), j + 1);
       }
       return ans;
   }
}