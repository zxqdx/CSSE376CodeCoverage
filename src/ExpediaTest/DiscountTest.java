package ExpediaTest;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import Expedia.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
public class DiscountTest {
	@Test
	public void TestThatDiscountInitializes()
	{
		Discount target = new Discount(0.01, 1);
		Assert.assertNotNull(target);
		Assert.assertEquals(0.01, target.ReductionPercent, 0.0001);
		Assert.assertEquals(1, target.FrequentFlyerMilesCost);
	}
}
