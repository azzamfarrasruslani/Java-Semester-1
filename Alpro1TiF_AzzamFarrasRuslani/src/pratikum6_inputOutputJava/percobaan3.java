package pratikum6_inputOutputJava;

/**
 *
 * @author  Azzam Farras Ruslani, 1 TI F
 */
public class percobaan3 {

    public static void main(String[] args) {
        String text = "123";

        byte b = Byte.parseByte(text);
        int i = Integer.parseInt(text);
        long l = Long.parseLong(text);
        float f = Float.parseFloat(text);
        double d = Double.parseDouble(text);
        boolean bl = Boolean.parseBoolean(text);

        System.out.println(b);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(bl);
    }
}
