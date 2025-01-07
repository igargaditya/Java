import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class a37_Input {
    public static void main(String[] args) throws IOException {
        // First Type of taking input
        int num1 = System.in.read();

        System.out.println(num1); // Prints the ascii value of first charachter in the output

        // Second Method

        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);
        int num2 = Integer.parseInt(bf.readLine());
        System.out.println(num2);

        bf.close(); // Its a resource so close resources

        // Third Method
        Scanner sc = new Scanner(System.in);
        int num3 = sc.nextInt();
        System.out.println(num3);

    }
}

// There is a out object of printStream class which is static method of system
// class hence
// We can use out method statically without making object of system class and
// call printlb method