/**
 * 
 */
package org.cvtc.shapes;

/**
 * @author Trevor
 *
 */
public class Cylinder extends shape{
	
	/**
	 * The radius of the Cylinder
	 */
	private float radius = 0.0f;
	
	/**
	 * The height of the Cylinder
	 */
	private float height = 0.0f;
	
	/**
	 * Gets the radius of the Cylinder
	 */
	public float getRadius() {
		return radius;
	}
	
	/**
	 * Sets the radius of the Cylinder
	 */
	private void setRadius(float radius) {
		this.radius = radius;
	}

	/**
	 * Gets the height of the Cylinder
	 */
	public float getHeight() {
		return height;
	}

	/**
	 * Sets the height of the Cylinder
	 */
	private void setHeight(float height) {
		this.height = height;
	}

	/**
	 * @param radius
	 * @param height
	 * Creates an instance of the Cylinder class
	 */
	public Cylinder(Dialog dialog, float radius, float height) {
		super(dialog);
		/**
		 * If radius is greater than or equal to zero , set it
		 */
		if (radius >=0){
			setRadius(radius);
		}
		
		/**
		 * If height is greater than or equal to zero, set it
		 */
		if (height >=0){
			setHeight(height);
		}
	}

	/**
	 * Inherited methods from the shape super class
	 */
	@Override
	public float surfaceArea() {
		
		/**
		 * Returns the surface area of the cylinder
		 */
		return ((2 * (float)Math.PI * (getRadius() * getRadius())) + (2 * (float)Math.PI * getRadius() * getHeight()));
	}

	/**
	 * Inherited methods from the shape super class
	 */
	@Override
	public float volume() {
		
		/**
		 * Returns the volume of the Cylinder
		 */
		return ((float)Math.PI * (getRadius() * getRadius()) * getHeight());
	}

	/**
	 * Inherited methods from the shape super class
	 */
	@Override
	public String render() {
		/**
		 * Displays the results as a string
		 */
		return "Sureface Area: " + surfaceArea() + "\nVolume: " + volume();
	}
	
	
	
	

}
