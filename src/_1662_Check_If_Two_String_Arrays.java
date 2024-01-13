public class _1662_Check_If_Two_String_Arrays {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for (String s : word1) {
            sb1.append(s);
        }
        for (String s: word2 ){
            sb2.append(s);
        }
        return sb1.toString().equals(sb2.toString());
    }

    public static void main(String[] args) {

    }
}
