package supportServices;
import java.time.LocalDateTime;

public interface confirmation {
    String getEquipmentID();
    LocalDateTime getTimestamp();
    Status getStatus();
    String getMessage();
}