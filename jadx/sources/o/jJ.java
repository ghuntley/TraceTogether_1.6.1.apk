package o;

public abstract class jJ implements jY {
    private final jY delegate;

    public jJ(jY jYVar) {
        if (jYVar != null) {
            this.delegate = jYVar;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    public final jY delegate() {
        return this.delegate;
    }

    public long read(jH jHVar, long j) {
        return this.delegate.read(jHVar, j);
    }

    public C3533kb timeout() {
        return this.delegate.timeout();
    }

    public void close() {
        this.delegate.close();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(");
        sb.append(this.delegate.toString());
        sb.append(")");
        return sb.toString();
    }
}
