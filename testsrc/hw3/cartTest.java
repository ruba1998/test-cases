package hw3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class cartTest {

	private cart classtest;
	
	@Before
	public void setUp() throws Exception {
		classtest=new cart();
	}

	@Test
	public void size0() {
	//	fail("Not yet implemented");
		assertEquals(classtest.size(),0);
	}

	@Test
	public void size1AndPrice127() {
		//fail("Not yet implemented");
		product p=new product("java book",127,1);
		classtest.add(p);
		assertEquals(1,classtest.size());
		assertEquals(127,classtest.total_cart());
		

	}
	@Test
	public void size2AndPrice227() {
		//fail("Not yet implemented");
		
		product p=new product("java book",127,1);
		classtest.add(p);
		assertEquals(1,classtest.size());
		assertEquals(127,classtest.total_cart());
		
		 p=new product("web design book",100,1);
		classtest.add(p);
	//	System.out.print(classtest.total_cart());
		assertEquals(227,classtest.total_cart());

		assertEquals(2,classtest.size());

	}
	

}
