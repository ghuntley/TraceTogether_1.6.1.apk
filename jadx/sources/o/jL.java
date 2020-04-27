package o;

public abstract class jL implements jZ {
    private final jZ delegate;

    public jL(jZ jZVar) {
        if (jZVar != null) {
            this.delegate = jZVar;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    public final jZ delegate() {
        return this.delegate;
    }

    public void write(jH jHVar, long j) {
        this.delegate.write(jHVar, j);
    }

    public void flush() {
        this.delegate.flush();
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
