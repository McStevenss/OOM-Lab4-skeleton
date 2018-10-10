package se.ju.csi.oom.lab4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TimeTesting {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void test() {
//		fail("Not yet implemented");
		
		String timeThatIKnow = "2018-08-10 13:10:00";
		System.out.println(timeThatIKnow);
		DateTime timeToTest = new DateTime(2018, 8, 10, 13, 10, 0);
		System.out.println(timeToTest);
		
		String stringToTest = timeToTest.toString();

		assertEquals(timeThatIKnow, stringToTest);
		
		
		DateTime dateToTest;
		dateToTest = new DateTime(timeThatIKnow);
		
		stringToTest = dateToTest.toString();
		
		assertEquals(timeThatIKnow, stringToTest);
		
	}

}
