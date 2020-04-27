package o;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Looper;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import o.C0496;
import o.C2764;
import o.C3262ab;

/* renamed from: o.łƖ  reason: contains not printable characters */
public class C0528 implements C2764.If {

    /* renamed from: ı  reason: contains not printable characters */
    static final String f4353 = "onCrash called from main thread!!!";

    /* renamed from: ɩ  reason: contains not printable characters */
    static final String f4354 = "Answers Events Handler";

    /* renamed from: Ɩ  reason: contains not printable characters */
    private final long f4355;

    /* renamed from: ǃ  reason: contains not printable characters */
    final C2764 f4356;

    /* renamed from: Ι  reason: contains not printable characters */
    final C3262ab f4357;

    /* renamed from: ι  reason: contains not printable characters */
    final C2635 f4358;

    /* renamed from: Ӏ  reason: contains not printable characters */
    final C2760 f4359;

    /* renamed from: ɩ  reason: contains not printable characters */
    public void m5090(String str) {
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static C0528 m5083(C3269ai aiVar, Context context, aD aDVar, String str, String str2, long j) {
        Context context2 = context;
        aD aDVar2 = aDVar;
        C0600 r4 = new C0600(context, aDVar, str, str2);
        C2710 r3 = new C2710(context, new C3304bo(aiVar));
        C3263ac.m1563();
        C3300bk bkVar = new C3300bk((byte) 0);
        C3262ab abVar = new C3262ab(context);
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(new ThreadFactory(f4354, new AtomicLong(1)) {

            /* renamed from: ı */
            private /* synthetic */ String f1386;

            /* renamed from: Ι */
            private /* synthetic */ AtomicLong f1387;

            public final java.lang.Thread newThread(
/*
Method generation error in method: o.aB.2.newThread(java.lang.Runnable):java.lang.Thread, dex: classes.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.aB.2.newThread(java.lang.Runnable):java.lang.Thread, class status: UNLOADED
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
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
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
            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
            
*/
        });
        aB.m1451(f4354, newSingleThreadScheduledExecutor, TimeUnit.SECONDS);
        C2764 r10 = new C2764(newSingleThreadScheduledExecutor);
        return new C0528(new C2635(aiVar, context, r3, r4, bkVar, newSingleThreadScheduledExecutor, new C2914(context)), abVar, r10, C2760.m14603(context), j);
    }

    C0528(C2635 r1, C3262ab abVar, C2764 r3, C2760 r4, long j) {
        this.f4358 = r1;
        this.f4357 = abVar;
        this.f4356 = r3;
        this.f4359 = r4;
        this.f4355 = j;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public void m5084() {
        this.f4358.m13967();
        C3262ab abVar = this.f4357;
        C2756 r1 = new C2756(this, this.f4356);
        if (abVar.f1480 != null) {
            abVar.f1480.m1549(r1);
        }
        this.f4356.m14626(this);
        if (m5093()) {
            m5085(this.f4355);
            this.f4359.m14605();
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public void m5087() {
        C3262ab abVar = this.f4357;
        if (abVar.f1480 != null) {
            C3262ab.Cif ifVar = abVar.f1480;
            for (Application.ActivityLifecycleCallbacks unregisterActivityLifecycleCallbacks : ifVar.f1481) {
                ifVar.f1482.unregisterActivityLifecycleCallbacks(unregisterActivityLifecycleCallbacks);
            }
        }
        this.f4358.m13969();
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public void m5092(C2863 r2) {
        C3263ac.m1563();
        this.f4358.m13972(C0496.m4872(r2));
    }

    /* renamed from: ι  reason: contains not printable characters */
    public void m5094(C0320 r2) {
        C3263ac.m1563();
        this.f4358.m13972(C0496.m4874((C0320<?>) r2));
    }

    /* renamed from: ı  reason: contains not printable characters */
    public void m5086(String str, String str2) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            C3263ac.m1563();
            this.f4358.m13971(C0496.m4871(str, str2));
            return;
        }
        throw new IllegalStateException(f4353);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public void m5085(long j) {
        C3263ac.m1563();
        this.f4358.m13974(C0496.m4875(j));
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public void m5089(Activity activity, C0496.C0497 r3) {
        C3263ac.m1563();
        this.f4358.m13972(C0496.m4876(r3, activity));
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public void m5088() {
        C3263ac.m1563();
        this.f4358.m13975();
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public void m5091(C3310bu buVar, String str) {
        this.f4356.m14623(buVar.f1798);
        this.f4358.m13973(buVar, str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public boolean m5093() {
        return !this.f4359.m14604();
    }
}
