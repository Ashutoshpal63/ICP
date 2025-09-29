class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==1)
        {
            return true;
        }
        int left=1;
        int right=num;
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            long sqrt=(long)mid*mid;
            if(sqrt==num)
            {
                return true;
            }
            else if(sqrt<num)
            {
                left=mid+1;
            }
            else
            {
                right=mid-1;
            }
        }
        return false;
    }
}