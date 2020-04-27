package o;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import o.C0967;

/* renamed from: o.ȝ  reason: contains not printable characters */
public abstract class C0941 extends BaseAdapter implements Filterable, C0967.C0968 {

    /* renamed from: ı  reason: contains not printable characters */
    protected boolean f5921 = false;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private DataSetObserver f5922;

    /* renamed from: ǃ  reason: contains not printable characters */
    public Context f5923;

    /* renamed from: ɩ  reason: contains not printable characters */
    private boolean f5924 = true;

    /* renamed from: Ι  reason: contains not printable characters */
    public Cursor f5925 = null;

    /* renamed from: ι  reason: contains not printable characters */
    private int f5926;

    /* renamed from: І  reason: contains not printable characters */
    private C0942 f5927;

    /* renamed from: і  reason: contains not printable characters */
    private C0967 f5928;

    public boolean hasStableIds() {
        return true;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public abstract void m6830(View view, Cursor cursor);

    /* renamed from: ι  reason: contains not printable characters */
    public abstract View m6832(Context context, Cursor cursor, ViewGroup viewGroup);

    public C0941(Context context) {
        this.f5923 = context;
        this.f5926 = -1;
        this.f5927 = new C0942();
        this.f5922 = new C0943();
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final Cursor m6831() {
        return this.f5925;
    }

    public int getCount() {
        Cursor cursor;
        if (!this.f5921 || (cursor = this.f5925) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    public Object getItem(int i) {
        Cursor cursor;
        if (!this.f5921 || (cursor = this.f5925) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.f5925;
    }

    public long getItemId(int i) {
        Cursor cursor;
        if (!this.f5921 || (cursor = this.f5925) == null || !cursor.moveToPosition(i)) {
            return 0;
        }
        return this.f5925.getLong(this.f5926);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.f5921) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        } else if (this.f5925.moveToPosition(i)) {
            if (view == null) {
                view = m6832(this.f5923, this.f5925, viewGroup);
            }
            m6830(view, this.f5925);
            return view;
        } else {
            throw new IllegalStateException("couldn't move cursor to position ".concat(String.valueOf(i)));
        }
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.f5921) {
            return null;
        }
        this.f5925.moveToPosition(i);
        if (view == null) {
            view = m6829(this.f5923, this.f5925, viewGroup);
        }
        m6830(view, this.f5925);
        return view;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public View m6829(Context context, Cursor cursor, ViewGroup viewGroup) {
        return m6832(context, cursor, viewGroup);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public CharSequence m6828(Cursor cursor) {
        return cursor == null ? "" : cursor.toString();
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public Cursor m6827(CharSequence charSequence) {
        return this.f5925;
    }

    public Filter getFilter() {
        if (this.f5928 == null) {
            this.f5928 = new C0967(this);
        }
        return this.f5928;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m6825() {
        Cursor cursor;
        if (this.f5924 && (cursor = this.f5925) != null && !cursor.isClosed()) {
            this.f5921 = this.f5925.requery();
        }
    }

    /* renamed from: o.ȝ$ı  reason: contains not printable characters */
    class C0942 extends ContentObserver {
        public final boolean deliverSelfNotifications() {
            return true;
        }

        C0942() {
            super(new Handler());
        }

        public final void onChange(boolean z) {
            C0941.this.m6825();
        }
    }

    /* renamed from: o.ȝ$ǃ  reason: contains not printable characters */
    class C0943 extends DataSetObserver {
        C0943() {
        }

        public final void onChanged() {
            C0941 r0 = C0941.this;
            r0.f5921 = true;
            r0.notifyDataSetChanged();
        }

        public final void onInvalidated() {
            C0941 r0 = C0941.this;
            r0.f5921 = false;
            r0.notifyDataSetInvalidated();
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public void m6826(Cursor cursor) {
        Cursor cursor2 = this.f5925;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                C0942 r1 = this.f5927;
                if (r1 != null) {
                    cursor2.unregisterContentObserver(r1);
                }
                DataSetObserver dataSetObserver = this.f5922;
                if (dataSetObserver != null) {
                    cursor2.unregisterDataSetObserver(dataSetObserver);
                }
            }
            this.f5925 = cursor;
            if (cursor != null) {
                C0942 r12 = this.f5927;
                if (r12 != null) {
                    cursor.registerContentObserver(r12);
                }
                DataSetObserver dataSetObserver2 = this.f5922;
                if (dataSetObserver2 != null) {
                    cursor.registerDataSetObserver(dataSetObserver2);
                }
                this.f5926 = cursor.getColumnIndexOrThrow("_id");
                this.f5921 = true;
                notifyDataSetChanged();
            } else {
                this.f5926 = -1;
                this.f5921 = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }
}
