package o;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Toast;
import java.io.File;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import o.C0309;
import o.mE;
import o.mH;
import zendesk.belvedere.ImageStream;

/* renamed from: o.mq  reason: case insensitive filesystem */
public final class C3604mq implements C3184 {

    /* renamed from: ɩ  reason: contains not printable characters */
    private final C2039 f3296;

    public C3604mq() {
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static ImageStream m3914(C1459 r5) {
        ImageStream imageStream;
        mC mCVar;
        C1550 supportFragmentManager = r5.getSupportFragmentManager();
        C1277 findFragmentByTag = supportFragmentManager.findFragmentByTag("belvedere_image_stream");
        int i = 0;
        if (findFragmentByTag instanceof ImageStream) {
            imageStream = (ImageStream) findFragmentByTag;
        } else {
            imageStream = new ImageStream();
            C1265 r3 = new C1265(supportFragmentManager);
            r3.m9968(0, imageStream, "belvedere_image_stream", 1);
            r3.m9966();
        }
        ViewGroup viewGroup = (ViewGroup) r5.getWindow().getDecorView();
        int childCount = viewGroup.getChildCount();
        while (true) {
            if (i >= childCount) {
                mC mCVar2 = new mC(r5);
                viewGroup.addView(mCVar2);
                mCVar = mCVar2;
                break;
            } else if (viewGroup.getChildAt(i) instanceof mC) {
                mCVar = (mC) viewGroup.getChildAt(i);
                break;
            } else {
                i++;
            }
        }
        imageStream.f14758 = new WeakReference<>(mCVar);
        return imageStream;
    }

    /* renamed from: o.mq$If */
    public static class If {

        /* renamed from: ı  reason: contains not printable characters */
        public final Context f3297;

        /* renamed from: Ɩ  reason: contains not printable characters */
        List<Integer> f3298;

        /* renamed from: ǃ  reason: contains not printable characters */
        public List<mF> f3299;

        /* renamed from: ɩ  reason: contains not printable characters */
        public List<mF> f3300;

        /* renamed from: ɹ  reason: contains not printable characters */
        public boolean f3301;

        /* renamed from: Ι  reason: contains not printable characters */
        public List<mE> f3302;

        /* renamed from: ι  reason: contains not printable characters */
        boolean f3303;

        /* renamed from: і  reason: contains not printable characters */
        public long f3304;

        public /* synthetic */ If(Context context, byte b) {
            this(context);
        }

        private If(Context context) {
            this.f3303 = true;
            this.f3302 = new ArrayList();
            this.f3300 = new ArrayList();
            this.f3299 = new ArrayList();
            this.f3298 = new ArrayList();
            this.f3304 = -1;
            this.f3301 = false;
            this.f3297 = context;
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final If m3918() {
            C2311 r6;
            File file;
            Uri r13;
            C3602mo r0 = C3602mo.m3911(this.f3297);
            mE.If ifR = new mE.If(r0.f3290.m3738(), r0.f3289, r0.f3290);
            mL mLVar = ifR.f3080;
            int i = ifR.f3082;
            Context context = mLVar.f3111;
            Intent intent = new Intent();
            intent.setAction("android.media.action.IMAGE_CAPTURE");
            PackageManager packageManager = context.getPackageManager();
            boolean z = false;
            boolean z2 = packageManager.hasSystemFeature("android.hardware.camera") || packageManager.hasSystemFeature("android.hardware.camera.front");
            boolean z3 = intent.resolveActivity(context.getPackageManager()) != null;
            Object[] objArr = {Boolean.valueOf(z2), Boolean.valueOf(z3)};
            if (z2 && z3) {
                Context context2 = mLVar.f3111;
                File r2 = mP.m3767(context2, "media");
                if (r2 == null) {
                    file = null;
                } else {
                    file = mP.m3772(r2, String.format(Locale.US, "camera_image_%s", new Object[]{new SimpleDateFormat("yyyyMMddHHmmssSSS", Locale.US).format(new Date(System.currentTimeMillis()))}), ".jpg");
                }
                if (file == null || (r13 = mP.m3771(context2, file)) == null) {
                    r6 = null;
                } else {
                    Object[] objArr2 = {Integer.valueOf(i), file, r13};
                    Intent intent2 = new Intent("android.media.action.IMAGE_CAPTURE");
                    intent2.putExtra("output", r13);
                    mP.m3773(context2, intent2, r13);
                    if (C1356.m8470(context2, "android.permission.CAMERA")) {
                        if (!(C0651.m5452(context2, "android.permission.CAMERA") == 0)) {
                            z = true;
                        }
                    }
                    mF r02 = mP.m3770(context2, r13);
                    r6 = new C2311(new mE(i, intent2, z ? "android.permission.CAMERA" : null, true, 2), new mF(file, r13, r13, file.getName(), r02.f3089, r02.f3091, r02.f3088, r02.f3094));
                }
            } else {
                r6 = new C2311(mE.m3739(), null);
            }
            mE mEVar = (mE) r6.f10733;
            mF mFVar = (mF) r6.f10734;
            if (mEVar.f3078) {
                mD mDVar = ifR.f3081;
                int i2 = ifR.f3082;
                synchronized (mDVar) {
                    mDVar.f3074.put(i2, mFVar);
                }
            }
            this.f3302.add(mEVar);
            return this;
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final If m3916(int... iArr) {
            ArrayList arrayList = new ArrayList(iArr.length);
            for (int valueOf : iArr) {
                arrayList.add(Integer.valueOf(valueOf));
            }
            this.f3298 = arrayList;
            return this;
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final void m3917(C1459 r10) {
            final ImageStream r102 = C3604mq.m3914(r10);
            List<mE> list = this.f3302;
            AnonymousClass1 r1 = new mH.C0236() {
                /* renamed from: ı  reason: contains not printable characters */
                public final void m3919(final List<mE> list) {
                    final C1269 activity = r102.getActivity();
                    if (activity != null && !activity.isChangingConfigurations()) {
                        final ViewGroup viewGroup = (ViewGroup) activity.getWindow().getDecorView();
                        viewGroup.post(new Runnable() {
                            public final void run() {
                                C0256 r0 = new C0256(list, If.this.f3300, If.this.f3299, If.this.f3303, If.this.f3298, If.this.f3304, If.this.f3301);
                                Activity activity = activity;
                                ViewGroup viewGroup = viewGroup;
                                mB mBVar = new mB(activity, LayoutInflater.from(activity).inflate(R.layout.f168952131558437, viewGroup, false), r102, r0);
                                mBVar.showAtLocation(viewGroup, 48, 0, 0);
                                ImageStream imageStream = r102;
                                imageStream.f14760 = mBVar;
                                imageStream.f14756 = r0;
                            }
                        });
                    }
                }

                /* renamed from: Ι  reason: contains not printable characters */
                public final void m3920() {
                    C1269 activity = r102.getActivity();
                    if (activity != null) {
                        Toast.makeText(activity, R.string.f170462131886130, 0).show();
                    }
                }
            };
            mH mHVar = r102.f14762;
            Context context = r102.getContext();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            boolean r6 = mH.m3742(context);
            boolean z = !mHVar.f3097.f3110.contains("android.permission.READ_EXTERNAL_STORAGE");
            if (!r6 && z) {
                arrayList2.add("android.permission.READ_EXTERNAL_STORAGE");
            }
            arrayList.addAll(arrayList2);
            arrayList.addAll(mHVar.m3743(list));
            if (mH.m3742(context) && arrayList.isEmpty()) {
                r1.m3747(mH.m3741(context, list));
            } else if (mH.m3742(context) || !arrayList.isEmpty()) {
                mHVar.f3098 = new mH.Cif(new mH.Cif(context, list, r1) {

                    /* renamed from: ı */
                    private /* synthetic */ Context f3101;

                    /* renamed from: ǃ */
                    private /* synthetic */ List f3102;

                    /* renamed from: ɩ */
                    private /* synthetic */ C0236 f3103;

                    /* renamed from: Ι */
                    public final void m3745(
/*
Method generation error in method: o.mH.4.Ι(java.util.Map, java.util.List):void, dex: classes.dex
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.mH.4.?(java.util.Map, java.util.List):void, class status: UNLOADED
                    	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:674)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:429)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                    	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                    	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                    
*/
                }) {

                    /* renamed from: ι */
                    private /* synthetic */ Cif f3100;

                    /* renamed from: Ι */
                    public final void m3744(
/*
Method generation error in method: o.mH.2.Ι(java.util.Map, java.util.List):void, dex: classes.dex
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.mH.2.?(java.util.Map, java.util.List):void, class status: UNLOADED
                    	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:429)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                    	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                    	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                    
*/
                };
                r102.requestPermissions((String[]) arrayList.toArray(new String[arrayList.size()]), 9842);
            } else {
                r1.m3748();
            }
        }
    }

    /* renamed from: o.mq$ɩ  reason: contains not printable characters */
    public static class C0256 implements Parcelable {
        public static final Parcelable.Creator<C0256> CREATOR = new Parcelable.Creator<C0256>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new C0256[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new C0256(parcel);
            }
        };

        /* renamed from: ı  reason: contains not printable characters */
        final List<mF> f3311;

        /* renamed from: Ɩ  reason: contains not printable characters */
        private final boolean f3312;

        /* renamed from: ǃ  reason: contains not printable characters */
        final List<Integer> f3313;

        /* renamed from: ɩ  reason: contains not printable characters */
        public final List<mE> f3314;

        /* renamed from: ɹ  reason: contains not printable characters */
        final boolean f3315;

        /* renamed from: Ι  reason: contains not printable characters */
        public final long f3316;

        /* renamed from: ι  reason: contains not printable characters */
        final List<mF> f3317;

        public final int describeContents() {
            return 0;
        }

        public C0256() {
            this.f3314 = new ArrayList();
            this.f3311 = new ArrayList();
            this.f3317 = new ArrayList();
            this.f3313 = new ArrayList();
            this.f3312 = true;
            this.f3316 = -1;
            this.f3315 = false;
        }

        C0256(List<mE> list, List<mF> list2, List<mF> list3, boolean z, List<Integer> list4, long j, boolean z2) {
            this.f3314 = list;
            this.f3311 = list2;
            this.f3317 = list3;
            this.f3312 = z;
            this.f3313 = list4;
            this.f3316 = j;
            this.f3315 = z2;
        }

        C0256(Parcel parcel) {
            this.f3314 = parcel.createTypedArrayList(mE.CREATOR);
            this.f3311 = parcel.createTypedArrayList(mF.CREATOR);
            this.f3317 = parcel.createTypedArrayList(mF.CREATOR);
            this.f3313 = new ArrayList();
            parcel.readList(this.f3313, Integer.class.getClassLoader());
            boolean z = false;
            this.f3312 = parcel.readInt() == 1;
            this.f3316 = parcel.readLong();
            this.f3315 = parcel.readInt() == 1 ? true : z;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeTypedList(this.f3314);
            parcel.writeTypedList(this.f3311);
            parcel.writeTypedList(this.f3317);
            parcel.writeList(this.f3313);
            parcel.writeInt(this.f3312 ? 1 : 0);
            parcel.writeLong(this.f3316);
            parcel.writeInt(this.f3315 ? 1 : 0);
        }
    }

    public C3604mq(C2039 r1) {
        this.f3296 = r1;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final C0329 m3915(Object obj) {
        C0770 r3;
        C2039 r9 = this.f3296;
        C0329<C2832> r0 = r9.f10076.m15465();
        C0329<C2832> r1 = r9.f10080.m15465();
        List<C0329> asList = Arrays.asList(new C0329[]{r0, r1});
        if (asList.isEmpty()) {
            r3 = new C0770();
            r3.m6079(null);
        } else {
            for (C0329 r4 : asList) {
                if (r4 == null) {
                    throw new NullPointerException("null tasks are not accepted");
                }
            }
            r3 = new C0770();
            C0309.Cif ifVar = new C0309.Cif(asList.size(), r3);
            for (C0329 r6 : asList) {
                r6.m4408(C0322.f3662, ifVar);
                r6.m4403(C0322.f3662, (C3191) ifVar);
                r6.m4402(C0322.f3662, (C2970) ifVar);
            }
        }
        return r3.m4419(new C0939(asList)).m4404(r9.f10075, new C3603mp(r9, r0, r1));
    }
}
