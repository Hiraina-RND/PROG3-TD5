import java.time.Instant;

public class Main {
    public static void main(String[] args) {
        DataRetriever dataRetriever = new DataRetriever();
        Instant instant = Instant.parse("2024-01-05T08:00:00Z");
        Ingredient ingredientOne = dataRetriever.findIngredientById(1);
        System.out.println(ingredientOne.getStockValueAt(instant));
        System.out.println("===============");
        System.out.println(dataRetriever.getStockValueAt(instant, 1));
        System.out.println("===============");
        System.out.println("Dish_cost from Dish class: " + dataRetriever.findDishById(1).getDishCost());
        System.out.println("===============");
        System.out.println("Dish_cost from dataRetriever: " + dataRetriever.getDishCost(1));
        System.out.println("===============");
        System.out.println("Dish_cross_margin from Dish class: " + dataRetriever.findDishById(1).getGrossMargin());
        System.out.println("===============");
        System.out.println("Dish_cross_margin from dataRetriever: " + dataRetriever.getGrossMargin(1));
    }
}
