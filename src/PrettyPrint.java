public class PrettyPrint {

    public static String makeTable(int[][] state)
    {
       StringBuilder res = new StringBuilder();
       res.append(fillLine);
       res.append(System.lineSeparator());
       res.append(makeHouseLine());
       res.append(System.lineSeparator());
       res.append(fillLine);
       res.append(System.lineSeparator());
       for(int row = 0; row < 6; ++row)
       {
           res.append(makeLine(state, row));
           res.append(System.lineSeparator());
           res.append(fillLine);
           res.append(System.lineSeparator());
       }
       return res.toString();
    }

    private static final int fieldWidth = 10;
    private static final int lineWidth = 7*fieldWidth + 8;
    private static String fillLine = "*".repeat(lineWidth);
    private static final String[] varNames = {"Navn", "Børn", "Træ", "Bil", "Farve", "Dyr"};
    private static final String[] houses = {"10", "12", "14", "16", "18", "20"};
    private static final String[] names = {"Hansen", "Olsen", "Larsen", "Madsen", "Jensen", "Nielsen"};
    private static final String[] children = {"1", "2", "3", "4", "5", "6"};
    private static final String[] trees = {"Pil", "Birk", "Eg", "Bøg", "Lærk", "Lind"};
    private static final String[] cars = {"Nissan", "Opel", "Ford", "Fiat", "Hyundai", "Tesla"};
    private static final String[] colors = {"Rød", "Blå", "Gul", "Grøn", "Hvid", "Sort"};
    private static final String[] animals = {"Hund", "Kat", "Fugl", "Fisk", "Marsvin", "Skildpadde"};
    private static final String[][] textValues = {names, children, trees, cars, colors, animals};

    private static String getValueName(int category, int value)
    {
        return textValues[category][value];
    }

    private static String pad(String str, int length)
    {
        StringBuilder res = new StringBuilder();
        int front = (length - str.length()) / 2;
        int back = length - str.length() - front;
        res.append(" ".repeat(front));
        res.append(str);
        res.append(" ".repeat(back));
        return res.toString();
    }

    private static String makeHouseLine()
    {
        StringBuilder res = new StringBuilder();
        res.append((pad("Hus", fieldWidth)));
        res.append('*');
        for(int i = 0; i < 6; ++i)
        {
            res.append(pad(houses[i], fieldWidth));
            res.append('*');
        }
        return res.toString();
    }

    private static String makeLine(int[][] state, int row)
    {
        StringBuilder res = new StringBuilder();
        res.append((pad(varNames[row], fieldWidth)));
        res.append('*');
        for(int i = 0; i < 6; ++i)
        {
            res.append(pad(textValues[row][i], fieldWidth));
            res.append('*');
        }
        return res.toString();
    }


    public static void main(String[] args) {

        Constraint all = new AllConstraints();

        int[][] state =
                {
                        {0, 1, 2, 3, 4, 5},
                        {0, 1, 2, 3, 4, 5},
                        {0, 1, 2, 3, 4, 5},
                        {0, 1, 2, 3, 4, 5},
                        {0, 1, 2, 3, 4, 5},
                        {0, 1, 2, 3, 4, 5}
                };
        System.out.println(makeTable(state));

        System.out.println(all.check(state));
    }

}
