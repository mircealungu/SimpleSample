package org.lungu.asimplesample.ui;

import org.lungu.asimplesample.model.ModelFacade;
import org.lungu.asimplesample.model.beings.Animal;
import org.lungu.asimplesample.model.beings.InformaticsPHD;
import org.lungu.asimplesample.util.PatentGenerator;

public class CarbonUI {
	public static void carbonMain(String[] args) {
		InformaticsPHD phd = ModelFacade.createInformaticsPHD();
		Animal vivi = ModelFacade.createDog();
		PatentGenerator gen = new PatentGenerator();
		
		phd.doSomeWork();
		phd.doSomeWork();
		phd.eat();
		phd.generatePatent(gen);
		phd.speakYourMind();
		
		vivi.play();
	}
}
