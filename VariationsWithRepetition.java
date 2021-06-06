import java.util.*;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        String elements = "14";
        String forms = "3";
        System.out.print("Variations with repetition: " + new BigDecimal(elements).pow(Integer.parseInt(forms)));
    }
}
