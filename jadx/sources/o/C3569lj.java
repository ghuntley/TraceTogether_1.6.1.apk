package o;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\u0018\u00002\u00020\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0014¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo/lj;", "Landroid/os/Bundle;", "p0", "", "onCreate", "(Landroid/os/Bundle;)V", "<init>", "()V", "Lo/ɩɿ;"}, k = 1, mv = {1, 1, 16})
/* renamed from: o.lj  reason: case insensitive filesystem */
public final class C3569lj extends C1269 {
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f169362131558480);
        ((Button) findViewById(R.id.f164802131361968)).setOnClickListener(new View.OnClickListener(this) {

            /* renamed from: Ι  reason: contains not printable characters */
            final /* synthetic */ C3569lj f2884;

            {
                this.f2884 = r1;
            }

            public final void onClick(View view) {
                this.f2884.startActivity(new Intent(this.f2884, C3567lh.class));
            }
        });
    }
}
