import java.util.*;
import java.math.BigDecimal;

public class Program {
    public static void main(String[] args) {
        String elements = "30";
        String forms = "5";
        BigDecimal divisor = factorial(new BigDecimal(forms)).multiply(factorial(new BigDecimal(elements).subtract(new BigDecimal(forms))));
        System.out.print("Combinations without repetition: " + factorial(new BigDecimal(elements)).divide(divisor));
    }
    
    public static BigDecimal factorial(BigDecimal n) {
        if (n.compareTo(BigDecimal.ZERO) == 0) {
            return BigDecimal.ONE;
        } else {
            BigDecimal b = n;
            b = b.subtract(BigDecimal.ONE);
            BigDecimal result = n;

            for (BigDecimal i = n; i.compareTo(BigDecimal.ONE) > 0; i = i.subtract(BigDecimal.ONE)) {
                result = result.multiply(b);
                b = b.subtract(BigDecimal.ONE);
            }
            return result;
        }
    }
}
