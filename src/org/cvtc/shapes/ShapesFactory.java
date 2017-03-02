/**
 * 
 */
package org.cvtc.shapes;

/**
 * @author Trevor
 *
 */
public class ShapesFactory {

	public shape createCuboid(Dialog dialog, float width, float height, float depth) {
		return new Cuboid(dialog, width, height, depth);
		
	}
	
	public shape createCylinder(Dialog dialog, float radius, float height) {
		return new Cylinder(dialog, radius, height);
		
	}
	
	public shape createSphere(Dialog dialog, float radius) {
		return new Sphere(dialog, radius);
		
	}
}
