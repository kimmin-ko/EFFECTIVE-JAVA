package chap05.item33;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Favorites {
    private Map<Class<?>, Object> favorite = new HashMap<>();

    public <T> void putFavorite(Class<T> type, T instance) {
        favorite.put(Objects.requireNonNull(type), instance);
    }

    public <T> T getFavorite(Class<T> type) {
        return type.cast(favorite.get(type));
    }
}
