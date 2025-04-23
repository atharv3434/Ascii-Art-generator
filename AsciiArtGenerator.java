import java.util.Scanner;

public class AsciiArtGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text (UPPERCASE only): ");
        String input = sc.nextLine().toUpperCase();

        StringBuilder[] outputLines = new StringBuilder[5];
        for (int i = 0; i < 5; i++) outputLines[i] = new StringBuilder();

        for (char c : input.toCharArray()) {
            String[] pattern = Fonts.FONT_MAP.getOrDefault(c, new String[]{"     ", "     ", "     ", "     ", "     "});
            for (int i = 0; i < 5; i++) {
                outputLines[i].append(pattern[i]).append("  ");
            }
        }

        System.out.println("\nASCII ART:\n");
        for (StringBuilder line : outputLines) {
            System.out.println(line);
        }

        System.out.print("\nDo you want to save this art to a file? (yes/no): ");
        String choice = sc.nextLine();
        if (choice.equalsIgnoreCase("yes")) {
            FileSaver.saveToFile(outputLines);
        }
    }
}
