class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer>ans=new ArrayList<>();
        int []t1=new int[26];
        int t2[]=new int[26];
        for(int i=0;i<p.length();i++)
        {
            t1[p.charAt(i)-'a']++;
        }
        for(int i=0;i<s.length();i++)
        {
            t2[s.charAt(i)-'a']++;
            if(i>=p.length())
            {
                t2[s.charAt(i-p.length())-'a']--;
            }
            if(Arrays.equals(t1,t2))
            {
                ans.add(i-p.length()+1);
            }
        }
        return ans;
    }
}