import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Counter {
    public static void main(String[] args) throws Exception {
        LocalDate today = LocalDate.now();
        LocalDate definedDate = LocalDate.of(2016, 05, 04);
        long data = ChronoUnit.YEARS.between(definedDate, today);

        System.out.println("Já tem " + data + " anos em que sou uma pessoa mais feliz.");
        
    }
}
