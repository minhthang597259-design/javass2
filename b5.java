package btvnss1;
import java.util.Scanner;
public class b5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a,b,c,d;
        System.out.println("can nang : ");
        a=sc.nextDouble();
        System.out.println("chieu cao : ");
        b=sc.nextDouble();
        System.out.printf("chi so bmi : %.2f\n", a/(b*b));


    }
}
