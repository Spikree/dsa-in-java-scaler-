public class Vowels {
    public static void main(String[] args) {
        String st = "youcandoit";
        removeVowel(st);
    }

    public static void removeVowel(String st) {
        for(int i = 0; i < st.length(); i ++ ) {
            char ch = st.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                continue;
            }
            System.out.print(ch);
        }
    }
}
