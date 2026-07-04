package util;

import java.util.Scanner;

public class InputHandler {
    private static final Scanner scanner = new Scanner(System.in);

    public static String inputString(String prompt) {
        System.out.println(prompt);
        return scanner.nextLine().trim();
    }

    public static int inputInt(String prompt) {
        while (true) {
            try {
                System.out.println(prompt);
                return Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Input harus berupa nagka bulat! Silahkan coba lagi.");
            }
        }
    }

    public static double inputdouble(String prompt) {
        while (true) {
            try {
                System.out.println(prompt);
                return Double.parseDouble(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Input harus berupa angka desimal! Gunakan tanda titik(.).");
            }
        }
    }
}
