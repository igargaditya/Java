import java.util.Scanner;

public class a38_try {
    public static void main(String[] args) {

        Scanner sc = null;
        int num = 0;
        try {
            sc = new Scanner(System.in);
            num = sc.nextInt();
        } finally {
            sc.close();
        }
        System.out.println(num);
    }
}

// Some statement which we have to do irrespective or exception or not
// and when we want to close the resource