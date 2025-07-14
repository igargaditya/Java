public class Strings_Performance {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        String s1 = "";
        long startime = System.currentTimeMillis();
        for (int i = 0; i < 200000; i++) {
            s1 += ("a");
        }
        long endTime = System.currentTimeMillis();

        System.out.println("String Adding 1000 times : " + (endTime - startime) + " ms");

        StringBuilder s2 = new StringBuilder("");
        startime = System.currentTimeMillis();
        for (int i = 0; i < 200000; i++) {
            s2.append("a");
        }
        endTime = System.currentTimeMillis();

        System.out.println("StringBuilder Adding 1000 times : " + (endTime - startime) + " ms");

        StringBuffer s3 = new StringBuffer("");
        startime = System.currentTimeMillis();
        for (int i = 0; i < 200000; i++) {
            s2.append("a");
        }
        endTime = System.currentTimeMillis();

        System.out.println("StringBuffer Adding 1000 times : " + (endTime - startime) + " ms");

    }
}
