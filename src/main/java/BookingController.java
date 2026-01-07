import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/bookings")
public class BookingController {

    @GetMapping("/health")
    public String health() {
        return "Booking service is running";
    }

    @PostMapping
    public String createBooking() {
        return "Booking created successfully";
    }
}
