package jcurses.tests;

import java.awt.*;
import java.awt.event.*;

public class AwtTest extends Frame implements ItemListener {
	
	
	public AwtTest() {
	super("JCURSES AwtTest");
	this.setSize(200,200);
	this.setLocation(100,100);
	Choice list = new Choice();
	list.add("item1");
	list.add("item2");
	list.add("item3");
	list.add("item4");
	list.add("item5");
	list.add("item6");
	for (int i=0; i<40; i++) {
		list.add("item7"+i);
	}
	
	
	
	
	list.addItemListener(this);
	this.add(list);
	setVisible(true);
	}
	
	
	public void itemStateChanged(ItemEvent e) {
	System.err.println("changed: "+e);
	}
	
	
	public static void main(String [] args) {
		AwtTest test = new AwtTest();
		new FileDialog(test).show();
	}
	
	
	

}
