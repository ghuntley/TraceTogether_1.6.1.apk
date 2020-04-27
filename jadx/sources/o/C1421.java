package o;

import android.annotation.SuppressLint;
import android.app.SearchManager;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.WeakHashMap;

@SuppressLint({"RestrictedAPI"})
/* renamed from: o.ɬ  reason: contains not printable characters */
public final class C1421 extends C1027 implements View.OnClickListener {

    /* renamed from: ł  reason: contains not printable characters */
    private int f7738 = -1;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private final WeakHashMap<String, Drawable.ConstantState> f7739;

    /* renamed from: ȷ  reason: contains not printable characters */
    private int f7740 = -1;

    /* renamed from: ɨ  reason: contains not printable characters */
    private ColorStateList f7741;

    /* renamed from: ɩ  reason: contains not printable characters */
    public int f7742 = 1;

    /* renamed from: ɪ  reason: contains not printable characters */
    private int f7743 = -1;

    /* renamed from: ɹ  reason: contains not printable characters */
    private final Context f7744;

    /* renamed from: ɾ  reason: contains not printable characters */
    private int f7745 = -1;

    /* renamed from: ι  reason: contains not printable characters */
    private final SearchManager f7746 = ((SearchManager) this.f5923.getSystemService("search"));

    /* renamed from: І  reason: contains not printable characters */
    private final int f7747;

    /* renamed from: г  reason: contains not printable characters */
    private int f7748 = -1;

    /* renamed from: і  reason: contains not printable characters */
    private final SearchableInfo f7749;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private final SearchView f7750;

    /* renamed from: ӏ  reason: contains not printable characters */
    private int f7751 = -1;

    public final boolean hasStableIds() {
        return false;
    }

    public C1421(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout());
        this.f7750 = searchView;
        this.f7749 = searchableInfo;
        this.f7747 = searchView.getSuggestionCommitIconResId();
        this.f7744 = context;
        this.f7739 = weakHashMap;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0079 A[Catch:{ RuntimeException -> 0x007d }] */
    /* renamed from: ɩ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.database.Cursor m8648(java.lang.CharSequence r11) {
        /*
            r10 = this;
            java.lang.String r0 = ""
            if (r11 != 0) goto L_0x0006
            r11 = r0
            goto L_0x000a
        L_0x0006:
            java.lang.String r11 = r11.toString()
        L_0x000a:
            androidx.appcompat.widget.SearchView r1 = r10.f7750
            int r1 = r1.getVisibility()
            r2 = 0
            if (r1 != 0) goto L_0x007d
            androidx.appcompat.widget.SearchView r1 = r10.f7750
            int r1 = r1.getWindowVisibility()
            if (r1 == 0) goto L_0x001c
            goto L_0x007d
        L_0x001c:
            android.app.SearchableInfo r1 = r10.f7749     // Catch:{ RuntimeException -> 0x007d }
            if (r1 != 0) goto L_0x0022
        L_0x0020:
            r11 = r2
            goto L_0x0077
        L_0x0022:
            java.lang.String r3 = r1.getSuggestAuthority()     // Catch:{ RuntimeException -> 0x007d }
            if (r3 != 0) goto L_0x0029
            goto L_0x0020
        L_0x0029:
            android.net.Uri$Builder r4 = new android.net.Uri$Builder     // Catch:{ RuntimeException -> 0x007d }
            r4.<init>()     // Catch:{ RuntimeException -> 0x007d }
            java.lang.String r5 = "content"
            android.net.Uri$Builder r4 = r4.scheme(r5)     // Catch:{ RuntimeException -> 0x007d }
            android.net.Uri$Builder r3 = r4.authority(r3)     // Catch:{ RuntimeException -> 0x007d }
            android.net.Uri$Builder r3 = r3.query(r0)     // Catch:{ RuntimeException -> 0x007d }
            android.net.Uri$Builder r0 = r3.fragment(r0)     // Catch:{ RuntimeException -> 0x007d }
            java.lang.String r3 = r1.getSuggestPath()     // Catch:{ RuntimeException -> 0x007d }
            if (r3 == 0) goto L_0x0049
            r0.appendEncodedPath(r3)     // Catch:{ RuntimeException -> 0x007d }
        L_0x0049:
            java.lang.String r3 = "search_suggest_query"
            r0.appendPath(r3)     // Catch:{ RuntimeException -> 0x007d }
            java.lang.String r7 = r1.getSuggestSelection()     // Catch:{ RuntimeException -> 0x007d }
            if (r7 == 0) goto L_0x005c
            r1 = 1
            java.lang.String[] r1 = new java.lang.String[r1]     // Catch:{ RuntimeException -> 0x007d }
            r3 = 0
            r1[r3] = r11     // Catch:{ RuntimeException -> 0x007d }
            r8 = r1
            goto L_0x0060
        L_0x005c:
            r0.appendPath(r11)     // Catch:{ RuntimeException -> 0x007d }
            r8 = r2
        L_0x0060:
            java.lang.String r11 = "limit"
            java.lang.String r1 = "50"
            r0.appendQueryParameter(r11, r1)     // Catch:{ RuntimeException -> 0x007d }
            android.net.Uri r5 = r0.build()     // Catch:{ RuntimeException -> 0x007d }
            android.content.Context r11 = r10.f5923     // Catch:{ RuntimeException -> 0x007d }
            android.content.ContentResolver r4 = r11.getContentResolver()     // Catch:{ RuntimeException -> 0x007d }
            r6 = 0
            r9 = 0
            android.database.Cursor r11 = r4.query(r5, r6, r7, r8, r9)     // Catch:{ RuntimeException -> 0x007d }
        L_0x0077:
            if (r11 == 0) goto L_0x007d
            r11.getCount()     // Catch:{ RuntimeException -> 0x007d }
            return r11
        L_0x007d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1421.m8648(java.lang.CharSequence):android.database.Cursor");
    }

    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        Cursor cursor = this.f5925;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    public final void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        Cursor cursor = this.f5925;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m8647(Cursor cursor) {
        try {
            super.m6826(cursor);
            if (cursor != null) {
                this.f7743 = cursor.getColumnIndex("suggest_text_1");
                this.f7740 = cursor.getColumnIndex("suggest_text_2");
                this.f7751 = cursor.getColumnIndex("suggest_text_2_url");
                this.f7745 = cursor.getColumnIndex("suggest_icon_1");
                this.f7738 = cursor.getColumnIndex("suggest_icon_2");
                this.f7748 = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final View m8651(Context context, Cursor cursor, ViewGroup viewGroup) {
        View r1 = super.m7268(context, cursor, viewGroup);
        r1.setTag(new Cif(r1));
        ((ImageView) r1.findViewById(R.id.f165142131362028)).setImageResource(this.f7747);
        return r1;
    }

    /* renamed from: o.ɬ$if  reason: invalid class name */
    static final class Cif {

