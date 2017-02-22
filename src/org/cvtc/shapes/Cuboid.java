/**
 * 
 */
package org.cvtc.shapes;

/**
 * @author Trevor
 *
 */
public class Cuboid extends shape {
	
	/**
	 * The width of the Cuboid
	 */
	private float width = 0.0f;
	
	/**
	 * The height of the Cuboid
	 */
	private float height = 0.0f;
	
	/**
	 * The depth of the Cuboid
	 */
	private float depth = 0.0f;
	
	/**
	 * Gets the width of the Cuboid
	 */
	public float getWidth() {
		return width;
	}

	/**
	 * Sets the width of the Cuboid
	 */
	private void setWidth(float width) {
		this.width = width;
	}

	/**
	 * Gets the height of the Cuboid
	 */
	public float getHeight() {
		return height;
	}

	/**
	 * Sets the height of the Cuboid
	 */
	private void setHeight(float height) {
		this.height = height;
	}

	/**
	 * Gets the depth of the Cuboid
	 */
	public float getDepth() {
		return depth;
	}

	/**
	 * Sets the depth of the Cuboid
	 */
	private void setDepth(float depth) {
		this.depth = depth;
	}

	/**
	 * @param width
	 * @param height
	 * @param depth
	 * Creates a new instance of a Cuboid
	 */
	public Cuboid(Dialog dialog, float width, float height, float depth) {
		
		super(dialog);
		
		/**
		 * if the width is greater than or equal to zero, set it
		 */
		if (width >= 0){
			setWidth(width);
		}
		
		/**
		 * if the height is greater than or equal to zero, set it
		 */
		if (height >=0){
			setHeight(height);
		}
		
		/**
		 * if the depth is greater than or equal to zero, set it
		 */
		if (depth >=0){
			setDepth(depth);
		}
	}

	/**
	 * Inherited methods from the shape super class
	 */
	@Override
	public float surfaceArea() {
		
		/**
		 * Returns the total surface area of the Cuboid
		 */
		return 2.0f * ((getWidth()*getHeight()) + (getHeight()*getDepth()) + (getDepth()*getWidth()));
	}

	/**
	 * Inherited methods from the shape super class
	 */
	@Override
	public float volume() {
		
		/**
		 * Returns the total volume of the Cuboid
		 */
		return (getWidth() * getDepth() * getHeight());
	}

	/**
	 * Inherited methods from the shape super class
	 */
	@Override
	public String render() {
		/**
		 * returns the surface area and volume as a string to display
		 */
		return "Sureface Area: " + surfaceArea() + " \nVolume: " + volume();
	}
	
	
	
	
	

}
