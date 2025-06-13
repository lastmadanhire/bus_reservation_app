
import com.lm.busreservation.entities.Bus;
import com.lm.busreservation.entities.BusRoute;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BusSchedule {
    @Id
    private Long scheduleId;
    private Bus bus;
    private BusRoute busRoute;
    private String departureTime;
    private int ticketPrice;
    private int discount;
    private int processingFee;
}
