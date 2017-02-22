/**
 * 
 */
package org.cvtc.shapes;

<<<<<<< HEAD
import java.awt.Component;

import javax.swing.JOptionPane;

=======
>>>>>>> Added interfaces
/**
 * @author Trevor
 *
 */
public class ShapesTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

<<<<<<< HEAD
		
		/**
		 * Creates a new instance of a cuboid
		 */
		Cuboid cuboid = new Cuboid(10, 10, 10);
=======
		Dialog dialog = new MessageBox();
		/**
		 * Creates a new instance of a cuboid
		 */
		Cuboid cuboid = new Cuboid(dialog, 10, 10, 10);
>>>>>>> Added interfaces
		
		/**
		 * Creates a new instance of a cylinder
		 */
<<<<<<< HEAD
		Cylinder cylinder = new Cylinder(1, 1);
=======
		Cylinder cylinder = new Cylinder(dialog, 1, 1);
>>>>>>> Added interfaces
		
		/**
		 * Creates a new instance of a sphere
		 */
<<<<<<< HEAD
		Sphere sphere = new Sphere(2);
		
		/**
		 * I needed a component for the showMessageDialog
		 */
		Component frame = null;
=======
		Sphere sphere = new Sphere(dialog, 2);
>>>>>>> Added interfaces
		
		/**
		 * Displays the cuboid results in a message box
		 */
<<<<<<< HEAD
		JOptionPane.showMessageDialog(frame, cuboid.render());
=======
		cuboid.render();
>>>>>>> Added interfaces
		
		/**
		 * Displays the sphere results in a message box
		 */
<<<<<<< HEAD
		JOptionPane.showMessageDialog(frame, sphere.render());
=======
		sphere.render();
>>>>>>> Added interfaces
		
		/**
		 * Displays the cylinder results in a message box
		 */
<<<<<<< HEAD
		JOptionPane.showMessageDialog(frame, cylinder.render());
=======
		cylinder.render();
>>>>>>> Added interfaces
		
	}

}
