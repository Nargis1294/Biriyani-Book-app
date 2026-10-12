public class Recipe {
    private String name;
    private String ingredients;
    private String steps;
    private int price;

    public Recipe(String name, String ingredients, String steps, int price) {
        this.name = name;
        this.ingredients = ingredients;
        this.steps = steps;
        this.price = price;
    }

    public String getName() { return name; }
    public String getIngredients() { return ingredients; }
    public String getSteps() { return steps; }
    public int getPrice() { return price; }

    public String getDetails() {
        return name + " - Rs." + price;
    }
}
