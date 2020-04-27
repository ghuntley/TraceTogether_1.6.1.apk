package o;

import java.io.Closeable;
import java.io.Flushable;

public interface jZ extends Closeable, Flushable {
    void close();

    void flush();

    C3533kb timeout();

    void write(jH jHVar, long j);
}
