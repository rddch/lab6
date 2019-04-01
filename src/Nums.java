import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Nums {

    private final double N = 24.0;
    private char[] chars = {'+', '-', '/', '*'};
    private String[] str = new String[7];
    private Object javaScript = null;

    public boolean option(double one, double two, double three, double four) {

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

                        for (int i = 0; i < str.length; i++) {
                        javaScript = new ScriptEngineManager().getEngineByName("JavaScript").eval(str[i]);
                            if (javaScript.equals(N)) {
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
