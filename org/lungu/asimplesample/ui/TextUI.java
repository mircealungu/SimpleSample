/*
 * Created on Sep 14, 2006
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package org.lungu.asimplesample.ui;

import org.lungu.asimplesample.model.beings.*;
import org.lungu.asimplesample.util.PatentGenerator;

/**
 * @author mircea
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class TextUI {

	public static void main(String[] args) {
		InformaticsPHD phd = new InformaticsPHD();
		Animal vivi = new Dog();
		PatentGenerator gen = new PatentGenerator();
		
		phd.doSomeWork();
		phd.doSomeWork();
		phd.eat();
		phd.generatePatent(gen);
		phd.speakYourMind();
		
		vivi.play();
	}
}

