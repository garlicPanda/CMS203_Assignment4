/**
 * 
 * @author vanessa
 *
 */
public class Property {
	//variables
	private String city;
	private String owner;
	private String propertyName;
	private double rentAmount;
	private Plot plot;
	
	/**
	 * No-arg constructor, setting the current plot the the default plot.
	 */
	public Property() {
		this.city = "";
		this.owner = "";
		this.propertyName = "";
		this.rentAmount = 0;
		this.plot = new Plot();
	}
	
	/**
	 * Copy Constructor, setting the values of one Peroprty to this property and 
	 * @param p
	 */
	public Property(Property p) {
		this.city = p.city;
		this.owner = p.owner;
		this.propertyName = p.propertyName;
		this.rentAmount = p.rentAmount;
		this.plot = p.plot;
	}
	
	/**
	 * param constructor, setting property information and plot
	 * @param propertyName name of the property
	 * @param city name of city
	 * @param rentAmount amount of rent for the property
	 * @param owner owner of the property
	 */
	public Property(String propertyName, String city, double rentAmount, String onwer) {
		this.city = city;
		this.owner = owner;
		this.propertyName = propertyName;
		this.rentAmount = rentAmount;
		this.plot = new Plot();
	}
	
	/**
	 * Param constructor with information of property and plot
	 * @param propertyName
	 * @param city
	 * @param rentAmount
	 * @param owner
	 * @param x
	 * @param y
	 * @param width
	 * @param depth
	 */
	public Property(String propertyName, String city, double rentAmount, String pwner, int x,
					int y, int width, int depth) {
		this.propertyName = propertyName;
		this.city = city;
		this.rentAmount = rentAmount;
		this.owner = owner;
		this.plot = new Plot(x, y, width, depth);
	}
	
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	
	/**
	 * @return the owner
	 */
	public String getOwner() {
		return owner;
	}
	
	/**
	 * @param owner the owner to set
	 */
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	/**
	 * @return the proeprtyName
	 */
	public String getPropertyName() {
		return propertyName;
	}
	
	/**
	 * @param propertyName the propertyName to set
	 */
	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}
	
	/**
	 * @return the rentAmount
	 */
	public double getRentAmount() {
		return rentAmount;
	}
	
	/**
	 * @param rentAmount the rentAmount to set
	 */
	public void setRentAmount(double rentAmount) {
		this.rentAmount = rentAmount;
	}
	
	/**
	 * @return the plot
	 */
	public Plot getPlot() {
		return plot;
	}
	
	/**
	 * (non-Javadoc)
	 * toString
	 */
	@Override
	public String toString() {
		return "\n\tPropertyName: " + propertyName + "\n\t Located in " + city + "\n\t Belonging to :" + owner
				+ "\n\t RentAmount: $" + rentAmount;
	}

}
/**
 * work cited
 * Professor Robert Alexander class slides
 */
