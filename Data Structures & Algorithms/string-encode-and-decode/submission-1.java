class Solution {

    public String encode(List<String> strs) {
      
      StringBuffer ans=new StringBuffer();
      for(String str: strs)
      {
         ans.append(str.length());
         ans.append("#");
         ans.append(str);
      }
      return ans.toString();
    }

    public List<String> decode(String str) {

        List<String> ans=new ArrayList<>();
        StringBuffer s=new StringBuffer();
        for(int i=0;i<str.length();)
        {
            int count=0;
            int j=i;
            int length=0;
            while(str.charAt(j)-'0'>=0 && str.charAt(j)-'0'<=9)
            {
               length=length*10+str.charAt(j)-'0';
               j++;
            }
            i=j+1;
            while(count<length && i<str.length())
            {
               s.append(str.charAt(i));
               i++;
               count++;
            }
 
            ans.add(s.toString());
            s=new StringBuffer();
        }

        return ans;

    }
}
