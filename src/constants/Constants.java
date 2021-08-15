package constants;

import shared.StringHelpers;

public class Constants {

    public static class Display {
        public static enum IndentationType {
            TAB("\t"), SPACE("    ");

            private String val;

            private IndentationType(String val) {
                this.val = val;
            }

            @Override
            public String toString() {
                return val;
            }

        }

        public static final IndentationType INDENTATION_TYPE = IndentationType.TAB;
        public static final int BREAKLINE_LENGTH = 100;
        public static final String BREAKLINE_PATTERN = "_";
        public static final String BREAKLINE;
        public static final String INVALID_INPUT_RESPONSE = "Invalid input baby, the king don't mess around~";
        static {
            BREAKLINE = StringHelpers.repeat(BREAKLINE_LENGTH, BREAKLINE_PATTERN) + System.lineSeparator();
        }

    }

    public static class DukeBot {
        public static final String NAME = "Duke Nukem";
        public static final String CATCHPHRASE = "Hail to the king, baby";
    }
}
