/*
 *  Name: Siphiwe Edson Chauque
 *  Student Number: 219084777
 *  Group: 26
 *
 */

package repositoryTest;
import domain.Booking;
import domain.Timeslot;
import factoryTest.TimeslotFactoryTest;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import repository.TimeslotRepositoryImpl;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@TestMethodOrder(MethodOrderer.MethodName.class)


public class TimeslotRepositoryTest<timeSlot> {

    private  static TimeslotRepositoryImpl repository = TimeslotRepositoryImpl.getRepository();
    private static Timeslot timeslot = TimeslotFactoryTest.createTimeslot(
            "5C",
            "12:00",
            "Not Available");


    @Test
     void a_create() {
        Timeslot timeslot = TimeslotFactoryTest.createTimeslot(
                "5C",
                "12:00",
                "Not Available");
       assertNotNull(timeslot);
        System.out.println("Timeslot: " + timeslot);
    }





    @Test
    void b_read() {
        Timeslot read = repository.read(Timeslot.getIsAvailable());
        System.out.println("Read :" + read);
    }

    @Test
    void update() {
        Timeslot updateTimeslot = new Timeslot.Builder().copy(timeslot)
                .setScreeningRoom("B2")
                .setTime("12:20")
                .setIsAvailable("is not available at the moment")
                .build();
        assertEquals(updateTimeslot.getScreeningRoom(), timeslot.getTime());
        System.out.println("Updated Booking: " + updateTimeslot);
    }

    @Test
    void d_delete() {
        repository.delete(Timeslot.isAvailable);
        assertNotNull(repository);
    }

    @Test
    void e_getAll() {
        System.out.println("Order: \n" + repository.getAll());
    }
}
