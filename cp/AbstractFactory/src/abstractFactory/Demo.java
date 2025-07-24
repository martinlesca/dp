package abstractFactory;

import abstractFactorySample.app.Application;

public class Demo {
	
	private static String getRecipe(String group, String type) {
		String recipe = null;
		recipe = new Application(group, type).createRecipe();
		return recipe;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String recipe = null;
		recipe = getRecipe(args[0], args[1]);
		System.out.println(recipe);
	}

}
