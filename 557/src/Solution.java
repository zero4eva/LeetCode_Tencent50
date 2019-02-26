import java.util.Arrays;

class Solution {
    public String reverseWords(String s) {
        StringBuffer sb = new StringBuffer();
        Arrays.asList(s.split(" ")).forEach((word) -> sb.append(new StringBuffer(word).reverse()).append(' '));
        return sb.substring(0,sb.length()-1);
    }

    public static void main() {

    }
}