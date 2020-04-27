package o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import o.X;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\u0018\u0000 \u00012\u00020,:\u0001\u0001B\u000f\u0012\u0006\u0010\u0016\u001a\u00020&¢\u0006\u0004\b'\u0010(B\u0019\u0012\u0006\u0010\u0016\u001a\u00020&\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b'\u0010)B!\u0012\u0006\u0010\u0016\u001a\u00020&\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\u0006\u0010*\u001a\u00020\n¢\u0006\u0004\b'\u0010+J!\u0010\u0001\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u0001\u0010\u001aJ\u0019\u0010\u0001\u001a\u00020\u00192\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u0001\u0010\u001bJ\u0017\u0010\u0001\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0001\u0010\u001cJ\u0015\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020 ¢\u0006\u0004\b\u001e\u0010!J\u0017\u0010#\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\"H\u0017¢\u0006\u0004\b#\u0010$J\u0019\u0010\u000b\u001a\u00020\u00192\b\u0010\u0016\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u000b\u0010%J!\u0010\b\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\b\u0010\u001aR\u0016\u0010\u0005\u001a\u00020\u00028C@\u0002X\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u001e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\u0001\u001a\u00020\n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u000eR$\u0010\u0014\u001a\u0004\u0018\u00010\u000f8\u0007@\u0007X\u000e¢\u0006\u0012\n\u0004\b\u0001\u0010\u0010\u001a\u0004\b\u000b\u0010\u0011\"\u0004\b\u0012\u0010\u0013"}, d2 = {"Lo/Z;", "ɩ", "Landroid/text/InputFilter;", "ι", "()Landroid/text/InputFilter;", "ǃ", "", "Lo/U;", "ı", "Ljava/util/List;", "", "Ι", "I", "Lo/W;", "Lo/W;", "Lo/Y;", "Lo/Y;", "()Lo/Y;", "setOtpListener", "(Lo/Y;)V", "otpListener", "Landroid/content/res/TypedArray;", "p0", "Landroid/util/AttributeSet;", "p1", "", "(Landroid/content/res/TypedArray;Landroid/util/AttributeSet;)V", "(Landroid/util/AttributeSet;)V", "(I)V", "", "setOTP", "(Ljava/lang/CharSequence;)V", "", "(Ljava/lang/String;)V", "Landroid/view/View$OnTouchListener;", "setOnTouchListener", "(Landroid/view/View$OnTouchListener;)V", "(Lo/W;)V", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "p2", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/widget/FrameLayout;"}, k = 1, mv = {1, 1, 15})
public final class Z extends FrameLayout {

    /* renamed from: ɩ  reason: contains not printable characters */
    public static final C0106 f1372 = new C0106((fL) null);

    /* renamed from: ı  reason: contains not printable characters */
    private List<U> f1373;

    /* renamed from: ǃ  reason: contains not printable characters */
    private W f1374;

    /* renamed from: ɩ  reason: contains not printable characters and collision with other field name */
    private Y f1375;
    /* access modifiers changed from: private */

    /* renamed from: Ι  reason: contains not printable characters */
    public int f1376;

    @JvmName(name = "setOtpListener")
    public final void setOtpListener(Y y) {
        this.f1375 = y;
    }

    @JvmName(name = "Ι")
    /* renamed from: Ι  reason: contains not printable characters */
    public final Y m1440() {
        return this.f1375;
    }

