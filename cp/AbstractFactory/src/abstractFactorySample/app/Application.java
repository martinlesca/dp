package abstractFactorySample.app;

import abstractFactorySample.factories.MediterraneanFactory;
import abstractFactorySample.factories.RecipeFactory;
import abstractFactorySample.factories.VegetarianFactory;
import abstractFactorySample.recipe.Recipe;

public class Application implements Recipe{
	
	private RecipeFactory factory;
	private String recipeGroup;
	private String recipeType;
	
	public Application(String group, String type) {
		recipeType = type;
		recipeGroup = group;
	}
	
	public String createRecipe() {

		String recipe = null;
		
		if (recipeType.equals("vegetarian")) {
			factory = new VegetarianFactory();
			switch (recipeGroup) {
	        case "breakfast":
	            recipe = factory.createBreakfast().createRecipe();
	            break;
	        case "lunch":
	            recipe = factory.createLunch().createRecipe();
	            break;
	        case "dinner":
	            recipe = factory.createDinner().createRecipe();
	            break;
	        default:
			}
		}else if (recipeType.equals("mediterranean")){
			factory = new MediterraneanFactory();
			switch (recipeGroup) {
	        case "breakfast":
	            recipe = factory.createBreakfast().createRecipe();
	            break;
	        case "lunch":
	            recipe = factory.createLunch().createRecipe();
	            break;
	        case "dinner":
	            recipe = factory.createDinner().createRecipe();
	            break;
	        default:
			}
		}

		return recipe;
	}
}
