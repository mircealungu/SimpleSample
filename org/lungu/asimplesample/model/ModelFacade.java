package org.lungu.asimplesample.model;

import org.lungu.asimplesample.model.beings.Dog;
import org.lungu.asimplesample.model.beings.InformaticsPHD;

public class ModelFacade {
	public static InformaticsPHD createInformaticsPHD()
	{
		return new InformaticsPHD();
	}
	public static Dog createDog()
	{
		return new Dog();
	}
	
	
}
