package chap02.item2;

import java.util.Objects;

public class NyPizza_Ex extends Pizza_Ex {
    public enum Size { SMALL, MEDIUM, LARGE }
    private final Size size;

    public static class Builder extends Pizza_Ex.Builder<Builder> {
        private final Size size;

        public Builder(Size size) {
            this.size = Objects.requireNonNull(size);
        }

        @Override
        public NyPizza_Ex build() {
            return new NyPizza_Ex(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }

    private NyPizza_Ex(Builder builder) {
        super(builder);
        size = builder.size;
    }
}
