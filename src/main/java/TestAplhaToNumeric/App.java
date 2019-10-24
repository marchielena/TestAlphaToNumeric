package TestAplhaToNumeric;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) {
        // TODO code application logic here
        //System.out.println((char)99);
        System.out.println(Convertitore("m10bs5"));
    }

    static char[] alpha = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    public static String Convertitore(String convertire) {
        String r = "";
        for (int i = 0; i < convertire.length(); i++) {
            char x = convertire.charAt(i);
            int pos = lettera(alpha, x);
            if (pos >= 0) {
                r += pos + "";
            } else {
                //System.out.println(x);
                //System.out.println(i+1 >= convertire.length());
                //System.out.println(lettera(alpha, convertire.charAt(i+1)) >= 0);
                if (i + 1 >= convertire.length() || lettera(alpha, convertire.charAt(i + 1)) >= 0) {
                    r += alpha[(x - 48) - 1];
                } else {
                    String num = x + "";
                    r += alpha[(Integer.parseInt(num.concat(convertire.charAt(i + 1) + ""))) - 1];
                    i++;

                }
            }
        }
        //System.out.println(r);
        return r;
    }

    public static int lettera(char[] alpha, char x) {
        for (int i = 0; i < alpha.length; i++) {
            char c = alpha[i];
            if (c == x) {
                return i + 1;
            }
        }
        return -1;
    }
}
