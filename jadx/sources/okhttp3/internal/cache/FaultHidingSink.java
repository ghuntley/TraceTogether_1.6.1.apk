package okhttp3.internal.cache;

import java.io.IOException;
import o.jH;
import o.jL;
import o.jZ;

class FaultHidingSink extends jL {
    private boolean hasErrors;

    /* access modifiers changed from: protected */
    public void onException(IOException iOException) {
    }

    FaultHidingSink(jZ jZVar) {
        super(jZVar);
    }

    public void write(jH jHVar, long j) {
        if (this.hasErrors) {
            jHVar.m2896(j);
            return;
        }
        try {
            super.write(jHVar, j);
        } catch (IOException e) {
            this.hasErrors = true;
            onException(e);
        }
    }

    public void flush() {
        if (!this.hasErrors) {
            try {
                super.flush();
            } catch (IOException e) {
                this.hasErrors = true;
                onException(e);
            }
        }
    }

    public void close() {
        if (!this.hasErrors) {
            try {
                super.close();
            } catch (IOException e) {
                this.hasErrors = true;
                onException(e);
            }
        }
    }
}
