package o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import kotlin.Metadata;
import o.X;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\u0018\u0000 \u00012\u00020):\u0001\u0001B\u000f\u0012\u0006\u0010\u0018\u001a\u00020\"¢\u0006\u0004\b#\u0010$B\u0019\u0012\u0006\u0010\u0018\u001a\u00020\"\u0012\b\u0010%\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b#\u0010&B!\u0012\u0006\u0010\u0018\u001a\u00020\"\u0012\b\u0010%\u001a\u0004\u0018\u00010\u001b\u0012\u0006\u0010'\u001a\u00020\u0002¢\u0006\u0004\b#\u0010(J\u0017\u0010\u0006\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0006\u0010\u001aJ\u0019\u0010\u0003\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u001bH\u0003¢\u0006\u0004\b\u0003\u0010\u001cJ\u0015\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010 \u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0002¢\u0006\u0004\b \u0010!R\u0016\u0010\u0001\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\n\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0016\u0010\f\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0016\u0010\r\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u000f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0012\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0014R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010\u0016"}, d2 = {"Lo/U;", "ɩ", "", "ǃ", "I", "ɹ", "ı", "Ӏ", "ι", "І", "Ι", "ȷ", "і", "Ɩ", "ɾ", "", "ӏ", "Z", "ɪ", "Landroid/widget/TextView;", "Landroid/widget/TextView;", "Landroid/view/View;", "Landroid/view/View;", "Landroid/content/res/TypedArray;", "p0", "", "(Landroid/content/res/TypedArray;)V", "Landroid/util/AttributeSet;", "(Landroid/util/AttributeSet;)V", "", "setText", "(Ljava/lang/String;)V", "setViewState", "(I)V", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "p1", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "p2", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/widget/FrameLayout;"}, k = 1, mv = {1, 1, 15})
public final class U extends FrameLayout {

    /* renamed from: ɩ  reason: contains not printable characters */
    public static final C0103 f1317 = new C0103((fL) null);

    /* renamed from: ı  reason: contains not printable characters */
    private int f1318;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private int f1319;

    /* renamed from: ǃ  reason: contains not printable characters */
    private int f1320;

    /* renamed from: ȷ  reason: contains not printable characters */
    private int f1321;

    /* renamed from: ɩ  reason: contains not printable characters and collision with other field name */
    private View f1322;

    /* renamed from: ɪ  reason: contains not printable characters */
    private int f1323;

    /* renamed from: ɹ  reason: contains not printable characters */
    private int f1324;

    /* renamed from: ɾ  reason: contains not printable characters */
    private int f1325;

    /* renamed from: Ι  reason: contains not printable characters */
    private TextView f1326;

    /* renamed from: І  reason: contains not printable characters */
    private int f1327;

    /* renamed from: і  reason: contains not printable characters */
    private int f1328;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private int f1329;

    /* renamed from: ӏ  reason: contains not printable characters */
    private boolean f1330;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public U(Context context) {
        super(context);
        fM.m2254(context, "");
        m1423((AttributeSet) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public U(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        fM.m2254(context, "");
        m1423(attributeSet);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public U(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        fM.m2254(context, "");
        m1423(attributeSet);
    }

    @SuppressLint({"CustomViewStyleable"})
    /* renamed from: ǃ  reason: contains not printable characters */
    private final void m1423(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, X.Cif.f1333);
        fM.m2252((Object) obtainStyledAttributes, "");
        m1422(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: ı  reason: contains not printable characters */
    private final void m1422(TypedArray typedArray) {
        float f;
        float f2;
        TypedArray typedArray2 = typedArray;
        V v = V.f1331;
        Context context = getContext();
        fM.m2252((Object) context, "");
        V v2 = V.f1331;
        Context context2 = getContext();
        fM.m2252((Object) context2, "");
        int i = X.Cif.f1347;
        Context context3 = getContext();
        fM.m2252((Object) context3, "");
        int color = typedArray2.getColor(i, C0913.m6727(context3.getResources(), X.C0105.f1369, (Resources.Theme) null));
        float dimension = typedArray2.getDimension(X.Cif.f1337, (float) v.m1425(context, 2.0f));
        int i2 = X.Cif.f1359;
        V v3 = V.f1331;
        Context context4 = getContext();
        fM.m2252((Object) context4, "");
        float dimension2 = typedArray2.getDimension(i2, (float) v3.m1424(context4, 0));
        float f3 = (float) 2;
        float dimension3 = typedArray2.getDimension(X.Cif.f1349, f3);
        float dimension4 = typedArray2.getDimension(X.Cif.f1348, f3);
        float dimension5 = typedArray2.getDimension(X.Cif.f1362, f3);
        float dimension6 = typedArray2.getDimension(X.Cif.f1363, f3);
        this.f1330 = typedArray2.getBoolean(X.Cif.f1334, false);
        this.f1323 = typedArray2.getResourceId(X.Cif.f1339, X.C0104.f1364);
        Context context5 = getContext();
        fM.m2252((Object) context5, "");
        this.f1325 = C0913.m6727(context5.getResources(), X.C0105.f1368, (Resources.Theme) null);
        boolean z = typedArray2.getBoolean(X.Cif.f1356, false);
        float dimension7 = typedArray2.getDimension(X.Cif.f1344, (float) v2.m1425(context2, 24.0f));
        String string = typedArray2.getString(X.Cif.f1345);
        int i3 = X.Cif.f1354;
        Context context6 = getContext();
        fM.m2252((Object) context6, "");
        float f4 = dimension3;
        int resourceId = typedArray2.getResourceId(i3, C0913.m6727(context6.getResources(), X.C0105.f1368, (Resources.Theme) null));
        this.f1327 = typedArray2.getResourceId(X.Cif.f1336, resourceId);
        this.f1328 = typedArray2.getResourceId(X.Cif.f1340, resourceId);
        this.f1319 = typedArray2.getResourceId(X.Cif.f1350, resourceId);
        this.f1321 = typedArray2.getResourceId(X.Cif.f1351, resourceId);
        int i4 = X.Cif.f1357;
        Context context7 = getContext();
        fM.m2252((Object) context7, "");
        float f5 = dimension6;
        this.f1320 = typedArray2.getColor(i4, C0913.m6727(context7.getResources(), X.C0105.f1369, (Resources.Theme) null));
        int i5 = X.Cif.f1361;
        Context context8 = getContext();
        fM.m2252((Object) context8, "");
        this.f1318 = typedArray2.getColor(i5, C0913.m6727(context8.getResources(), X.C0105.f1370, (Resources.Theme) null));
        int i6 = X.Cif.f1341;
        Context context9 = getContext();
        fM.m2252((Object) context9, "");
        this.f1324 = typedArray2.getColor(i6, C0913.m6727(context9.getResources(), X.C0105.f1367, (Resources.Theme) null));
        int i7 = X.Cif.f1352;
        Context context10 = getContext();
        fM.m2252((Object) context10, "");
        this.f1329 = typedArray2.getColor(i7, C0913.m6727(context10.getResources(), X.C0105.f1369, (Resources.Theme) null));
        setBackgroundResource(resourceId);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        this.f1326 = new TextView(getContext());
        TextView textView = this.f1326;
        if (textView != null) {
            textView.setGravity(17);
        }
        if (string != null) {
            try {
                Context context11 = getContext();
                fM.m2252((Object) context11, "");
                Typeface createFromAsset = Typeface.createFromAsset(context11.getAssets(), string);
                TextView textView2 = this.f1326;
                if (textView2 != null) {
                    textView2.setTypeface(createFromAsset);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        TextView textView3 = this.f1326;
        if (textView3 != null) {
            textView3.setTextColor(color);
        }
        TextView textView4 = this.f1326;
        if (textView4 != null) {
            textView4.setTextSize(0, dimension7);
        }
        addView(this.f1326, layoutParams);
        if (z) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, (int) dimension);
            layoutParams2.gravity = 80;
            if (dimension2 != 0.0f) {
                f2 = dimension2;
                f = f2;
                dimension4 = f;
            } else {
                dimension2 = dimension5;
                f2 = f4;
                f = f5;
            }
            layoutParams2.leftMargin = (int) dimension2;
            layoutParams2.rightMargin = (int) dimension4;
            layoutParams2.bottomMargin = (int) f2;
            layoutParams2.topMargin = (int) f;
            this.f1322 = new View(getContext());
            addView(this.f1322, layoutParams2);
        }
    }

    public final void setText(String str) {
        fM.m2254(str, "");
        if (!this.f1330) {
            TextView textView = this.f1326;
            if (textView != null && textView != null) {
                textView.setText(str);
                return;
            }
            return;
        }
        TextView textView2 = this.f1326;
        if (textView2 != null) {
            textView2.setText("");
        }
        if (fM.m2257(str, "")) {
            TextView textView3 = this.f1326;
            if (textView3 != null) {
                textView3.setBackgroundResource(this.f1325);
                return;
            }
            return;
        }
        TextView textView4 = this.f1326;
        if (textView4 != null) {
            textView4.setBackgroundResource(this.f1323);
        }
    }

    public final void setViewState(int i) {
        if (i == -1) {
            View view = this.f1322;
            if (view != null) {
                view.setBackgroundColor(this.f1324);
            }
            setBackgroundResource(this.f1321);
        } else if (i == 0) {
            View view2 = this.f1322;
            if (view2 != null) {
                view2.setBackgroundColor(this.f1318);
            }
            setBackgroundResource(this.f1328);
        } else if (i == 1) {
            View view3 = this.f1322;
            if (view3 != null) {
                view3.setBackgroundColor(this.f1320);
            }
            setBackgroundResource(this.f1327);
        } else if (i == 2) {
            View view4 = this.f1322;
            if (view4 != null) {
                view4.setBackgroundColor(this.f1329);
            }
            setBackgroundResource(this.f1319);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\b\u0003\u0018\u00002\u00020\u0003B\t\b\u0002¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lo/U$ɩ;", "<init>", "()V", ""}, k = 1, mv = {1, 1, 15})
    /* renamed from: o.U$ɩ  reason: contains not printable characters */
    public static final class C0103 {
        private C0103() {
        }

        public /* synthetic */ C0103(fL fLVar) {
            this();
        }
    }
}
