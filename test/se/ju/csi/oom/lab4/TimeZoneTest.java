package se.ju.csi.oom.lab4;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashSet;

import org.junit.Before;
import org.junit.Test;

public class TimeZoneTest {

	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void testShiftTimeZone() {
//		fail("Not yet implemented");
		
		DateTime testdate = new DateTime(2016, 1, 1, 6, 0, 0);
		
		String rightDate = "2015-12-31 21:00:00";
		String testD = TimeZoneTranslator.shiftTimeZone(testdate, 0,-9).toString();
		
		assertEquals(rightDate, testD);
		
		System.out.println(rightDate);
		
		System.out.println(testD);
			
	}

	@Test
	public void testShiftEventTimeZone() {
//		fail("Not yet implemented");
		
		DateTime eventStart = new DateTime(2018, 8, 10, 12, 30, 0);
		DateTime eventEnd = new DateTime(2018, 8, 10, 14, 30, 0);		
		Person Mans = new Person("Mans");
		Person Rabert = new Person("Robert");
		Place JU = new Place("JU", 0.0, 0.0, 0.0);
		
		DateTime eventIKnowStart = new DateTime(2018,8,10,16,30,0);
		DateTime eventIKnowEnd = new DateTime(2018, 8, 10, 18, 30, 0);
		
		Event testiKnow = new Event("Meme Conference", eventIKnowStart, eventIKnowEnd,  new HashSet<>(Arrays.asList(Rabert, Mans)), JU);
			
		Event test = new Event("Meme Conference", eventStart, eventEnd, new HashSet<>(Arrays.asList(Rabert, Mans)), JU);	
		test = TimeZoneTranslator.shiftEventTimeZone(test, TimeZone.GREENWICH_UTC, TimeZone.UNITED_ARAB_EMIRATES);
		
		System.out.println(test.toString());
		
		
		assertEquals(test.toString(), testiKnow.toString());
	}

}
