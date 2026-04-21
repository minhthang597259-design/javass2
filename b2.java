import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một số nguyên từ 1 đến 12: ");
        int month = scanner.nextInt();

        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println("Tên tháng: Tháng " + month);
                System.out.println("Số ngày: 31 ngày");
                break;
            case 4: case 6: case 9: case 11:
                System.out.println("Tên tháng: Tháng " + month);
                System.out.println("Số ngày: 30 ngày");
                break;
            case 2:
                System.out.println("Tên tháng: Tháng 2");
                System.out.println("Số ngày: 28 hoặc 29 ngày");
                break;
            default:
                System.out.println("Tháng không hợp lệ");
        }

        scanner.close();
    }
}
