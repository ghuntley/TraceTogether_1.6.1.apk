package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.ProgressBar;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class mO extends ProgressBar {

    /* renamed from: ɩ  reason: contains not printable characters */
    private List<C0238> f3122;

    /* renamed from: ι  reason: contains not printable characters */
    private C0237 f3123;

    static {
        Collections.singletonList(new C0238(60, 4000));
        Arrays.asList(new C0238[]{new C0238(60, 4000), new C0238(90, 15000)});
    }

    public mO(Context context) {
        super(context);
        new Handler(Looper.getMainLooper());
    }

    public mO(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new Handler(Looper.getMainLooper());
    }

    public mO(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        new Handler(Looper.getMainLooper());
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private void m3762(List<C0238> list, int i) {
        if (this.f3123 == null) {
            ArrayList arrayList = new ArrayList(list.size());
            for (C0238 next : list) {
                int r2 = next.f3128;
                long r3 = next.f3127;
                ObjectAnimator ofInt = ObjectAnimator.ofInt(this, "progress", new int[]{i, r2});
                ofInt.setInterpolator(new DecelerateInterpolator());
                ofInt.setDuration(r3);
                int r1 = next.f3128;
                arrayList.add(ofInt);
                i = r1;
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playSequentially(arrayList);
            animatorSet.setStartDelay(0);
            this.f3123 = new C0237(animatorSet);
            this.f3123.f3126.start();
        }
    }

    public final Parcelable onSaveInstanceState() {
        if (this.f3123 != null) {
            return new If(super.onSaveInstanceState(), getProgress(), this.f3122);
        }
        setProgress(0);
        return super.onSaveInstanceState();
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof If) {
            If ifR = (If) parcelable;
            if (ifR.f3125 > 0) {
                ArrayList arrayList = new ArrayList(ifR.f3124);
                ArrayList arrayList2 = new ArrayList();
                int i = 0;
                for (C0238 r5 : ifR.f3124) {
                    if (ifR.f3125 < r5.f3128) {
                        arrayList2.add(r5);
                    } else {
                        i = r5.f3128;
                    }
                }
                if (O.m1394(arrayList2)) {
                    C0238 r3 = (C0238) arrayList2.remove(0);
                    int r32 = r3.f3128;
                    arrayList2.add(0, new C0238(r32, (long) (((float) r3.f3127) * (1.0f - (((float) (ifR.f3125 - i)) / ((float) (r3.f3128 - i)))))));
                }
                m3762(arrayList2, ifR.f3125);
                this.f3122 = arrayList;
            } else {
                setProgress(0);
            }
            parcelable = ifR.getSuperState();
        }
        super.onRestoreInstanceState(parcelable);
    }

    /* renamed from: o.mO$ɩ  reason: contains not printable characters */
    static class C0238 implements Parcelable, Comparable<C0238> {
        public static final Parcelable.Creator<C0238> CREATOR = new Parcelable.Creator<C0238>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new C0238[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new C0238(parcel);
            }
        };
        /* access modifiers changed from: private */

        /* renamed from: ɩ  reason: contains not printable characters */
        public final long f3127;
        /* access modifiers changed from: private */

        /* renamed from: Ι  reason: contains not printable characters */
        public final int f3128;

        public final int describeContents() {
            return 0;
        }

        public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
            return this.f3128 - ((C0238) obj).f3128;
        }

        C0238(int i, long j) {
            this.f3128 = i;
            this.f3127 = j;
        }

        C0238(Parcel parcel) {
            this.f3128 = parcel.readInt();
            this.f3127 = parcel.readLong();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f3128);
            parcel.writeLong(this.f3127);
        }
    }

    static class If extends View.BaseSavedState {
        public static final Parcelable.Creator<If> CREATOR = new Parcelable.Creator<If>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new If[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new If(parcel, (byte) 0);
            }
        };
        /* access modifiers changed from: private */

        /* renamed from: ɩ  reason: contains not printable characters */
        public final List<C0238> f3124;
        /* access modifiers changed from: private */

        /* renamed from: ι  reason: contains not printable characters */
        public final int f3125;

        /* synthetic */ If(Parcel parcel, byte b) {
            this(parcel);
        }

        public If(Parcelable parcelable, int i, List<C0238> list) {
            super(parcelable);
            this.f3125 = i;
            this.f3124 = list;
        }

        private If(Parcel parcel) {
            super(parcel);
            this.f3125 = parcel.readInt();
            this.f3124 = new ArrayList();
            parcel.readTypedList(this.f3124, C0238.CREATOR);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f3125);
            parcel.writeTypedList(this.f3124);
        }
    }

    /* renamed from: o.mO$ǃ  reason: contains not printable characters */
    static class C0237 extends AnimatorListenerAdapter {

        /* renamed from: ı  reason: contains not printable characters */
        final Animator f3126;

        public final void onAnimationCancel(Animator animator) {
        }

        public final void onAnimationEnd(Animator animator) {
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationStart(Animator animator) {
        }

        C0237(Animator animator) {
            this.f3126 = animator;
            this.f3126.addListener(this);
        }
    }
}
