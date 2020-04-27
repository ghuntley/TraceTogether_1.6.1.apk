package o;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import java.util.Arrays;
import java.util.List;

public final class mR extends FrameLayout {

    /* renamed from: ı  reason: contains not printable characters */
    private static final List<Integer> f3151 = Arrays.asList(new Integer[]{Integer.valueOf(R.id.f168392131362476), Integer.valueOf(R.id.f168412131362482), Integer.valueOf(R.id.f168422131362483), Integer.valueOf(R.id.f168402131362477), Integer.valueOf(R.id.f168382131362475)});

    public mR(Context context) {
        super(context);
        inflate(context, R.layout.f170022131558584, this);
        O.m1392(f3151, new C3623w<Integer, mS>() {
            public final /* synthetic */ Object apply(Object obj) {
                return (mS) mR.this.findViewById(((Integer) obj).intValue());
            }
        });
    }

    public mR(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        inflate(context, R.layout.f170022131558584, this);
        O.m1392(f3151, new C3623w<Integer, mS>() {
            public final /* synthetic */ Object apply(Object obj) {
                return (mS) mR.this.findViewById(((Integer) obj).intValue());
            }
        });
    }

    public mR(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        inflate(context, R.layout.f170022131558584, this);
        O.m1392(f3151, new C3623w<Integer, mS>() {
            public final /* synthetic */ Object apply(Object obj) {
                return (mS) mR.this.findViewById(((Integer) obj).intValue());
            }
        });
    }
}
