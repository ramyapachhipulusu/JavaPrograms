import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class localDate{
    public static void main(String args[]){
        LocalDate now =LocalDate.now();
        LocalDate after=LocalDate.of(2025, 6, 1);
        Period pd=Period.between(now,after);
        int days=pd.getDays();
        int months=pd.getMonths();
        int years=pd.getYears();
        System.out.println(years*365+months*30+days);

        long tdays=ChronoUnit.DAYS.between(now, after);
        System.out.println("Total days"+tdays);
    }
}