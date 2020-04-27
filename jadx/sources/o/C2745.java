package o;

import android.content.ComponentName;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.TransformationMethod;
import android.util.Base64;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.Status;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.security.GeneralSecurityException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import o.C2344;

@Deprecated
/* renamed from: o.Ӏ  reason: contains not printable characters */
public final class C2745 {

    /* renamed from: ı  reason: contains not printable characters */
    public static final ComponentName f12769 = new ComponentName("com.google.android.gms", "com.google.android.gms.common.stats.GmsCoreStatsService");

    /* renamed from: ǃ  reason: contains not printable characters */
    public static C2745 f12770;

    /* renamed from: ɩ  reason: contains not printable characters */
    public int f12771;

    /* renamed from: Ι  reason: contains not printable characters */
    public long f12772;

    /* renamed from: ι  reason: contains not printable characters */
    public long f12773;

    /* renamed from: o.Ӏ$IF */
    public static final class IF {

        /* renamed from: ɩ  reason: contains not printable characters */
        public int f12774;

        /* renamed from: Ι  reason: contains not printable characters */
        public int f12775;
    }

    /* renamed from: o.Ӏ$aux */
    public static final class aux {

        /* renamed from: ı  reason: contains not printable characters */
        public static final int f12779 = 2;

        /* renamed from: ıı  reason: contains not printable characters */
        public static final int f12780 = 0;

        /* renamed from: ıŀ  reason: contains not printable characters */
        public static final int f12781 = 2;

        /* renamed from: ıƖ  reason: contains not printable characters */
        public static final int f12782 = 3;

        /* renamed from: ıǃ  reason: contains not printable characters */
        public static final int f12783 = 0;

        /* renamed from: ıȷ  reason: contains not printable characters */
        public static final int[] f12784 = {16842930, 16843126, 16843131, 16843362, R.attr.f153842130969197};

        /* renamed from: ıɨ  reason: contains not printable characters */
        public static final int f12785 = 3;

        /* renamed from: ıɩ  reason: contains not printable characters */
        public static final int f12786 = 5;

        /* renamed from: ıɪ  reason: contains not printable characters */
        public static final int f12787 = 2;

        /* renamed from: ıɹ  reason: contains not printable characters */
        public static final int[] f12788 = {16842754, 16842766, 16842960, 16843014, 16843156, 16843230, 16843231, 16843233, 16843234, 16843235, 16843236, 16843237, 16843375, R.attr.f148242130968590, R.attr.f148422130968608, R.attr.f148442130968610, R.attr.f148522130968618, R.attr.f150412130968828, R.attr.f151952130968986, R.attr.f151962130968987, R.attr.f153502130969162, R.attr.f154152130969232, R.attr.f155392130969374};

        /* renamed from: ıɾ  reason: contains not printable characters */
        public static final int[] f12789 = {16843044, 16843045, 16843074, R.attr.f154182130969235, R.attr.f154312130969249, R.attr.f154602130969279, R.attr.f154612130969280, R.attr.f154632130969282, R.attr.f155122130969346, R.attr.f155132130969347, R.attr.f155142130969348, R.attr.f155402130969375, R.attr.f155452130969380, R.attr.f155462130969381};

        /* renamed from: ıɿ  reason: contains not printable characters */
        public static final int f12790 = 1;

        /* renamed from: ıʟ  reason: contains not printable characters */
        public static final int f12791 = 4;

        /* renamed from: ıΙ  reason: contains not printable characters */
        public static final int f12792 = 123;

        /* renamed from: ıι  reason: contains not printable characters */
        public static final int f12793 = 7;

        /* renamed from: ıІ  reason: contains not printable characters */
        public static final int f12794 = 120;

        /* renamed from: ıг  reason: contains not printable characters */
        public static final int f12795 = 1;

        /* renamed from: ıі  reason: contains not printable characters */
        public static final int f12796 = 1;

        /* renamed from: ıӀ  reason: contains not printable characters */
        public static final int[] f12797 = {R.attr.f148502130968616};

        /* renamed from: ıӏ  reason: contains not printable characters */
        public static final int f12798 = 1;

        /* renamed from: ĸ  reason: contains not printable characters */
        public static final int f12799 = 9;

        /* renamed from: Ŀ  reason: contains not printable characters */
        public static final int f12800 = 8;

        /* renamed from: ŀ  reason: contains not printable characters */
        public static final int f12801 = 26;

        /* renamed from: ł  reason: contains not printable characters */
        public static final int[] f12802 = {16842931};

        /* renamed from: ŧ  reason: contains not printable characters */
        public static final int f12803 = 2;

        /* renamed from: ſ  reason: contains not printable characters */
        public static final int f12804 = 0;

        /* renamed from: ƒ  reason: contains not printable characters */
        public static final int f12805 = 2;

        /* renamed from: Ɩ  reason: contains not printable characters */
        public static final int f12806 = 13;

        /* renamed from: Ɩı  reason: contains not printable characters */
        public static final int f12807 = 5;

        /* renamed from: Ɩǃ  reason: contains not printable characters */
        public static final int f12808 = 7;

        /* renamed from: Ɩɩ  reason: contains not printable characters */
        public static final int f12809 = 4;

        /* renamed from: Ɩι  reason: contains not printable characters */
        public static final int f12810 = 3;

        /* renamed from: Ɨ  reason: contains not printable characters */
        public static final int[] f12811 = {R.attr.f148622130968630, R.attr.f148642130968637, R.attr.f150162130968795, R.attr.f151722130968962, R.attr.f154552130969274, R.attr.f155332130969367};

        /* renamed from: ƚ  reason: contains not printable characters */
        public static final int f12812 = 0;

        /* renamed from: ƨ  reason: contains not printable characters */
        public static final int f12813 = 0;

        /* renamed from: ƫ  reason: contains not printable characters */
        public static final int f12814 = 7;

        /* renamed from: Ƭ  reason: contains not printable characters */
        public static final int f12815 = 4;

        /* renamed from: ƭ  reason: contains not printable characters */
        public static final int f12816 = 8;

        /* renamed from: ǀ  reason: contains not printable characters */
        public static final int f12817 = 2;

        /* renamed from: ǃ  reason: contains not printable characters */
        public static final int[] f12818 = {R.attr.f148622130968630, R.attr.f148642130968637, R.attr.f148652130968638, R.attr.f150422130968829, R.attr.f150432130968830, R.attr.f150442130968831, R.attr.f150452130968832, R.attr.f150462130968833, R.attr.f150472130968834, R.attr.f150732130968860, R.attr.f150862130968873, R.attr.f150872130968874, R.attr.f151042130968893, R.attr.f151722130968962, R.attr.f151782130968968, R.attr.f151862130968976, R.attr.f151872130968977, R.attr.f151892130968980, R.attr.f151992130968992, R.attr.f152112130969005, R.attr.f153152130969109, R.attr.f153472130969158, R.attr.f153842130969197, R.attr.f153912130969204, R.attr.f153922130969205, R.attr.f154522130969271, R.attr.f154552130969274, R.attr.f155232130969357, R.attr.f155332130969367};

        /* renamed from: ǃı  reason: contains not printable characters */
        public static final int f12819 = 1;

        /* renamed from: ǃƖ  reason: contains not printable characters */
        public static final int f12820 = 6;

        /* renamed from: ǃǃ  reason: contains not printable characters */
        public static final int[] f12821 = {16842804, 16843117, 16843118, 16843119, 16843120, 16843666, 16843667};

        /* renamed from: ǃȷ  reason: contains not printable characters */
        public static final int f12822 = 5;

        /* renamed from: ǃɨ  reason: contains not printable characters */
        public static final int f12823 = 8;

        /* renamed from: ǃɩ  reason: contains not printable characters */
        public static final int f12824 = 11;

        /* renamed from: ǃɪ  reason: contains not printable characters */
        public static final int f12825 = 6;

        /* renamed from: ǃɹ  reason: contains not printable characters */
        public static final int f12826 = 10;

        /* renamed from: ǃɾ  reason: contains not printable characters */
        public static final int f12827 = 9;

        /* renamed from: ǃɿ  reason: contains not printable characters */
        public static final int f12828 = 13;

        /* renamed from: ǃʟ  reason: contains not printable characters */
        public static final int f12829 = 11;

        /* renamed from: ǃΙ  reason: contains not printable characters */
        public static final int f12830 = 0;

        /* renamed from: ǃι  reason: contains not printable characters */
        public static final int f12831 = 10;

        /* renamed from: ǃІ  reason: contains not printable characters */
        public static final int[] f12832 = {16843015, R.attr.f149192130968696, R.attr.f149262130968703, R.attr.f149272130968704};

        /* renamed from: ǃг  reason: contains not printable characters */
        public static final int f12833 = 12;

        /* renamed from: ǃі  reason: contains not printable characters */
        public static final int f12834 = 0;

        /* renamed from: ǃӀ  reason: contains not printable characters */
        public static final int f12835 = 0;

        /* renamed from: ǃӏ  reason: contains not printable characters */
        public static final int f12836 = 11;

        /* renamed from: ȷ  reason: contains not printable characters */
        public static final int f12837 = 17;

        /* renamed from: ȷı  reason: contains not printable characters */
        public static final int[] f12838 = {16842901, 16842902, 16842903, 16842904, 16842906, 16842907, 16843105, 16843106, 16843107, 16843108, 16843692, 16844165, R.attr.f151562130968945, R.attr.f151642130968953, R.attr.f154912130969310, R.attr.f155052130969337};

        /* renamed from: ȷǃ  reason: contains not printable characters */
        public static final int f12839 = 10;

        /* renamed from: Ƚ  reason: contains not printable characters */
        public static final int f12840 = 13;

        /* renamed from: Ɂ  reason: contains not printable characters */
        public static final int f12841 = 13;

        /* renamed from: ɂ  reason: contains not printable characters */
        public static final int f12842 = 3;

        /* renamed from: Ɉ  reason: contains not printable characters */
        public static final int f12843 = 2;

        /* renamed from: ɉ  reason: contains not printable characters */
        public static final int[] f12844 = {16842804, R.attr.f148572130968625, R.attr.f148582130968626, R.attr.f148592130968627, R.attr.f148602130968628, R.attr.f148612130968629, R.attr.f150912130968878, R.attr.f150922130968879, R.attr.f150932130968880, R.attr.f150942130968881, R.attr.f150952130968883, R.attr.f150962130968884, R.attr.f150972130968885, R.attr.f150982130968886, R.attr.f151532130968942, R.attr.f151562130968945, R.attr.f151642130968953, R.attr.f152312130969025, R.attr.f152982130969092, R.attr.f154912130969310, R.attr.f155052130969337};

        /* renamed from: ɍ  reason: contains not printable characters */
        public static final int[] f12845 = {16843071};

        /* renamed from: ɔ  reason: contains not printable characters */
        public static final int f12846 = 4;

        /* renamed from: ɛ  reason: contains not printable characters */
        public static final int f12847 = 12;

        /* renamed from: ɜ  reason: contains not printable characters */
        public static final int f12848 = 9;

        /* renamed from: ɟ  reason: contains not printable characters */
        public static final int f12849 = 5;

        /* renamed from: ɢ  reason: contains not printable characters */
        public static final int f12850 = 4;

        /* renamed from: ɤ  reason: contains not printable characters */
        public static final int f12851 = 3;

        /* renamed from: ɨ  reason: contains not printable characters */
        public static final int f12852 = 20;

        /* renamed from: ɨı  reason: contains not printable characters */
        public static final int f12853 = 2;

        /* renamed from: ɨǃ  reason: contains not printable characters */
        public static final int f12854 = 3;

        /* renamed from: ɩ  reason: contains not printable characters */
        public static final int f12855 = 1;

        /* renamed from: ɩı  reason: contains not printable characters */
        public static final int f12856 = 17;

        /* renamed from: ɩƖ  reason: contains not printable characters */
        public static final int f12857 = 0;

        /* renamed from: ɩǃ  reason: contains not printable characters */
        public static final int f12858 = 12;

        /* renamed from: ɩɩ  reason: contains not printable characters */
        public static final int[] f12859 = {16842927, 16842948, 16843046, 16843047, 16843048, R.attr.f150872130968874, R.attr.f150892130968876, R.attr.f153412130969151, R.attr.f154162130969233};

        /* renamed from: ɩɹ  reason: contains not printable characters */
        public static final int f12860 = 1;

        /* renamed from: ɩΙ  reason: contains not printable characters */
        public static final int f12861 = 14;

        /* renamed from: ɩι  reason: contains not printable characters */
        public static final int f12862 = 1;

        /* renamed from: ɩІ  reason: contains not printable characters */
        public static final int f12863 = 17;

        /* renamed from: ɩі  reason: contains not printable characters */
        public static final int f12864 = 16;

        /* renamed from: ɩӀ  reason: contains not printable characters */
        public static final int f12865 = 18;

        /* renamed from: ɩӏ  reason: contains not printable characters */
        public static final int f12866 = 13;

