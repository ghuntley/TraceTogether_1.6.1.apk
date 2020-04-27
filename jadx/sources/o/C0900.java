package o;

import android.os.AsyncTask;

/* renamed from: o.ǃɈ  reason: contains not printable characters */
public class C0900 {
    /* renamed from: ι  reason: contains not printable characters */
    public void m6676(String str) {
        throw new RuntimeException(str);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public int m6675() {
        return m6675() + ((int) Math.random());
    }

    /* renamed from: ı  reason: contains not printable characters */
    public void m6672() {
        C3263ac.m1563();
    }

    /* renamed from: ı  reason: contains not printable characters */
    public void m6673(final long j) {
        new AsyncTask<Void, Void, Void>() {
            /* access modifiers changed from: protected */
            /* renamed from: ı  reason: contains not printable characters */
            public Void doInBackground(Void... voidArr) {
                try {
                    Thread.sleep(j);
                } catch (InterruptedException unused) {
                }
                C0900.this.m6676("Background thread crash");
                return null;
            }
        }.execute(new Void[]{null});
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public void m6674() {
        try {
            m6671("1");
        } catch (Exception e) {
            throw new RuntimeException("2", e);
        } catch (Exception e2) {
            try {
                throw new RuntimeException("3", e2);
            } catch (Exception e3) {
                try {
                    throw new RuntimeException("4", e3);
                } catch (Exception e4) {
                    throw new RuntimeException("5", e4);
                }
            }
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private void m6671(String str) {
        throw new RuntimeException(str);
    }
}
