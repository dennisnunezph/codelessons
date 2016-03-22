package compareasia.research.monads;
import java.util.function.Function;

/**
 * Created by dennis on 7/30/15.
 */
public class Optional<T> {
    private static final Optional<?> EMPTY = new Optional<>(null);
    private final T value;

    private Optional(T value) {
        this.value = value;
    }

    public<U> Optional<U> map(Function<? super T, ? extends U> f) {
        return value == null ? (Optional<U>) EMPTY : new Optional(f.apply(value));
    }

    public<U> Optional<?> flatMap(Function<? super T, Optional<U>> f) {
        return value == null ? EMPTY : f.apply(value);
    }
}
