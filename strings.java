
public class strings {

    public static boolean palindrom(String str) {

        String s = str.toLowerCase();
        s = s.replaceAll("A-Za-z0-9", "");

        for (int i = 0; i < s.length() / 2; i++) {

            int last = s.length();

            if (s.charAt(i) != s.charAt(last - 1 - i)) {

                return false;
            }

        }
        return true;
    }

    public static String compressionStrings(String str) {

        StringBuilder sb = new StringBuilder("");
        int count = 0;
        for (int i = 0; i < str.length(); i++) {

            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if (count > 1) {
                sb.append(count);
            }
        }
        return sb.toString();
    }

    public static String prefix(String[] str) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length; i++) {

            if (str[i].charAt(i) != str[i + 1].charAt(i)) {
                return "null";
            } else {
                while (i < str.length - 1 || str[i].charAt(i) == str[i + 1].charAt(i)) {
                    sb.append(str[i].charAt(i));
                    if (i < str.length) {
                        i++;

                    }
                }
                String newStr = sb.toString();
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String str[] = {"dog", "racecar", "car"};
        String str1 = "aabbbca";
        // str.toUpperCase();
        // System.out.print(str.toLowerCase());
        // str.toLowerCase();
        // String newstr = str.replaceAll(",", "").replaceAll(":", "").toLowerCase();
        // System.out.println(prefix(str));
        System.out.println(compressionStrings(str1));
    }
}
