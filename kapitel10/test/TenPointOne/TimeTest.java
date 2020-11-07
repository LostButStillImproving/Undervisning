package TenPointOne;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TimeTest {

    @Test
    public void testNoArgConstructor(){
        Time time = new Time();
        Assertions.assertEquals(14, time.getHour());
        Assertions.assertEquals(07, time.getMinute());
    }

    @Test
    public void testPassedTimeArgConstructor(){
        int passedTime = 3600000;
        Time time = new Time(passedTime);
        Assertions.assertEquals(2, time.getHour());

    }

    @Test
    public void setTimeTest() {
        Time time = new Time();
        time.setTime(555550000);
        Assertions.assertEquals(11, time.getHour());
        Assertions.assertEquals(19, time.getMinute());
        Assertions.assertEquals(10, time.getSecond());
    }

    @Test
    public void hourminsecConstructorArgsTest() {
        Time time = new Time(23, 30, 5);
        Assertions.assertEquals(23, time.getHour());
        Assertions.assertEquals(30, time.getMinute());
        Assertions.assertEquals(5, time.getSecond());
    }

}