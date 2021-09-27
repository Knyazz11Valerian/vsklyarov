package HW6;

import java.util.Scanner;

public class DepositCalculatorToRefactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s="год";
        int a;
        System.out.print("Введите сумму вклада в банк в гривнах: ");
        double sum = sc.nextDouble();
        System.out.print("Какой процент годовых? ");
        double percent = sc.nextDouble();
        System.out.print("Длительность вклада (лет): ");
        int term = sc.nextInt();
        System.out.println();

        for (int i = 1; i <= term; i++) {
            double y = sum / 100 * percent;
            sum = sum + y;
            double sumToPrint= Math.round(sum * 100.0) / 100.0;
            double yToPrint= Math.round(y * 100.0) / 100.0;
            a=i;
            if (a>100){
                a-=a/100*100;
            }
            if (a>20){
                a-=a/10*10;
            }


            switch (a) {
                case 1:
                    s = " год";
                    break;
                case 2:
                    s = " года";
                    break;
                case 5:
                    s = " лет";
                    break;
            }
            if (i>0){
                System.out.println("--------");
            }
            System.out.println("Накопленная сумма за " + i + s + " составила: " + sumToPrint);
            System.out.println("Начисленные проценты в грн: " + yToPrint);
        }
    }
}
