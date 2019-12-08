import static org.junit.Assert.*;

import org.junit.*;

public class MyListTest {
		
		private MyList mylist;

		@Before
		public void setUp() throws Exception {
			mylist = new MyList();
		}

		@After
		public void tearDown() throws Exception {
			mylist = null;
		}

		@Test
		public void testAdd() {
			mylist.add("Orange");
			assertTrue(mylist.lstFruits.contains("Orange"));
		}
		@Test
		public void testRemove() {
			mylist.add("Orange");
			mylist.remove("Orange");
			assertFalse(mylist.lstFruits.contains("Orange"));
		}
		@Test
		public void sizeTest() {
			mylist.add("Orange");
			mylist.add("Apple");
			assertEquals(2, mylist.size());
		}
		@Test
		public void removeAllTest() {
			mylist.add("Orange");
			mylist.add("Apple");
			mylist.add("Banana");
			mylist.removeAll();
			assertEquals(0, mylist.size());
		}

	}



