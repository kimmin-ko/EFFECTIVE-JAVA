package chap02.item2;

public class NutritionFacts {
    private final int servingSize;
    private final int servings;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;

    public static class Builder {
        private final int servingSize;
        private final int servings;

        private  int calories     = 0;
        private  int fat          = 0;
        private  int sodium       = 0;
        private  int carbohydrate = 0;

        public Builder(int servingSize, int servings) {
            if(servingSize < 0) throw new IllegalArgumentException("Serving 크기가 0보다 작습니다.");
            this.servingSize = servingSize;
            this.servings = servings;
        }

        public Builder calories(int calories) { this.calories = calories; return this; }
        public Builder fat(int fat) { this.fat = fat; return this; }
        public Builder sodium(int sodium) { this.sodium = sodium; return this; }
        public Builder carbohydrate(int carbohydrate) { this.carbohydrate = carbohydrate; return this; }

        public NutritionFacts build() {
            return new NutritionFacts(this);
        }
    }

    private NutritionFacts(Builder builder) {
        servingSize = builder.servingSize;
        servings = builder.servings;
        calories = builder.calories;
        fat = builder.fat;
        sodium = builder.sodium;
        carbohydrate = builder.carbohydrate;
    }
}
