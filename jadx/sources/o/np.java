package o;

public abstract class np<E> {
    public abstract E getInitialState();

    public abstract E reduce(E e, nc<?> ncVar);

    public String getStateKey() {
        return nt.m4028(getInitialState().getClass());
    }
}
