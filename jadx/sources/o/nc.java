package o;

public class nc<E> {
    private final String actionType;
    private final E data;

    public nc(String str, E e) {
        this.actionType = str;
        this.data = e;
    }

    public nc(String str) {
        this.actionType = str;
        this.data = null;
    }

    public String getActionType() {
        return this.actionType;
    }

    public <F> F getData(Class<F> cls) {
        if (cls.isInstance(this.data)) {
            return cls.cast(this.data);
        }
        return null;
    }

    public <F> F getData() {
        return this.data;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Action{actionType='");
        sb.append(this.actionType);
        sb.append('\'');
        sb.append(", data=");
        sb.append(this.data);
        sb.append('}');
        return sb.toString();
    }
}
