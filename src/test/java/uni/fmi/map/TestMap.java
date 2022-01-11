package uni.fmi.map;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class TestMap {

	@Test
	public void test1() {
		final Map<String, String> testInstance = new HashMap<String, String>();
		testInstance.put("test", "testValue1");
		System.out.println(testInstance.get("test"));
		testInstance.put("test", "testValue2");
		System.out.println(testInstance.get("test"));
		testInstance.put("test", "testValue3");
		System.out.println(testInstance.get("test"));
		assertEquals(1,testInstance.size());
		assertEquals("testValue3",testInstance.get("test"));
	}
	
}
