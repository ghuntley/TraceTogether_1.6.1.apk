package o;

import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import o.C1976;

/* renamed from: o.ϲǃ  reason: contains not printable characters */
public class C2170 extends C1976 {

    /* renamed from: ȷ  reason: contains not printable characters */
    private boolean f10333;

    /* renamed from: ɪ  reason: contains not printable characters */
    private int f10334;

    /* renamed from: ɹ  reason: contains not printable characters */
    ArrayList<C1976> f10335;

    /* renamed from: І  reason: contains not printable characters */
    boolean f10336;

    /* renamed from: і  reason: contains not printable characters */
    int f10337;

    public /* synthetic */ Object clone() {
        return clone();
    }

    public C2170() {
        this.f10335 = new ArrayList<>();
        this.f10333 = true;
        this.f10336 = false;
        this.f10334 = 0;
    }

    @SuppressLint({"RestrictedApi"})
    public C2170(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10335 = new ArrayList<>();
        boolean z = true;
        this.f10333 = true;
        int i = 0;
        this.f10336 = false;
        this.f10334 = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2004.f9956);
        m11507(((XmlResourceParser) attributeSet).getAttributeValue("http://schemas.android.com/apk/res/android", "transitionOrdering") == null ? false : z ? obtainStyledAttributes.getInt(0, 0) : i);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final C2170 m11507(int i) {
        if (i == 0) {
            this.f10333 = true;
        } else if (i == 1) {
            this.f10333 = false;
        } else {
            throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: ".concat(String.valueOf(i)));
        }
        return this;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final C2170 m11505(long j) {
        ArrayList<C1976> arrayList;
        super.m10733(j);
        if (this.f9900 >= 0 && (arrayList = this.f10335) != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f10335.get(i).m10733(j);
            }
        }
        return this;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final C2170 m11499(TimeInterpolator timeInterpolator) {
        this.f10334 |= 1;
        ArrayList<C1976> arrayList = this.f10335;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f10335.get(i).m10723(timeInterpolator);
            }
        }
        return (C2170) super.m10723(timeInterpolator);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m11516(C1873 r3) {
        super.m10750(r3);
        this.f10334 |= 4;
        if (this.f10335 != null) {
            for (int i = 0; i < this.f10335.size(); i++) {
                this.f10335.get(i).m10750(r3);
            }
        }
    }

    /* renamed from: o.ϲǃ$If */
    static class If extends C2169 {

        /* renamed from: ɩ  reason: contains not printable characters */
        private C2170 f10340;

