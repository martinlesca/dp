package abstractFactorySample.recipe.dinner;

public class MediterraneanDinner implements Dinner{

	@Override
	public String createRecipe() {
		return "Receita mediterranea para janta";
	}

}