        /* renamed from: ı  reason: contains not printable characters */
        public final ImageView f7752;

        /* renamed from: ǃ  reason: contains not printable characters */
        public final TextView f7753;

        /* renamed from: ɩ  reason: contains not printable characters */
        public final ImageView f7754;

        /* renamed from: Ι  reason: contains not printable characters */
        public final ImageView f7755;

        /* renamed from: ι  reason: contains not printable characters */
        public final TextView f7756;

        public Cif(View view) {
            this.f7756 = (TextView) view.findViewById(16908308);
            this.f7753 = (TextView) view.findViewById(16908309);
            this.f7752 = (ImageView) view.findViewById(16908295);
            this.f7754 = (ImageView) view.findViewById(16908296);
            this.f7755 = (ImageView) view.findViewById(R.id.f165142131362028);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v18, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v21, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v25, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v26, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: Ι  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m8650(android.view.View r19, android.database.Cursor r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r20
            java.lang.Object r2 = r19.getTag()
            o.ɬ$if r2 = (o.C1421.Cif) r2
            int r3 = r0.f7748
            r4 = -1
            r5 = 0
            if (r3 == r4) goto L_0x0015
            int r3 = r1.getInt(r3)
            goto L_0x0016
        L_0x0015:
            r3 = 0
        L_0x0016:
            android.widget.TextView r6 = r2.f7756
            r7 = 8
            if (r6 == 0) goto L_0x0034
            int r6 = r0.f7743
            java.lang.String r6 = m8642(r1, r6)
            android.widget.TextView r8 = r2.f7756
            r8.setText(r6)
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 == 0) goto L_0x0031
            r8.setVisibility(r7)
            goto L_0x0034
        L_0x0031:
            r8.setVisibility(r5)
        L_0x0034:
            android.widget.TextView r6 = r2.f7753
            r8 = 2
            r9 = 1
            if (r6 == 0) goto L_0x00c1
            int r6 = r0.f7751
            java.lang.String r6 = m8642(r1, r6)
            if (r6 == 0) goto L_0x0086
            android.content.res.ColorStateList r10 = r0.f7741
            if (r10 != 0) goto L_0x0065
            android.util.TypedValue r10 = new android.util.TypedValue
            r10.<init>()
            android.content.Context r11 = r0.f5923
            android.content.res.Resources$Theme r11 = r11.getTheme()
            r12 = 2130969334(0x7f0402f6, float:1.7547347E38)
            r11.resolveAttribute(r12, r10, r9)
            android.content.Context r11 = r0.f5923
            android.content.res.Resources r11 = r11.getResources()
            int r10 = r10.resourceId
            android.content.res.ColorStateList r10 = r11.getColorStateList(r10)
            r0.f7741 = r10
        L_0x0065:
            android.text.SpannableString r10 = new android.text.SpannableString
            r10.<init>(r6)
            android.text.style.TextAppearanceSpan r15 = new android.text.style.TextAppearanceSpan
            r12 = 0
            r13 = 0
            r14 = 0
            android.content.res.ColorStateList r11 = r0.f7741
            r16 = 0
            r17 = r11
            r11 = r15
            r4 = r15
            r15 = r17
            r11.<init>(r12, r13, r14, r15, r16)
            int r6 = r6.length()
            r11 = 33
            r10.setSpan(r4, r5, r6, r11)
            goto L_0x008c
        L_0x0086:
            int r4 = r0.f7740
            java.lang.String r10 = m8642(r1, r4)
        L_0x008c:
            boolean r4 = android.text.TextUtils.isEmpty(r10)
            if (r4 == 0) goto L_0x00a1
            android.widget.TextView r4 = r2.f7756
            if (r4 == 0) goto L_0x00af
            android.widget.TextView r4 = r2.f7756
            r4.setSingleLine(r5)
            android.widget.TextView r4 = r2.f7756
            r4.setMaxLines(r8)
            goto L_0x00af
        L_0x00a1:
            android.widget.TextView r4 = r2.f7756
            if (r4 == 0) goto L_0x00af
            android.widget.TextView r4 = r2.f7756
            r4.setSingleLine(r9)
            android.widget.TextView r4 = r2.f7756
            r4.setMaxLines(r9)
        L_0x00af:
            android.widget.TextView r4 = r2.f7753
            r4.setText(r10)
            boolean r6 = android.text.TextUtils.isEmpty(r10)
            if (r6 == 0) goto L_0x00be
            r4.setVisibility(r7)
            goto L_0x00c1
        L_0x00be:
            r4.setVisibility(r5)
        L_0x00c1:
            android.widget.ImageView r4 = r2.f7752
            r6 = 0
            if (r4 == 0) goto L_0x0125
            android.widget.ImageView r4 = r2.f7752
            int r10 = r0.f7745
            r11 = -1
            if (r10 != r11) goto L_0x00cf
            r10 = r6
            goto L_0x0121
        L_0x00cf:
            java.lang.String r10 = r1.getString(r10)
            android.graphics.drawable.Drawable r10 = r0.m8645(r10)
            if (r10 == 0) goto L_0x00da
            goto L_0x0121
        L_0x00da:
            android.app.SearchableInfo r10 = r0.f7749
            android.content.ComponentName r10 = r10.getSearchActivity()
            java.lang.String r11 = r10.flattenToShortString()
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r12 = r0.f7739
            boolean r12 = r12.containsKey(r11)
            if (r12 == 0) goto L_0x0103
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r10 = r0.f7739
            java.lang.Object r10 = r10.get(r11)
            android.graphics.drawable.Drawable$ConstantState r10 = (android.graphics.drawable.Drawable.ConstantState) r10
            if (r10 != 0) goto L_0x00f8
            r10 = r6
            goto L_0x0114
        L_0x00f8:
            android.content.Context r11 = r0.f7744
            android.content.res.Resources r11 = r11.getResources()
            android.graphics.drawable.Drawable r10 = r10.newDrawable(r11)
            goto L_0x0114
        L_0x0103:
            android.graphics.drawable.Drawable r10 = r0.m8640((android.content.ComponentName) r10)
            if (r10 != 0) goto L_0x010b
            r12 = r6
            goto L_0x010f
        L_0x010b:
            android.graphics.drawable.Drawable$ConstantState r12 = r10.getConstantState()
        L_0x010f:
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r13 = r0.f7739
            r13.put(r11, r12)
        L_0x0114:
            if (r10 == 0) goto L_0x0117
            goto L_0x0121
        L_0x0117:
            android.content.Context r10 = r0.f5923
            android.content.pm.PackageManager r10 = r10.getPackageManager()
            android.graphics.drawable.Drawable r10 = r10.getDefaultActivityIcon()
        L_0x0121:
            r11 = 4
            m8643(r4, r10, r11)
        L_0x0125:
            android.widget.ImageView r4 = r2.f7754
            if (r4 == 0) goto L_0x013c
            android.widget.ImageView r4 = r2.f7754
            int r10 = r0.f7738
            r11 = -1
            if (r10 != r11) goto L_0x0131
            goto L_0x0139
        L_0x0131:
            java.lang.String r1 = r1.getString(r10)
            android.graphics.drawable.Drawable r6 = r0.m8645(r1)
        L_0x0139:
            m8643(r4, r6, r7)
        L_0x013c:
            int r1 = r0.f7742
            if (r1 == r8) goto L_0x014d
            if (r1 != r9) goto L_0x0147
            r1 = r3 & 1
            if (r1 == 0) goto L_0x0147
            goto L_0x014d
        L_0x0147:
            android.widget.ImageView r1 = r2.f7755
            r1.setVisibility(r7)
            return
        L_0x014d:
            android.widget.ImageView r1 = r2.f7755
            r1.setVisibility(r5)
            android.widget.ImageView r1 = r2.f7755
            android.widget.TextView r3 = r2.f7756
            java.lang.CharSequence r3 = r3.getText()
            r1.setTag(r3)
            android.widget.ImageView r1 = r2.f7755
            r1.setOnClickListener(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1421.m8650(android.view.View, android.database.Cursor):void");
    }

    public final void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f7750.onQueryRefine((CharSequence) tag);
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private static void m8643(ImageView imageView, Drawable drawable, int i) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e) {
            View r3 = m6832(this.f5923, this.f5925, viewGroup);
            if (r3 != null) {
                ((Cif) r3.getTag()).f7756.setText(e.toString());
            }
            return r3;
        }
    }

    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e) {
            View r3 = m6829(this.f5923, this.f5925, viewGroup);
            if (r3 != null) {
                ((Cif) r3.getTag()).f7756.setText(e.toString());
            }
            return r3;
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private Drawable m8645(String str) {
        Drawable drawable;
        Drawable drawable2 = null;
        if (str != null && !str.isEmpty() && !"0".equals(str)) {
            try {
                int parseInt = Integer.parseInt(str);
                StringBuilder sb = new StringBuilder("android.resource://");
                sb.append(this.f7744.getPackageName());
                sb.append("/");
                sb.append(parseInt);
                String obj = sb.toString();
                Drawable.ConstantState constantState = this.f7739.get(obj);
                if (constantState == null) {
                    drawable = null;
                } else {
                    drawable = constantState.newDrawable();
                }
                if (drawable != null) {
                    return drawable;
                }
                Drawable r1 = C0651.m5458(this.f7744, parseInt);
                if (r1 != null) {
                    this.f7739.put(obj, r1.getConstantState());
                }
                return r1;
            } catch (NumberFormatException unused) {
                Drawable.ConstantState constantState2 = this.f7739.get(str);
                if (constantState2 != null) {
                    drawable2 = constantState2.newDrawable();
                }
                if (drawable2 != null) {
                    return drawable2;
                }
                drawable2 = m8641(Uri.parse(str));
                if (drawable2 != null) {
                    this.f7739.put(str, drawable2.getConstantState());
                }
            } catch (Resources.NotFoundException unused2) {
                return null;
            }
        }
        return drawable2;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:7|8|9) */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:18|19|20|21|22) */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0021, code lost:
        throw new java.io.FileNotFoundException("Resource does not exist: ".concat(java.lang.String.valueOf(r4)));
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x003a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0012 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:21:0x003a=Splitter:B:21:0x003a, B:4:0x000d=Splitter:B:4:0x000d} */
    /* renamed from: ı  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.drawable.Drawable m8641(android.net.Uri r4) {
        /*
            r3 = this;
            r0 = 0
            java.lang.String r1 = r4.getScheme()     // Catch:{ FileNotFoundException -> 0x004b }
            java.lang.String r2 = "android.resource"
            boolean r1 = r2.equals(r1)     // Catch:{ FileNotFoundException -> 0x004b }
            if (r1 == 0) goto L_0x0022
            android.graphics.drawable.Drawable r4 = r3.m8644((android.net.Uri) r4)     // Catch:{ NotFoundException -> 0x0012 }
            return r4
        L_0x0012:
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException -> 0x004b }
            java.lang.String r2 = "Resource does not exist: "
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ FileNotFoundException -> 0x004b }
            java.lang.String r4 = r2.concat(r4)     // Catch:{ FileNotFoundException -> 0x004b }
            r1.<init>(r4)     // Catch:{ FileNotFoundException -> 0x004b }
            throw r1     // Catch:{ FileNotFoundException -> 0x004b }
        L_0x0022:
            android.content.Context r1 = r3.f7744     // Catch:{ FileNotFoundException -> 0x004b }
            android.content.ContentResolver r1 = r1.getContentResolver()     // Catch:{ FileNotFoundException -> 0x004b }
            java.io.InputStream r1 = r1.openInputStream(r4)     // Catch:{ FileNotFoundException -> 0x004b }
            if (r1 == 0) goto L_0x003b
            android.graphics.drawable.Drawable r4 = android.graphics.drawable.Drawable.createFromStream(r1, r0)     // Catch:{ all -> 0x0036 }
            r1.close()     // Catch:{ IOException -> 0x0035 }
        L_0x0035:
            return r4
        L_0x0036:
            r4 = move-exception
            r1.close()     // Catch:{ IOException -> 0x003a }
        L_0x003a:
            throw r4     // Catch:{ FileNotFoundException -> 0x004b }
        L_0x003b:
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException -> 0x004b }
            java.lang.String r2 = "Failed to open "
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ FileNotFoundException -> 0x004b }
            java.lang.String r4 = r2.concat(r4)     // Catch:{ FileNotFoundException -> 0x004b }
            r1.<init>(r4)     // Catch:{ FileNotFoundException -> 0x004b }
            throw r1     // Catch:{ FileNotFoundException -> 0x004b }
        L_0x004b:
            r4 = move-exception
            r4.getMessage()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1421.m8641(android.net.Uri):android.graphics.drawable.Drawable");
    }

    /* renamed from: ı  reason: contains not printable characters */
    private Drawable m8640(ComponentName componentName) {
        PackageManager packageManager = this.f5923.getPackageManager();
        try {
            ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, 128);
            int iconResource = activityInfo.getIconResource();
            if (iconResource == 0) {
                return null;
            }
            Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
            if (drawable != null) {
                return drawable;
            }
            componentName.flattenToShortString();
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static String m8646(Cursor cursor, String str) {
        return m8642(cursor, cursor.getColumnIndex(str));
    }

    /* renamed from: ı  reason: contains not printable characters */
    private static String m8642(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private Drawable m8644(Uri uri) {
        int i;
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            try {
                Resources resourcesForApplication = this.f5923.getPackageManager().getResourcesForApplication(authority);
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments != null) {
                    int size = pathSegments.size();
                    if (size == 1) {
                        try {
                            i = Integer.parseInt(pathSegments.get(0));
                        } catch (NumberFormatException unused) {
                            throw new FileNotFoundException("Single path segment is not a resource ID: ".concat(String.valueOf(uri)));
                        }
                    } else if (size == 2) {
                        i = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
                    } else {
                        throw new FileNotFoundException("More than two path segments: ".concat(String.valueOf(uri)));
                    }
                    if (i != 0) {
                        return resourcesForApplication.getDrawable(i);
                    }
                    throw new FileNotFoundException("No resource found for: ".concat(String.valueOf(uri)));
                }
                throw new FileNotFoundException("No path: ".concat(String.valueOf(uri)));
            } catch (PackageManager.NameNotFoundException unused2) {
                throw new FileNotFoundException("No package found for authority: ".concat(String.valueOf(uri)));
            }
        } else {
            throw new FileNotFoundException("No authority: ".concat(String.valueOf(uri)));
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final CharSequence m8649(Cursor cursor) {
        String r3;
        String r1;
        if (cursor == null) {
            return null;
        }
        String r12 = m8642(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (r12 != null) {
            return r12;
        }
        if (this.f7749.shouldRewriteQueryFromData() && (r1 = m8642(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
            return r1;
        }
        if (!this.f7749.shouldRewriteQueryFromText() || (r3 = m8642(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
            return null;
        }
        return r3;
    }
}
