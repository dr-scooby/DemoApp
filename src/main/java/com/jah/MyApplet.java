package com.jah;
import javax.swing.*;
import java.awt.*;

public class MyApplet extends JApplet{
	
	@SuppressWarnings("deprecation")
	public void init() {
		getContentPane().add(new JLabel("Applet"));
	}

}
