import java.time.LocalDate;
import java.time.LocalDateTime;

public class Gigasecond {
  LocalDateTime localDateTime;
  public Gigasecond(LocalDate moment) {
    localDateTime = moment.atStartOfDay();
  }

  public Gigasecond(LocalDateTime moment) {
    localDateTime = moment;
  }

  public LocalDateTime getDateTime() {
    long secondsToAdd = 1000000000;
    localDateTime = localDateTime.plusSeconds(secondsToAdd);
    return localDateTime;
  }
}
