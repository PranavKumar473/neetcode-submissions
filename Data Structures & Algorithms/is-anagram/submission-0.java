class Solution {
    public boolean isAnagram(String s, String t) {
      HashMap<Character, Integer> hmap = new HashMap<>();

      if(s.length()!=t.length()){
        return false;
      }

      for(int i=0;i<s.length();i++){
        char charS = s.charAt(i);
        char charT = t.charAt(i);
        hmap.put(charS,hmap.getOrDefault(charS,0)+1);
        hmap.put(charT,hmap.getOrDefault(charT,0)-1);
      }
      for(int count:hmap.values()){
        if(count!=0){
            return false;
        }
      }
      return true;
    }
}