        If(C2170 r1) {
            this.f10340 = r1;
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final void m11527() {
            if (!this.f10340.f10336) {
                this.f10340.m10725();
                this.f10340.f10336 = true;
            }
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final void m11526(C1976 r3) {
            C2170 r0 = this.f10340;
            r0.f10337--;
            if (this.f10340.f10337 == 0) {
                C2170 r02 = this.f10340;
                r02.f10336 = false;
                r02.m10744();
            }
            r3.m10741((C1976.If) this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: Ι  reason: contains not printable characters */
    public final void m11515(ViewGroup viewGroup, C2771 r14, C2771 r15, ArrayList<C2259> arrayList, ArrayList<C2259> arrayList2) {
        long r1 = m10745();
        int size = this.f10335.size();
        for (int i = 0; i < size; i++) {
            C1976 r6 = this.f10335.get(i);
            if (r1 > 0 && (this.f10333 || i == 0)) {
                long r9 = r6.m10745();
                if (r9 > 0) {
                    r6.m10740(r9 + r1);
                } else {
                    r6.m10740(r1);
                }
            }
            r6.m10749(viewGroup, r14, r15, arrayList, arrayList2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: ι  reason: contains not printable characters */
    public final void m11519() {
        if (this.f10335.isEmpty()) {
            m10725();
            m10744();
            return;
        }
        If ifR = new If(this);
        Iterator<C1976> it = this.f10335.iterator();
        while (it.hasNext()) {
            it.next().m10747((C1976.If) ifR);
        }
        this.f10337 = this.f10335.size();
        if (!this.f10333) {
            for (int i = 1; i < this.f10335.size(); i++) {
                final C1976 r2 = this.f10335.get(i);
                this.f10335.get(i - 1).m10747((C1976.If) new C2169() {
                    /* renamed from: ǃ  reason: contains not printable characters */
                    public final void m11525(C1976 r2) {
                        r2.m10753();
                        r2.m10741((C1976.If) this);
                    }
                });
            }
            C1976 r0 = this.f10335.get(0);
            if (r0 != null) {
                r0.m10753();
                return;
            }
            return;
        }
        Iterator<C1976> it2 = this.f10335.iterator();
        while (it2.hasNext()) {
            it2.next().m10753();
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m11521(C2259 r4) {
        if (m10742(r4.f10584)) {
            Iterator<C1976> it = this.f10335.iterator();
            while (it.hasNext()) {
                C1976 next = it.next();
                if (next.m10742(r4.f10584)) {
                    next.m10755(r4);
                    r4.f10583.add(next);
                }
            }
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m11510(C2259 r4) {
        if (m10742(r4.f10584)) {
            Iterator<C1976> it = this.f10335.iterator();
            while (it.hasNext()) {
                C1976 next = it.next();
                if (next.m10742(r4.f10584)) {
                    next.m10736(r4);
                    r4.f10583.add(next);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public final void m11517(C2259 r4) {
        super.m10751(r4);
        int size = this.f10335.size();
        for (int i = 0; i < size; i++) {
            this.f10335.get(i).m10751(r4);
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m11520(View view) {
        super.m10754(view);
        int size = this.f10335.size();
        for (int i = 0; i < size; i++) {
            this.f10335.get(i).m10754(view);
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m11501(View view) {
        super.m10726(view);
        int size = this.f10335.size();
        for (int i = 0; i < size; i++) {
            this.f10335.get(i).m10726(view);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: І  reason: contains not printable characters */
    public final void m11523() {
        super.m10757();
        int size = this.f10335.size();
        for (int i = 0; i < size; i++) {
            this.f10335.get(i).m10757();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public final void m11502(ViewGroup viewGroup) {
        super.m10727(viewGroup);
        int size = this.f10335.size();
        for (int i = 0; i < size; i++) {
            this.f10335.get(i).m10727(viewGroup);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ι  reason: contains not printable characters */
    public final void m11522(boolean z) {
        super.m10756(z);
        int size = this.f10335.size();
        for (int i = 0; i < size; i++) {
            this.f10335.get(i).m10756(z);
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m11504(C2186 r4) {
        super.m10730(r4);
        this.f10334 |= 2;
        int size = this.f10335.size();
        for (int i = 0; i < size; i++) {
            this.f10335.get(i).m10730(r4);
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m11503(C1976.C1977 r4) {
        super.m10729(r4);
        this.f10334 |= 8;
        int size = this.f10335.size();
        for (int i = 0; i < size; i++) {
            this.f10335.get(i).m10729(r4);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public final String m11498(String str) {
        String r0 = super.m10722(str);
        for (int i = 0; i < this.f10335.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(r0);
            sb.append("\n");
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append("  ");
            sb.append(this.f10335.get(i).m10722(sb2.toString()));
            r0 = sb.toString();
        }
        return r0;
    }

    /* renamed from: Ӏ  reason: contains not printable characters */
    public final C1976 m11524() {
        C2170 r0 = (C2170) super.clone();
        r0.f10335 = new ArrayList<>();
        int size = this.f10335.size();
        for (int i = 0; i < size; i++) {
            C1976 r3 = this.f10335.get(i).clone();
            r0.f10335.add(r3);
            r3.f9890 = r0;
        }
        return r0;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final C2170 m11509(C1976 r6) {
        this.f10335.add(r6);
        r6.f9890 = this;
        if (this.f9900 >= 0) {
            r6.m10733(this.f9900);
        }
        if ((this.f10334 & 1) != 0) {
            r6.m10723(m10739());
        }
        if ((this.f10334 & 2) != 0) {
            r6.m10730(this.f9910);
        }
        if ((this.f10334 & 4) != 0) {
            r6.m10750(m10732());
        }
        if ((this.f10334 & 8) != 0) {
            r6.m10729(m10758());
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ι  reason: contains not printable characters */
    public final /* synthetic */ C1976 m11518(ViewGroup viewGroup) {
        super.m10752(viewGroup);
        int size = this.f10335.size();
        for (int i = 0; i < size; i++) {
            this.f10335.get(i).m10752(viewGroup);
        }
        return this;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ C1976 m11512(C1976.If ifR) {
        return (C2170) super.m10741(ifR);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ C1976 m11514(C1976.If ifR) {
        return (C2170) super.m10747(ifR);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final /* synthetic */ C1976 m11513(View view) {
        for (int i = 0; i < this.f10335.size(); i++) {
            this.f10335.get(i).m10746(view);
        }
        return (C2170) super.m10746(view);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final /* synthetic */ C1976 m11506(View view) {
        for (int i = 0; i < this.f10335.size(); i++) {
            this.f10335.get(i).m10734(view);
        }
        return (C2170) super.m10734(view);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ C1976 m11511(long j) {
        return (C2170) super.m10740(j);
    }
}
