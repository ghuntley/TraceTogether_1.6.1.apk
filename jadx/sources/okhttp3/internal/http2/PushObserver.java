package okhttp3.internal.http2;

import java.util.List;
import o.jI;

public interface PushObserver {
    public static final PushObserver CANCEL = new PushObserver() {
        public boolean onHeaders(int i, List<Header> list, boolean z) {
            return true;
        }

        public boolean onRequest(int i, List<Header> list) {
            return true;
        }

        public void onReset(int i, ErrorCode errorCode) {
        }

        public boolean onData(int i, jI jIVar, int i2, boolean z) {
            jIVar.m2928((long) i2);
            return true;
        }
    };

    boolean onData(int i, jI jIVar, int i2, boolean z);

    boolean onHeaders(int i, List<Header> list, boolean z);

    boolean onRequest(int i, List<Header> list);

    void onReset(int i, ErrorCode errorCode);
}
