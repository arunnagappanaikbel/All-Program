import java.math.BigDecimal;
public class BigDecimalAdd {
    public static void main(String[] args) {

                                                 // create 3 BigDecimal objects
        BigDecimal bg1,bg2,bg3;

        // assign value to bg1 and bg2
        bg1 = new BigDecimal("40.732");
        bg2 = new BigDecimal("30.12");

        // print bg1 and bg2 value
        System.out.println("Object Value is " + bg1);
        System.out.println("Augend value is " + bg2);

        bg3 = bg1.add(bg2);

        // print bg3 value
        System.out.println("Result is " + bg3);
    }
}
