package o;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Adapter;
import android.widget.GridView;
import android.widget.ListAdapter;
import com.google.android.material.datepicker.MaterialDatePicker;
import java.util.Calendar;
import java.util.TimeZone;

/* renamed from: o.ιҹ  reason: contains not printable characters */
final class C2073 extends GridView {

    /* renamed from: ǃ  reason: contains not printable characters */
    private final Calendar f10150;

    public final /* bridge */ /* synthetic */ void setAdapter(Adapter adapter) {
        setAdapter((ListAdapter) adapter);
    }

    public C2073(Context context) {
        this(context, (AttributeSet) null);
    }

    public C2073(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C2073(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Calendar instance = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        instance.clear();
        this.f10150 = instance;
        if (MaterialDatePicker.m944(getContext())) {
            setNextFocusLeftId(R.id.f164842131361974);
            setNextFocusRightId(R.id.f164902131361994);
        }
        C0293.m4151((View) this, (C2449) new C2449() {
            /* renamed from: ǃ  reason: contains not printable characters */
            public final void m11002(View view, C0520 r2) {
                super.m12579(view, r2);
                r2.m5035((Object) null);
            }
        });
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((C2135) super.getAdapter()).notifyDataSetChanged();
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() != -1) {
            int selectedItemPosition = getSelectedItemPosition();
            C2326 r1 = ((C2135) super.getAdapter()).f10284;
            int firstDayOfWeek = r1.f10765.get(7) - r1.f10765.getFirstDayOfWeek();
            if (firstDayOfWeek < 0) {
                firstDayOfWeek += r1.f10762;
            }
            if (selectedItemPosition < firstDayOfWeek) {
                if (19 != i) {
                    return false;
                }
                C2326 r7 = ((C2135) super.getAdapter()).f10284;
                int firstDayOfWeek2 = r7.f10765.get(7) - r7.f10765.getFirstDayOfWeek();
                if (firstDayOfWeek2 < 0) {
                    firstDayOfWeek2 += r7.f10762;
                }
                setSelection(firstDayOfWeek2);
                return true;
            }
        }
        return true;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final C2135 m11001() {
        return (C2135) super.getAdapter();
    }

    public final void setAdapter(ListAdapter listAdapter) {
        if (listAdapter instanceof C2135) {
            super.setAdapter(listAdapter);
        } else {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", new Object[]{C2073.class.getCanonicalName(), C2135.class.getCanonicalName()}));
        }
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        int i4;
        C2073 r0 = this;
        super.onDraw(canvas);
        C2135 r1 = (C2135) super.getAdapter();
        C2117<?> r2 = r1.f10282;
        C1936 r3 = r1.f10283;
        C2326 r4 = r1.f10284;
        int i5 = 7;
        int firstDayOfWeek = r4.f10765.get(7) - r4.f10765.getFirstDayOfWeek();
        if (firstDayOfWeek < 0) {
            firstDayOfWeek += r4.f10762;
        }
        Long r42 = r1.getItem(firstDayOfWeek);
        C2326 r5 = r1.f10284;
        int firstDayOfWeek2 = r5.f10765.get(7) - r5.f10765.getFirstDayOfWeek();
        if (firstDayOfWeek2 < 0) {
            firstDayOfWeek2 += r5.f10762;
        }
        int i6 = 1;
        Long r7 = r1.getItem((firstDayOfWeek2 + r1.f10284.f10763) - 1);
        for (C2311 next : r2.m11276()) {
            if (next.f10733 == null || next.f10734 == null) {
                r0 = this;
            } else {
                long longValue = ((Long) next.f10733).longValue();
                long longValue2 = ((Long) next.f10734).longValue();
                Long valueOf = Long.valueOf(longValue);
                Long valueOf2 = Long.valueOf(longValue2);
                if (!(r42 == null || r7 == null || valueOf == null || valueOf2 == null || valueOf.longValue() > r7.longValue() || valueOf2.longValue() < r42.longValue())) {
                    if (longValue < r42.longValue()) {
                        C2326 r9 = r1.f10284;
                        i = r9.f10765.get(i5) - r9.f10765.getFirstDayOfWeek();
                        if (i < 0) {
                            i += r9.f10762;
                        }
                        i2 = i % r1.f10284.f10762 == 0 ? 0 : r0.getChildAt(i - 1).getRight();
                    } else {
                        r0.f10150.setTimeInMillis(longValue);
                        int i7 = r0.f10150.get(5) - i6;
                        C2326 r10 = r1.f10284;
                        int firstDayOfWeek3 = r10.f10765.get(i5) - r10.f10765.getFirstDayOfWeek();
                        if (firstDayOfWeek3 < 0) {
                            firstDayOfWeek3 += r10.f10762;
                        }
                        i = firstDayOfWeek3 + i7;
                        View childAt = r0.getChildAt(i);
                        i2 = childAt.getLeft() + (childAt.getWidth() / 2);
                    }
                    if (longValue2 > r7.longValue()) {
                        C2326 r8 = r1.f10284;
                        int firstDayOfWeek4 = r8.f10765.get(i5) - r8.f10765.getFirstDayOfWeek();
                        if (firstDayOfWeek4 < 0) {
                            firstDayOfWeek4 += r8.f10762;
                        }
                        i3 = (firstDayOfWeek4 + r1.f10284.f10763) - i6;
                        if ((i3 + 1) % r1.f10284.f10762 == 0) {
                            i4 = getWidth();
                        } else {
                            i4 = r0.getChildAt(i3).getRight();
                        }
                    } else {
                        r0.f10150.setTimeInMillis(longValue2);
                        int i8 = r0.f10150.get(5) - i6;
                        C2326 r11 = r1.f10284;
                        int firstDayOfWeek5 = r11.f10765.get(i5) - r11.f10765.getFirstDayOfWeek();
                        if (firstDayOfWeek5 < 0) {
                            firstDayOfWeek5 += r11.f10762;
                        }
                        i3 = firstDayOfWeek5 + i8;
                        View childAt2 = r0.getChildAt(i3);
                        i4 = (childAt2.getWidth() / 2) + childAt2.getLeft();
                    }
                    int itemId = (int) r1.getItemId(i);
                    Long l = r7;
                    int itemId2 = (int) r1.getItemId(i3);
                    while (itemId <= itemId2) {
                        int numColumns = getNumColumns() * itemId;
                        int numColumns2 = (numColumns + getNumColumns()) - 1;
                        View childAt3 = r0.getChildAt(numColumns);
                        canvas.drawRect((float) (numColumns > i ? 0 : i2), (float) (childAt3.getTop() + r3.f9770.f9924.top), (float) (i3 > numColumns2 ? getWidth() : i4), (float) (childAt3.getBottom() - r3.f9770.f9924.bottom), r3.f9776);
                        itemId++;
                        i6 = 1;
                        r0 = this;
                    }
                    i5 = 7;
                    r0 = this;
                    r7 = l;
                } else {
                    return;
                }
            }
        }
    }

    public final void setSelection(int i) {
        C2326 r0 = ((C2135) super.getAdapter()).f10284;
        int firstDayOfWeek = r0.f10765.get(7) - r0.f10765.getFirstDayOfWeek();
        if (firstDayOfWeek < 0) {
            firstDayOfWeek += r0.f10762;
        }
        if (i < firstDayOfWeek) {
            C2326 r5 = ((C2135) super.getAdapter()).f10284;
            int firstDayOfWeek2 = r5.f10765.get(7) - r5.f10765.getFirstDayOfWeek();
            if (firstDayOfWeek2 < 0) {
                firstDayOfWeek2 += r5.f10762;
            }
            super.setSelection(firstDayOfWeek2);
            return;
        }
        super.setSelection(i);
    }

    /* access modifiers changed from: protected */
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        if (!z) {
            super.onFocusChanged(false, i, rect);
        } else if (i == 33) {
            C2135 r3 = (C2135) super.getAdapter();
            C2326 r4 = r3.f10284;
            int firstDayOfWeek = r4.f10765.get(7) - r4.f10765.getFirstDayOfWeek();
            if (firstDayOfWeek < 0) {
                firstDayOfWeek += r4.f10762;
            }
            setSelection((firstDayOfWeek + r3.f10284.f10763) - 1);
        } else if (i == 130) {
            C2326 r32 = ((C2135) super.getAdapter()).f10284;
            int firstDayOfWeek2 = r32.f10765.get(7) - r32.f10765.getFirstDayOfWeek();
            if (firstDayOfWeek2 < 0) {
                firstDayOfWeek2 += r32.f10762;
            }
            setSelection(firstDayOfWeek2);
        } else {
            super.onFocusChanged(true, i, rect);
        }
    }
}
