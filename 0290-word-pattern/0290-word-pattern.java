import java.util.*;
class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String>map = new HashMap<>();
        String [] ans = s.split(" ");
        if(ans.length != pattern.length()){
            return false;
        }
        for(int i = 0;i<pattern.length();i++){
            char ch = pattern.charAt(i);
            String word = ans[i];
            if(map.containsKey(ch)){
                if(!map.get(ch).equals(word)){
                    return false;
                }
                
            }
            else{
                if(map.containsValue(word)){
                    return false;
                }
                map.put(ch,word);
            }
        }return true;
    }
}