        /* renamed from: ɪ  reason: contains not printable characters */
        public static final int f12867 = 22;

        /* renamed from: ɪı  reason: contains not printable characters */
        public static final int f12868 = 5;

        /* renamed from: ɪǃ  reason: contains not printable characters */
        public static final int f12869 = 12;

        /* renamed from: ɫ  reason: contains not printable characters */
        public static final int f12870 = 14;

        /* renamed from: ɬ  reason: contains not printable characters */
        public static final int f12871 = 2;

        /* renamed from: ɭ  reason: contains not printable characters */
        public static final int f12872 = 2;

        /* renamed from: ɹ  reason: contains not printable characters */
        public static final int f12873 = 9;

        /* renamed from: ɹı  reason: contains not printable characters */
        public static final int f12874 = 15;

        /* renamed from: ɹǃ  reason: contains not printable characters */
        public static final int[] f12875 = {16842926, 16843052, 16843053, 16843054, 16843055, 16843056, 16843057, R.attr.f153892130969202, R.attr.f154502130969269};

        /* renamed from: ɹɩ  reason: contains not printable characters */
        public static final int f12876 = 11;

        /* renamed from: ɹι  reason: contains not printable characters */
        public static final int f12877 = 10;

        /* renamed from: ɺ  reason: contains not printable characters */
        public static final int f12878 = 3;

        /* renamed from: ɻ  reason: contains not printable characters */
        public static final int f12879 = 7;

        /* renamed from: ɼ  reason: contains not printable characters */
        public static final int[] f12880 = {R.attr.f151262130968915, R.attr.f152002130968993};

        /* renamed from: ɽ  reason: contains not printable characters */
        public static final int f12881 = 18;

        /* renamed from: ɾ  reason: contains not printable characters */
        public static final int f12882 = 14;

        /* renamed from: ɾı  reason: contains not printable characters */
        public static final int[] f12883 = {16842927, 16843072, R.attr.f149202130968697, R.attr.f150172130968796, R.attr.f150182130968797, R.attr.f150422130968829, R.attr.f150432130968830, R.attr.f150442130968831, R.attr.f150452130968832, R.attr.f150462130968833, R.attr.f150472130968834, R.attr.f153152130969109, R.attr.f153162130969110, R.attr.f153392130969148, R.attr.f153422130969152, R.attr.f153452130969156, R.attr.f153462130969157, R.attr.f153842130969197, R.attr.f154522130969271, R.attr.f154532130969272, R.attr.f154542130969273, R.attr.f155232130969357, R.attr.f155252130969359, R.attr.f155262130969360, R.attr.f155272130969361, R.attr.f155282130969362, R.attr.f155292130969363, R.attr.f155302130969364, R.attr.f155312130969365, R.attr.f155322130969366};

        /* renamed from: ɾǃ  reason: contains not printable characters */
        public static final int f12884 = 14;

        /* renamed from: ɿ  reason: contains not printable characters */
        public static final int f12885 = 25;

        /* renamed from: ɿı  reason: contains not printable characters */
        public static final int f12886 = 0;

        /* renamed from: ɿǃ  reason: contains not printable characters */
        public static final int f12887 = 15;

        /* renamed from: ʃ  reason: contains not printable characters */
        public static final int f12888 = 5;

        /* renamed from: ʄ  reason: contains not printable characters */
        public static final int f12889 = 22;

        /* renamed from: ʅ  reason: contains not printable characters */
        public static final int f12890 = 0;

        /* renamed from: ʇ  reason: contains not printable characters */
        public static final int f12891 = 84;

        /* renamed from: ʈ  reason: contains not printable characters */
        public static final int f12892 = 19;

        /* renamed from: ʋ  reason: contains not printable characters */
        public static final int f12893 = 1;

        /* renamed from: ʌ  reason: contains not printable characters */
        public static final int f12894 = 1;

        /* renamed from: ʎ  reason: contains not printable characters */
        public static final int f12895 = 2;

        /* renamed from: ʏ  reason: contains not printable characters */
        public static final int f12896 = 2;

        /* renamed from: ʔ  reason: contains not printable characters */
        public static final int f12897 = 1;

        /* renamed from: ʕ  reason: contains not printable characters */
        public static final int f12898 = 3;

        /* renamed from: ʖ  reason: contains not printable characters */
        public static final int[] f12899 = {16843033, R.attr.f154322130969250, R.attr.f155212130969355, R.attr.f155222130969356};

        /* renamed from: ʝ  reason: contains not printable characters */
        public static final int f12900 = 4;

        /* renamed from: ʟ  reason: contains not printable characters */
        public static final int f12901 = 28;

        /* renamed from: ʟı  reason: contains not printable characters */
        public static final int f12902 = 5;

        /* renamed from: ʟǃ  reason: contains not printable characters */
        public static final int f12903 = 7;

        /* renamed from: ʡ  reason: contains not printable characters */
        public static final int f12904 = 21;

        /* renamed from: ʢ  reason: contains not printable characters */
        public static final int f12905 = 20;

        /* renamed from: ʭ  reason: contains not printable characters */
        public static final int f12906 = 6;

        /* renamed from: ͱ  reason: contains not printable characters */
        public static final int f12907 = 3;

        /* renamed from: ͻ  reason: contains not printable characters */
        public static final int[] f12908 = {16842994, R.attr.f149212130968698, R.attr.f149222130968699, R.attr.f153042130969098, R.attr.f153052130969099, R.attr.f153432130969154, R.attr.f154192130969236, R.attr.f154212130969238};

        /* renamed from: ͼ  reason: contains not printable characters */
        public static final int f12909 = 4;

        /* renamed from: ͽ  reason: contains not printable characters */
        public static final int f12910 = 6;

        /* renamed from: Γ  reason: contains not printable characters */
        public static final int f12911 = 1;

        /* renamed from: Ι  reason: contains not printable characters */
        public static final int f12912 = 0;

        /* renamed from: Ιı  reason: contains not printable characters */
        public static final int f12913 = 3;

        /* renamed from: Ιǃ  reason: contains not printable characters */
        public static final int f12914 = 6;

        /* renamed from: Ιɩ  reason: contains not printable characters */
        public static final int f12915 = 5;

        /* renamed from: ΙΙ  reason: contains not printable characters */
        public static final int f12916 = 8;

        /* renamed from: Ιι  reason: contains not printable characters */
        public static final int f12917 = 8;

        /* renamed from: ΙІ  reason: contains not printable characters */
        public static final int f12918 = 12;

        /* renamed from: Ιі  reason: contains not printable characters */
        public static final int f12919 = 11;

        /* renamed from: ΙӀ  reason: contains not printable characters */
        public static final int f12920 = 9;

        /* renamed from: Ξ  reason: contains not printable characters */
        public static final int f12921 = 4;

        /* renamed from: Τ  reason: contains not printable characters */
        public static final int f12922 = 2;

        /* renamed from: Υ  reason: contains not printable characters */
        public static final int[] f12923 = {16842839, 16842926, R.attr.f148112130968577, R.attr.f148122130968578, R.attr.f148132130968579, R.attr.f148142130968580, R.attr.f148152130968581, R.attr.f148162130968582, R.attr.f148172130968583, R.attr.f148182130968584, R.attr.f148192130968585, R.attr.f148202130968586, R.attr.f148212130968587, R.attr.f148222130968588, R.attr.f148232130968589, R.attr.f148252130968591, R.attr.f148262130968592, R.attr.f148272130968593, R.attr.f148282130968594, R.attr.f148292130968595, R.attr.f148302130968596, R.attr.f148312130968597, R.attr.f148322130968598, R.attr.f148332130968599, R.attr.f148342130968600, R.attr.f148352130968601, R.attr.f148362130968602, R.attr.f148372130968603, R.attr.f148382130968604, R.attr.f148392130968605, R.attr.f148402130968606, R.attr.f148412130968607, R.attr.f148452130968611, R.attr.f148462130968612, R.attr.f148472130968613, R.attr.f148482130968614, R.attr.f148492130968615, R.attr.f148562130968624, R.attr.f148932130968670, R.attr.f149142130968691, R.attr.f149152130968692, R.attr.f149162130968693, R.attr.f149172130968694, R.attr.f149182130968695, R.attr.f149242130968701, R.attr.f149252130968702, R.attr.f149822130968759, R.attr.f149892130968766, R.attr.f150212130968801, R.attr.f150222130968802, R.attr.f150232130968803, R.attr.f150242130968804, R.attr.f150252130968805, R.attr.f150262130968806, R.attr.f150272130968807, R.attr.f150312130968815, R.attr.f150322130968816, R.attr.f150362130968823, R.attr.f150542130968841, R.attr.f150832130968870, R.attr.f150842130968871, R.attr.f150852130968872, R.attr.f150882130968875, R.attr.f150902130968877, R.attr.f150992130968888, R.attr.f151002130968889, R.attr.f151012130968890, R.attr.f151022130968891, R.attr.f151032130968892, R.attr.f151862130968976, R.attr.f151982130968991, R.attr.f153002130969094, R.attr.f153012130969095, R.attr.f153022130969096, R.attr.f153032130969097, R.attr.f153062130969100, R.attr.f153072130969101, R.attr.f153082130969102, R.attr.f153092130969103, R.attr.f153102130969104, R.attr.f153112130969105, R.attr.f153122130969106, R.attr.f153132130969107, R.attr.f153142130969108, R.attr.f153682130969180, R.attr.f153692130969181, R.attr.f153702130969182, R.attr.f153832130969196, R.attr.f153852130969198, R.attr.f153952130969208, R.attr.f153972130969210, R.attr.f153982130969211, R.attr.f153992130969212, R.attr.f154082130969222, R.attr.f154092130969223, R.attr.f154102130969224, R.attr.f154112130969225, R.attr.f154292130969247, R.attr.f154302130969248, R.attr.f154622130969281, R.attr.f154922130969321, R.attr.f154942130969323, R.attr.f154952130969324, R.attr.f154962130969325, R.attr.f154972130969327, R.attr.f154982130969328, R.attr.f154992130969329, R.attr.f155002130969330, R.attr.f155012130969333, R.attr.f155022130969334, R.attr.f155352130969369, R.attr.f155362130969370, R.attr.f155372130969371, R.attr.f155382130969372, R.attr.f155512130969387, R.attr.f155542130969390, R.attr.f155552130969391, R.attr.f155562130969392, R.attr.f155572130969393, R.attr.f155582130969394, R.attr.f155592130969395, R.attr.f155602130969396, R.attr.f155612130969397, R.attr.f155622130969398, R.attr.f155632130969399};

        /* renamed from: γ  reason: contains not printable characters */
        public static final int f12924 = 10;

        /* renamed from: ε  reason: contains not printable characters */
        public static final int f12925 = 7;

        /* renamed from: ι  reason: contains not printable characters */
        public static final int f12926 = 3;

        /* renamed from: ιı  reason: contains not printable characters */
        public static final int f12927 = 0;

        /* renamed from: ιƖ  reason: contains not printable characters */
        public static final int f12928 = 15;

        /* renamed from: ιǃ  reason: contains not printable characters */
        public static final int f12929 = 114;

        /* renamed from: ιɩ  reason: contains not printable characters */
        public static final int f12930 = 5;

        /* renamed from: ιɹ  reason: contains not printable characters */
        public static final int f12931 = 17;

        /* renamed from: ιΙ  reason: contains not printable characters */
        public static final int f12932 = 1;

        /* renamed from: ιι  reason: contains not printable characters */
        public static final int f12933 = 4;

        /* renamed from: ιІ  reason: contains not printable characters */
        public static final int[] f12934 = {16843126, 16843465, R.attr.f153602130969172};

        /* renamed from: ιі  reason: contains not printable characters */
        public static final int f12935 = 0;

        /* renamed from: ιӀ  reason: contains not printable characters */
        public static final int[] f12936 = {R.attr.f153612130969173, R.attr.f153672130969179};

        /* renamed from: ιӏ  reason: contains not printable characters */
        public static final int f12937 = 13;

        /* renamed from: κ  reason: contains not printable characters */
        public static final int f12938 = 0;

        /* renamed from: λ  reason: contains not printable characters */
        public static final int f12939 = 14;

        /* renamed from: ν  reason: contains not printable characters */
        public static final int f12940 = 2;

        /* renamed from: ο  reason: contains not printable characters */
        public static final int[] f12941 = {16842931, 16842996, 16842997, 16843137};

        /* renamed from: ς  reason: contains not printable characters */
        public static final int f12942 = 6;

        /* renamed from: τ  reason: contains not printable characters */
        public static final int f12943 = 2;

        /* renamed from: υ  reason: contains not printable characters */
        public static final int f12944 = 0;

        /* renamed from: ϒ  reason: contains not printable characters */
        public static final int f12945 = 16;

        /* renamed from: ϛ  reason: contains not printable characters */
        public static final int f12946 = 3;

        /* renamed from: Ϝ  reason: contains not printable characters */
        public static final int f12947 = 18;

