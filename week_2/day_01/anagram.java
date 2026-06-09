import java.util.HashMap;
public class anagram{
    public static void main(String [] args){
        String s= "car";
        String t="tar";

        boolean ans=isAnagram(s,t);
        System.out.println(ans);
    }
    public static boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> mp=new HashMap<>();
        HashMap<Character,Integer> map=new HashMap<>();
        for( char ch: s.toCharArray()){
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        }
        for( char c: t.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        if(mp.equals(map)) return true;
        return false;
    }
}