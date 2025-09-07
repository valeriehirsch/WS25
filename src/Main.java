
public class Main {
    public static void main(String[] args) {
        Aufgabe3();
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
}