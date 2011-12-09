/*
 *  * Created on Sep 14, 2006
 *   *
 *    * TODO To change the template for this generated file go to
 *     * Window - Preferences - Java - Code Style - Code Templates
 *      */
package org.lungu.asimplesample.ui;

import org.lungu.asimplesample.model.beings.*;

/**
 *  * @author mircea
 *   *
 *    * TODO To change the template for this generated type comment go to
 *     * Window - Preferences - Java - Code Style - Code Templates
 *      */
public class TextUI {

	public static void main(String[] args) {
		InformaticsPHD phd = new InformaticsPHD();
		Animal vivi = new Dog();

		phd.doSomeWork();
		phd.doSomeWork();
		phd.eat();
		phd.speakYourMind();
		vivi.play();
	}
}


