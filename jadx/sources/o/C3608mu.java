package o;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;
import java.util.UUID;
import o.C3609mv;
import o.C3610mw;
import o.mN;

/* renamed from: o.mu  reason: case insensitive filesystem */
public final class C3608mu {

    /* renamed from: ı  reason: contains not printable characters */
    public final String f3330;

    /* renamed from: ɩ  reason: contains not printable characters */
    public final String f3331;

    /* renamed from: ι  reason: contains not printable characters */
    public final String f3332;

    C3608mu() {
    }

    /* renamed from: o.mu$if  reason: invalid class name */
    static abstract class Cif {

        /* renamed from: ı  reason: contains not printable characters */
        final int f3336;

        /* renamed from: ǃ  reason: contains not printable characters */
        final long f3337 = ((long) UUID.randomUUID().hashCode());

        /* renamed from: ɩ  reason: contains not printable characters */
        boolean f3338 = false;

        /* renamed from: ι  reason: contains not printable characters */
        final mF f3339;

        /* access modifiers changed from: package-private */
        /* renamed from: ǃ  reason: contains not printable characters */
        public abstract void m3925(View view);

        Cif(int i, mF mFVar) {
            this.f3336 = i;
            this.f3339 = mFVar;
        }
    }

    /* renamed from: o.mu$ǃ  reason: contains not printable characters */
    static class C0257 extends Cif {

        /* renamed from: Ι  reason: contains not printable characters */
        final C3609mv.C0259 f3340;

        /* renamed from: І  reason: contains not printable characters */
        private final mF f3341;

        /* renamed from: Ӏ  reason: contains not printable characters */
        private final ResolveInfo f3342;

        C0257(C3609mv.C0259 r3, mF mFVar, Context context) {
            super(R.layout.f168972131558439, mFVar);
            ResolveInfo resolveInfo;
            this.f3341 = mFVar;
            String str = mFVar.f3093;
            PackageManager packageManager = context.getPackageManager();
            mF r4 = C3602mo.m3911(context).m3912("tmp", str);
            if (r4 != null) {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(r4.f3090);
                List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
                if (queryIntentActivities != null && queryIntentActivities.size() > 0) {
                    resolveInfo = queryIntentActivities.get(0);
                    this.f3342 = resolveInfo;
                    this.f3340 = r3;
                }
            }
            resolveInfo = null;
            this.f3342 = resolveInfo;
            this.f3340 = r3;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ǃ  reason: contains not printable characters */
        public final void m3926(View view) {
            Context context = view.getContext();
            ImageView imageView = (ImageView) view.findViewById(R.id.f165692131362122);
            TextView textView = (TextView) view.findViewById(R.id.f165702131362123);
            mN mNVar = (mN) view.findViewById(R.id.f165682131362121);
            mNVar.setContentDescriptionStrings(context.getString(R.string.f170502131886135, new Object[]{this.f3341.f3093}), context.getString(R.string.f170482131886133, new Object[]{this.f3341.f3093}));
            ((TextView) view.findViewById(R.id.f165712131362124)).setText(this.f3341.f3093);
            if (this.f3342 != null) {
                PackageManager packageManager = context.getPackageManager();
                textView.setText(this.f3342.loadLabel(packageManager));
                imageView.setImageDrawable(this.f3342.loadIcon(packageManager));
            } else {
                textView.setText(R.string.f170452131886129);
                imageView.setImageResource(17301651);
            }
            mNVar.setSelected(this.f3338);
            mNVar.setSelectionListener(new mN.If() {
                /* renamed from: ı  reason: contains not printable characters */
                public final boolean m3927() {
                    return C0257.this.f3340.m3932(C0257.this);
                }
            });
        }
    }

    /* renamed from: o.mu$ɩ  reason: contains not printable characters */
    static class C0258 extends Cif implements C3610mw.C0260 {

        /* renamed from: Ι  reason: contains not printable characters */
        final C3609mv.C0259 f3344;

