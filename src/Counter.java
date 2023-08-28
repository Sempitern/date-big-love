import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Counter {
    public static void main(String[] args) throws Exception {
        LocalDate today = LocalDate.now();
        LocalDate definedDate = LocalDate.of(2016, 05, 04);

        Period  period = Period.between(definedDate, today);

        int years = period.getYears();
        int months = period.getMonths();
        int days = period.getDays();

        System.out.println("Já se faz " + years + " anos, " + months + " meses e " + days + " dias em que sou uma pessoa mais feliz.");
        
    }
}
