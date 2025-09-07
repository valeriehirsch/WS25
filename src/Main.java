import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Aufgabe10();
    }
    public static void Aufgabe1 () {
        System.out.println("Hello World!");
    }

    public static void Aufgabe2 () {
        System.out.println("0123456789012345678901");

        String input ="         __            _(\\    |@@|          (__/\\__ \\--/ __          \\___|----|  |   __        \\ }{ /\\ )_ / _\\ /\\__/\\ \\__O (__         (--/\\--)    \\__/       _)(  )(_              `---''---`        ";
        String parts[] = new String[input.length()%22];

        for (int i = 0; i < parts.length; i++) {
            parts[i] = input.substring(22*(i), 22*(i+1));
        }

        for (int i = 0; i < parts.length; i++) {
            System.out.println(parts[i]);
        }

    }

    public static void Aufgabe3 () {
        char c = 'Z';
        int hexa = 0xface;
        int octnum = 012;
        long lngnum = 80L;
        float f1num = 44e-1f;
        float f2num = 5.5f;
        double d1num = 8.88e1;
        double d2num = 99.9;
        int sum = c + hexa + octnum + (int)lngnum + (int)f1num + (int)f2num + (int)d1num + (int)d2num;
        System.out.println(sum);
    }

    public static void Aufgabe4 () {
        Scanner myObj = new Scanner(System.in);
        int x = myObj.nextInt();
        int y = myObj.nextInt();
        System.out.println(x+y);
    }

    public static void Aufgabe5 () {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Before Swap:");
        System.out.print("x: ");
        int x = myObj.nextInt();
        System.out.print("y: ");
        int y = myObj.nextInt();

        // x 10
        // y 5

        x = x+y; // 15
        y = x-y; // 10
        x = x-y; // 5

        System.out.println("After Swap:");
        System.out.println("x: " + x);
        System.out.println("y: " + y);

    }

    public static void Aufgabe6 () {
        Scanner myObj = new Scanner(System.in);
        System.out.print("n1: ");
        int x = myObj.nextInt();
        System.out.print("n2: ");
        int y = myObj.nextInt();
        if (x > y) {
            System.out.println("n1 > n2");
        }
        else if (x < y) {
            System.out.println("n1 < n2");
        }
        else {
            System.out.println("n1 == n2");
        }

    }

    public static void Aufgabe7 () {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter annual Revenue: ");
        int revenue = myObj.nextInt();

        if (revenue < 0 || revenue >= 100000) {
            System.out.println("Invalid Revenue");
        } else if (revenue > 0 && revenue < 20000) {
            System.out.println("Poor Sales Revenue");
        } else if (revenue > 20000 && revenue < 50000) {
            System.out.println("Average Sales Revenue");
        } else if (revenue > 50000 && revenue < 80000) {
            System.out.println("Good Sales Revenue");
        } else if (revenue > 80000 && revenue < 100000) {
            System.out.println("Excellent Sales Revenue");
        }


    }
    public static void Aufgabe8 () {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter ComissionClass: ");
        int provision = myObj.nextInt();
        double comission = 0.00;
        switch(provision) {
            case 1:
                comission = 0.01;
                break;
            case 2:
                comission = 0.02;
                break;
            case 3:
                comission = 0.03;
                break;
            case 4:
                comission = 0.04;
                break;


            default:
                break;
        }
        System.out.println("Your Commission Rate was set to " + String.format( "%.2f", comission ));
    }

    public static void Aufgabe9 () {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Year: ");
        int leapYear = myObj.nextInt();
//        System.out.println(leapYear % 4);
//        System.out.println(leapYear % 100);
//        System.out.println(leapYear % 400);
        if ((leapYear % 4 == 0) && (leapYear % 100 != 0) || (leapYear % 400 == 0)){
            System.out.println("Leapyear");
        }
        else {
            System.out.println("Not a Leapyear");
        }
    }

    public static void Aufgabe10 () {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Number: ");
        int num = myObj.nextInt();

        int einser = num % 10;
        int zehner = (num / 10) % 10;
        int hunderter = num / 100;
        if (hunderter != 0){
            System.out.println( einser * 100 + zehner * 10 + hunderter);
        }
        else {
            System.out.println( einser * 10 + zehner);
        }
    }
}