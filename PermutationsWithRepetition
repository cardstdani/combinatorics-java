import java.util.*;
import java.math.BigDecimal;

public class Program {
    public static void main(String[] args) {
        String elements = "10";
        List<Integer> repetitions = Arrays.asList(1, 4, 2);

        BigDecimal divisor = BigDecimal.ONE;
        for (int a = 0; a < repetitions.size(); a++) {
            repetitions.set(a, factorial(new BigDecimal(repetitions.get(a).toString())).intValue());
            divisor = divisor.multiply(new BigDecimal(repetitions.get(a)));
        }

        System.out.print("Permutations with repetition: " + factorial(new BigDecimal(elements)).divide(divisor));
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