        /* renamed from: ϟ  reason: contains not printable characters */
        public static final int f12948 = 117;

        /* renamed from: ϲ  reason: contains not printable characters */
        public static final int f12949 = 1;

        /* renamed from: ϳ  reason: contains not printable characters */
        public static final int f12950 = 0;

        /* renamed from: І  reason: contains not printable characters */
        public static final int f12951 = 12;

        /* renamed from: Іı  reason: contains not printable characters */
        public static final int f12952 = 3;

        /* renamed from: Іǃ  reason: contains not printable characters */
        public static final int f12953 = 8;

        /* renamed from: Іɩ  reason: contains not printable characters */
        public static final int f12954 = 1;

        /* renamed from: ІΙ  reason: contains not printable characters */
        public static final int f12955 = 22;

        /* renamed from: Іι  reason: contains not printable characters */
        public static final int f12956 = 1;

        /* renamed from: ІІ  reason: contains not printable characters */
        public static final int f12957 = 20;

        /* renamed from: Іі  reason: contains not printable characters */
        public static final int f12958 = 19;

        /* renamed from: ІӀ  reason: contains not printable characters */
        public static final int f12959 = 21;

        /* renamed from: Ј  reason: contains not printable characters */
        public static final int f12960 = 1;

        /* renamed from: Г  reason: contains not printable characters */
        public static final int f12961 = 3;

        /* renamed from: Т  reason: contains not printable characters */
        public static final int f12962 = 7;

        /* renamed from: Ч  reason: contains not printable characters */
        public static final int f12963 = 3;

        /* renamed from: г  reason: contains not printable characters */
        public static final int f12964 = 27;

        /* renamed from: гı  reason: contains not printable characters */
        public static final int f12965 = 24;

        /* renamed from: гǃ  reason: contains not printable characters */
        public static final int f12966 = 23;

        /* renamed from: з  reason: contains not printable characters */
        public static final int[] f12967 = {16842970, 16843039, 16843296, 16843364, R.attr.f150092130968788, R.attr.f150372130968824, R.attr.f150812130968868, R.attr.f151672130968957, R.attr.f151972130968988, R.attr.f152332130969027, R.attr.f153932130969206, R.attr.f153942130969207, R.attr.f154062130969220, R.attr.f154072130969221, R.attr.f154512130969270, R.attr.f154592130969278, R.attr.f155522130969388};

        /* renamed from: к  reason: contains not printable characters */
        public static final int f12968 = 27;

        /* renamed from: л  reason: contains not printable characters */
        public static final int f12969 = 25;

        /* renamed from: о  reason: contains not printable characters */
        public static final int[] f12970 = {16843436, 16843437};

        /* renamed from: с  reason: contains not printable characters */
        public static final int f12971 = 0;

        /* renamed from: т  reason: contains not printable characters */
        public static final int f12972 = 6;

        /* renamed from: у  reason: contains not printable characters */
        public static final int f12973 = 1;

        /* renamed from: х  reason: contains not printable characters */
        public static final int f12974 = 3;

        /* renamed from: ч  reason: contains not printable characters */
        public static final int f12975 = 2;

        /* renamed from: ь  reason: contains not printable characters */
        public static final int f12976 = 0;

        /* renamed from: э  reason: contains not printable characters */
        public static final int f12977 = 0;

        /* renamed from: є  reason: contains not printable characters */
        public static final int[] f12978 = {16842766, 16842960, 16843156, 16843230, 16843231, 16843232};

        /* renamed from: ѕ  reason: contains not printable characters */
        public static final int f12979 = 26;

        /* renamed from: і  reason: contains not printable characters */
        public static final int f12980 = 7;

        /* renamed from: іı  reason: contains not printable characters */
        public static final int f12981 = 0;

        /* renamed from: іǃ  reason: contains not printable characters */
        public static final int f12982 = 2;

        /* renamed from: іɩ  reason: contains not printable characters */
        public static final int f12983 = 2;

        /* renamed from: іΙ  reason: contains not printable characters */
        public static final int f12984 = 0;

        /* renamed from: іι  reason: contains not printable characters */
        public static final int f12985 = 4;

        /* renamed from: іІ  reason: contains not printable characters */
        public static final int f12986 = 4;

        /* renamed from: іі  reason: contains not printable characters */
        public static final int f12987 = 29;

        /* renamed from: іӀ  reason: contains not printable characters */
        public static final int f12988 = 28;

        /* renamed from: ј  reason: contains not printable characters */
        public static final int f12989 = 5;

        /* renamed from: ҁ  reason: contains not printable characters */
        public static final int f12990 = 118;

        /* renamed from: Ґ  reason: contains not printable characters */
        public static final int f12991 = 119;

        /* renamed from: ґ  reason: contains not printable characters */
        public static final int f12992 = 4;

        /* renamed from: ғ  reason: contains not printable characters */
        public static final int f12993 = 115;

        /* renamed from: ҫ  reason: contains not printable characters */
        public static final int f12994 = 8;

        /* renamed from: ҭ  reason: contains not printable characters */
        public static final int f12995 = 116;

        /* renamed from: Ү  reason: contains not printable characters */
        public static final int f12996 = 121;

        /* renamed from: ү  reason: contains not printable characters */
        public static final int f12997 = 7;

        /* renamed from: ҷ  reason: contains not printable characters */
        public static final int f12998 = 5;

        /* renamed from: Һ  reason: contains not printable characters */
        public static final int f12999 = 6;

        /* renamed from: Ӏ  reason: contains not printable characters */
        public static final int f13000 = 10;

        /* renamed from: Ӏı  reason: contains not printable characters */
        public static final int f13001 = 3;

        /* renamed from: Ӏǃ  reason: contains not printable characters */
        public static final int f13002 = 1;

        /* renamed from: Ӏɩ  reason: contains not printable characters */
        public static final int f13003 = 12;

        /* renamed from: ӀΙ  reason: contains not printable characters */
        public static final int[] f13004 = {16842752, 16842970, R.attr.f153632130969175, R.attr.f153662130969178, R.attr.f155082130969340};

        /* renamed from: Ӏι  reason: contains not printable characters */
        public static final int f13005 = 13;

        /* renamed from: ӀІ  reason: contains not printable characters */
        public static final int f13006 = 1;

        /* renamed from: Ӏі  reason: contains not printable characters */
        public static final int f13007 = 0;

        /* renamed from: ӀӀ  reason: contains not printable characters */
        public static final int[] f13008 = {16842960, 16842994, 16842995};

        /* renamed from: ӌ  reason: contains not printable characters */
        public static final int f13009 = 10;

        /* renamed from: ӏ  reason: contains not printable characters */
        public static final int f13010 = 15;

        /* renamed from: ӏı  reason: contains not printable characters */
        public static final int f13011 = 11;

        /* renamed from: ӏǃ  reason: contains not printable characters */
        public static final int f13012 = 9;

        /* renamed from: ӏɩ  reason: contains not printable characters */
        public static final int f13013 = 2;

        /* renamed from: ӏι  reason: contains not printable characters */
        public static final int[] f13014 = {16842964, R.attr.f148662130968639, R.attr.f148672130968640};

        /* renamed from: Ӷ  reason: contains not printable characters */
        public static final int f13015 = 4;

        /* renamed from: ӷ  reason: contains not printable characters */
        public static final int[] f13016 = {16843074, R.attr.f155182130969352, R.attr.f155192130969353, R.attr.f155202130969354};

        /* renamed from: ԁ  reason: contains not printable characters */
        public static final int f13017 = 15;

        /* renamed from: ԅ  reason: contains not printable characters */
        public static final int f13018 = 14;

        /* renamed from: ԇ  reason: contains not printable characters */
        public static final int f13019 = 124;

        /* renamed from: ԍ  reason: contains not printable characters */
        public static final int f13020 = 5;

        /* renamed from: ԏ  reason: contains not printable characters */
        public static final int f13021 = 0;

        /* renamed from: ԑ  reason: contains not printable characters */
        public static final int f13022 = 0;

        /* renamed from: ԧ  reason: contains not printable characters */
        public static final int f13023 = 122;

        /* renamed from: չ  reason: contains not printable characters */
        public static final int f13024 = 1;

        /* renamed from: ւ  reason: contains not printable characters */
        public static final int f13025 = 16;

        /* renamed from: օ  reason: contains not printable characters */
        public static final int f13026 = 0;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static void m14544(Parcel parcel, int i, Float f, boolean z) {
    }

    /* renamed from: o.Ӏ$ι  reason: contains not printable characters */
    public static final class C2750 {
        public C2750() {
            new HashMap();
        }
    }

    /* renamed from: o.Ӏ$ı  reason: contains not printable characters */
    public static final class C2746 implements TransformationMethod {

        /* renamed from: ǃ  reason: contains not printable characters */
        public static final int f13032 = 2130968892;

        /* renamed from: ı  reason: contains not printable characters */
        private Locale f13033;

        public final void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
        }

        public C2746(Context context) {
            this.f13033 = context.getResources().getConfiguration().locale;
        }

        public final CharSequence getTransformation(CharSequence charSequence, View view) {
            if (charSequence != null) {
                return charSequence.toString().toUpperCase(this.f13033);
            }
            return null;
        }

        public C2746() {
        }

