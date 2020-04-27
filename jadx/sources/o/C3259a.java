package o;

import android.graphics.Bitmap;

/* renamed from: o.a  reason: case insensitive filesystem */
public interface C3259a {
    /* renamed from: ı  reason: contains not printable characters */
    int m1442();

    /* renamed from: ǃ  reason: contains not printable characters */
    int m1443();

    /* renamed from: ɩ  reason: contains not printable characters */
    Bitmap m1444(String str);

    /* renamed from: ι  reason: contains not printable characters */
    void m1445(String str, Bitmap bitmap);

    /* renamed from: o.a$4  reason: invalid class name */
    public static class AnonymousClass4 implements C3259a, Runnable {

        /* renamed from: ı  reason: contains not printable characters */
        private final C1404 f1379;

        /* renamed from: ɩ  reason: contains not printable characters */
        private final C1588 f1380;

        /* renamed from: ı  reason: contains not printable characters */
        public final int m1446() {
            return 0;
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final int m1447() {
            return 0;
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final Bitmap m1448(String str) {
            return null;
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final void m1449(String str, Bitmap bitmap) {
        }

        AnonymousClass4() {
        }

        public AnonymousClass4(C1588 r1, C1404 r2) {
            this.f1380 = r1;
            this.f1379 = r2;
        }

        public final void run() {
            this.f1380.m9275(this.f1379.f7667);
        }
    }
}
