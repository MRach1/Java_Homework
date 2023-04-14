package DZ1;

import java.util.Scanner;

public class t4 {
    public static void main(String[] args){
        System.out.println("Введите первое число:");
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        System.out.println("Введите второе число:");
        double b = in.nextDouble();
        System.out.println("1 - сложение\n2 - вычитание\n3 - умножение\n4 - деление");
        System.out.println("Выберите номер операции:");
        int c = in.nextInt();
        System.out.println(calc(a, b, c));
    }
    public static double calc(double a1, double a2, int t){
        if (t == 1){
            return a1 + a2;
        }
        if (t == 2){
            return a1 - a2;
        }
        if (t == 3){
            return a1 * a2;
        }
        else{
            return a1/a2;
        }
    }
}
