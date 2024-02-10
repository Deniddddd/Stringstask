package second;

public class Delet {
    public static void main(String[] args) {
        String sb = "orange, plum, tomato, onion, grape, onion";
        StringBuffer buffer = new StringBuffer(sb);
        while(buffer.indexOf("onion") != -1) {
            int index = buffer.indexOf("onion");
            buffer.delete(index, index + "onion".length());
        }
        System.out.println(buffer);
    }
}
