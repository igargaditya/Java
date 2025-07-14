public class Strings2 {
    public static void main(String[] args) {
        String name = new String("Aditya");
        String name1 = new String("AdItya");

        // 1. Length
        System.out.println(name1.length());
        // 2. Checks for the content of String (Case Sensitive)
        System.out.println(name.equals(name1));
        // 3. Checks for the content of String (Case Insensitive)
        System.out.println(name.equalsIgnoreCase(name1));
        // 4. Get Char at some index
        System.out.println(name.charAt(1));

        // Important
        // 5. ComapreTo (returns the difference of Ascii value between 2 strings)
        String name2 = "Pearl Rathour";
        System.out.println('P' + 0); // 80
        System.out.println('A' + 0); // 65
        System.out.println(name1.compareTo(name2)); // A-P = -15
        System.out.println(name2.compareTo(name1)); // P-A = 15

        // 6. Substring
        System.out.println(name2.substring(6));
        System.out.println(name2.substring(1, name2.length())); // Endindex not included

        // 7. Uppercase and lowercase
        System.out.println(name2.toUpperCase());

        // 8. Trim
        System.out.println(name2.trim());

        // 9. Replace - Changes every occurence
        System.out.println(name2.replace("earl", "early"));

        // 10. Contains
        System.out.println(name2.contains("earl"));

        // 11. Empty String check
        System.out.println("     ".isEmpty());
        System.out.println("     ".isBlank());

        // 12. Index of --> first index of char
        System.out.println(name2.indexOf("Pe"));

        // 13. Conver int into String
        int a = 100;
        String b = String.valueOf(a);
        System.out.println(b);

        // 14. Format String
        String c = String.format("I am %s and i am %d year old", "Aditya", 23);
        System.out.println(c);

    }
}
