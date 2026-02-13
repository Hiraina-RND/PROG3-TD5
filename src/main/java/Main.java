import java.time.Instant;

public class Main {
    public static void main(String[] args) {
        DataRetriever dataRetriever = new DataRetriever();
        Instant instant = Instant.parse("2024-01-05T08:00:00Z");
        Ingredient ingredientOne = dataRetriever.findIngredientById(1);
        System.out.println(ingredientOne.getStockValueAt(instant));
        System.out.println("===============");
        System.out.println(dataRetriever.getStockValueAt(instant, 1));
    }
}
