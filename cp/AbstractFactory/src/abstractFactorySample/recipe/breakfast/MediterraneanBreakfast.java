package abstractFactorySample.recipe.breakfast;

public class MediterraneanBreakfast implements Breakfast{

	@Override
	public String createRecipe() {
		return "Receita mediterranea para cafe da manhã";
	}
}
