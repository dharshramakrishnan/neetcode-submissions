class Solution {
    public int[] replaceElements(int[] arr) {
      int[] ans=new int[arr.length];
      int n=arr.length;
      ans[n-1]=-1;

      if(arr.length==1) return ans;
      ans[n-2]=arr[n-1];
      int j=n-3;

      for(int i=arr.length-2;i>=0;i--)
      {
           if(arr[i]<ans[i]  && j>=0)
           {
             ans[j]=ans[i];
           }

           else if(j>=0)
           {
            ans[j]=arr[i];
           }

           j--;
      }
      return ans;  
      
    }
}