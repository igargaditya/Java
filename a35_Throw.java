class AdityaException extends Exception {

    public AdityaException(String s) {
        super(s); // Calls the constructor of parent class
    }
}

public class a35_Throw {

    public static void main(String[] args) {

        int i = 20;
        int j = 18;

        try {
            j = 18 / i;
            if (j == 0) {
                // throw new ArithmeticException("J has been 0 so defaulted it ");
                throw new AdityaException("Hey");
            }
        } catch (ArithmeticException e) {
            j = 18 / 1;
            System.out.println("Thats The Default Valye of j :" + e);

        } catch (AdityaException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println("Something went wrong");
        }
        System.out.println(j);
        System.out.println("Bye");
    }
}

// Throw Keyword is used to throw the exception