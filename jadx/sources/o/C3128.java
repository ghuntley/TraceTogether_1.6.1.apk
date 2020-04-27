package o;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;
import o.C2639;

/* renamed from: o.լյ  reason: contains not printable characters */
final class C3128 {

    /* renamed from: ı  reason: contains not printable characters */
    static Dialog f14270;

    /* renamed from: ǃ  reason: contains not printable characters */
    static Context f14271;

    /* renamed from: ɩ  reason: contains not printable characters */
    private static final Field f14272;

    /* renamed from: Ι  reason: contains not printable characters */
    private static final Field f14273;

    /* renamed from: ι  reason: contains not printable characters */
    private static final Field f14274;

    C3128() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0048  */
    static {
        /*
            r0 = 1
            r1 = 0
            java.lang.Class<android.widget.TextView> r2 = android.widget.TextView.class
            java.lang.String r3 = "mCursorDrawableRes"
            java.lang.reflect.Field r2 = r2.getDeclaredField(r3)     // Catch:{ Exception -> 0x003c }
            r2.setAccessible(r0)     // Catch:{ Exception -> 0x003a }
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x003a }
            r4 = 16
            if (r3 >= r4) goto L_0x0017
            java.lang.Class<android.widget.TextView> r3 = android.widget.TextView.class
            r4 = r1
            goto L_0x0029
        L_0x0017:
            java.lang.Class<android.widget.TextView> r3 = android.widget.TextView.class
            java.lang.String r4 = "mEditor"
            java.lang.reflect.Field r3 = r3.getDeclaredField(r4)     // Catch:{ Exception -> 0x003a }
            r3.setAccessible(r0)     // Catch:{ Exception -> 0x0038 }
            java.lang.Class r4 = r3.getType()     // Catch:{ Exception -> 0x0038 }
            r6 = r4
            r4 = r3
            r3 = r6
        L_0x0029:
            java.lang.String r5 = "mCursorDrawable"
            java.lang.reflect.Field r3 = r3.getDeclaredField(r5)     // Catch:{ Exception -> 0x0036 }
            r3.setAccessible(r0)     // Catch:{ Exception -> 0x0034 }
            r0 = 0
            goto L_0x003f
        L_0x0034:
            goto L_0x003f
        L_0x0036:
            r3 = r1
            goto L_0x003f
        L_0x0038:
            r4 = r3
            goto L_0x0036
        L_0x003a:
            r3 = r1
            goto L_0x003e
        L_0x003c:
            r2 = r1
            r3 = r2
        L_0x003e:
            r4 = r3
        L_0x003f:
            if (r0 == 0) goto L_0x0048
            f14274 = r1
            f14273 = r1
            f14272 = r1
            return
        L_0x0048:
            f14274 = r4
            f14273 = r3
            f14272 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C3128.<clinit>():void");
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static void m15861(C2639 r16, String str) {
        boolean z;
        Drawable drawable;
        Object obj;
        C2639 r9 = r16;
        String str2 = str;
        f14271 = r16.getContext();
        f14270 = new Dialog(f14271);
        r16.m13999();
        r16.m13993();
        List<C2987> r11 = C2987.m15321(f14271, r9);
        f14270.requestWindowFeature(1);
        f14270.getWindow().setContentView(R.layout.f169332131558477);
        if (!r9.f12053 || !r9.f12008) {
            f14270.getWindow().setSoftInputMode(2);
        } else {
            f14270.getWindow().setSoftInputMode(4);
        }
        RecyclerView recyclerView = (RecyclerView) f14270.findViewById(R.id.f166392131362220);
        TextView textView = (TextView) f14270.findViewById(R.id.f167712131362385);
        RelativeLayout relativeLayout = (RelativeLayout) f14270.findViewById(R.id.f167162131362301);
        ImageView imageView = (ImageView) f14270.findViewById(R.id.f165492131362094);
        EditText editText = (EditText) f14270.findViewById(R.id.f165132131362027);
        TextView textView2 = (TextView) f14270.findViewById(R.id.f167692131362383);
        RelativeLayout relativeLayout2 = (RelativeLayout) f14270.findViewById(R.id.f167152131362300);
        ImageView imageView2 = (ImageView) f14270.findViewById(R.id.f165502131362095);
        try {
            if (r9.f12003 != null) {
                if (r9.f12029 != -99) {
                    textView2.setTypeface(r9.f12003, r9.f12029);
                    editText.setTypeface(r9.f12003, r9.f12029);
                    textView.setTypeface(r9.f12003, r9.f12029);
                } else {
                    textView2.setTypeface(r9.f12003);
                    editText.setTypeface(r9.f12003);
                    textView.setTypeface(r9.f12003);
                }
            }
        } catch (Exception unused) {
        }
        if (r9.f12025 != 0) {
            relativeLayout2.setBackgroundColor(r9.f12025);
        }
        int i = 0;
        if (r9.f12057) {
            imageView2.setVisibility(0);
            imageView2.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    C3128.f14270.dismiss();
                }
            });
        } else {
            imageView2.setVisibility(8);
        }
        if (!r9.f12046) {
            textView.setVisibility(8);
        }
        if (r9.f12027 != 0) {
            int i2 = r9.f12027;
            imageView.setColorFilter(i2);
            imageView2.setColorFilter(i2);
            textView.setTextColor(i2);
            textView2.setTextColor(i2);
            editText.setTextColor(i2);
            editText.setHintTextColor(Color.argb(100, Color.red(i2), Color.green(i2), Color.blue(i2)));
        }
        if (r9.f12018 != 0 && Build.VERSION.SDK_INT >= 21) {
            editText.setBackgroundTintList(ColorStateList.valueOf(r9.f12018));
            int i3 = r9.f12018;
            if (f14273 != null) {
                try {
                    Context context = editText.getContext();
                    int i4 = f14272.getInt(editText);
                    if (Build.VERSION.SDK_INT < 21) {
                        drawable = context.getResources().getDrawable(i4);
                    } else {
                        drawable = context.getDrawable(i4);
                    }
                    drawable.setColorFilter(i3, PorterDuff.Mode.SRC_IN);
                    Field field = f14273;
                    if (Build.VERSION.SDK_INT < 16) {
                        obj = editText;
                    } else {
                        obj = f14274.get(editText);
                    }
                    field.set(obj, new Drawable[]{drawable, drawable});
                } catch (Exception unused2) {
                }
            }
        }
        String r1 = C2987.m15316(r9.f12010, r16.m13995());
        if (r9.f12017 != null) {
            C2639.C2642 r12 = r9.f12017;
            r16.m13995();
            r1 = r12.m14001();
        }
        textView.setText(r1);
        String r0 = C2987.m15327(r9.f12010, r16.m13995());
        if (r9.f12017 != null) {
            C2639.C2642 r02 = r9.f12017;
            r16.m13995();
            r0 = r02.m14003();
        }
        editText.setHint(r0);
        String r03 = C2987.m15320(r9.f12010, r16.m13995());
        if (r9.f12017 != null) {
            C2639.C2642 r04 = r9.f12017;
            r16.m13995();
            r03 = r04.m14002();
        }
        textView2.setText(r03);
        if (!r9.f12053) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) recyclerView.getLayoutParams();
            layoutParams.height = -2;
            recyclerView.setLayoutParams(layoutParams);
        }
        C1026 r05 = new C1026(f14271, r11, r16, relativeLayout, editText, textView2, f14270, imageView);
        recyclerView.setLayoutManager(new LinearLayoutManager(f14271));
        recyclerView.setAdapter(r05);
        C1510 r06 = (C1510) f14270.findViewById(R.id.f165212131362047);
        r06.setRecyclerView(recyclerView);
        if (r9.f12024) {
            if (r9.f12049 != 0) {
                r06.setBubbleColor(r9.f12049);
            }
            if (r9.f12019 != 0) {
                r06.setHandleColor(r9.f12019);
            }
            if (r9.f12009 != 0) {
                try {
                    r06.setBubbleTextAppearance(r9.f12009);
                } catch (Exception unused3) {
                }
            }
        } else {
            r06.setVisibility(8);
        }
        f14270.setOnDismissListener(new DialogInterface.OnDismissListener() {
            public final void onDismiss(DialogInterface dialogInterface) {
                C3128.m15860(C3128.f14271);
            }
        });
        f14270.setOnCancelListener(new DialogInterface.OnCancelListener() {
            public final void onCancel(DialogInterface dialogInterface) {
                C3128.m15860(C3128.f14271);
            }
        });
        if (str2 != null) {
            if (r9.f12037 != null) {
                Iterator<C2987> it = r9.f12037.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it.next().f13769.equalsIgnoreCase(str2)) {
                            z = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            z = false;
            if (!z) {
                int size = (r9.f12037 == null || r9.f12037.size() <= 0) ? 0 : r9.f12037.size() + 1;
                while (true) {
                    if (i >= r11.size()) {
                        break;
                    } else if (r11.get(i).f13769.equalsIgnoreCase(str2)) {
                        recyclerView.scrollToPosition(i + size);
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        f14270.show();
    }

    /* renamed from: ı  reason: contains not printable characters */
    static void m15859() {
        Dialog dialog = f14270;
        if (dialog != null) {
            dialog.dismiss();
        }
        f14270 = null;
        f14271 = null;
    }

    /* renamed from: ı  reason: contains not printable characters */
    static /* synthetic */ void m15860(Context context) {
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            InputMethodManager inputMethodManager = (InputMethodManager) activity.getSystemService("input_method");
            View currentFocus = activity.getCurrentFocus();
            if (currentFocus == null) {
                currentFocus = new View(activity);
            }
            inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
        }
    }
}
