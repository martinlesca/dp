package abstractFactorySample.recipe.launch;

public class VegetarianLunch implements Lunch{

	@Override
	public String createRecipe() {
		return "Receita vegetariana para almoço";
	}

}
