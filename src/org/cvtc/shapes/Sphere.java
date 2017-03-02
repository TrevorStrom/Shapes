/**
 * 
 */
package org.cvtc.shapes;

/**
 * @author Trevor
 *
 */
public class Sphere extends shape{
	
	/**
	 * the radius of the Sphere
	 */
	private float radius = 0.0f;

	/**
	 * Gets the radius of the Sphere
	 */
	public float getRadius() {
		return radius;
	}

	/**
	 * Sets the radius of the Sphere
	 */
	public void setRadius(float radius) {
		this.radius = radius;
	}

	/**
	 * @param radius
	 * Create an instance of the Sphere
	 */

	public Sphere(Dialog dialog, float radius) {
		super(dialog);
		
		/**
		 * If the radius is greater than or equal to 0, set it
		 */
		if (radius >=0){
			setRadius(radius);
		}
	}

	/**
	 * Inherited methods from the shape super class
	 */
	@Override
	public float surfaceArea() {
		
		/**
		 * Returns the surface area of the Sphere
		 */
		return (4 * (float)Math.PI * (getRadius() * getRadius()));
	}

	/**
	 * Inherited methods from the shape super class
	 */
	@Override
	public float volume() {
		
		/**
		 * Returns the volume of the Sphere
		 */
		return ((4/3) * (float)Math.PI * (getRadius() * getRadius() * getRadius()));
	}

	/**
	 * Inherited methods from the shape super class
	 */
	@Override
	public String render() {
		
		/**
		 * Returns the results as a string
		 */
		return "Surface Area: " + surfaceArea() + "\nVolume: " + volume();
	}
}
