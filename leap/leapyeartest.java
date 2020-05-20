package leap;
import static org.junit.Assert.*;

import org.junit.Test;
public class leapyeartest {
	private leapyear lp;
@Test
public void isnotleap_1900()
{
	assertFalse(lp.isLeap(1900));
}
}
