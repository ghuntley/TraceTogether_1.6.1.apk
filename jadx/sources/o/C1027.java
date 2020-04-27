package o;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: o.Ʌ  reason: contains not printable characters */
public abstract class C1027 extends C0941 {

    /* renamed from: Ɩ  reason: contains not printable characters */
    private LayoutInflater f6247;

    /* renamed from: ɩ  reason: contains not printable characters */
    private int f6248;

    /* renamed from: ι  reason: contains not printable characters */
    private int f6249;

    @Deprecated
    public C1027(Context context, int i) {
        super(context);
        this.f6248 = i;
        this.f6249 = i;
        this.f6247 = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    /* renamed from: ι  reason: contains not printable characters */
    public View m7268(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f6247.inflate(this.f6249, viewGroup, false);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final View m7267(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f6247.inflate(this.f6248, viewGroup, false);
    }
}