        /* renamed from: ı  reason: contains not printable characters */
        public static <T> T m14555(T t) {
            if (t != null) {
                return t;
            }
            throw new NullPointerException("null reference");
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public static String m14562(String str) {
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
            throw new IllegalArgumentException("Given String is empty or null");
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public static <T> T m14559(T t, Object obj) {
            if (t != null) {
                return t;
            }
            throw new NullPointerException(String.valueOf(obj));
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public static int m14561(int i) {
            if (i != 0) {
                return i;
            }
            throw new IllegalArgumentException("Given Integer is zero");
        }

        /* renamed from: ı  reason: contains not printable characters */
        public static void m14557(boolean z) {
            if (!z) {
                throw new IllegalStateException();
            }
        }

        /* renamed from: ı  reason: contains not printable characters */
        public static void m14558(boolean z, Object obj) {
            if (!z) {
                throw new IllegalStateException(String.valueOf(obj));
            }
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public static void m14563(boolean z) {
            if (!z) {
                throw new IllegalArgumentException();
            }
        }

        /* renamed from: ı  reason: contains not printable characters */
        public static void m14556(String str) {
            if (!C2396.m12409()) {
                throw new IllegalStateException(str);
            }
        }

        /* renamed from: ι  reason: contains not printable characters */
        public static String m14564(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return str;
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public static boolean m14560(String str) {
            return str == null || str.trim().isEmpty();
        }

        static {
            Pattern.compile("\\$\\{(.*?)\\}");
        }
    }

    /* renamed from: o.Ӏ$if  reason: invalid class name */
    public static final class Cif {

        /* renamed from: ǃ  reason: contains not printable characters */
        public int f13030 = 0;

        /* renamed from: ι  reason: contains not printable characters */
        public HashSet<Cif> f13031 = new HashSet<>(2);

        /* renamed from: ǃ  reason: contains not printable characters */
        public void m14551() {
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public void m14553() {
            this.f13030 = 0;
            this.f13031.clear();
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final void m14554() {
            this.f13030 = 0;
            Iterator<Cif> it = this.f13031.iterator();
            while (it.hasNext()) {
                it.next().m14554();
            }
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final void m14552() {
            this.f13030 = 1;
            Iterator<Cif> it = this.f13031.iterator();
            while (it.hasNext()) {
                it.next().m14551();
            }
        }
    }

    /* renamed from: o.Ӏ$iF  reason: case insensitive filesystem */
    public static final class C3657iF {

        /* renamed from: Ι  reason: contains not printable characters */
        private static SparseArray<C1766> f13027 = new SparseArray<>();

        /* renamed from: ι  reason: contains not printable characters */
        private static EnumMap<C1766, Integer> f13028;

        /* renamed from: ı  reason: contains not printable characters */
        private final int f13029;

        public C3657iF(int i, byte b) {
            this(i, 0);
        }

        private C3657iF(int i, char c) {
            this(i);
        }

        private C3657iF(int i) {
            this.f13029 = i;
        }

        public C3657iF() {
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public static C1766 m14549(int i) {
            C1766 r0 = f13027.get(i);
            if (r0 != null) {
                return r0;
            }
            throw new IllegalArgumentException("Unknown Priority for value ".concat(String.valueOf(i)));
        }

        /* renamed from: ι  reason: contains not printable characters */
        public static int m14550(C1766 r2) {
            Integer num = f13028.get(r2);
            if (num != null) {
                return num.intValue();
            }
            throw new IllegalStateException("PriorityMapping is missing known Priority value ".concat(String.valueOf(r2)));
        }

        static {
            EnumMap<C1766, Integer> enumMap = new EnumMap<>(C1766.class);
            f13028 = enumMap;
            enumMap.put(C1766.DEFAULT, 0);
            f13028.put(C1766.VERY_LOW, 1);
            f13028.put(C1766.HIGHEST, 2);
            for (C1766 next : f13028.keySet()) {
                f13027.append(f13028.get(next).intValue(), next);
            }
        }
    }

    /* renamed from: o.Ӏ$ǃ  reason: contains not printable characters */
    public static final class C2747 {

        /* renamed from: ı  reason: contains not printable characters */
        public int f13034 = RecyclerView.UNDEFINED_DURATION;

        /* renamed from: Ɩ  reason: contains not printable characters */
        public boolean f13035 = false;

        /* renamed from: ǃ  reason: contains not printable characters */
        public int f13036 = 0;

        /* renamed from: ɩ  reason: contains not printable characters */
        public int f13037 = 0;

        /* renamed from: ɹ  reason: contains not printable characters */
        public boolean f13038 = false;

        /* renamed from: Ι  reason: contains not printable characters */
        public int f13039 = RecyclerView.UNDEFINED_DURATION;

        /* renamed from: ι  reason: contains not printable characters */
        public int f13040 = 0;

        /* renamed from: І  reason: contains not printable characters */
        public int f13041 = 0;

        /* renamed from: ι  reason: contains not printable characters */
        public final void m14566(int i, int i2) {
            this.f13039 = i;
            this.f13034 = i2;
            this.f13038 = true;
            if (this.f13035) {
                if (i2 != Integer.MIN_VALUE) {
                    this.f13036 = i2;
                }
                if (i != Integer.MIN_VALUE) {
                    this.f13040 = i;
                    return;
                }
                return;
            }
            if (i != Integer.MIN_VALUE) {
                this.f13036 = i;
            }
            if (i2 != Integer.MIN_VALUE) {
                this.f13040 = i2;
            }
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final void m14565(int i, int i2) {
            this.f13038 = false;
            if (i != Integer.MIN_VALUE) {
                this.f13037 = i;
                this.f13036 = i;
            }
            if (i2 != Integer.MIN_VALUE) {
                this.f13041 = i2;
                this.f13040 = i2;
            }
        }
    }

    /* renamed from: o.Ӏ$ɩ  reason: contains not printable characters */
    public static final class C2748 {

        /* renamed from: ı  reason: contains not printable characters */
        public final String f13042;

        /* renamed from: ǃ  reason: contains not printable characters */
        public final String f13043;

        /* renamed from: ɩ  reason: contains not printable characters */
        public final String f13044;

        /* renamed from: Ι  reason: contains not printable characters */
        public final int f13045;

        /* renamed from: ι  reason: contains not printable characters */
        public final List<List<byte[]>> f13046;

        /* renamed from: Ӏ  reason: contains not printable characters */
        public final String f13047;

        public C2748(String str, String str2, String str3, List<List<byte[]>> list) {
            if (str != null) {
                this.f13042 = str;
                if (str2 != null) {
                    this.f13043 = str2;
                    if (str3 != null) {
                        this.f13044 = str3;
                        if (list != null) {
                            this.f13046 = list;
                            this.f13045 = 0;
                            StringBuilder sb = new StringBuilder(this.f13042);
                            sb.append("-");
                            sb.append(this.f13043);
                            sb.append("-");
                            sb.append(this.f13044);
                            this.f13047 = sb.toString();
                            return;
                        }
                        throw new NullPointerException();
                    }
                    throw new NullPointerException();
                }
                throw new NullPointerException();
            }
            throw new NullPointerException();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder("FontRequest {mProviderAuthority: ");
            sb2.append(this.f13042);
            sb2.append(", mProviderPackage: ");
            sb2.append(this.f13043);
            sb2.append(", mQuery: ");
            sb2.append(this.f13044);
            sb2.append(", mCertificates:");
            sb.append(sb2.toString());
            for (int i = 0; i < this.f13046.size(); i++) {
                sb.append(" [");
                List list = this.f13046.get(i);
                for (int i2 = 0; i2 < list.size(); i2++) {
                    sb.append(" \"");
                    sb.append(Base64.encodeToString((byte[]) list.get(i2), 0));
                    sb.append("\"");
                }
                sb.append(" ]");
            }
            sb.append("}");
            StringBuilder sb3 = new StringBuilder("mCertificatesArray: ");
            sb3.append(this.f13045);
            sb.append(sb3.toString());
            return sb.toString();
        }

        public C2748() {
        }

        /* renamed from: ı  reason: contains not printable characters */
        public static int m14567(float f, int i, int i2) {
            float f2;
            float f3;
            float f4;
            float f5;
            float f6;
            float f7;
            float f8;
            float f9;
            float f10;
            float f11;
            int i3 = i;
            int i4 = i2;
            if (i3 == i4) {
                return i3;
            }
            float f12 = ((float) (i3 >>> 24)) / 255.0f;
            float f13 = ((float) ((i3 >> 16) & 255)) / 255.0f;
            float f14 = ((float) ((i3 >> 8) & 255)) / 255.0f;
            float f15 = ((float) (i3 & 255)) / 255.0f;
            float f16 = ((float) (i4 >>> 24)) / 255.0f;
            float f17 = ((float) ((i4 >> 16) & 255)) / 255.0f;
            float f18 = ((float) ((i4 >> 8) & 255)) / 255.0f;
            float f19 = ((float) (i4 & 255)) / 255.0f;
            if (f13 <= 0.04045f) {
                f2 = f13 / 12.92f;
            } else {
                f2 = (float) Math.pow((double) ((f13 + 0.055f) / 1.055f), 2.4000000953674316d);
            }
            if (f14 <= 0.04045f) {
                f3 = f14 / 12.92f;
            } else {
                f3 = (float) Math.pow((double) ((f14 + 0.055f) / 1.055f), 2.4000000953674316d);
            }
            if (f15 <= 0.04045f) {
                f5 = f15 / 12.92f;
                f4 = 0.055f;
            } else {
                f4 = 0.055f;
                f5 = (float) Math.pow((double) ((f15 + 0.055f) / 1.055f), 2.4000000953674316d);
            }
            if (f17 <= 0.04045f) {
                f6 = f17 / 12.92f;
            } else {
                f6 = (float) Math.pow((double) ((f17 + f4) / 1.055f), 2.4000000953674316d);
            }
            if (f18 <= 0.04045f) {
                f7 = f18 / 12.92f;
            } else {
                f7 = (float) Math.pow((double) ((f18 + f4) / 1.055f), 2.4000000953674316d);
            }
            if (f19 <= 0.04045f) {
                f8 = f19 / 12.92f;
            } else {
                f8 = (float) Math.pow((double) ((f19 + f4) / 1.055f), 2.4000000953674316d);
            }
            float f20 = f2 + (f * (f6 - f2));
            float f21 = f3 + (f * (f7 - f3));
            float f22 = f5 + ((f8 - f5) * f);
            float f23 = (f12 + (f * (f16 - f12))) * 255.0f;
            if (f20 <= 0.0031308f) {
                f9 = f20 * 12.92f;
            } else {
                f9 = (float) ((Math.pow((double) f20, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
            }
            float f24 = f9 * 255.0f;
            if (f21 <= 0.0031308f) {
                f10 = f21 * 12.92f;
            } else {
                f10 = (float) ((Math.pow((double) f21, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
            }
            float f25 = f10 * 255.0f;
            if (f22 <= 0.0031308f) {
                f11 = f22 * 12.92f;
            } else {
                f11 = (float) ((Math.pow((double) f22, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
            }
            return Math.round(f11 * 255.0f) | (Math.round(f23) << 24) | (Math.round(f24) << 16) | (Math.round(f25) << 8);
        }
    }

    /* renamed from: o.Ӏ$If  reason: case insensitive filesystem */
    public static final class C3656If implements TextWatcher {

        /* renamed from: ǃ  reason: contains not printable characters */
        private ArrayList<String> f12776 = new ArrayList<>();

        /* renamed from: Ι  reason: contains not printable characters */
        private boolean f12777;

        /* renamed from: ι  reason: contains not printable characters */
        private boolean f12778;

        public final String toString() {
            StringBuilder sb = new StringBuilder("\n*** Metrics ***\nmeasures: 0\nadditionalMeasures: 0\nresolutions passes: 0\ntable increases: 0\nmaxTableSize: 0\nmaxVariables: 0\nmaxRows: 0\n\nminimize: 0");
            sb.append("\nminimizeGoal: 0\nconstraints: 0\nsimpleconstraints: 0\noptimize: 0\niterations: 0\npivots: 0\nbfs: 0\nvariables: 0\nerrors: ");
            sb.append(0);
            sb.append("\nslackvariables: 0\nextravariables: 0\nfullySolved: 0\ngraphOptimizer: 0\nresolvedWidgets: 0\noldresolvedWidgets: 0\nnonresolvedWidgets: 0");
            sb.append("\ncenterConnectionResolved: 0\nmatchConnectionResolved: 0\nchainConnectionResolved: 0\nbarrierConnectionResolved: 0");
            sb.append("\nproblematicsLayouts: ");
            sb.append(this.f12776);
            sb.append("\n");
            return sb.toString();
        }

        /* JADX WARNING: type inference failed for: r3v3, types: [java.util.List, java.lang.Object, java.lang.String] */
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            boolean z;
            if (!this.f12778 && !this.f12777 && i2 > 0) {
                int i4 = i;
                while (true) {
                    if (i4 >= i + i2) {
                        z = false;
                        break;
                    } else if (!PhoneNumberUtils.isNonSeparator(charSequence.charAt(i4))) {
                        z = true;
                        break;
                    } else {
                        i4++;
                    }
                }
                if (z) {
                    this.f12777 = true;
                    ? r3 = 0;
                    r3.clear();
                    if (!r3.equals(r3)) {
                        bU.m1728(r3);
                    }
                }
            }
        }

        /* JADX WARNING: type inference failed for: r3v3, types: [java.util.List, java.lang.Object, java.lang.String] */
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            boolean z;
            if (!this.f12778 && !this.f12777 && i3 > 0) {
                int i4 = i;
                while (true) {
                    if (i4 >= i + i3) {
                        z = false;
                        break;
                    } else if (!PhoneNumberUtils.isNonSeparator(charSequence.charAt(i4))) {
                        z = true;
                        break;
                    } else {
                        i4++;
                    }
                }
                if (z) {
                    this.f12777 = true;
                    ? r3 = 0;
                    r3.clear();
                    if (!r3.equals(r3)) {
                        bU.m1728(r3);
                    }
                }
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: java.lang.String} */
        /* JADX WARNING: type inference failed for: r5v0, types: [java.util.List, java.lang.Object, java.lang.String] */
        /* JADX WARNING: type inference failed for: r5v13 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final synchronized void afterTextChanged(android.text.Editable r14) {
            /*
                r13 = this;
                monitor-enter(r13)
                boolean r0 = r13.f12777     // Catch:{ all -> 0x0121 }
                r1 = 1
                r2 = 0
                if (r0 == 0) goto L_0x0013
                int r14 = r14.length()     // Catch:{ all -> 0x0121 }
                if (r14 == 0) goto L_0x000e
                goto L_0x000f
            L_0x000e:
                r1 = 0
            L_0x000f:
                r13.f12777 = r1     // Catch:{ all -> 0x0121 }
                monitor-exit(r13)
                return
            L_0x0013:
                boolean r0 = r13.f12778     // Catch:{ all -> 0x0121 }
                if (r0 == 0) goto L_0x0019
                monitor-exit(r13)
                return
            L_0x0019:
                int r0 = android.text.Selection.getSelectionEnd(r14)     // Catch:{ all -> 0x0121 }
                int r3 = r14.length()     // Catch:{ all -> 0x0121 }
                if (r0 != r3) goto L_0x0025
                r3 = 1
                goto L_0x0026
            L_0x0025:
                r3 = 0
            L_0x0026:
                java.lang.String r4 = ""
                r5 = 0
                r5.clear()     // Catch:{ all -> 0x0121 }
                boolean r6 = r5.equals(r5)     // Catch:{ all -> 0x0121 }
                if (r6 != 0) goto L_0x0035
                o.bU.m1728(r5)     // Catch:{ all -> 0x0121 }
            L_0x0035:
                java.lang.String r6 = "+0"
                int r7 = r14.length()     // Catch:{ all -> 0x0121 }
                r8 = 48
                if (r7 <= 0) goto L_0x0055
                char r7 = r14.charAt(r2)     // Catch:{ all -> 0x0121 }
                if (r7 == r8) goto L_0x0055
                java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0121 }
                r7.<init>()     // Catch:{ all -> 0x0121 }
                r7.append(r6)     // Catch:{ all -> 0x0121 }
                r7.append(r14)     // Catch:{ all -> 0x0121 }
                java.lang.String r6 = r7.toString()     // Catch:{ all -> 0x0121 }
                goto L_0x0056
            L_0x0055:
                r6 = r14
            L_0x0056:
                int r7 = r6.length()     // Catch:{ all -> 0x0121 }
                r10 = r4
                r4 = 0
                r9 = 0
            L_0x005d:
                if (r4 >= r7) goto L_0x0073
                char r11 = r6.charAt(r4)     // Catch:{ all -> 0x0121 }
                boolean r12 = android.telephony.PhoneNumberUtils.isNonSeparator(r11)     // Catch:{ all -> 0x0121 }
                if (r12 == 0) goto L_0x0070
                if (r9 == 0) goto L_0x006f
                o.bU.m1726(r9)     // Catch:{ all -> 0x0121 }
                r10 = r5
            L_0x006f:
                r9 = r11
            L_0x0070:
                int r4 = r4 + 1
                goto L_0x005d
            L_0x0073:
                if (r9 == 0) goto L_0x0079
                o.bU.m1726(r9)     // Catch:{ all -> 0x0121 }
                goto L_0x007a
            L_0x0079:
                r5 = r10
            L_0x007a:
                java.lang.String r4 = r5.trim()     // Catch:{ all -> 0x0121 }
                int r5 = r6.length()     // Catch:{ all -> 0x0121 }
                if (r5 == 0) goto L_0x008a
                char r5 = r6.charAt(r2)     // Catch:{ all -> 0x0121 }
                if (r5 == r8) goto L_0x00a6
            L_0x008a:
                int r5 = r4.length()     // Catch:{ all -> 0x0121 }
                r6 = 2
                if (r5 <= r6) goto L_0x00a4
                char r5 = r4.charAt(r6)     // Catch:{ all -> 0x0121 }
                r7 = 32
                if (r5 != r7) goto L_0x009f
                r5 = 3
                java.lang.String r4 = r4.substring(r5)     // Catch:{ all -> 0x0121 }
                goto L_0x00a6
            L_0x009f:
                java.lang.String r4 = r4.substring(r6)     // Catch:{ all -> 0x0121 }
                goto L_0x00a6
            L_0x00a4:
                java.lang.String r4 = ""
            L_0x00a6:
                boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0121 }
                if (r5 == 0) goto L_0x00ae
                java.lang.String r4 = ""
            L_0x00ae:
                r6 = r4
                java.lang.String r4 = r14.toString()     // Catch:{ all -> 0x0121 }
                boolean r4 = r6.equals(r4)     // Catch:{ all -> 0x0121 }
                if (r4 == 0) goto L_0x00ba
                goto L_0x00f5
            L_0x00ba:
                if (r3 == 0) goto L_0x00c1
                int r0 = r6.length()     // Catch:{ all -> 0x0121 }
                goto L_0x00f5
            L_0x00c1:
                r4 = 0
                r5 = 0
            L_0x00c3:
                int r7 = r14.length()     // Catch:{ all -> 0x0121 }
                if (r4 >= r7) goto L_0x00da
                if (r4 >= r0) goto L_0x00da
                char r7 = r14.charAt(r4)     // Catch:{ all -> 0x0121 }
                boolean r7 = android.telephony.PhoneNumberUtils.isNonSeparator(r7)     // Catch:{ all -> 0x0121 }
                if (r7 == 0) goto L_0x00d7
                int r5 = r5 + 1
            L_0x00d7:
                int r4 = r4 + 1
                goto L_0x00c3
            L_0x00da:
                r0 = 0
                r4 = 0
            L_0x00dc:
                int r7 = r6.length()     // Catch:{ all -> 0x0121 }
                if (r0 >= r7) goto L_0x00f4
                if (r4 != r5) goto L_0x00e5
                goto L_0x00f5
            L_0x00e5:
                char r7 = r6.charAt(r0)     // Catch:{ all -> 0x0121 }
                boolean r7 = android.telephony.PhoneNumberUtils.isNonSeparator(r7)     // Catch:{ all -> 0x0121 }
                if (r7 == 0) goto L_0x00f1
                int r4 = r4 + 1
            L_0x00f1:
                int r0 = r0 + 1
                goto L_0x00dc
            L_0x00f4:
                r0 = 0
            L_0x00f5:
                if (r3 != 0) goto L_0x0108
            L_0x00f7:
                int r3 = r0 + -1
                if (r3 <= 0) goto L_0x0108
                char r3 = r6.charAt(r3)     // Catch:{ all -> 0x0121 }
                boolean r3 = android.telephony.PhoneNumberUtils.isNonSeparator(r3)     // Catch:{ all -> 0x0121 }
                if (r3 != 0) goto L_0x0108
                int r0 = r0 + -1
                goto L_0x00f7
            L_0x0108:
                r13.f12778 = r1     // Catch:{ Exception -> 0x011f }
                r4 = 0
                int r5 = r14.length()     // Catch:{ Exception -> 0x011f }
                r7 = 0
                int r8 = r6.length()     // Catch:{ Exception -> 0x011f }
                r3 = r14
                r3.replace(r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x011f }
                r13.f12778 = r2     // Catch:{ Exception -> 0x011f }
                android.text.Selection.setSelection(r14, r0)     // Catch:{ Exception -> 0x011f }
                monitor-exit(r13)
                return
            L_0x011f:
                monitor-exit(r13)
                return
            L_0x0121:
                r14 = move-exception
                monitor-exit(r13)
                throw r14
            */
            throw new UnsupportedOperationException("Method not decompiled: o.C2745.C3656If.afterTextChanged(android.text.Editable):void");
        }
    }

    /* renamed from: o.Ӏ$Ι  reason: contains not printable characters */
    public static final class C2749 {

        /* renamed from: ı  reason: contains not printable characters */
        public final HashMap<String, C1688> f13048 = new HashMap<>();

        /* renamed from: ɩ  reason: contains not printable characters */
        public final ArrayList<C1277> f13049 = new ArrayList<>();

        /* renamed from: Ι  reason: contains not printable characters */
        public final void m14575(C1277 r3) {
            if (!this.f13049.contains(r3)) {
                synchronized (this.f13049) {
                    this.f13049.add(r3);
                }
                r3.mAdded = true;
                return;
            }
            throw new IllegalStateException("Fragment already added: ".concat(String.valueOf(r3)));
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final void m14574(int i) {
            Iterator<C1277> it = this.f13049.iterator();
            while (it.hasNext()) {
                C1688 r1 = this.f13048.get(it.next().mWho);
                if (r1 != null) {
                    r1.f8761 = i;
                }
            }
            for (C1688 next : this.f13048.values()) {
                if (next != null) {
                    next.f8761 = i;
                }
            }
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final void m14577(C1688 r6) {
            C1277 r2;
            C1277 r62 = r6.f8760;
            Iterator<C1688> it = this.f13048.values().iterator();
            while (true) {
                r2 = null;
                if (!it.hasNext()) {
                    break;
                }
                C1688 next = it.next();
                if (next != null) {
                    C1277 r1 = next.f8760;
                    if (r62.mWho.equals(r1.mTargetWho)) {
                        r1.mTarget = r62;
                        r1.mTargetWho = null;
                    }
                }
            }
            this.f13048.put(r62.mWho, (Object) null);
            if (r62.mTargetWho != null) {
                C1688 r0 = this.f13048.get(r62.mTargetWho);
                if (r0 != null) {
                    r2 = r0.f8760;
                }
                r62.mTarget = r2;
            }
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final ArrayList<C1674> m14576() {
            ArrayList<C1674> arrayList = new ArrayList<>(this.f13048.size());
            for (C1688 next : this.f13048.values()) {
                if (next != null) {
                    C1674 r3 = new C1674(next.f8760);
                    if (next.f8760.mState < 0 || r3.f8690 != null) {
                        r3.f8690 = next.f8760.mSavedFragmentState;
                    } else {
                        r3.f8690 = next.m9596();
                        if (next.f8760.mTargetWho != null) {
                            if (r3.f8690 == null) {
                                r3.f8690 = new Bundle();
                            }
                            r3.f8690.putString("android:target_state", next.f8760.mTargetWho);
                            if (next.f8760.mTargetRequestCode != 0) {
                                r3.f8690.putInt("android:target_req_state", next.f8760.mTargetRequestCode);
                            }
                        }
                    }
                    arrayList.add(r3);
                    C1550.m9081(2);
                }
            }
            return arrayList;
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final ArrayList<String> m14568() {
            synchronized (this.f13049) {
                if (this.f13049.isEmpty()) {
                    return null;
                }
                ArrayList<String> arrayList = new ArrayList<>(this.f13049.size());
                Iterator<C1277> it = this.f13049.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().mWho);
                    C1550.m9081(2);
                }
                return arrayList;
            }
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final List<C1277> m14573() {
            ArrayList arrayList;
            if (this.f13049.isEmpty()) {
                return Collections.emptyList();
            }
            synchronized (this.f13049) {
                arrayList = new ArrayList(this.f13049);
            }
            return arrayList;
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final List<C1277> m14572() {
            ArrayList arrayList = new ArrayList();
            for (C1688 next : this.f13048.values()) {
                if (next != null) {
                    arrayList.add(next.f8760);
                } else {
                    arrayList.add((Object) null);
                }
            }
            return arrayList;
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final C1277 m14569(String str) {
            C1277 findFragmentByWho;
            for (C1688 next : this.f13048.values()) {
                if (next != null && (findFragmentByWho = next.f8760.findFragmentByWho(str)) != null) {
                    return findFragmentByWho;
                }
            }
            return null;
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final C1277 m14570(C1277 r5) {
            ViewGroup viewGroup = r5.mContainer;
            View view = r5.mView;
            if (!(viewGroup == null || view == null)) {
                for (int indexOf = this.f13049.indexOf(r5) - 1; indexOf >= 0; indexOf--) {
                    C1277 r1 = this.f13049.get(indexOf);
                    if (r1.mContainer == viewGroup && r1.mView != null) {
                        return r1;
                    }
                }
            }
            return null;
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final void m14571(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("    ");
            String obj = sb.toString();
            if (!this.f13048.isEmpty()) {
                printWriter.print(str);
                printWriter.print("Active Fragments:");
                for (C1688 next : this.f13048.values()) {
                    printWriter.print(str);
                    if (next != null) {
                        C1277 r2 = next.f8760;
                        printWriter.println(r2);
                        r2.dump(obj, fileDescriptor, printWriter, strArr);
                    } else {
                        printWriter.println("null");
                    }
                }
            }
            int size = this.f13049.size();
            if (size > 0) {
                printWriter.print(str);
                printWriter.println("Added Fragments:");
                for (int i = 0; i < size; i++) {
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i);
                    printWriter.print(": ");
                    printWriter.println(this.f13049.get(i).toString());
                }
            }
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m14548(long j, double d, double d2) {
        float f = ((float) (j - 946728000000L)) / 8.64E7f;
        float f2 = (0.01720197f * f) + 6.24006f;
        double d3 = (double) f2;
        double sin = (Math.sin(d3) * 0.03341960161924362d) + d3 + (Math.sin((double) (2.0f * f2)) * 3.4906598739326E-4d) + (Math.sin((double) (f2 * 3.0f)) * 5.236000106378924E-6d) + 1.796593063d + 3.141592653589793d;
        double d4 = (-d2) / 360.0d;
        double round = ((double) (((float) Math.round(((double) (f - 9.0E-4f)) - d4)) + 9.0E-4f)) + d4 + (Math.sin(d3) * 0.0053d) + (Math.sin(2.0d * sin) * -0.0069d);
        double asin = Math.asin(Math.sin(sin) * Math.sin(0.4092797040939331d));
        double d5 = 0.01745329238474369d * d;
        double sin2 = (Math.sin(-0.10471975803375244d) - (Math.sin(d5) * Math.sin(asin))) / (Math.cos(d5) * Math.cos(asin));
        if (sin2 >= 1.0d) {
            this.f12771 = 1;
            this.f12772 = -1;
            this.f12773 = -1;
        } else if (sin2 <= -1.0d) {
            this.f12771 = 0;
            this.f12772 = -1;
            this.f12773 = -1;
        } else {
            double acos = (double) ((float) (Math.acos(sin2) / 6.283185307179586d));
            this.f12772 = Math.round((round + acos) * 8.64E7d) + 946728000000L;
            this.f12773 = Math.round((round - acos) * 8.64E7d) + 946728000000L;
            if (this.f12773 >= j || this.f12772 <= j) {
                this.f12771 = 1;
            } else {
                this.f12771 = 0;
            }
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static int m14504(Context context, String str) {
        int myPid = Process.myPid();
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, myPid, myUid) == -1) {
            return -1;
        }
        String r5 = C2871.m14932(str);
        if (r5 != null) {
            if (packageName == null) {
                String[] packagesForUid = context.getPackageManager().getPackagesForUid(myUid);
                if (packagesForUid == null || packagesForUid.length <= 0) {
                    return -1;
                }
                packageName = packagesForUid[0];
            }
            if (C2871.m14931(context, r5, packageName) != 0) {
                return -2;
            }
        }
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0016, code lost:
        r0 = r2.getClass().getName();
     */
    /* renamed from: ι  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m14547(java.lang.Object r2, java.lang.StringBuilder r3) {
        /*
            if (r2 != 0) goto L_0x0008
            java.lang.String r2 = "null"
            r3.append(r2)
            return
        L_0x0008:
            java.lang.Class r0 = r2.getClass()
            java.lang.String r0 = r0.getSimpleName()
            int r1 = r0.length()
            if (r1 > 0) goto L_0x002c
            java.lang.Class r0 = r2.getClass()
            java.lang.String r0 = r0.getName()
            r1 = 46
            int r1 = r0.lastIndexOf(r1)
            if (r1 <= 0) goto L_0x002c
            int r1 = r1 + 1
            java.lang.String r0 = r0.substring(r1)
        L_0x002c:
            r3.append(r0)
            r0 = 123(0x7b, float:1.72E-43)
            r3.append(r0)
            int r2 = java.lang.System.identityHashCode(r2)
            java.lang.String r2 = java.lang.Integer.toHexString(r2)
            r3.append(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C2745.m14547(java.lang.Object, java.lang.StringBuilder):void");
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static int m14500(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        StringBuilder sb = new StringBuilder("`");
        sb.append(str);
        sb.append("`");
        return cursor.getColumnIndexOrThrow(sb.toString());
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static C1282 m14507(C2383 r3, C0343 r4) {
        return new C1282(C2040.m10922(r3, r4, C2467.m12711(), C1942.f9782));
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static C1282 m14540(C2383 r3, C0343 r4) {
        return new C1282(C2040.m10922(r3, r4, 1.0f, C1942.f9782));
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static String m14501(int i, int[] iArr, String[] strArr, int[] iArr2) {
        StringBuilder sb = new StringBuilder("$");
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            if (i3 == 1 || i3 == 2) {
                sb.append('[');
                sb.append(iArr2[i2]);
                sb.append(']');
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                sb.append('.');
                if (strArr[i2] != null) {
                    sb.append(strArr[i2]);
                }
            }
        }
        return sb.toString();
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static String m14526(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str2.length() + str.length());
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            if (str2.length() > i) {
                sb.append(str2.charAt(i));
            }
        }
        return sb.toString();
    }

    /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* renamed from: ǃ  reason: contains not printable characters */
    public static <TInput, TResult, TException extends java.lang.Throwable> TResult m14506(int r1, TInput r2, o.C2360<TInput, TResult, TException> r3, o.C2436<TInput, TResult> r4) {
        /*
        L_0x0000:
            java.lang.Object r0 = r3.m12311(r2)
            java.lang.Object r2 = r4.m12537(r2, r0)
            if (r2 == 0) goto L_0x000e
            int r1 = r1 + -1
            if (r1 > 0) goto L_0x0000
        L_0x000e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C2745.m14506(int, java.lang.Object, o.З, o.и):java.lang.Object");
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static void m14503(Parcel parcel, int i, int i2) {
        if (i2 >= 65535) {
            parcel.writeInt(i | -65536);
            parcel.writeInt(i2);
            return;
        }
        parcel.writeInt(i | (i2 << 16));
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static int m14517(Parcel parcel) {
        parcel.writeInt(-45243);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static void m14531(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(dataPosition - i);
        parcel.setDataPosition(dataPosition);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static void m14546(Parcel parcel, int i, boolean z) {
        m14503(parcel, i, 4);
        parcel.writeInt(z ? 1 : 0);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static void m14543(Parcel parcel, int i, Boolean bool, boolean z) {
        if (bool != null) {
            m14503(parcel, 21, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static void m14532(Parcel parcel, int i, int i2) {
        m14503(parcel, i, 4);
        parcel.writeInt(i2);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static void m14508(Parcel parcel, int i, long j) {
        m14503(parcel, i, 8);
        parcel.writeLong(j);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static void m14533(Parcel parcel, int i, Long l, boolean z) {
        if (l != null) {
            m14503(parcel, i, 8);
            parcel.writeLong(l.longValue());
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static void m14510(Parcel parcel, int i, Double d, boolean z) {
        if (d != null) {
            m14503(parcel, 8, 8);
            parcel.writeDouble(d.doubleValue());
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static void m14545(Parcel parcel, int i, String str, boolean z) {
        if (str != null) {
            parcel.writeInt(i | -65536);
            parcel.writeInt(0);
            int dataPosition = parcel.dataPosition();
            parcel.writeString(str);
            int dataPosition2 = parcel.dataPosition();
            parcel.setDataPosition(dataPosition - 4);
            parcel.writeInt(dataPosition2 - dataPosition);
            parcel.setDataPosition(dataPosition2);
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static void m14509(Parcel parcel, int i, IBinder iBinder, boolean z) {
        if (iBinder != null) {
            parcel.writeInt(i | -65536);
            parcel.writeInt(0);
            int dataPosition = parcel.dataPosition();
            parcel.writeStrongBinder(iBinder);
            int dataPosition2 = parcel.dataPosition();
            parcel.setDataPosition(dataPosition - 4);
            parcel.writeInt(dataPosition2 - dataPosition);
            parcel.setDataPosition(dataPosition2);
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static void m14542(Parcel parcel, int i, Parcelable parcelable, int i2, boolean z) {
        if (parcelable != null) {
            parcel.writeInt(i | -65536);
            parcel.writeInt(0);
            int dataPosition = parcel.dataPosition();
            parcelable.writeToParcel(parcel, i2);
            int dataPosition2 = parcel.dataPosition();
            parcel.setDataPosition(dataPosition - 4);
            parcel.writeInt(dataPosition2 - dataPosition);
            parcel.setDataPosition(dataPosition2);
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static void m14541(Parcel parcel, int i, Bundle bundle, boolean z) {
        if (bundle != null) {
            parcel.writeInt(i | -65536);
            parcel.writeInt(0);
            int dataPosition = parcel.dataPosition();
            parcel.writeBundle(bundle);
            int dataPosition2 = parcel.dataPosition();
            parcel.setDataPosition(dataPosition - 4);
            parcel.writeInt(dataPosition2 - dataPosition);
            parcel.setDataPosition(dataPosition2);
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static void m14521(Parcel parcel, int i, List<String> list, boolean z) {
        if (list != null) {
            parcel.writeInt(i | -65536);
            parcel.writeInt(0);
            int dataPosition = parcel.dataPosition();
            parcel.writeStringList(list);
            int dataPosition2 = parcel.dataPosition();
            parcel.setDataPosition(dataPosition - 4);
            parcel.writeInt(dataPosition2 - dataPosition);
            parcel.setDataPosition(dataPosition2);
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static <T extends Parcelable> void m14534(Parcel parcel, int i, T[] tArr, int i2, boolean z) {
        if (tArr != null) {
            parcel.writeInt(i | -65536);
            parcel.writeInt(0);
            int dataPosition = parcel.dataPosition();
            parcel.writeInt(r0);
            for (T t : tArr) {
                if (t == null) {
                    parcel.writeInt(0);
                } else {
                    m14512(parcel, t, i2);
                }
            }
            int dataPosition2 = parcel.dataPosition();
            parcel.setDataPosition(dataPosition - 4);
            parcel.writeInt(dataPosition2 - dataPosition);
            parcel.setDataPosition(dataPosition2);
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static <T extends Parcelable> void m14511(Parcel parcel, int i, List<T> list, boolean z) {
        if (list != null) {
            parcel.writeInt(i | -65536);
            parcel.writeInt(0);
            int dataPosition = parcel.dataPosition();
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                Parcelable parcelable = (Parcelable) list.get(i2);
                if (parcelable == null) {
                    parcel.writeInt(0);
                } else {
                    m14512(parcel, parcelable, 0);
                }
            }
            int dataPosition2 = parcel.dataPosition();
            parcel.setDataPosition(dataPosition - 4);
            parcel.writeInt(dataPosition2 - dataPosition);
            parcel.setDataPosition(dataPosition2);
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private static <T extends Parcelable> void m14512(Parcel parcel, T t, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        t.writeToParcel(parcel, i);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static <T> boolean m14536(T[] tArr, T t) {
        int length = tArr != null ? tArr.length : 0;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            T t2 = tArr[i];
            if (t2 == t || (t2 != null && t2.equals(t))) {
                break;
            }
            i++;
        }
        return i >= 0;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static <T> T[] m14523(T[]... tArr) {
        int i = 0;
        for (int i2 = 0; i2 < 2; i2++) {
            i += tArr[i2].length;
        }
        T[] copyOf = Arrays.copyOf(tArr[0], i);
        int length = tArr[0].length;
        for (int i3 = 1; i3 < 2; i3++) {
            T[] tArr2 = tArr[1];
            System.arraycopy(tArr2, 0, copyOf, length, tArr2.length);
        }
        return copyOf;
    }

    @Deprecated
    /* renamed from: Ι  reason: contains not printable characters */
    public static <T> List<T> m14527(T t) {
        return Collections.singletonList(t);
    }

    @Deprecated
    /* renamed from: ι  reason: contains not printable characters */
    public static <T> List<T> m14539(T... tArr) {
        return Collections.unmodifiableList(Arrays.asList(tArr));
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static float m14524(float f, float f2, float f3, float f4) {
        double d = (double) (0.0f - f);
        double d2 = (double) (0.0f - f2);
        float hypot = (float) Math.hypot(d, d2);
        double d3 = (double) (f3 - f);
        float hypot2 = (float) Math.hypot(d3, d2);
        double d4 = (double) (f4 - f2);
        float hypot3 = (float) Math.hypot(d3, d4);
        float hypot4 = (float) Math.hypot(d, d4);
        if (hypot > hypot2 && hypot > hypot3 && hypot > hypot4) {
            return hypot;
        }
        if (hypot2 <= hypot3 || hypot2 <= hypot4) {
            return hypot3 > hypot4 ? hypot3 : hypot4;
        }
        return hypot2;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static C2197 m14530(int i) {
        if (i != 0) {
            return i != 1 ? new C0623() : new C0567();
        }
        return new C0623();
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static void m14513(View view, float f) {
        Drawable background = view.getBackground();
        if (background instanceof C0671) {
            C0671 r1 = (C0671) background;
            if (r1.f4785.f4803 != f) {
                r1.f4785.f4803 = f;
                r1.m5521();
            }
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static void m14535(View view) {
        Drawable background = view.getBackground();
        if (background instanceof C0671) {
            C0671 r0 = (C0671) background;
            if (r0.f4785.f4812 != null && r0.f4785.f4812.f11871) {
                float r2 = C3198.m16137(view);
                if (r0.f4785.f4801 != r2) {
                    r0.f4785.f4801 = r2;
                    r0.m5521();
                }
            }
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static void m14514(View view, C0671 r2) {
        if (r2.f4785.f4812 != null && r2.f4785.f4812.f11871) {
            float r1 = C3198.m16137(view);
            if (r2.f4785.f4801 != r1) {
                r2.f4785.f4801 = r1;
                r2.m5521();
            }
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static String m14519(String str, Object... objArr) {
        String valueOf = String.valueOf(str);
        for (int i = 0; i <= 0; i++) {
            objArr[0] = m14538(objArr[0]);
        }
        StringBuilder sb = new StringBuilder(valueOf.length() + 16);
        int i2 = 0;
        int i3 = 0;
        while (i2 <= 0) {
            int indexOf = valueOf.indexOf("%s", 0);
            if (indexOf == -1) {
                break;
            }
            sb.append(valueOf, 0, indexOf);
            i2++;
            sb.append(objArr[0]);
            i3 = indexOf + 2;
        }
        sb.append(valueOf, i3, valueOf.length());
        if (i2 <= 0) {
            sb.append(" [");
            sb.append(objArr[0]);
            sb.append(']');
        }
        return sb.toString();
    }

    /* renamed from: ι  reason: contains not printable characters */
    private static String m14538(Object obj) {
        try {
            return String.valueOf(obj);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append(obj.getClass().getName());
            sb.append('@');
            sb.append(Integer.toHexString(System.identityHashCode(obj)));
            String obj2 = sb.toString();
            Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, "Exception during lenientFormat for ".concat(String.valueOf(obj2)), e);
            StringBuilder sb2 = new StringBuilder("<");
            sb2.append(obj2);
            sb2.append(" threw ");
            sb2.append(e.getClass().getName());
            sb2.append(">");
            return sb2.toString();
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static String m14518(String str) {
        try {
            Object invoke = Class.forName("android.os.SystemProperties").getDeclaredMethod("get", new Class[]{String.class}).invoke((Object) null, new Object[]{str});
            if (invoke != null && String.class.isAssignableFrom(invoke.getClass())) {
                return (String) invoke;
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static List<C2062> m14520(List<C1384> list) {
        if (list == null || list.isEmpty()) {
            return C0719.m5842();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<C1384> it = list.iterator();
        while (it.hasNext()) {
            C1384 next = it.next();
            C1673 r2 = (next == null || TextUtils.isEmpty(next.m8541())) ? null : new C1673(next.m8540(), next.m8539(), next.m8542(), next.m8541());
            if (r2 != null) {
                arrayList.add(r2);
            }
        }
        return arrayList;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static C1522 m14529(C1970 r2, String str) {
        if (r2 == null) {
            throw new NullPointerException("null reference");
        } else if (C2229.class.isAssignableFrom(r2.getClass())) {
            return C2229.m11674((C2229) r2, str);
        } else {
            if (C2010.class.isAssignableFrom(r2.getClass())) {
                return C2010.m10814((C2010) r2, str);
            }
            if (C2388.class.isAssignableFrom(r2.getClass())) {
                return C2388.m12399((C2388) r2, str);
            }
            if (C2086.class.isAssignableFrom(r2.getClass())) {
                return C2086.m11077((C2086) r2, str);
            }
            if (C2316.class.isAssignableFrom(r2.getClass())) {
                return C2316.m12084((C2316) r2, str);
            }
            if (C1630.class.isAssignableFrom(r2.getClass())) {
                return C1630.m9393((C1630) r2, str);
            }
            throw new IllegalArgumentException("Unsupported credential type.");
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static Status m14525(String str) {
        if (TextUtils.isEmpty(str)) {
            return new Status(17499);
        }
        String[] split = str.split(":", 2);
        split[0] = split[0].trim();
        if (split.length > 1 && split[1] != null) {
            split[1] = split[1].trim();
        }
        List asList = Arrays.asList(split);
        if (asList.size() > 1) {
            return m14505((String) asList.get(0), (String) asList.get(1));
        }
        return m14505((String) asList.get(0), (String) null);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: ǃ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.android.gms.common.api.Status m14505(java.lang.String r4, java.lang.String r5) {
        /*
            int r0 = r4.hashCode()
            r1 = 1
            switch(r0) {
                case -2130504259: goto L_0x031e;
                case -2065866930: goto L_0x0313;
                case -2014808264: goto L_0x0308;
                case -2005236790: goto L_0x02fd;
                case -2001169389: goto L_0x02f3;
                case -1944433728: goto L_0x02e8;
                case -1800638118: goto L_0x02dd;
                case -1774756919: goto L_0x02d2;
                case -1587614300: goto L_0x02c7;
                case -1583894766: goto L_0x02bb;
                case -1458751677: goto L_0x02af;
                case -1421414571: goto L_0x02a3;
                case -1345867105: goto L_0x0297;
                case -1340100504: goto L_0x028b;
                case -1232010689: goto L_0x027f;
                case -1202691903: goto L_0x0273;
                case -1112393964: goto L_0x0268;
                case -1063710844: goto L_0x025c;
                case -974503964: goto L_0x0250;
                case -863830559: goto L_0x0244;
                case -828507413: goto L_0x0239;
                case -749743758: goto L_0x022d;
                case -736207500: goto L_0x0221;
                case -646022241: goto L_0x0215;
                case -595928767: goto L_0x0209;
                case -333672188: goto L_0x01fd;
                case -294485423: goto L_0x01f1;
                case -217128228: goto L_0x01e5;
                case -122667194: goto L_0x01d9;
                case -75433118: goto L_0x01cd;
                case -40686718: goto L_0x01c1;
                case 15352275: goto L_0x01b5;
                case 210308040: goto L_0x01a9;
                case 269327773: goto L_0x019d;
                case 278802867: goto L_0x0191;
                case 408411681: goto L_0x0185;
                case 423563023: goto L_0x0179;
                case 483847807: goto L_0x016d;
                case 491979549: goto L_0x0161;
                case 492072102: goto L_0x0155;
                case 542728406: goto L_0x0149;
                case 582457886: goto L_0x013d;
                case 605031096: goto L_0x0131;
                case 745638750: goto L_0x0125;
                case 786916712: goto L_0x0119;
                case 799258561: goto L_0x010d;
                case 819646646: goto L_0x0102;
                case 844240628: goto L_0x00f6;
                case 886186878: goto L_0x00ea;
                case 895302372: goto L_0x00de;
                case 922685102: goto L_0x00d2;
                case 989000548: goto L_0x00c6;
                case 1034932393: goto L_0x00bb;
                case 1072360691: goto L_0x00b0;
                case 1094975491: goto L_0x00a4;
                case 1107081238: goto L_0x0098;
                case 1141576252: goto L_0x008c;
                case 1199811910: goto L_0x0080;
                case 1226505451: goto L_0x0074;
                case 1388786705: goto L_0x0069;
                case 1433767024: goto L_0x005e;
                case 1442968770: goto L_0x0052;
                case 1494923453: goto L_0x0046;
                case 1497901284: goto L_0x003a;
                case 1803454477: goto L_0x002e;
                case 1898790704: goto L_0x0022;
                case 2063209097: goto L_0x0016;
                case 2082564316: goto L_0x000a;
                default: goto L_0x0008;
            }
        L_0x0008:
            goto L_0x0329
        L_0x000a:
            java.lang.String r0 = "UNSUPPORTED_TENANT_OPERATION"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 49
            goto L_0x032a
        L_0x0016:
            java.lang.String r0 = "EMAIL_CHANGE_NEEDS_VERIFICATION"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 63
            goto L_0x032a
        L_0x0022:
            java.lang.String r0 = "MISSING_SESSION_INFO"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 35
            goto L_0x032a
        L_0x002e:
            java.lang.String r0 = "MISSING_CONTINUE_URI"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 44
            goto L_0x032a
        L_0x003a:
            java.lang.String r0 = "TOO_MANY_ATTEMPTS_TRY_LATER"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 21
            goto L_0x032a
        L_0x0046:
            java.lang.String r0 = "INVALID_APP_CREDENTIAL"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 19
            goto L_0x032a
        L_0x0052:
            java.lang.String r0 = "INVALID_PHONE_NUMBER"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 32
            goto L_0x032a
        L_0x005e:
            java.lang.String r0 = "USER_DISABLED"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 5
            goto L_0x032a
        L_0x0069:
            java.lang.String r0 = "INVALID_IDENTIFIER"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 6
            goto L_0x032a
        L_0x0074:
            java.lang.String r0 = "FEDERATED_USER_ID_ALREADY_LINKED"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 12
            goto L_0x032a
        L_0x0080:
            java.lang.String r0 = "MISSING_CODE"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 33
            goto L_0x032a
        L_0x008c:
            java.lang.String r0 = "SESSION_EXPIRED"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 38
            goto L_0x032a
        L_0x0098:
            java.lang.String r0 = "<<Network Error>>"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 15
            goto L_0x032a
        L_0x00a4:
            java.lang.String r0 = "INVALID_PASSWORD"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 11
            goto L_0x032a
        L_0x00b0:
            java.lang.String r0 = "INVALID_CUSTOM_TOKEN"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 2
            goto L_0x032a
        L_0x00bb:
            java.lang.String r0 = "INVALID_PENDING_TOKEN"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 3
            goto L_0x032a
        L_0x00c6:
            java.lang.String r0 = "RESET_PASSWORD_EXCEED_LIMIT"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 22
            goto L_0x032a
        L_0x00d2:
            java.lang.String r0 = "INVALID_MESSAGE_PAYLOAD"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 26
            goto L_0x032a
        L_0x00de:
            java.lang.String r0 = "MISSING_CLIENT_IDENTIFIER"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 65
            goto L_0x032a
        L_0x00ea:
            java.lang.String r0 = "REQUIRES_SECOND_FACTOR_AUTH"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 53
            goto L_0x032a
        L_0x00f6:
            java.lang.String r0 = "WEB_CONTEXT_CANCELED"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 48
            goto L_0x032a
        L_0x0102:
            java.lang.String r0 = "CREDENTIAL_MISMATCH"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 1
            goto L_0x032a
        L_0x010d:
            java.lang.String r0 = "INVALID_PROVIDER_ID"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 46
            goto L_0x032a
        L_0x0119:
            java.lang.String r0 = "INVALID_VERIFICATION_PROOF"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 37
            goto L_0x032a
        L_0x0125:
            java.lang.String r0 = "INVALID_MFA_PENDING_CREDENTIAL"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 56
            goto L_0x032a
        L_0x0131:
            java.lang.String r0 = "REJECTED_CREDENTIAL"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 52
            goto L_0x032a
        L_0x013d:
            java.lang.String r0 = "UNVERIFIED_EMAIL"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 59
            goto L_0x032a
        L_0x0149:
            java.lang.String r0 = "PASSWORD_LOGIN_DISABLED"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 18
            goto L_0x032a
        L_0x0155:
            java.lang.String r0 = "WEB_STORAGE_UNSUPPORTED"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 43
            goto L_0x032a
        L_0x0161:
            java.lang.String r0 = "INVALID_ID_TOKEN"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 13
            goto L_0x032a
        L_0x016d:
            java.lang.String r0 = "EMAIL_EXISTS"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 10
            goto L_0x032a
        L_0x0179:
            java.lang.String r0 = "MISSING_MFA_PENDING_CREDENTIAL"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 54
            goto L_0x032a
        L_0x0185:
            java.lang.String r0 = "INVALID_DYNAMIC_LINK_DOMAIN"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 51
            goto L_0x032a
        L_0x0191:
            java.lang.String r0 = "MISSING_PHONE_NUMBER"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 31
            goto L_0x032a
        L_0x019d:
            java.lang.String r0 = "INVALID_SENDER"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 27
            goto L_0x032a
        L_0x01a9:
            java.lang.String r0 = "UNSUPPORTED_FIRST_FACTOR"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 62
            goto L_0x032a
        L_0x01b5:
            java.lang.String r0 = "EMAIL_NOT_FOUND"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 8
            goto L_0x032a
        L_0x01c1:
            java.lang.String r0 = "WEAK_PASSWORD"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 16
            goto L_0x032a
        L_0x01cd:
            java.lang.String r0 = "USER_NOT_FOUND"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 9
            goto L_0x032a
        L_0x01d9:
            java.lang.String r0 = "MISSING_MFA_ENROLLMENT_ID"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 55
            goto L_0x032a
        L_0x01e5:
            java.lang.String r0 = "SECOND_FACTOR_LIMIT_EXCEEDED"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 61
            goto L_0x032a
        L_0x01f1:
            java.lang.String r0 = "WEB_INTERNAL_ERROR"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 42
            goto L_0x032a
        L_0x01fd:
            java.lang.String r0 = "OPERATION_NOT_ALLOWED"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 17
            goto L_0x032a
        L_0x0209:
            java.lang.String r0 = "TIMEOUT"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 14
            goto L_0x032a
        L_0x0215:
            java.lang.String r0 = "CREDENTIAL_TOO_OLD_LOGIN_AGAIN"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 20
            goto L_0x032a
        L_0x0221:
            java.lang.String r0 = "MISSING_PASSWORD"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 30
            goto L_0x032a
        L_0x022d:
            java.lang.String r0 = "MFA_ENROLLMENT_NOT_FOUND"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 57
            goto L_0x032a
        L_0x0239:
            java.lang.String r0 = "NO_SUCH_PROVIDER"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 0
            goto L_0x032a
        L_0x0244:
            java.lang.String r0 = "INVALID_CERT_HASH"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 40
            goto L_0x032a
        L_0x0250:
            java.lang.String r0 = "MISSING_OR_INVALID_NONCE"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 66
            goto L_0x032a
        L_0x025c:
            java.lang.String r0 = "ADMIN_ONLY_OPERATION"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 58
            goto L_0x032a
        L_0x0268:
            java.lang.String r0 = "INVALID_EMAIL"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 7
            goto L_0x032a
        L_0x0273:
            java.lang.String r0 = "SECOND_FACTOR_EXISTS"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 60
            goto L_0x032a
        L_0x027f:
            java.lang.String r0 = "INVALID_SESSION_INFO"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 36
            goto L_0x032a
        L_0x028b:
            java.lang.String r0 = "INVALID_TENANT_ID"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 50
            goto L_0x032a
        L_0x0297:
            java.lang.String r0 = "TOKEN_EXPIRED"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 23
            goto L_0x032a
        L_0x02a3:
            java.lang.String r0 = "INVALID_CODE"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 34
            goto L_0x032a
        L_0x02af:
            java.lang.String r0 = "MISSING_EMAIL"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 29
            goto L_0x032a
        L_0x02bb:
            java.lang.String r0 = "INVALID_OOB_CODE"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 24
            goto L_0x032a
        L_0x02c7:
            java.lang.String r0 = "EXPIRED_OOB_CODE"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 25
            goto L_0x032a
        L_0x02d2:
            java.lang.String r0 = "WEB_NETWORK_REQUEST_FAILED"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 41
            goto L_0x032a
        L_0x02dd:
            java.lang.String r0 = "QUOTA_EXCEEDED"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 39
            goto L_0x032a
        L_0x02e8:
            java.lang.String r0 = "DYNAMIC_LINK_NOT_ACTIVATED"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 45
            goto L_0x032a
        L_0x02f3:
            java.lang.String r0 = "INVALID_IDP_RESPONSE"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 4
            goto L_0x032a
        L_0x02fd:
            java.lang.String r0 = "INTERNAL_SUCCESS_SIGN_OUT"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 64
            goto L_0x032a
        L_0x0308:
            java.lang.String r0 = "WEB_CONTEXT_ALREADY_PRESENTED"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 47
            goto L_0x032a
        L_0x0313:
            java.lang.String r0 = "INVALID_RECIPIENT_EMAIL"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 28
            goto L_0x032a
        L_0x031e:
            java.lang.String r0 = "USER_CANCELLED"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 67
            goto L_0x032a
        L_0x0329:
            r0 = -1
        L_0x032a:
            r2 = 17499(0x445b, float:2.4521E-41)
            switch(r0) {
                case 0: goto L_0x040e;
                case 1: goto L_0x040b;
                case 2: goto L_0x0408;
                case 3: goto L_0x0405;
                case 4: goto L_0x0405;
                case 5: goto L_0x0402;
                case 6: goto L_0x03ff;
                case 7: goto L_0x03ff;
                case 8: goto L_0x03fc;
                case 9: goto L_0x03fc;
                case 10: goto L_0x03f9;
                case 11: goto L_0x03f6;
                case 12: goto L_0x03f3;
                case 13: goto L_0x03f0;
                case 14: goto L_0x03ed;
                case 15: goto L_0x03ed;
                case 16: goto L_0x03ea;
                case 17: goto L_0x03e7;
                case 18: goto L_0x03e7;
                case 19: goto L_0x03e4;
                case 20: goto L_0x03e1;
                case 21: goto L_0x03de;
                case 22: goto L_0x03de;
                case 23: goto L_0x03db;
                case 24: goto L_0x03d8;
                case 25: goto L_0x03d5;
                case 26: goto L_0x03d2;
                case 27: goto L_0x03cf;
                case 28: goto L_0x03cc;
                case 29: goto L_0x03c9;
                case 30: goto L_0x03c6;
                case 31: goto L_0x03c3;
                case 32: goto L_0x03bf;
                case 33: goto L_0x03bb;
                case 34: goto L_0x03b7;
                case 35: goto L_0x03b3;
                case 36: goto L_0x03af;
                case 37: goto L_0x03ab;
                case 38: goto L_0x03a7;
                case 39: goto L_0x03a3;
                case 40: goto L_0x039f;
                case 41: goto L_0x039b;
                case 42: goto L_0x0397;
                case 43: goto L_0x0393;
                case 44: goto L_0x038f;
                case 45: goto L_0x038b;
                case 46: goto L_0x0387;
                case 47: goto L_0x0383;
                case 48: goto L_0x037f;
                case 49: goto L_0x037b;
                case 50: goto L_0x0377;
                case 51: goto L_0x0373;
                case 52: goto L_0x036f;
                case 53: goto L_0x036b;
                case 54: goto L_0x0367;
                case 55: goto L_0x0363;
                case 56: goto L_0x035f;
                case 57: goto L_0x035b;
                case 58: goto L_0x0357;
                case 59: goto L_0x0353;
                case 60: goto L_0x034f;
                case 61: goto L_0x034b;
                case 62: goto L_0x0347;
                case 63: goto L_0x0343;
                case 64: goto L_0x033f;
                case 65: goto L_0x033b;
                case 66: goto L_0x0337;
                case 67: goto L_0x0333;
                default: goto L_0x032f;
            }
        L_0x032f:
            r0 = 17499(0x445b, float:2.4521E-41)
            goto L_0x0410
        L_0x0333:
            r0 = 18001(0x4651, float:2.5225E-41)
            goto L_0x0410
        L_0x0337:
            r0 = 17094(0x42c6, float:2.3954E-41)
            goto L_0x0410
        L_0x033b:
            r0 = 17093(0x42c5, float:2.3952E-41)
            goto L_0x0410
        L_0x033f:
            r0 = 17091(0x42c3, float:2.395E-41)
            goto L_0x0410
        L_0x0343:
            r0 = 17090(0x42c2, float:2.3948E-41)
            goto L_0x0410
        L_0x0347:
            r0 = 17089(0x42c1, float:2.3947E-41)
            goto L_0x0410
        L_0x034b:
            r0 = 17088(0x42c0, float:2.3945E-41)
            goto L_0x0410
        L_0x034f:
            r0 = 17087(0x42bf, float:2.3944E-41)
            goto L_0x0410
        L_0x0353:
            r0 = 17086(0x42be, float:2.3943E-41)
            goto L_0x0410
        L_0x0357:
            r0 = 17085(0x42bd, float:2.3941E-41)
            goto L_0x0410
        L_0x035b:
            r0 = 17084(0x42bc, float:2.394E-41)
            goto L_0x0410
        L_0x035f:
            r0 = 17083(0x42bb, float:2.3938E-41)
            goto L_0x0410
        L_0x0363:
            r0 = 17082(0x42ba, float:2.3937E-41)
            goto L_0x0410
        L_0x0367:
            r0 = 17081(0x42b9, float:2.3936E-41)
            goto L_0x0410
        L_0x036b:
            r0 = 17078(0x42b6, float:2.3931E-41)
            goto L_0x0410
        L_0x036f:
            r0 = 17075(0x42b3, float:2.3927E-41)
            goto L_0x0410
        L_0x0373:
            r0 = 17074(0x42b2, float:2.3926E-41)
            goto L_0x0410
        L_0x0377:
            r0 = 17079(0x42b7, float:2.3933E-41)
            goto L_0x0410
        L_0x037b:
            r0 = 17073(0x42b1, float:2.3924E-41)
            goto L_0x0410
        L_0x037f:
            r0 = 17058(0x42a2, float:2.3903E-41)
            goto L_0x0410
        L_0x0383:
            r0 = 17057(0x42a1, float:2.3902E-41)
            goto L_0x0410
        L_0x0387:
            r0 = 17071(0x42af, float:2.3922E-41)
            goto L_0x0410
        L_0x038b:
            r0 = 17068(0x42ac, float:2.3917E-41)
            goto L_0x0410
        L_0x038f:
            r0 = 17040(0x4290, float:2.3878E-41)
            goto L_0x0410
        L_0x0393:
            r0 = 17065(0x42a9, float:2.3913E-41)
            goto L_0x0410
        L_0x0397:
            r0 = 17062(0x42a6, float:2.3909E-41)
            goto L_0x0410
        L_0x039b:
            r0 = 17061(0x42a5, float:2.3908E-41)
            goto L_0x0410
        L_0x039f:
            r0 = 17064(0x42a8, float:2.3912E-41)
            goto L_0x0410
        L_0x03a3:
            r0 = 17052(0x429c, float:2.3895E-41)
            goto L_0x0410
        L_0x03a7:
            r0 = 17051(0x429b, float:2.3894E-41)
            goto L_0x0410
        L_0x03ab:
            r0 = 17049(0x4299, float:2.3891E-41)
            goto L_0x0410
        L_0x03af:
            r0 = 17046(0x4296, float:2.3887E-41)
            goto L_0x0410
        L_0x03b3:
            r0 = 17045(0x4295, float:2.3885E-41)
            goto L_0x0410
        L_0x03b7:
            r0 = 17044(0x4294, float:2.3884E-41)
            goto L_0x0410
        L_0x03bb:
            r0 = 17043(0x4293, float:2.3882E-41)
            goto L_0x0410
        L_0x03bf:
            r0 = 17042(0x4292, float:2.3881E-41)
            goto L_0x0410
        L_0x03c3:
            r0 = 17041(0x4291, float:2.388E-41)
            goto L_0x0410
        L_0x03c6:
            r0 = 17035(0x428b, float:2.3871E-41)
            goto L_0x0410
        L_0x03c9:
            r0 = 17034(0x428a, float:2.387E-41)
            goto L_0x0410
        L_0x03cc:
            r0 = 17033(0x4289, float:2.3868E-41)
            goto L_0x0410
        L_0x03cf:
            r0 = 17032(0x4288, float:2.3867E-41)
            goto L_0x0410
        L_0x03d2:
            r0 = 17031(0x4287, float:2.3866E-41)
            goto L_0x0410
        L_0x03d5:
            r0 = 17029(0x4285, float:2.3863E-41)
            goto L_0x0410
        L_0x03d8:
            r0 = 17030(0x4286, float:2.3864E-41)
            goto L_0x0410
        L_0x03db:
            r0 = 17021(0x427d, float:2.3852E-41)
            goto L_0x0410
        L_0x03de:
            r0 = 17010(0x4272, float:2.3836E-41)
            goto L_0x0410
        L_0x03e1:
            r0 = 17014(0x4276, float:2.3842E-41)
            goto L_0x0410
        L_0x03e4:
            r0 = 17028(0x4284, float:2.3861E-41)
            goto L_0x0410
        L_0x03e7:
            r0 = 17006(0x426e, float:2.383E-41)
            goto L_0x0410
        L_0x03ea:
            r0 = 17026(0x4282, float:2.3859E-41)
            goto L_0x0410
        L_0x03ed:
            r0 = 17020(0x427c, float:2.385E-41)
            goto L_0x0410
        L_0x03f0:
            r0 = 17017(0x4279, float:2.3846E-41)
            goto L_0x0410
        L_0x03f3:
            r0 = 17025(0x4281, float:2.3857E-41)
            goto L_0x0410
        L_0x03f6:
            r0 = 17009(0x4271, float:2.3835E-41)
            goto L_0x0410
        L_0x03f9:
            r0 = 17007(0x426f, float:2.3832E-41)
            goto L_0x0410
        L_0x03fc:
            r0 = 17011(0x4273, float:2.3837E-41)
            goto L_0x0410
        L_0x03ff:
            r0 = 17008(0x4270, float:2.3833E-41)
            goto L_0x0410
        L_0x0402:
            r0 = 17005(0x426d, float:2.3829E-41)
            goto L_0x0410
        L_0x0405:
            r0 = 17004(0x426c, float:2.3828E-41)
            goto L_0x0410
        L_0x0408:
            r0 = 17000(0x4268, float:2.3822E-41)
            goto L_0x0410
        L_0x040b:
            r0 = 17002(0x426a, float:2.3825E-41)
            goto L_0x0410
        L_0x040e:
            r0 = 17016(0x4278, float:2.3844E-41)
        L_0x0410:
            if (r0 != r2) goto L_0x043e
            if (r5 == 0) goto L_0x0438
            com.google.android.gms.common.api.Status r2 = new com.google.android.gms.common.api.Status
            int r3 = r4.length()
            int r3 = r3 + r1
            int r1 = r5.length()
            int r3 = r3 + r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            r1.append(r4)
            java.lang.String r4 = ":"
            r1.append(r4)
            r1.append(r5)
            java.lang.String r4 = r1.toString()
            r2.<init>(r0, r4)
            return r2
        L_0x0438:
            com.google.android.gms.common.api.Status r5 = new com.google.android.gms.common.api.Status
            r5.<init>(r0, r4)
            return r5
        L_0x043e:
            com.google.android.gms.common.api.Status r4 = new com.google.android.gms.common.api.Status
            r4.<init>(r0, r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C2745.m14505(java.lang.String, java.lang.String):com.google.android.gms.common.api.Status");
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static String m14537() {
        try {
            return C3358dk.f2040.toString();
        } catch (NoClassDefFoundError unused) {
            return null;
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static C2344<?> m14502(String str, String str2) {
        C1872 r3 = C1872.m10257(str, str2);
        C2344.C2345 r0 = new C2344.C2345(C1872.class, new Class[0], (byte) 0);
        r0.f10852 = 1;
        r0.f10854 = new C2387(r3);
        return r0.m12231();
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static X509Certificate[] m14516(X509Certificate[] x509CertificateArr, C3307br brVar) {
        LinkedList linkedList = new LinkedList();
        boolean r2 = brVar.m1834(x509CertificateArr[0]);
        linkedList.add(x509CertificateArr[0]);
        boolean z = true;
        boolean z2 = r2;
        int i = 1;
        while (i < x509CertificateArr.length) {
            if (brVar.m1834(x509CertificateArr[i])) {
                z2 = true;
            }
            if (!m14515(x509CertificateArr[i], x509CertificateArr[i - 1])) {
                break;
            }
            linkedList.add(x509CertificateArr[i]);
            i++;
        }
        X509Certificate r6 = brVar.m1833(x509CertificateArr[i - 1]);
        if (r6 != null) {
            linkedList.add(r6);
        } else {
            z = z2;
        }
        if (z) {
            return (X509Certificate[]) linkedList.toArray(new X509Certificate[linkedList.size()]);
        }
        throw new CertificateException("Didn't find a trust anchor in chain cleanup!");
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private static boolean m14515(X509Certificate x509Certificate, X509Certificate x509Certificate2) {
        if (!x509Certificate.getSubjectX500Principal().equals(x509Certificate2.getIssuerX500Principal())) {
            return false;
        }
        try {
            x509Certificate2.verify(x509Certificate.getPublicKey());
            return true;
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static C3321cb m14528(Callable<C3321cb> callable) {
        try {
            C3321cb call = callable.call();
            if (call != null) {
                return call;
            }
            throw new NullPointerException("Scheduler Callable returned null");
        } catch (Throwable th) {
            throw cW.m1935(th);
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static void m14522(Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        } else if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        } else if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }
}
