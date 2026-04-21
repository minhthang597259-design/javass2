import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;

        while (true) {
            System.out.print("Nhập một số nguyên dương N: ");
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                if (n > 0) {
                    break;
                } else {
                    System.out.println("Số nhập vào không hợp lệ");
                }
            } else {
                System.out.println("Số nhập vào không hợp lệ");
                scanner.next(); 
            }
        }

        System.out.println("Danh sách các số Armstrong từ 0 đến " + n + ":");
        for (int i = 0; i <= n; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        
        scanner.close();
    }

    public static boolean isArmstrong(int num) {
        if (num == 0) {
            return true;
        }

        int k = String.valueOf(num).length();
        int sum = 0;
        int temp = num;

        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, k);
            temp /= 10;
        }

        return sum == num;
    }
}