        /* renamed from: І  reason: contains not printable characters */
        private final mF f3345;

        /* renamed from: Ӏ  reason: contains not printable characters */
        private C3610mw.C0261 f3346;

        C0258(C3609mv.C0259 r2, mF mFVar) {
            super(R.layout.f168962131558438, mFVar);
            this.f3344 = r2;
            this.f3345 = mFVar;
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final void m3928(View view) {
            Context context = view.getContext();
            C3610mw mwVar = (C3610mw) view.findViewById(R.id.f165722131362125);
            mN mNVar = (mN) view.findViewById(R.id.f165732131362126);
            mNVar.setContentDescriptionStrings(context.getString(R.string.f170512131886136, new Object[]{this.f3345.f3093}), context.getString(R.string.f170492131886134, new Object[]{this.f3345.f3093}));
            if (this.f3346 != null) {
                C3616p r3 = C3616p.m4040(context);
                Uri uri = this.f3345.f3092;
                C3610mw.C0261 r0 = this.f3346;
                if (uri != null && !uri.equals(mwVar.f3351)) {
                    if (mwVar.f3354 != null) {
                        mwVar.f3354.m4044((Object) mwVar);
                        mwVar.f3354.m4044((Object) mwVar);
                    }
                    mwVar.f3351 = uri;
                    mwVar.f3354 = r3;
                    mwVar.f3355 = r0.f3362;
                    mwVar.f3353 = r0.f3361;
                    mwVar.f3356 = r0.f3360;
                    mwVar.f3352 = r0.f3363;
                    mwVar.m3935(r3, uri, mwVar.f3352, mwVar.f3355, mwVar.f3353);
                }
            } else {
                C3616p r32 = C3616p.m4040(context);
                Uri uri2 = this.f3345.f3092;
                long j = this.f3345.f3088;
                long j2 = this.f3345.f3094;
                if (uri2 != null && !uri2.equals(mwVar.f3351)) {
                    if (mwVar.f3354 != null) {
                        mwVar.f3354.m4044((Object) mwVar);
                        mwVar.f3354.m4044((Object) mwVar);
                    }
                    mwVar.f3351 = uri2;
                    mwVar.f3354 = r32;
                    mwVar.f3355 = (int) j;
                    mwVar.f3353 = (int) j2;
                    mwVar.f3358 = this;
                    if (mwVar.f3352 > 0) {
                        mwVar.m3935(r32, uri2, mwVar.f3352, mwVar.f3355, mwVar.f3353);
                    } else {
                        mwVar.f3357.set(true);
                    }
                }
            }
            mNVar.setSelected(this.f3338);
            mNVar.setSelectionListener(new mN.If() {
                /* renamed from: ı  reason: contains not printable characters */
                public final boolean m3930() {
                    return C0258.this.f3344.m3932(C0258.this);
                }
            });
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final void m3929(C3610mw.C0261 r1) {
            this.f3346 = r1;
        }
    }

    /* renamed from: o.mu$If */
    static class If extends Cif {

        /* renamed from: Ι  reason: contains not printable characters */
        private final int f3334;

        /* renamed from: Ӏ  reason: contains not printable characters */
        private final View.OnClickListener f3335;

        /* synthetic */ If(View.OnClickListener onClickListener) {
            this(onClickListener, (byte) 0);
        }

        private If(View.OnClickListener onClickListener, byte b) {
            super(R.layout.f168982131558440, (mF) null);
            this.f3334 = 2131230822;
            this.f3335 = onClickListener;
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final void m3924(View view) {
            ((ImageView) view.findViewById(R.id.f165752131362128)).setImageResource(2131230822);
            view.findViewById(R.id.f165742131362127).setOnClickListener(this.f3335);
        }
    }

    public C3608mu(String str, String str2, String str3) {
        this.f3332 = str;
        this.f3331 = str2;
        this.f3330 = str3;
    }
}
