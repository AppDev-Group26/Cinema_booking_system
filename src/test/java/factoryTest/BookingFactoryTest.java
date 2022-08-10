/*
 *  Name: Siphiwe Edson Chauque
 *  Student Number: 219084777
 *  Group: 26
 *
 */

package factoryTest;
import domain.Booking;
import factory.BookingFactory;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BookingFactoryTest {

     @Test
    public void test (){
         Booking booking = BookingFactory.createBooking(
                 2637,
                 45,
                 "17 June 2022",
                 "12:40",
                 "A14",
                 174);
         System.out.println(booking.toString());
         assertNotNull(booking);

     }


}
