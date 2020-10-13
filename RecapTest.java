package tests;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import com.testreview.day7.MathUtil;


public class RecapTest {
	MathUtil calc;
	
	@BeforeEach
	void setUp() {
		calc = new MathUtil();
	}
	
	@Test
	void testCirc() {
		int radius =4;
		
		double expected = 2*3.14*radius;
		
		double actual= calc.circ(radius);
		
		assertEquals(actual,expected,"Doesnt give right circumfrence")
	}
	@Test
	void testAdd() {
		int expected=2;
		int actual=calc.add(1,1);
		assertEquals(actual,expected,"Did not add right")
	}

}
