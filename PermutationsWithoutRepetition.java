import java.util.*;
import java.math.BigDecimal;

public class Program {
    public static void main(String[] args) {
        String elements = "5";
        System.out.print("Permutations without repetition: " + factorial(new BigDecimal(elements)));
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
