public class Vowels {
    public static void main(String[] args) {
        String st = "youcandoit";
        removeVowel(st);

        for(int i = 0; i <= 10; i ++) {
            if(i == 7) {
                continue;  // this will skip 7 from the iteration 
            } else if(i > 8) {
                break;   // this will stop the loop when it reaches 9
            }

            System.out.println(i);
        }
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
