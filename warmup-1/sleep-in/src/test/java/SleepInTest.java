import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SleepInTest {

    @Test
    public void ReturnTrueWhenWeekdayIsFalseAndVacationIsFalse() {
      assertEquals(true, new SleepIn().getSleepInStatus(false, false));
    }

    @Test
    public void ReturnFalseWhenWeekdayIsTrueAndVacationIsFalse() {
      assertEquals(false, new SleepIn().getSleepInStatus(true, false));
    }

    @Test
    public void ReturnTrueWhenWeekdayIsFalseAndVacationIsTrue() {
      assertEquals(true, new SleepIn().getSleepInStatus(false, true));
    }

    @Test
    public void ReturnTrueWhenWeekdayIsTrueAndVacationIsTrue() {
      assertEquals(true, new SleepIn().getSleepInStatus(true, true));
    }

}
