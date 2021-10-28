import javafx.scene.layout.Region;

/**
 * 
 * @author vanessa
 *
 */
public class ManagementCompany {
	
	private final int MAX_PROPERTY = 5;
	private final int MAX_WIDTH = 10;
	private final int MAX_DEPTH = 10;
	private Property[] properties;
	private double mgmFeePer;
	private String name;
	private String taxID;
	private Plot plot;
	
	/**
	 * No-arg constructor, setting plot with 0.0 for x and y and 10 for width and depth
	 * setting the max number of properties array
	 */
	public ManagementCompany() {
		this.plot = new Plot(0,0,MAX_WIDTH, MAX_DEPTH);
		this.properties = new Property[MAX_PROPERTY];
	}
	
	/**
	 * param constructor using name, taxID and management fee
	 * @param name of the company
	 * @param taxID of company
	 * @param mgmFeePer of charges each property 
	 */
	public ManagementCompany(String name, String taxID, double mgmFeePer) {
		this.name = name;
	    this.taxID = taxID;
	    this.mgmFeePer = mgmFeePer;
	    this.plot = new Plot(0,0,MAX_WIDTH, MAX_DEPTH);
	    this.properties = new Property[MAX_PROPERTY];
	}
	
	/**
	 * param constructor using the company information and plot information
	 * @param name 
	 * @param taxID
	 * @param mgmFeePer
	 * @param x
	 * @param y
	 * @param width
	 * @param depth
	 */
	public ManagementCompany(String name, String taxID, double mgmFeePer, 
			int x, int y, int width, int depth) {
		this.name = name;
	    this.taxID = taxID;
	    this.mgmFeePer = mgmFeePer;
	    this.plot = new Plot(x,y,width,depth);
	    this.properties = new Property[MAX_PROPERTY];
	}
	
	/**
	 * This method add a property to the properties array and return different thing
	 * @param propertyobject
	 * @return number which is code for different thing
	 */
	public int addProperty(Property property) {
	
		if (property == null) {
			return -2;
		}
		
		//if the property outside of the management pot return -3
		//plot.getWidth() + " " + plot.getDepth()
		//property.getPlot().getWidth() + " " + property.getPlot().getDepth()
		else if (!plot.encompasses(property.getPlot())) {
			return -3;
		}
		
		for (int i = 0;i < properties.length;i++) {
		      if (properties[i] != null) {
		        if (properties[i].getPlot().overlaps(property.getPlot())) {
		          return -4;
		        }
		      } else {
		        properties[i]=property;
		        return i;
		      } 
		    }
		      return -1;
		
	}
	
	/**
	 * This method add a property to the management company using property information
	 * @param propertiName
	 * @param city
	 * @param rent
	 * @param owner
	 * @return
	 */
	public int addProperty(String propertyName, String city, double rent, String ownerName) {
	    return addProperty(new Property(propertyName, city, rent, ownerName));
	  }
	
	/**
	 * This method add a property to the management company using property information and 
	 * plot information
	 * @param propertyName
	 * @param city
	 * @param rent
	 * @param owner
	 * @param x
	 * @param y
	 * @param width
	 * @param depth
	 * @return 
	 */
	public int addProperty(String propertyName, String city, double rent, String ownerName,
		      int x, int y, int width, int depth) {
		    return addProperty(new Property(propertyName, city, rent, ownerName, x, y, width, depth));
	  }
	
	/**
	 * This method returns total rent of all properties
	 * @return total rent for all properties
	 */
	public double totalRent() {
		double total = 0.0;
		for (int i = 0; i < properties.length; i++) {
			if(properties[i] != null)
				total += properties[i].getRentAmount();
		}
		return total;
	}
	
	/**
	 * This method return the maximum rent among the properties
	 * @return max
	 */
	
	public double maxRentProp() {
		
		double max = properties[0].getRentAmount();
		for (int i = 1; i < properties.length; i++)
			if (properties[i] != null && properties[i].getRentAmount() > max)
				max = properties[i].getRentAmount();

		return max;
	}
	
	/**
	 * This method returns that index of element of properties array where the rent is max
	 * @return index
	 */
	public int maxRentPropertyIndex() {
		
		double maxRentIndex = 0.0;
		for (int i = 0;i < properties.length; i++) {
			if (properties[i].getRentAmount() > properties[i + 1].getRentAmount()) {
				maxRentIndex = properties[i].getRentAmount();
			}
		}
		return (int)maxRentIndex;
	}
	
	/**
	 * This method returns the information of property in the properties array on the given index
	 * @param i index of the array
	 * @return toString equals property
	 */
	public String displayPropertyAtIndex(int index) {
		return properties[index].toString();
	}
	
	/**
	 * @return the MAX_PROPERTY
	 */
	public int getMAX_PROPERTY() {
		return MAX_PROPERTY;
	}
	
	/**
	 * non-Javadoc
	 */
	@Override
	public String toString() {
		String str = "";
		for (int i = 0; i < properties.length; i++) {
			str += properties[i].toString();
		}
		double totalFee = (totalRent() * (mgmFeePer / 100));
		return "List of the properties for " + name + ", taxID: " + taxID
				+ "\n--------------------------------------------------------------" + str
				+ "\n--------------------------------------------------------------\n" + "Total Management Fee: $"
				+ totalFee;
	}

	public Plot getPlot() {
		// TODO Auto-generated method stub
		return plot;
	}

	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	
	
}
