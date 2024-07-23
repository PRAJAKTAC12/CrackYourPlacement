 int sum=0;
        int count=0;
        int ans[]=new int[k];
        ans[0]=1;
        for(int i=0;i<nums.length;i++)
        {
                sum=sum+nums[i];
                int rem=sum%k;
                if(rem<0)
                {
                    rem=rem+k;
                }
                count=count+ans[rem];
                ans[rem]++;
        }
        return count;
