
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ManagementCompanyTestSTUDENT {
	
	ManagementCompany mgmCop;
	
	@Before
	public void setUp() throws Exception {
		//student create a management company
		mgmCop = new ManagementCompany("Panda", "08888", 6);
		
		//student add three properties, with plots, to mgmt co
		Property p1 = new Property("Mountain View", "Santa Clara", 1500, "kenny", 1,2,3,4);
		Property p2 = new Property("Lake view", "Germantown", 2000, "Daisy", 2,3,4,5);
		Property p3 = new Property("fair oaks", "Githersburg", 3500, "Mike", 3,4,5,6);
		
		mgmCop.addProperty(p1);
		mgmCop.addProperty(p2);
		mgmCop.addProperty(p3);
		
	}

	@After
	public void tearDown() {
		//student set mgmt co to null  
		mgmCop = null;
	}

	@Test
	public void testAddPropertyDefaultPlot() {
		//student should add property with 4 args & default plot
		assertEquals(mgmCop.addProperty("asd", "xfg", 500, "dhtjf"),1,0);
		//student should add property with 8 args
		assertEquals(mgmCop.addProperty("efrg", "sgf", 4500, "srg", 5, 5, 2, 2), 2,0);
		//student should add property that exceeds the size of the mgmt co array and can not be added, add property should return -1
		assertEquals(mgmCop.addProperty("Osgf", "sfdg", 3100, "sgf", 7,4,2,2), 3, 0);
	}
 
	@Test
	public void testMaxRentProp() {
		
		//student should test if maxRentProp contains the maximum rent of properties
		assertEquals(mgmCop.maxRentProp(), 1500, 0);
		
	}

	@Test
	public void testTotalRent() {
		
		//student should test if totalRent returns the total rent of properties
		assertEquals(mgmCop.totalRent(), 1500, 0);
	}

 }