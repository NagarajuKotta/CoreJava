public class SeaValleyCount {

    public static void main(String[] args) {
        String str = "DDUUDDUDUUUD";
        seaValleyCount(str);
    }

    public static void seaValleyCount(String str) {
        char ch[] = str.toCharArray();
        int valleyCount = 0;
        int level = 0;
        for (int c = 0; c < ch.length; ++c) {
            if (ch[c] == 'D') {
                level--;
            } else if (ch[c] == 'U') {
                ++level;
                if (level == 0)
                    ++valleyCount;
            }
        }
        System.out.println("Sea valley count = " + valleyCount);
    }
}
