public class validstring{
    public static void main(String args[]){
        String s="A man, a plan, a canal: Panama";
        boolean ans=isPalindrome(s);
        System.out.println(ans);

    }
    public static boolean isPalindrome(String s) {
        String store="";
        s=s.toLowerCase();

    for(char ch : s.toCharArray()) {
        if((ch>='a' && ch<='z')|| ch>='0' && ch<='9'){
            store=store+ch;
        }
    }
    String reverse="";
    for(int i = store.length() - 1; i >= 0; i--) {
    reverse += store.charAt(i);
    }
    for(int i=0;i<store.length();i++){
        if(store.charAt(i)!=reverse.charAt(i))
        return false;
    }
    return true;
    }
}