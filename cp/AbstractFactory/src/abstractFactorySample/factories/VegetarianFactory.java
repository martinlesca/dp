package abstractFactorySample.factories;

import abstractFactorySample.recipe.breakfast.Breakfast;
import abstractFactorySample.recipe.breakfast.VegetarianBreakfast;
import abstractFactorySample.recipe.dinner.Dinner;
import abstractFactorySample.recipe.dinner.VegetarianDinner;
import abstractFactorySample.recipe.launch.Lunch;
import abstractFactorySample.recipe.launch.VegetarianLunch;

public class VegetarianFactory implements RecipeFactory{
	
	@Override
	public Breakfast createBreakfast() {
		return new VegetarianBreakfast();
	}

	@Override
	public Lunch createLunch() {
		return new VegetarianLunch();
	}

	@Override
	public Dinner createDinner() {
		return new VegetarianDinner();
	}

	
}
