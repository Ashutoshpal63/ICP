class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        ArrayList<Integer>ans=new ArrayList<>();
        
        int n=nums.length;
        for(int i=0;i<=n-k;i++)
        {
            int max=Integer.MIN_VALUE;
            for(int j=i;j<i+k;j++)
            {
                max=Math.max(max,nums[j]);
            }
            ans.add(max);
        }
        int j=ans.size();
        int[] arr=new int[j];
        for(int i=0;i<j;i++)
        {
            arr[i]=ans.get(i);
        }
        return arr;
    }
}