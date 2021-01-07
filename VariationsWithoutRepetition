import java.util.*;
import java.math.BigDecimal;

public class Program {
    public static void main(String[] args) {
        BigDecimal elements = new BigDecimal("10");
        BigDecimal result = elements;
        String forms = "2";

        for (BigDecimal i = BigDecimal.ONE; i.compareTo(new BigDecimal(forms)) < 0; i = i.add(BigDecimal.ONE)) {
            elements = elements.subtract(BigDecimal.ONE);
            result = result.multiply(elements);
        }

        System.out.print("Variations without repetition: " + result);
    }
}
