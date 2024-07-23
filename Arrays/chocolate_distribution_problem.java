class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        // your code here
        if(a.size()==0)return 0;
        long res = Integer.MAX_VALUE;
        Collections.sort(a);
        
        for(int i=0;i<n-m+1;i++){
            int minElement = a.get(i);
            int maxElement = a.get(i+m-1);
            res=Math.min(res,maxElement-minElement);
        }
        
        return res;
    }
}
