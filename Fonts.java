import java.util.HashMap;

public class Fonts {
    public static final HashMap<Character, String[]> FONT_MAP = new HashMap<>();

    static {
        FONT_MAP.put('H', new String[]{
                "H   H",
                "H   H",
                "HHHHH",
                "H   H",
                "H   H"
        });
        FONT_MAP.put('I', new String[]{
                " III ",
                "  I  ",
                "  I  ",
                "  I  ",
                " III "
        });
        FONT_MAP.put('E', new String[]{
                "EEEEE",
                "E    ",
                "EEE  ",
                "E    ",
                "EEEEE"
        });
        FONT_MAP.put('L', new String[]{
                "L    ",
                "L    ",
                "L    ",
                "L    ",
                "LLLLL"
        });
        FONT_MAP.put('O', new String[]{
                " OOO ",
                "O   O",
                "O   O",
                "O   O",
                " OOO "
        });
        // Add more letters as needed
    }
}
