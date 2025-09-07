
public class Main {
    public static void main(String[] args) {
        Aufgabe2();
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
}