import java.util.ArrayList;

public class MainActivity {
    public static void main(String[] args) {
        ArrayList<Recipe> recipes = new ArrayList<>();

        recipes.add(new Recipe("Hyderabadi Chicken Biryani", "Chicken, Rice, Spices", "Cook rice, layer chicken, dum 20 mins", 250));
        recipes.add(new Recipe("Mutton Biryani", "Mutton, Basmati Rice", "Marinate, cook, dum 30 mins", 350));
        recipes.add(new Recipe("Veg Biryani", "Veggies, Rice, Curd", "Cook veggies, layer rice, dum 15 mins", 180));

        System.out.println("=== Biriyani Book App ===");
        for (Recipe r : recipes) {
            System.out.println(r.getDetails());
            System.out.println("Ingredients: " + r.getIngredients());
            System.out.println("Steps: " + r.getSteps());
            System.out.println("--------------------");
        }
    }
}
