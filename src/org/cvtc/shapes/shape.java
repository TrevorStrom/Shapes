package org.cvtc.shapes;

/**
 * @author Trevor
 *
 */
public abstract class shape {
	
<<<<<<< HEAD
	protected Dialog dialog;

=======
>>>>>>> e3aae6b206bd4374ff17d507d379fa314ebc977e
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
	
	public Dialog getDialog() {
		return dialog;
	}

	private void setDialog(Dialog dialog) {
		this.dialog = dialog;
	}
	
	public shape(Dialog dialog) {
		setDialog(dialog);
	}
=======
>>>>>>> e3aae6b206bd4374ff17d507d379fa314ebc977e

}

