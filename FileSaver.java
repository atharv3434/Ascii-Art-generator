import java.io.FileWriter;
import java.io.IOException;

public class FileSaver {
    public static void saveToFile(StringBuilder[] art) {
        try (FileWriter fw = new FileWriter("ascii_art.txt")) {
            for (StringBuilder line : art) {
                fw.write(line.toString() + "\n");
            }
            System.out.println("✅ ASCII Art saved to ascii_art.txt");
        } catch (IOException e) {
            System.out.println("❌ Error saving file.");
        }
    }
}
