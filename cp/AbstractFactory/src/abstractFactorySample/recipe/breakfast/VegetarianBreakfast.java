package abstractFactorySample.recipe.breakfast;

public class VegetarianBreakfast implements Breakfast{

	@Override
	public String createRecipe() {
		return "Receita vegetariana para cafe da manhã";
	}
}
