package o;

import android.os.Bundle;
import androidx.lifecycle.LiveData;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import o.C3169;

/* renamed from: o.ıɺ  reason: contains not printable characters */
final class C0347 extends C0401 {

    /* renamed from: ǃ  reason: contains not printable characters */
    static boolean f3741 = false;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final Cif f3742;

    /* renamed from: ι  reason: contains not printable characters */
    private final C2851 f3743;

    /* renamed from: o.ıɺ$ɩ  reason: contains not printable characters */
    public static class C0348<D> extends C2687<D> {

        /* renamed from: Ɩ  reason: contains not printable characters */
        final Bundle f3746;

        /* renamed from: І  reason: contains not printable characters */
        final C0402<D> f3747;

        /* renamed from: Ӏ  reason: contains not printable characters */
        final int f3748;

        /* renamed from: ǃ  reason: contains not printable characters */
        public final void m4501() {
            boolean z = C0347.f3741;
            C0402<D> r0 = this.f3747;
            r0.f3960 = true;
            r0.f3959 = false;
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final void m4500() {
            boolean z = C0347.f3741;
            this.f3747.f3960 = false;
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final void m4502(C2915<? super D> r1) {
            super.m194(r1);
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final void m4503(D d) {
            super.m14290(d);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.f3748);
            sb.append(" : ");
            C2745.m14547((Object) this.f3747, sb);
            sb.append("}}");
            return sb.toString();
        }
    }

    /* renamed from: o.ıɺ$if  reason: invalid class name */
    static class Cif extends C0326 {

        /* renamed from: ǃ  reason: contains not printable characters */
        private static final C3169.C3172 f3744 = new C3169.C3172() {
            /* renamed from: ı  reason: contains not printable characters */
            public final <T extends C0326> T m4499(Class<T> cls) {
                return new Cif();
            }
        };

        /* renamed from: ι  reason: contains not printable characters */
        C1286<C0348> f3745 = new C1286<>();

        Cif() {
        }

        /* renamed from: ι  reason: contains not printable characters */
        static Cif m4497(C0307 r2) {
            return (Cif) new C3169(r2, f3744).m16018(Cif.class);
        }

        /* renamed from: ι  reason: contains not printable characters */
        public void m4498() {
            super.m4397();
            if (this.f3745.m8210() <= 0) {
                this.f3745.m8212();
                return;
            }
            boolean z = C0347.f3741;
            this.f3745.m8218(0).f3747.f3959 = true;
            throw new IllegalStateException("No listener register");
        }
    }

    C0347(C2851 r1, C0307 r2) {
        this.f3743 = r1;
        this.f3742 = Cif.m4497(r2);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m4496() {
        Cif ifVar = this.f3742;
        int r1 = ifVar.f3745.m8210();
        for (int i = 0; i < r1; i++) {
            ifVar.f3745.m8218(i);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        C2745.m14547((Object) this.f3743, sb);
        sb.append("}}");
        return sb.toString();
    }

    @Deprecated
    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m4495(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        Cif ifVar = this.f3742;
        if (ifVar.f3745.m8210() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("    ");
            String obj = sb.toString();
            for (int i = 0; i < ifVar.f3745.m8210(); i++) {
                C0348 r2 = ifVar.f3745.m8218(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(ifVar.f3745.m8208(i));
                printWriter.print(": ");
                printWriter.println(r2.toString());
                printWriter.print(obj);
                printWriter.print("mId=");
                printWriter.print(r2.f3748);
                printWriter.print(" mArgs=");
                printWriter.println(r2.f3746);
                printWriter.print(obj);
                printWriter.print("mLoader=");
                printWriter.println(r2.f3747);
                C0402<D> r4 = r2.f3747;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(obj);
                sb2.append("  ");
                String obj2 = sb2.toString();
                printWriter.print(obj2);
                printWriter.print("mId=");
                printWriter.print(0);
                printWriter.print(" mListener=");
                Object obj3 = null;
                printWriter.println((Object) null);
                if (r4.f3960) {
                    printWriter.print(obj2);
                    printWriter.print("mStarted=");
                    printWriter.print(r4.f3960);
                    printWriter.print(" mContentChanged=");
                    printWriter.print(false);
                    printWriter.print(" mProcessingChange=");
                    printWriter.println(false);
                }
                if (r4.f3959) {
                    printWriter.print(obj2);
                    printWriter.print("mAbandoned=");
                    printWriter.print(r4.f3959);
                    printWriter.print(" mReset=");
                    printWriter.println(false);
                }
                printWriter.print(obj);
                printWriter.print("mData=");
                Object obj4 = r2.f236;
                if (obj4 != LiveData.f233) {
                    obj3 = obj4;
                }
                StringBuilder sb3 = new StringBuilder(64);
                C2745.m14547(obj3, sb3);
                sb3.append("}");
                printWriter.println(sb3.toString());
                printWriter.print(obj);
                printWriter.print("mStarted=");
                printWriter.println(r2.f238 > 0);
            }
        }
    }
}
