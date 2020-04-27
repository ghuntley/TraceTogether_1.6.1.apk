package o;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import o.C2745;

/* renamed from: o.AuX  reason: case insensitive filesystem */
public final class C3250AuX implements View.OnClickListener {

    /* renamed from: ı  reason: contains not printable characters */
    final Window f1121;

    /* renamed from: ŀ  reason: contains not printable characters */
    TextView f1122;

    /* renamed from: ł  reason: contains not printable characters */
    ImageView f1123;

    /* renamed from: ſ  reason: contains not printable characters */
    int f1124;

    /* renamed from: Ɩ  reason: contains not printable characters */
    public ListView f1125;

    /* renamed from: Ɨ  reason: contains not printable characters */
    int f1126;

    /* renamed from: ƚ  reason: contains not printable characters */
    int f1127 = -1;

    /* renamed from: ǀ  reason: contains not printable characters */
    private Message f1128;

    /* renamed from: ǃ  reason: contains not printable characters */
    final int f1129;

    /* renamed from: ȷ  reason: contains not printable characters */
    CharSequence f1130;

    /* renamed from: ɍ  reason: contains not printable characters */
    int f1131;

    /* renamed from: ɔ  reason: contains not printable characters */
    private Message f1132;

    /* renamed from: ɟ  reason: contains not printable characters */
    private Message f1133;

    /* renamed from: ɨ  reason: contains not printable characters */
    Button f1134;

    /* renamed from: ɩ  reason: contains not printable characters */
    final Context f1135;

    /* renamed from: ɪ  reason: contains not printable characters */
    CharSequence f1136;

    /* renamed from: ɹ  reason: contains not printable characters */
    Button f1137;

    /* renamed from: ɺ  reason: contains not printable characters */
    boolean f1138;

    /* renamed from: ɼ  reason: contains not printable characters */
    final View.OnClickListener f1139 = this;

    /* renamed from: ɾ  reason: contains not printable characters */
    C0882 f1140;

    /* renamed from: ɿ  reason: contains not printable characters */
    ListAdapter f1141;

    /* renamed from: ʅ  reason: contains not printable characters */
    int f1142;

    /* renamed from: ʟ  reason: contains not printable characters */
    View f1143;

    /* renamed from: Ι  reason: contains not printable characters */
    final C0956 f1144;

    /* renamed from: ι  reason: contains not printable characters */
    CharSequence f1145;

    /* renamed from: ϲ  reason: contains not printable characters */
    private Handler f1146;

    /* renamed from: І  reason: contains not printable characters */
    Button f1147;

    /* renamed from: г  reason: contains not printable characters */
    TextView f1148;

    /* renamed from: і  reason: contains not printable characters */
    CharSequence f1149;

    /* renamed from: Ӏ  reason: contains not printable characters */
    CharSequence f1150;

    /* renamed from: ӏ  reason: contains not printable characters */
    Drawable f1151;

    /* renamed from: o.AuX$If */
    static final class If extends Handler {

        /* renamed from: ι  reason: contains not printable characters */
        private WeakReference<DialogInterface> f1164;

        public If(DialogInterface dialogInterface) {
            this.f1164 = new WeakReference<>(dialogInterface);
        }

