/**
 * 
 * @author vanessa
 *
 */
public class Plot {
	//variables
	private int x;		//upper left value
	private int y;		//upper left value
	private int width;	//horizontal
	private int depth;	//vertical
	
	/**
	 * No-arg constructor setting width and depth to 1
	 */
	public Plot() {
		width = 1;
		depth = 1;
	}
	
	/**
	 * Copy constructor, getting a Plot object and setting the value of x,y, width and depth
	 * to the current Plot
	 * @param p
	 */
	public Plot(Plot p) {
		this.x = p.x;
		this.y = p.y;
		this.width = p.width;
		this.depth = p.depth;
	}
	
	/**
	 * Param comstructor passing x,y positions and width and depth of the plot
	 * @param x upper left of x-axis
	 * @param y upper left of x-axis
	 * @param width x position to the right length
	 * @param depth y position to the bottom length
	 */
	public Plot(int x, int y, int width, int depth) {
	    this.x = x;
	    this.y = y;
	    this.width = width;
	    this.depth = depth;
	}
	
	/**
	 *This method determines if a given plot is overlapping the current plot
	 *@param plot
	 *@return true if it is overlapping the current plot, otherwise false
	 */
	public boolean overlaps(Plot plot) {
		//current plot
		int LeftAx = x;				
		int LeftAy = y;
		int RightAx = x + width;
		int RightAy = y + depth;
		
		//compare with given plot, see if it is over lap
		//if two plot does not over lap, return false
		if ((plot.x) >= RightAx || (plot.x + plot.width) <= LeftAx || 
				(plot.y) >= RightAy || (plot.y + plot.depth) <= LeftAy)
			return false;
		else
			return true;
	}
	
	/**
	 * This method determines if a given plot is inside of the current plot
	 * @param plot
	 * @return true if it is inside of the current plot, otherwise false
	 */
	public boolean encompasses(Plot plot) {
		//current plot
		int LeftAx = x;				
		int LeftAy = y;
		int RightAx = x + width;				
		int RightAy = y + depth;
		
		//compare with given plot, see if it is inside of the current plot
		if(plot.x >= LeftAx && plot.y >= LeftAy && 
				(plot.x + plot.width) <= RightAx && (plot.y + plot.depth) <= RightAy)
			return true;
		else
			return false;
	}
	
	/**
	 * @return the x
	 */
	public int getX() {
	  return x;
	}

	/**
	 * @param x the x to set
	 */
	public void setX(int x) {
	  this.x = x;
	}

	/**
	 * @return the y
	 */
	public int getY() {
	  return y;
	}

	/**
	 * @param y the y to set
	 */
	public void setY(int y) {
	  this.y = y;
	}

	/**
	 * @return the width
	 */
	public int getWidth() {
	  return width;
	}

	/**
	 * @param width the width to set
	 */
	public void setWidth(int width) {
	  this.width = width;
	}

	/**
	 * @return the depth
	 */
	public int getDepth() {
	  return depth;
	}

	/**
	 * @param depth the depth to set
	 */
	public void setDepth(int depth) {
	  this.depth = depth;
	}
	/**
	 * toString method
	 * @Override
	 */
	public String toString() {
		return "Upper left: (" + x + "," + y + "); Width: " + width + " Depth:" + depth;
	}
	
}
