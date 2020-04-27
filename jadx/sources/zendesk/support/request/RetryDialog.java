package zendesk.support.request;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.List;
import o.C1411;
import o.R;

class RetryDialog extends C1411 {
    private BottomSheetBehavior<FrameLayout> bottomSheetBehavior;
    /* access modifiers changed from: private */
    public Listener listener;
    /* access modifiers changed from: private */
    public final List<StateMessage> message;

    interface Listener {
        void onDeleteMessage(List<StateMessage> list);

        void onRetryMessage(List<StateMessage> list);
    }

    RetryDialog(Context context, List<StateMessage> list) {
        super(context);
        this.message = list;
        init();
    }

    public void onStart() {
        super.onStart();
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior2 = this.bottomSheetBehavior;
        if (bottomSheetBehavior2 != null) {
            bottomSheetBehavior2.m909(3);
        }
    }

    private void init() {
        setContentView(R.layout.f169792131558558);
        setCancelable(true);
        setCanceledOnTouchOutside(true);
        this.bottomSheetBehavior = initBottomSheet();
        initListener();
    }

    private void initListener() {
        View findViewById = findViewById(R.id.f166682131362249);
        View findViewById2 = findViewById(R.id.f166692131362250);
        if (findViewById2 != null && findViewById != null) {
            findViewById.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    if (RetryDialog.this.listener != null) {
                        RetryDialog.this.listener.onDeleteMessage(RetryDialog.this.message);
                    }
                    RetryDialog.this.dismiss();
                }
            });
            findViewById2.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    if (RetryDialog.this.listener != null) {
                        RetryDialog.this.listener.onRetryMessage(RetryDialog.this.message);
                    }
                    RetryDialog.this.dismiss();
                }
            });
        }
    }

    private BottomSheetBehavior<FrameLayout> initBottomSheet() {
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.f165052131362011);
        if (frameLayout == null) {
            return null;
        }
        try {
            return BottomSheetBehavior.m904(frameLayout);
        } catch (Exception unused) {
            return null;
        }
    }

    public void setListener(Listener listener2) {
        this.listener = listener2;
    }
}
