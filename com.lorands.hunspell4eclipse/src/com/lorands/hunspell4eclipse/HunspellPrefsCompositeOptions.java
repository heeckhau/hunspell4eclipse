/**
 * 
 */
package com.lorands.hunspell4eclipse;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;

/**
 * @author Lorand Somogyi
 * 
 */
class HunspellPrefsCompositeOptions extends Composite {

	private Button checkBox;

	private Button checkBox1;
	private Button checkBox2;
	private Button checkBox3;
	private Button checkBox4;
	private Group group1;

	/**
	 * @param parent
	 * @param style
	 */
	public HunspellPrefsCompositeOptions(Composite parent, int style) {
		super(parent, style);
		initialize();
	}

	/**
	 * This method initializes group
	 * 
	 */
	private void createGroup() {
		GridLayout gridLayout = new GridLayout();
		gridLayout.numColumns = 1;
		// group = new Group(this, SWT.NONE);
		// group.setLayout(gridLayout);
		createGroup1();
	}

	/**
	 * This method initializes group1
	 * 
	 */
	private void createGroup1() {
		GridLayout gridLayout1 = new GridLayout();
		gridLayout1.numColumns = 1;
		GridData gridData = new GridData();
		gridData.horizontalAlignment = GridData.FILL;
		gridData.grabExcessHorizontalSpace = true;
		gridData.grabExcessVerticalSpace = true;
		gridData.verticalAlignment = GridData.FILL;
		group1 = new Group(this, SWT.NONE);
		group1.setText("Options");
		group1.setLayout(gridLayout1);
		group1.setLayoutData(gridData);
		checkBox = new Button(group1, SWT.CHECK);
		checkBox.setText("ignore words with digits");
		checkBox.setSelection(true);
		checkBox1 = new Button(group1, SWT.CHECK);
		checkBox1.setText("Ignore mixed case words");
		checkBox1.setSelection(true);
		checkBox2 = new Button(group1, SWT.CHECK);
		checkBox2.setText("Ignore upper case words");
		checkBox2.setSelection(true);
		checkBox3 = new Button(group1, SWT.CHECK);
		checkBox3.setText("Ignore single letters");
		checkBox3.setSelection(true);
		checkBox4 = new Button(group1, SWT.CHECK);
		checkBox4.setText("Ignore words with non-letters");
		checkBox4.setSelection(true);
	}

	private void initialize() {
		createGroup();
		this.setLayout(new FillLayout());
		setSize(new Point(300, 200));
	}

	/**
	 * @return
	 */
	boolean isSingleLetter() {
		return checkBox3.getSelection();
	}

	/**
	 * @return
	 */
	boolean isUpperCase() {
		return checkBox2.getSelection();
	}

	/**
	 * @return
	 */
	boolean isWWDigitsIgnored() {
		return checkBox.getSelection();
	}

	/**
	 * @return
	 */
	boolean isWWMixedCaseIgnored() {
		return checkBox1.getSelection();
	}

	/**
	 * @return
	 */
	boolean isWWNonLetters() {
		return checkBox4.getSelection();
	}

	/**
	 * @param opt
	 */
	public void setSingleLetter(boolean opt) {
		checkBox3.setSelection(opt);

	}

	/**
	 * @param opt
	 */
	public void setUpperCase(boolean opt) {
		checkBox2.setSelection(opt);
	}

	/**
	 * @param opt
	 */
	public void setWWDigitsIgnored(boolean opt) {
		checkBox.setSelection(opt);
	}

	/**
	 * @param opt
	 */
	public void setWWMixedCaseIgnored(boolean opt) {
		checkBox1.setSelection(opt);

	}

	/**
	 * @param opt
	 */
	public void setWWNonLetters(boolean opt) {
		checkBox4.setSelection(opt);
	}

}
