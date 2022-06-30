import java.util.Scanner;

public class JobRotation2 {

    public static long fibo(int n) {
        if (n < 2) {
            return n;
        } else {
            return fibo(n - 1) + fibo(n - 2);

        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int entrada = input.nextInt();

        boolean eFibonnacci= false;
        for (int i = 0; i <= entrada; i++) {
            if (fibo(i) == entrada) {
                System.out.println("E fibonacci: " + entrada );
                eFibonnacci = true;
                break;
            }
            fibo(i);
        }
        if (!eFibonnacci) {
            System.out.println("Nao e fibonacci: " + entrada);
        }
    }

    }