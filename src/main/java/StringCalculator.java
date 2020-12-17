import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.stream.Stream;

public class StringCalculator {

    DecimalFormat df;

    StringCalculator(){
        DecimalFormatSymbols formatSymbols = new DecimalFormatSymbols();
        formatSymbols.setDecimalSeparator('.');
        df = new DecimalFormat();
        df.setDecimalFormatSymbols(formatSymbols);
    }

    public String add(String number) {
        String[] numbers = number.split(",");

        if (numbers.length > 2) {
            //not clear about exceptions
            throw new IllegalArgumentException("Too many arguments (0, 1 or 2 accepted");
        }

        return df.format(Stream.of(numbers).mapToDouble(this::mapString).sum());
    }

    private Double mapString(String string) {
        if (string.isEmpty()) {
            return 0d;
        }
        return Double.parseDouble(string);
    }
}
