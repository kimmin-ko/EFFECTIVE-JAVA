package chap02.item2;

public class Calzone_Ex extends Pizza_Ex {
    private boolean sauceInside;

    public static class Builder extends Pizza_Ex.Builder<Builder> {
        private boolean sauceInside = false;

        public Builder sauceInside() {
            sauceInside = true;
            return this;
        }

        @Override
        public Calzone_Ex build() {
            return new Calzone_Ex(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }

    private Calzone_Ex(Builder builder) {
        super(builder);
        sauceInside = builder.sauceInside;
    }
}
