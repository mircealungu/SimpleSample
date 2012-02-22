/*
 * Created on Sep 14, 2006
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package org.lungu.asimplesample.model.things;
import java.util.Random;

/**
 * @author mircea
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class Kebab {
	private int calories;
	public Kebab(){
		calories = 50 + (new Random(33)).nextInt();
	}
	public int calories()
	{
		return calories;
	}
}