    @JvmName(name = "ι")
    /* renamed from: ι  reason: contains not printable characters */
    private final InputFilter m1439() {
        return AnonymousClass3.f1377;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Z(Context context) {
        super(context);
        fM.m2254(context, "");
        m1436((AttributeSet) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Z(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        fM.m2254(context, "");
        m1436(attributeSet);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Z(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        fM.m2254(context, "");
        m1436(attributeSet);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private final void m1436(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, X.Cif.f1333);
        fM.m2252((Object) obtainStyledAttributes, "");
        m1432(obtainStyledAttributes, attributeSet);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: ı  reason: contains not printable characters */
    private final void m1432(TypedArray typedArray, AttributeSet attributeSet) {
        this.f1376 = typedArray.getInt(X.Cif.f1343, 4);
        m1435(typedArray, attributeSet);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private final void m1435(TypedArray typedArray, AttributeSet attributeSet) {
        this.f1373 = new ArrayList();
        if (this.f1376 > 0) {
            String string = typedArray.getString(X.Cif.f1338);
            int i = X.Cif.f1358;
            V v = V.f1331;
            Context context = getContext();
            fM.m2252((Object) context, "");
            int i2 = X.Cif.f1353;
            V v2 = V.f1331;
            Context context2 = getContext();
            fM.m2252((Object) context2, "");
            int i3 = X.Cif.f1346;
            V v3 = V.f1331;
            Context context3 = getContext();
            fM.m2252((Object) context3, "");
            int dimension = (int) typedArray.getDimension(i3, (float) v3.m1424(context3, -1));
            int i4 = X.Cif.f1355;
            V v4 = V.f1331;
            Context context4 = getContext();
            fM.m2252((Object) context4, "");
            int dimension2 = (int) typedArray.getDimension(i4, (float) v4.m1424(context4, 4));
            int i5 = X.Cif.f1335;
            V v5 = V.f1331;
            Context context5 = getContext();
            fM.m2252((Object) context5, "");
            int dimension3 = (int) typedArray.getDimension(i5, (float) v5.m1424(context5, 4));
            int i6 = X.Cif.f1360;
            V v6 = V.f1331;
            Context context6 = getContext();
            fM.m2252((Object) context6, "");
            int dimension4 = (int) typedArray.getDimension(i6, (float) v6.m1424(context6, 4));
            int i7 = X.Cif.f1342;
            V v7 = V.f1331;
            Context context7 = getContext();
            fM.m2252((Object) context7, "");
            int dimension5 = (int) typedArray.getDimension(i7, (float) v7.m1424(context7, 4));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) typedArray.getDimension(i, (float) v.m1424(context, 48)), (int) typedArray.getDimension(i2, (float) v2.m1424(context2, 48)));
            if (dimension > 0) {
                layoutParams.setMargins(dimension, dimension, dimension, dimension);
            } else {
                layoutParams.setMargins(dimension2, dimension4, dimension3, dimension5);
            }
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams2.gravity = 17;
            Context context8 = getContext();
            fM.m2252((Object) context8, "");
            this.f1374 = new W(context8);
            W w = this.f1374;
            if (w != null) {
                w.setFilters(new InputFilter[]{m1439(), new InputFilter.LengthFilter(this.f1376)});
            }
            m1437(this.f1374);
            addView(this.f1374, layoutParams2);
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
            LinearLayout linearLayout = new LinearLayout(getContext());
            addView(linearLayout, layoutParams3);
            int i8 = this.f1376;
            for (int i9 = 0; i9 < i8; i9++) {
                Context context9 = getContext();
                fM.m2252((Object) context9, "");
                U u = new U(context9, attributeSet);
                u.setViewState(0);
                linearLayout.addView(u, i9, layoutParams);
                List<U> list = this.f1373;
                if (list != null) {
                    list.add(u);
                }
            }
            if (string != null) {
                setOTP(string);
            } else {
                setOTP("");
            }
        } else {
            throw new IllegalStateException("Please specify the length of the otp view");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\b\n\u0018\u00002\u00020\u000eJ\u0017\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\r\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\f"}, d2 = {"Lo/Z$if;", "Landroid/text/Editable;", "p0", "", "afterTextChanged", "(Landroid/text/Editable;)V", "", "", "p1", "p2", "p3", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "onTextChanged", "Landroid/text/TextWatcher;"}, k = 1, mv = {1, 1, 15})
    /* renamed from: o.Z$if  reason: invalid class name */
    public static final class Cif implements TextWatcher {

        /* renamed from: ɩ  reason: contains not printable characters */
        final /* synthetic */ Z f1378;

        public final void afterTextChanged(Editable editable) {
            fM.m2254(editable, "");
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            fM.m2254(charSequence, "");
        }

        Cif(Z z) {
            this.f1378 = z;
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            fM.m2254(charSequence, "");
            this.f1378.setOTP(charSequence);
            this.f1378.m1434(charSequence.length());
            Y r2 = this.f1378.m1440();
            if (r2 != null) {
                r2.m1431();
                if (charSequence.length() == this.f1378.f1376) {
                    r2.m1430(charSequence.toString());
                }
            }
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private final void m1437(W w) {
        if (w != null) {
            w.addTextChangedListener(new Cif(this));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m1434(int i) {
        List<U> list = this.f1373;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (i2 == i) {
                    list.get(i2).setViewState(1);
                } else {
                    list.get(i2).setViewState(0);
                }
            }
            if (i == list.size()) {
                list.get(list.size() - 1).setViewState(1);
            }
        }
    }

    public final void setOTP(CharSequence charSequence) {
        fM.m2254(charSequence, "");
        List<U> list = this.f1373;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (i < charSequence.length()) {
                    list.get(i).setText(String.valueOf(charSequence.charAt(i)));
                } else {
                    list.get(i).setText("");
                }
            }
        }
    }

    public final void setOTP(String str) {
        fM.m2254(str, "");
        W w = this.f1374;
        if (w != null) {
            w.setText(str);
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        fM.m2254(onTouchListener, "");
        super.setOnTouchListener(onTouchListener);
        W w = this.f1374;
        if (w != null) {
            w.setOnTouchListener(onTouchListener);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\b\u0003\u0018\u00002\u00020\u0003B\t\b\u0002¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lo/Z$ɩ;", "<init>", "()V", ""}, k = 1, mv = {1, 1, 15})
    /* renamed from: o.Z$ɩ  reason: contains not printable characters */
    public static final class C0106 {
        private C0106() {
        }

        public /* synthetic */ C0106(fL fLVar) {
            this();
        }
    }
}
