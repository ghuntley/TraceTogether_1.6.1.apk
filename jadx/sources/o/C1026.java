package o;

import android.app.Dialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: o.Ƀ  reason: contains not printable characters */
final class C1026 extends RecyclerView.C0035<Cif> implements C1650 {

    /* renamed from: ı  reason: contains not printable characters */
    EditText f6224;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private LayoutInflater f6225;

    /* renamed from: ǃ  reason: contains not printable characters */
    C2639 f6226;

    /* renamed from: ȷ  reason: contains not printable characters */
    private int f6227 = 0;

    /* renamed from: ɩ  reason: contains not printable characters */
    Dialog f6228;

    /* renamed from: ɹ  reason: contains not printable characters */
    private TextView f6229;

    /* renamed from: Ι  reason: contains not printable characters */
    Context f6230;

    /* renamed from: ι  reason: contains not printable characters */
    List<C2987> f6231 = null;

    /* renamed from: І  reason: contains not printable characters */
    ImageView f6232;

    /* renamed from: і  reason: contains not printable characters */
    private RelativeLayout f6233;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private List<C2987> f6234 = null;

    public final /* synthetic */ void onBindViewHolder(RecyclerView.con con, final int i) {
        Cif ifVar = (Cif) con;
        C2987 r0 = this.f6231.get(i);
        if (r0 != null) {
            ifVar.f6241.setVisibility(8);
            ifVar.f6240.setVisibility(0);
            ifVar.f6245.setVisibility(0);
            if (C1026.this.f6226.f12056) {
                ifVar.f6245.setVisibility(0);
            } else {
                ifVar.f6245.setVisibility(8);
            }
            String str = "";
            if (C1026.this.f6226.f12006 && C1026.this.f6226.f12013) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(C2987.m15317(r0));
                sb.append("   ");
                str = sb.toString();
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(r0.f13772);
            String obj = sb2.toString();
            if (C1026.this.f6226.f12028) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(obj);
                sb3.append(" (");
                sb3.append(r0.f13769.toUpperCase());
                sb3.append(")");
                obj = sb3.toString();
            }
            ifVar.f6240.setText(obj);
            TextView textView = ifVar.f6245;
            StringBuilder sb4 = new StringBuilder("+");
            sb4.append(r0.f13771);
            textView.setText(sb4.toString());
            if (!C1026.this.f6226.f12006 || C1026.this.f6226.f12013) {
                ifVar.f6242.setVisibility(8);
            } else {
                ifVar.f6242.setVisibility(0);
                ImageView imageView = ifVar.f6244;
                if (r0.f13773 == -99) {
                    r0.f13773 = C2987.m15324(r0);
                }
                imageView.setImageResource(r0.f13773);
            }
        } else {
            ifVar.f6241.setVisibility(0);
            ifVar.f6240.setVisibility(8);
            ifVar.f6245.setVisibility(8);
            ifVar.f6242.setVisibility(8);
        }
        if (this.f6231.size() <= i || this.f6231.get(i) == null) {
            ifVar.f6243.setOnClickListener((View.OnClickListener) null);
        } else {
            ifVar.f6243.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    if (C1026.this.f6231 != null && C1026.this.f6231.size() > i) {
                        C2639 r0 = C1026.this.f6226;
                        C2987 r2 = C1026.this.f6231.get(i);
                        if (r0.f12041.f12022) {
                            C2639 r3 = r0.f12041;
                            String str = r2.f13769;
                            SharedPreferences.Editor edit = r3.f12010.getSharedPreferences(r3.f12021, 0).edit();
                            edit.putString(r3.f12004, str);
                            edit.apply();
                        }
                        r0.m13994(r2);
                    }
                    if (view != null && C1026.this.f6231 != null && C1026.this.f6231.size() > i && C1026.this.f6231.get(i) != null) {
                        ((InputMethodManager) C1026.this.f6230.getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
                        C1026.this.f6228.dismiss();
                    }
                }
            });
        }
    }

    C1026(Context context, List<C2987> list, C2639 r4, RelativeLayout relativeLayout, EditText editText, TextView textView, Dialog dialog, ImageView imageView) {
        this.f6230 = context;
        this.f6234 = list;
        this.f6226 = r4;
        this.f6228 = dialog;
        this.f6229 = textView;
        this.f6224 = editText;
        this.f6233 = relativeLayout;
        this.f6232 = imageView;
        this.f6225 = LayoutInflater.from(context);
        this.f6231 = m7264("");
        if (this.f6226.f12053) {
            this.f6232.setVisibility(8);
            EditText editText2 = this.f6224;
            if (editText2 != null) {
                editText2.addTextChangedListener(new TextWatcher() {
                    public final void afterTextChanged(Editable editable) {
                    }

                    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                    }

                    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                        C1026.m7265(C1026.this, charSequence.toString());
                        if (charSequence.toString().trim().equals("")) {
                            C1026.this.f6232.setVisibility(8);
                        } else {
                            C1026.this.f6232.setVisibility(0);
                        }
                    }
                });
                this.f6224.setOnEditorActionListener(new TextView.OnEditorActionListener() {
                    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                        if (i != 3) {
                            return false;
                        }
                        ((InputMethodManager) C1026.this.f6230.getSystemService("input_method")).hideSoftInputFromWindow(C1026.this.f6224.getWindowToken(), 0);
                        return true;
                    }
                });
            }
            this.f6232.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    C1026.this.f6224.setText("");
                }
            });
            return;
        }
        this.f6233.setVisibility(8);
    }

    /* renamed from: ı  reason: contains not printable characters */
    private List<C2987> m7264(String str) {
        ArrayList arrayList = new ArrayList();
        this.f6227 = 0;
        if (this.f6226.f12037 != null && this.f6226.f12037.size() > 0) {
            for (C2987 next : this.f6226.f12037) {
                if (next.m15331(str)) {
                    arrayList.add(next);
                    this.f6227++;
                }
            }
            if (arrayList.size() > 0) {
                arrayList.add((Object) null);
                this.f6227++;
            }
        }
        for (C2987 next2 : this.f6234) {
            if (next2.m15331(str)) {
                arrayList.add(next2);
            }
        }
        return arrayList;
    }

    public final int getItemCount() {
        return this.f6231.size();
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final String m7266(int i) {
        C2987 r0 = this.f6231.get(i);
        if (this.f6227 > i) {
            return "★";
        }
        return r0 != null ? r0.f13772.substring(0, 1) : "☺";
    }

    /* renamed from: o.Ƀ$if  reason: invalid class name */
    class Cif extends RecyclerView.con {

        /* renamed from: ı  reason: contains not printable characters */
        TextView f6240 = ((TextView) this.f6243.findViewById(R.id.f167682131362382));

        /* renamed from: Ɩ  reason: contains not printable characters */
        View f6241 = this.f6243.findViewById(R.id.f166332131362212);

        /* renamed from: ǃ  reason: contains not printable characters */
        LinearLayout f6242 = ((LinearLayout) this.f6243.findViewById(R.id.f165652131362117));

        /* renamed from: ɩ  reason: contains not printable characters */
        RelativeLayout f6243;

        /* renamed from: Ι  reason: contains not printable characters */
        ImageView f6244 = ((ImageView) this.f6243.findViewById(R.id.f165442131362089));

        /* renamed from: ι  reason: contains not printable characters */
        TextView f6245 = ((TextView) this.f6243.findViewById(R.id.f167672131362381));

        public Cif(View view) {
            super(view);
            this.f6243 = (RelativeLayout) view;
            if (C1026.this.f6226.f12027 != 0) {
                this.f6240.setTextColor(C1026.this.f6226.f12027);
                this.f6245.setTextColor(C1026.this.f6226.f12027);
                this.f6241.setBackgroundColor(C1026.this.f6226.f12027);
            }
            try {
                if (C1026.this.f6226.f12003 == null) {
                    return;
                }
                if (C1026.this.f6226.f12029 != -99) {
                    this.f6245.setTypeface(C1026.this.f6226.f12003, C1026.this.f6226.f12029);
                    this.f6240.setTypeface(C1026.this.f6226.f12003, C1026.this.f6226.f12029);
                    return;
                }
                this.f6245.setTypeface(C1026.this.f6226.f12003);
                this.f6240.setTypeface(C1026.this.f6226.f12003);
            } catch (Exception unused) {
            }
        }
    }

    public final /* synthetic */ RecyclerView.con onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new Cif(this.f6225.inflate(R.layout.f169342131558478, viewGroup, false));
    }

    /* renamed from: Ι  reason: contains not printable characters */
    static /* synthetic */ void m7265(C1026 r3, String str) {
        r3.f6229.setVisibility(8);
        String lowerCase = str.toLowerCase();
        if (lowerCase.length() > 0 && lowerCase.charAt(0) == '+') {
            lowerCase = lowerCase.substring(1);
        }
        r3.f6231 = r3.m7264(lowerCase);
        if (r3.f6231.size() == 0) {
            r3.f6229.setVisibility(0);
        }
        r3.notifyDataSetChanged();
    }
}