        public final void handleMessage(Message message) {
            int i = message.what;
            if (i == -3 || i == -2 || i == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick(this.f1164.get(), message.what);
            } else if (i == 1) {
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    public C3250AuX(Context context, C0956 r5, Window window) {
        this.f1135 = context;
        this.f1144 = r5;
        this.f1121 = window;
        this.f1146 = new If(r5);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, C2745.aux.f12908, R.attr.f148482130968614, 0);
        this.f1142 = obtainStyledAttributes.getResourceId(C2745.aux.f12971, 0);
        obtainStyledAttributes.getResourceId(C2745.aux.f12872, 0);
        this.f1124 = obtainStyledAttributes.getResourceId(C2745.aux.f12992, 0);
        obtainStyledAttributes.getResourceId(C2745.aux.f12989, 0);
        this.f1126 = obtainStyledAttributes.getResourceId(C2745.aux.f12879, 0);
        this.f1131 = obtainStyledAttributes.getResourceId(C2745.aux.f12974, 0);
        this.f1138 = obtainStyledAttributes.getBoolean(C2745.aux.f12972, true);
        this.f1129 = obtainStyledAttributes.getDimensionPixelSize(C2745.aux.f12960, 0);
        obtainStyledAttributes.recycle();
        r5.supportRequestWindowFeature(1);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m1263(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message) {
        if (onClickListener != null) {
            message = this.f1146.obtainMessage(i, onClickListener);
        }
        if (i == -3) {
            this.f1136 = charSequence;
            this.f1132 = message;
        } else if (i == -2) {
            this.f1130 = charSequence;
            this.f1128 = message;
        } else if (i == -1) {
            this.f1149 = charSequence;
            this.f1133 = message;
        } else {
            throw new IllegalArgumentException("Button does not exist");
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    static ViewGroup m1262(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    static void m1261(View view, View view2, View view3) {
        int i = 0;
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            if (!view.canScrollVertically(1)) {
                i = 4;
            }
            view3.setVisibility(i);
        }
    }

    /* renamed from: o.AuX$ı  reason: contains not printable characters */
    public static class C0084 extends ListView {

        /* renamed from: ı  reason: contains not printable characters */
        private final int f1165;

        /* renamed from: Ι  reason: contains not printable characters */
        private final int f1166;

        public C0084(Context context) {
            this(context, (AttributeSet) null);
        }

        public C0084(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2745.aux.f12936);
            this.f1165 = obtainStyledAttributes.getDimensionPixelOffset(C2745.aux.f12938, -1);
            this.f1166 = obtainStyledAttributes.getDimensionPixelOffset(C2745.aux.f12954, -1);
        }

        public void setHasDecor(boolean z, boolean z2) {
            if (!z2 || !z) {
                setPadding(getPaddingLeft(), z ? getPaddingTop() : this.f1166, getPaddingRight(), z2 ? getPaddingBottom() : this.f1165);
            }
        }
    }

    /* renamed from: o.AuX$ǃ  reason: contains not printable characters */
    public static class C0085 {

        /* renamed from: ı  reason: contains not printable characters */
        public CharSequence f1167;

        /* renamed from: ł  reason: contains not printable characters */
        public int f1168 = -1;

        /* renamed from: Ɩ  reason: contains not printable characters */
        public CharSequence f1169;

        /* renamed from: ǃ  reason: contains not printable characters */
        public final LayoutInflater f1170;

        /* renamed from: ȷ  reason: contains not printable characters */
        public boolean f1171;

        /* renamed from: ɨ  reason: contains not printable characters */
        public DialogInterface.OnKeyListener f1172;

        /* renamed from: ɩ  reason: contains not printable characters */
        public View f1173;

        /* renamed from: ɪ  reason: contains not printable characters */
        public boolean f1174;

        /* renamed from: ɹ  reason: contains not printable characters */
        public CharSequence f1175;

        /* renamed from: ɾ  reason: contains not printable characters */
        public ListAdapter f1176;

        /* renamed from: Ι  reason: contains not printable characters */
        public final Context f1177;

        /* renamed from: ι  reason: contains not printable characters */
        public Drawable f1178;

        /* renamed from: І  reason: contains not printable characters */
        public DialogInterface.OnClickListener f1179;

        /* renamed from: і  reason: contains not printable characters */
        public DialogInterface.OnClickListener f1180;

        /* renamed from: Ӏ  reason: contains not printable characters */
        public CharSequence f1181;

        /* renamed from: ӏ  reason: contains not printable characters */
        public DialogInterface.OnClickListener f1182;

        public C0085(Context context) {
            this.f1177 = context;
            this.f1171 = true;
            this.f1170 = (LayoutInflater) context.getSystemService("layout_inflater");
        }
    }

    /* renamed from: o.AuX$ɩ  reason: contains not printable characters */
    static class C0086 extends ArrayAdapter<CharSequence> {
        public final long getItemId(int i) {
            return (long) i;
        }

        public final boolean hasStableIds() {
            return true;
        }

        public C0086(Context context, int i) {
            super(context, i, 16908308, (Object[]) null);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
        r3 = r2.f1132;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r3) {
        /*
            r2 = this;
            android.widget.Button r0 = r2.f1147
            if (r3 != r0) goto L_0x000d
            android.os.Message r0 = r2.f1133
            if (r0 == 0) goto L_0x000d
            android.os.Message r3 = android.os.Message.obtain(r0)
            goto L_0x0028
        L_0x000d:
            android.widget.Button r0 = r2.f1137
            if (r3 != r0) goto L_0x001a
            android.os.Message r0 = r2.f1128
            if (r0 == 0) goto L_0x001a
            android.os.Message r3 = android.os.Message.obtain(r0)
            goto L_0x0028
        L_0x001a:
            android.widget.Button r0 = r2.f1134
            if (r3 != r0) goto L_0x0027
            android.os.Message r3 = r2.f1132
            if (r3 == 0) goto L_0x0027
            android.os.Message r3 = android.os.Message.obtain(r3)
            goto L_0x0028
        L_0x0027:
            r3 = 0
        L_0x0028:
            if (r3 == 0) goto L_0x002d
            r3.sendToTarget()
        L_0x002d:
            android.os.Handler r3 = r2.f1146
            r0 = 1
            o.ȷ r1 = r2.f1144
            android.os.Message r3 = r3.obtainMessage(r0, r1)
            r3.sendToTarget()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C3250AuX.onClick(android.view.View):void");
    }
}
