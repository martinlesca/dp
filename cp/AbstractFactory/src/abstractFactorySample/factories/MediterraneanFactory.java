package abstractFactorySample.factories;

import abstractFactorySample.recipe.breakfast.Breakfast;
import abstractFactorySample.recipe.breakfast.MediterraneanBreakfast;
import abstractFactorySample.recipe.dinner.Dinner;
import abstractFactorySample.recipe.dinner.MediterraneanDinner;
import abstractFactorySample.recipe.launch.Lunch;
import abstractFactorySample.recipe.launch.MediterraneanLunch;

public class MediterraneanFactory implements RecipeFactory{
	
	@Override
	public Breakfast createBreakfast() {
		return new MediterraneanBreakfast();
	}

	@Override
	public Lunch createLunch() {
		return new MediterraneanLunch();
	}

	@Override
	public Dinner createDinner() {
		return new MediterraneanDinner();
	}

	
}
