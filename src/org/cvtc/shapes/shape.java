package org.cvtc.shapes;

/**
 * @author Trevor
 *
 */
public abstract class shape {
	
<<<<<<< HEAD
=======
	protected Dialog dialog;

>>>>>>> Added interfaces
	/**
	 * 
	 * Surface area method declaration 
	 */
	public abstract float surfaceArea();
	
	/**
	 * volume method declaration
	 */
	public abstract float volume();
	
	/**
	 * render method declaration
	 * @return 
	 */
	public abstract String render();
<<<<<<< HEAD
=======
	
	public Dialog getDialog() {
		return dialog;
	}

	private void setDialog(Dialog dialog) {
		this.dialog = dialog;
	}
	
	public shape(Dialog dialog) {
		setDialog(dialog);
	}
>>>>>>> Added interfaces

}

