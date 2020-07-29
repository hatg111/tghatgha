public class Pprogram {
    public static void main(String[] args) {
        char q = 34;
        String[] codeLines = {
                "public class Pprogram {",
                "    public static void main(String[] args) {",
                "        char q = 34;",
                "        String[] codeLines = {",
                "            ",
                "        };",
                "",
                "        for (int i = 0; i < 4; i++) {",
                "            System.out.println(codeLines[i]);",
                "        }",
                "        for (int i = 0; i < codeLines.length; i++) {",
                "            System.out.println(codeLines[4] + q + codeLines[i] + q + ',');",
                "        }",
                "        for (int i = 5; i< codeLines.length; i++) {",
                "            System.out.println(codeLines[i]);",
                "        }",
                "    }",
                "}",
        };

        for (int i = 0; i < 4; i++) {
            System.out.println(codeLines[i]);
        }
        for (int i = 0; i < codeLines.length; i++) {
            System.out.println(codeLines[4] + q + codeLines[i] + q + ',');
        }
        for (int i = 5; i< codeLines.length; i++) {
            System.out.println(codeLines[i]);
        }
    }
}
