package first;

public class StringBuilder {
    public static void main(java.lang.String[] args) {
        getOutput(getData(provideData()));
    }

    private static java.lang.String[] provideData() {
        return new java.lang.String[]{"brange", "plum", "tomato", "onion", "grape"};
    }

    private static java.lang.String getData(java.lang.String[] items) {
        java.lang.StringBuilder stringBuilder = new java.lang.StringBuilder();
        int count = 0;
        for (java.lang.String name : items) {
            count++;
            stringBuilder
                    .append(count)
                    .append(")")
                    .append(name)
                    .append("\n");
        }
        return stringBuilder.toString();
    }

    private static void getOutput(java.lang.String output) {
        System.out.println(output);
    }
}