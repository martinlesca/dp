package abstractFactorySample.recipe.dinner;

public class VegetarianDinner implements Dinner {

	@Override
	public String createRecipe() {
		return "Receita vegetariana para janta";
	}

}
