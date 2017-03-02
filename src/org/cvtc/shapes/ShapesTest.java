/**
 * 
 */
package org.cvtc.shapes;

<<<<<<< HEAD
=======
import java.awt.Component;

import javax.swing.JOptionPane;

>>>>>>> e3aae6b206bd4374ff17d507d379fa314ebc977e
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
		Dialog dialog = new MessageBox();
		/**
		 * Creates a new instance of a cuboid
		 */
		Cuboid cuboid = new Cuboid(dialog, 10, 10, 10);
=======
		
		/**
		 * Creates a new instance of a cuboid
		 */
		Cuboid cuboid = new Cuboid(10, 10, 10);
>>>>>>> e3aae6b206bd4374ff17d507d379fa314ebc977e
		
		/**
		 * Creates a new instance of a cylinder
		 */
<<<<<<< HEAD
		Cylinder cylinder = new Cylinder(dialog, 1, 1);
=======
		Cylinder cylinder = new Cylinder(1, 1);
>>>>>>> e3aae6b206bd4374ff17d507d379fa314ebc977e
		
		/**
		 * Creates a new instance of a sphere
		 */
<<<<<<< HEAD
		Sphere sphere = new Sphere(dialog, 2);
=======
		Sphere sphere = new Sphere(2);
		
		/**
		 * I needed a component for the showMessageDialog
		 */
		Component frame = null;
>>>>>>> e3aae6b206bd4374ff17d507d379fa314ebc977e
		
		/**
		 * Displays the cuboid results in a message box
		 */
<<<<<<< HEAD
		cuboid.render();
=======
		JOptionPane.showMessageDialog(frame, cuboid.render());
>>>>>>> e3aae6b206bd4374ff17d507d379fa314ebc977e
		
		/**
		 * Displays the sphere results in a message box
		 */
<<<<<<< HEAD
		sphere.render();
=======
		JOptionPane.showMessageDialog(frame, sphere.render());
>>>>>>> e3aae6b206bd4374ff17d507d379fa314ebc977e
		
		/**
		 * Displays the cylinder results in a message box
		 */
<<<<<<< HEAD
		cylinder.render();
=======
		JOptionPane.showMessageDialog(frame, cylinder.render());
>>>>>>> e3aae6b206bd4374ff17d507d379fa314ebc977e
		
	}

}
