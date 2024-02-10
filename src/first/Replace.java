package first;

public class Replace {
    public static void main(String[] args) {
        String input = "brange, plum, tomato, onibn, grape";
        String corrected = input.replace("brange", "orange").replace("onibn", "onion");
        System.out.println(corrected);
//        StringBuffer sb = new StringBuffer("onibn");
//        sb.replace(3,4,"o");
//        System.out.println(sb);
    }
}
