class Solution {
    public String reverseWords(String s) {
        
        s = s.replaceAll(" +"," ");
        StringBuilder st = new StringBuilder();
        String[] arr= s.split(" ");
        for (int i = arr.length-1; i>=0; i--)
            
        {
            st.append(arr[i] + " ");
            
            
        }
        
        String ans= st.toString();
        ans = ans.trim();
    
    return ans;
}
}
