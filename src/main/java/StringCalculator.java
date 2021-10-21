import java.math.BigDecimal;

public class StringCalculator {

    public static final String NUMBER_SEPARATOR = ",";
    public static final String EMPTY_NUMBER = "0";

    public String add(String stringNumber) {
        if(stringNumber.isEmpty()) {
            return EMPTY_NUMBER;
        }

        BigDecimal sum = BigDecimal.ZERO;
        for(String number : stringNumber.split(NUMBER_SEPARATOR)) {
            sum = sum.add(new BigDecimal(number));
        }
        return sum.toString();
    }
}
