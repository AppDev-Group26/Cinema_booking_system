/*
 *  Name: Siphiwe Edson Chauque
 *  Student Number: 219084777
 *  Group: 26
 *
 */

package factoryTest;
import domain.Timeslot;
import factory.TimeslotFactory;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TimeslotFactoryTest {

 @Test
    public void test(){
       Timeslot timeslot = TimeslotFactory.createTimeslot("Mega","09:00","Yes");
     System.out.println(timeslot.toString());
       assertNotNull(timeslot);
     }

}
