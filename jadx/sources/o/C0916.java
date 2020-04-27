package o;

import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Movie;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import java.io.InputStream;

/* renamed from: o.ǃΙ  reason: contains not printable characters */
class C0916 extends Resources {

    /* renamed from: ı  reason: contains not printable characters */
    private final Resources f5805;

    public C0916(Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f5805 = resources;
    }

    public CharSequence getText(int i) {
        return this.f5805.getText(i);
    }

    public CharSequence getQuantityText(int i, int i2) {
        return this.f5805.getQuantityText(i, i2);
    }

    public String getString(int i) {
        return this.f5805.getString(i);
    }

    public String getString(int i, Object... objArr) {
        return this.f5805.getString(i, objArr);
    }

    public String getQuantityString(int i, int i2, Object... objArr) {
        return this.f5805.getQuantityString(i, i2, objArr);
    }

    public String getQuantityString(int i, int i2) {
        return this.f5805.getQuantityString(i, i2);
    }

    public CharSequence getText(int i, CharSequence charSequence) {
        return this.f5805.getText(i, charSequence);
    }

    public CharSequence[] getTextArray(int i) {
        return this.f5805.getTextArray(i);
    }

    public String[] getStringArray(int i) {
        return this.f5805.getStringArray(i);
    }

    public int[] getIntArray(int i) {
        return this.f5805.getIntArray(i);
    }

    public TypedArray obtainTypedArray(int i) {
        return this.f5805.obtainTypedArray(i);
    }

    public float getDimension(int i) {
        return this.f5805.getDimension(i);
    }

    public int getDimensionPixelOffset(int i) {
        return this.f5805.getDimensionPixelOffset(i);
    }

    public int getDimensionPixelSize(int i) {
        return this.f5805.getDimensionPixelSize(i);
    }

    public float getFraction(int i, int i2, int i3) {
        return this.f5805.getFraction(i, i2, i3);
    }

    public Drawable getDrawable(int i) {
        return this.f5805.getDrawable(i);
    }

    public Drawable getDrawable(int i, Resources.Theme theme) {
        return this.f5805.getDrawable(i, theme);
    }

    public Drawable getDrawableForDensity(int i, int i2) {
        return this.f5805.getDrawableForDensity(i, i2);
    }

    public Drawable getDrawableForDensity(int i, int i2, Resources.Theme theme) {
        return this.f5805.getDrawableForDensity(i, i2, theme);
    }

    public Movie getMovie(int i) {
        return this.f5805.getMovie(i);
    }

    public int getColor(int i) {
        return this.f5805.getColor(i);
    }

    public ColorStateList getColorStateList(int i) {
        return this.f5805.getColorStateList(i);
    }

    public boolean getBoolean(int i) {
        return this.f5805.getBoolean(i);
    }

    public int getInteger(int i) {
        return this.f5805.getInteger(i);
    }

    public XmlResourceParser getLayout(int i) {
        return this.f5805.getLayout(i);
    }

    public XmlResourceParser getAnimation(int i) {
        return this.f5805.getAnimation(i);
    }

    public XmlResourceParser getXml(int i) {
        return this.f5805.getXml(i);
    }

    public InputStream openRawResource(int i) {
        return this.f5805.openRawResource(i);
    }

    public InputStream openRawResource(int i, TypedValue typedValue) {
        return this.f5805.openRawResource(i, typedValue);
    }

    public AssetFileDescriptor openRawResourceFd(int i) {
        return this.f5805.openRawResourceFd(i);
    }

    public void getValue(int i, TypedValue typedValue, boolean z) {
        this.f5805.getValue(i, typedValue, z);
    }

    public void getValueForDensity(int i, int i2, TypedValue typedValue, boolean z) {
        this.f5805.getValueForDensity(i, i2, typedValue, z);
    }

    public void getValue(String str, TypedValue typedValue, boolean z) {
        this.f5805.getValue(str, typedValue, z);
    }

    public TypedArray obtainAttributes(AttributeSet attributeSet, int[] iArr) {
        return this.f5805.obtainAttributes(attributeSet, iArr);
    }

    public void updateConfiguration(Configuration configuration, DisplayMetrics displayMetrics) {
        super.updateConfiguration(configuration, displayMetrics);
        Resources resources = this.f5805;
        if (resources != null) {
            resources.updateConfiguration(configuration, displayMetrics);
        }
    }

    public DisplayMetrics getDisplayMetrics() {
        return this.f5805.getDisplayMetrics();
    }

    public Configuration getConfiguration() {
        return this.f5805.getConfiguration();
    }

    public int getIdentifier(String str, String str2, String str3) {
        return this.f5805.getIdentifier(str, str2, str3);
    }

    public String getResourceName(int i) {
        return this.f5805.getResourceName(i);
    }

    public String getResourcePackageName(int i) {
        return this.f5805.getResourcePackageName(i);
    }

    public String getResourceTypeName(int i) {
        return this.f5805.getResourceTypeName(i);
    }

    public String getResourceEntryName(int i) {
        return this.f5805.getResourceEntryName(i);
    }

    public void parseBundleExtras(XmlResourceParser xmlResourceParser, Bundle bundle) {
        this.f5805.parseBundleExtras(xmlResourceParser, bundle);
    }

    public void parseBundleExtra(String str, AttributeSet attributeSet, Bundle bundle) {
        this.f5805.parseBundleExtra(str, attributeSet, bundle);
    }
}
