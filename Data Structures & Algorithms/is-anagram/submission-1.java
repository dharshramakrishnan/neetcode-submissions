class Solution {
    public boolean isAnagram(String s, String t) {
      
      Map<Character,Integer> mpp=new HashMap<>();

      if(s.length()!=t.length()) return false;

      for(int i=0;i<s.length();i++)
      {
         
            mpp.put(s.charAt(i),mpp.getOrDefault(s.charAt(i),0)+1);
          
      }
      
      for(int i=0;i<t.length();i++)
      {
        if(mpp.containsKey(t.charAt(i)) && mpp.get(t.charAt(i))>0)
        {
          mpp.put(t.charAt(i),mpp.get(t.charAt(i))-1);
        }
        else if(mpp.containsKey(t.charAt(i)) && mpp.get(t.charAt(i))==0)
        {
          return false;
        }
        else
        {
          return false;
        }

      }
      
      return true;
    }
}
