package o;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;

/* renamed from: o.Ӏɪ  reason: contains not printable characters */
final class C2791 {

    /* renamed from: ǃ  reason: contains not printable characters */
    private static final ViewGroup.MarginLayoutParams f13188;

    /* renamed from: ı  reason: contains not printable characters */
    private LinearLayoutManager f13189;

    static {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        f13188 = marginLayoutParams;
        marginLayoutParams.setMargins(0, 0, 0, 0);
    }

    C2791(LinearLayoutManager linearLayoutManager) {
        this.f13189 = linearLayoutManager;
    }

    /* renamed from: ι  reason: contains not printable characters */
    private boolean m14705() {
        int r0 = this.f13189.m421();
        for (int i = 0; i < r0; i++) {
            if (m14704(this.f13189.m432(i))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ı  reason: contains not printable characters */
    private static boolean m14704(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
            if (layoutTransition != null && layoutTransition.isChangingLayout()) {
                return true;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (m14704(viewGroup.getChildAt(i))) {
                    return true;
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009a, code lost:
        if (r4[r0 - 1][1] >= r3) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x009c, code lost:
        r0 = false;
     */
    /* renamed from: ǃ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean m14706() {
        /*
            r11 = this;
            androidx.recyclerview.widget.LinearLayoutManager r0 = r11.f13189
            int r0 = r0.m421()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x009e
            androidx.recyclerview.widget.LinearLayoutManager r3 = r11.f13189
            int r3 = r3.f290
            if (r3 != 0) goto L_0x0012
            r3 = 1
            goto L_0x0013
        L_0x0012:
            r3 = 0
        L_0x0013:
            r4 = 2
            int[] r4 = new int[]{r0, r4}
            java.lang.Class<int> r5 = int.class
            java.lang.Object r4 = java.lang.reflect.Array.newInstance(r5, r4)
            int[][] r4 = (int[][]) r4
            r5 = 0
        L_0x0021:
            if (r5 >= r0) goto L_0x006b
            androidx.recyclerview.widget.LinearLayoutManager r6 = r11.f13189
            android.view.View r6 = r6.m432((int) r5)
            if (r6 == 0) goto L_0x0063
            android.view.ViewGroup$LayoutParams r7 = r6.getLayoutParams()
            boolean r8 = r7 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r8 == 0) goto L_0x0036
            android.view.ViewGroup$MarginLayoutParams r7 = (android.view.ViewGroup.MarginLayoutParams) r7
            goto L_0x0038
        L_0x0036:
            android.view.ViewGroup$MarginLayoutParams r7 = f13188
        L_0x0038:
            r8 = r4[r5]
            if (r3 == 0) goto L_0x0043
            int r9 = r6.getLeft()
            int r10 = r7.leftMargin
            goto L_0x0049
        L_0x0043:
            int r9 = r6.getTop()
            int r10 = r7.topMargin
        L_0x0049:
            int r9 = r9 - r10
            r8[r1] = r9
            r8 = r4[r5]
            if (r3 == 0) goto L_0x0057
            int r6 = r6.getRight()
            int r7 = r7.rightMargin
            goto L_0x005d
        L_0x0057:
            int r6 = r6.getBottom()
            int r7 = r7.bottomMargin
        L_0x005d:
            int r6 = r6 + r7
            r8[r2] = r6
            int r5 = r5 + 1
            goto L_0x0021
        L_0x0063:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "null view contained in the view hierarchy"
            r0.<init>(r1)
            throw r0
        L_0x006b:
            o.Ӏɪ$2 r3 = new o.Ӏɪ$2
            r3.<init>()
            java.util.Arrays.sort(r4, r3)
            r3 = 1
        L_0x0074:
            if (r3 >= r0) goto L_0x0086
            int r5 = r3 + -1
            r5 = r4[r5]
            r5 = r5[r2]
            r6 = r4[r3]
            r6 = r6[r1]
            if (r5 == r6) goto L_0x0083
            goto L_0x009c
        L_0x0083:
            int r3 = r3 + 1
            goto L_0x0074
        L_0x0086:
            r3 = r4[r1]
            r3 = r3[r2]
            r5 = r4[r1]
            r5 = r5[r1]
            int r3 = r3 - r5
            r5 = r4[r1]
            r5 = r5[r1]
            if (r5 > 0) goto L_0x009c
            int r0 = r0 - r2
            r0 = r4[r0]
            r0 = r0[r2]
            if (r0 >= r3) goto L_0x009e
        L_0x009c:
            r0 = 0
            goto L_0x009f
        L_0x009e:
            r0 = 1
        L_0x009f:
            if (r0 == 0) goto L_0x00a9
            androidx.recyclerview.widget.LinearLayoutManager r0 = r11.f13189
            int r0 = r0.m421()
            if (r0 > r2) goto L_0x00b0
        L_0x00a9:
            boolean r0 = r11.m14705()
            if (r0 == 0) goto L_0x00b0
            return r2
        L_0x00b0:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C2791.m14706():boolean");
    }
}
