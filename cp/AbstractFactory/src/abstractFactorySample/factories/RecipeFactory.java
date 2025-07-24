package abstractFactorySample.factories;

import abstractFactorySample.recipe.breakfast.Breakfast;
import abstractFactorySample.recipe.dinner.Dinner;
import abstractFactorySample.recipe.launch.Lunch;

public interface RecipeFactory {
	Breakfast createBreakfast();
	Lunch createLunch();
	Dinner createDinner();
}
