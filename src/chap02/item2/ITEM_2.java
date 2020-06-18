package chap02.item2;

public class ITEM_2 {

    public static void main(String[] args) {
        NutritionFacts n = new NutritionFacts.Builder(1, 2)
                .fat(6).calories(22).build();


        NyPizza pizza = new NyPizza.Builder(NyPizza.Size.SMALL)
                .addTopping(Pizza.Topping.SAUSAGE)
                .addTopping(Pizza.Topping.MUSHROOM)
                .build();

        Calzone calzone = new Calzone.Builder()
                .addTopping(Pizza.Topping.MUSHROOM)
                .sauceInside()
                .build();

    }

}
