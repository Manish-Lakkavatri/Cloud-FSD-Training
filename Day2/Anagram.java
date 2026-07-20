package Day2;

public class Anagram {

    public static boolean isValidAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        int[] freq = new int[256];

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
            freq[t.charAt(i)]--;
        }

        for (int count : freq) {
            if (count != 0) {
                return false;
            }
        }
        

        return true;
    }


    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        System.out.println(isValidAnagram(str1, str2));
        
    }
}