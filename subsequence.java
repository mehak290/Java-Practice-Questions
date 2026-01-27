public class subsequence {
    public static void subseq(String s, String res) {
        //base case
        if (s.length() == 0) {
            System.out.println(res);
            return;
        }
        char ch = s.charAt(0);
        // not take
        subseq(s.substring(1), res);
        // take
        subseq(s.substring(1), res + ch);
    }
    public static void main(String[] args) {
        String s = "abc";
        subseq(s, "");
    }
}
