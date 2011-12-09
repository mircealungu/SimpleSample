/*
 * Created on Sep 14, 2006
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package org.lungu.asimplesample.model.things;

/**
 * @author mircea
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class Laptop {
	private boolean turnedOn = false;
	public Laptop()
	{
		
	}
	public void turnOn()
	{
		turnedOn = true;
		loadOperatingSystem();
	}
	public void turnOff()
	{
		turnedOn = false;
	}
	private void loadOperatingSystem()
	{
	}
	/**
	 * 
	 */
	public void runVariousPrograms() {
		
	}
}
