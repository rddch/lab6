import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Nums {

    private final int N = 24;
    private char[] chars = {'+', '-', '/', '*'};
    private String[] str = new String[7];
    private Object[] javaScript = new Object[7];

    public boolean option(int one, int two, int three, int four) {

        try {
            for (int c = 0; c < chars.length; c++) {
                for (int ch = 0; ch < chars.length; ch++) {
                    for (int cha = 0; cha < chars.length; cha++) {

                        str[0] = one + " " + chars[c] + " " + two + " " + chars[ch] + " " +
                                three + " " + chars[cha] + " " + four;
                        str[1] = "(" + one + " " + chars[c] + " " + two + ")" + " " + chars[ch] + " " +
                                "(" + three + " " + chars[cha] + " " + four + ")";
                        str[2] = "(" + one + " " + chars[c] + " " + two + " " + chars[ch] + " " +
                                +three + ")" + " " + chars[cha] + " " + four;
                        str[3] = one + " " + chars[c] + " " + "(" + two + " " + chars[ch] + " " +
                                +three + " " + chars[cha] + " " + four + ")";
                        str[4] = "(" + one + " " + chars[c] + " " + two + ")" + " " + chars[ch] + " " +
                                three + " " + chars[cha] + " " + four;
                        str[5] = one + " " + chars[c] + " " + two + " " + chars[ch] + " " +
                                "(" + three + " " + chars[cha] + " " + four + ")";
                        str[6] = one + " " + chars[c] + " " + "(" + two + " " + chars[ch] + " " +
                                three + ")" + " " + chars[cha] + " " + four;

                        for (int i = 0; i < javaScript.length; i++) {
                        javaScript[i] = new ScriptEngineManager().getEngineByName("JavaScript").eval(str[i]);
                            if (javaScript[i].equals(N)) {
                                System.out.println("Пояснение: " + str[i]);
                                return true;
                            }
                        }
                    }
                }
            }
        } catch (ScriptException e) {
            e.printStackTrace();
        }
        return false;
    }
}
