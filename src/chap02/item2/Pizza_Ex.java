package chap02.item2;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

public abstract class Pizza_Ex {
    public enum Topping_Ex { HAM, MUSHROOM, ONION, PEPPER, SAUSAGE }
    final Set<Topping_Ex> toppings;

    abstract static class Builder<T extends Builder<T>> {
        EnumSet<Topping_Ex> toppings = EnumSet.noneOf(Topping_Ex.class);

        public T addTopping(Topping_Ex topping) {
            toppings.add(Objects.requireNonNull(topping));
            return self();
        }

        abstract Pizza_Ex build();

        protected abstract T self();
    }

    Pizza_Ex(Builder<?> builder) {
        toppings = builder.toppings.clone();
    }

}
