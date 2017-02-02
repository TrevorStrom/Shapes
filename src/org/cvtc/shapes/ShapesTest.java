/**
 * 
 */
package org.cvtc.shapes;

import java.awt.Component;

import javax.swing.JOptionPane;

/**
 * @author Trevor
 *
 */
public class ShapesTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		
		/**
		 * Creates a new instance of a cuboid
		 */
		Cuboid cuboid = new Cuboid(10, 10, 10);
		
		/**
		 * Creates a new instance of a cylinder
		 */
		Cylinder cylinder = new Cylinder(1, 1);
		
		/**
		 * Creates a new instance of a sphere
		 */
		Sphere sphere = new Sphere(2);
		
		/**
		 * I needed a component for the showMessageDialog
		 */
		Component frame = null;
		
		/**
		 * Displays the cuboid results in a message box
		 */
		JOptionPane.showMessageDialog(frame, cuboid.render());
		
		/**
		 * Displays the sphere results in a message box
		 */
		JOptionPane.showMessageDialog(frame, sphere.render());
		
		/**
		 * Displays the cylinder results in a message box
		 */
		JOptionPane.showMessageDialog(frame, cylinder.render());
		
	}

}
