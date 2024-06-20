public class LeetCodeLongestSubstringWithoutRepetingCharacters {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("dvdf");
        StringBuilder s1 = new StringBuilder(s.substring(1));

        StringBuilder fs = new StringBuilder();
        StringBuilder cs = new StringBuilder();

        cs.append(s.charAt(0));

        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            if (cs.toString().contains(Character.toString(c))) {
                if (fs.length() < cs.length()) {
                    fs = new StringBuilder(cs);
                }

                int j = cs.indexOf(Character.toString(c)) + 1;
                cs = new StringBuilder(cs.substring(j));
                cs.append(c);
            } else {
                cs.append(c);
            }
        }
        if (cs.length() > fs.length()) {
            fs = new StringBuilder(cs);
        }
        System.out.println(fs.length());
    }

}

