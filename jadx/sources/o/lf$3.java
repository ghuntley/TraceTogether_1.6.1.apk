package o;

import android.content.Context;
import java.util.Random;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "run", "()V"}, k = 3, mv = {1, 1, 16})
final class lf$3 implements Runnable {

    /* renamed from: ι$781c806b  reason: contains not printable characters */
    final /* synthetic */ Object f2878$781c806b;

    public lf$3(Object obj) {
        this.f2878$781c806b = obj;
    }

    public final void run() {
        Throwable cause;
        int nextInt = new Random().nextInt();
        try {
            Object invoke = ((Class) C3166.m16013(4, 4, 0)).getMethod("Ι", new Class[]{(Class) C3166.m16013(4, 4, 0)}).invoke((Object) null, new Object[]{this.f2878$781c806b});
            try {
                Object[] objArr = new Object[2];
                objArr[1] = Integer.valueOf(nextInt);
                objArr[0] = invoke;
                if (((Integer) ((Class) C3166.m16013(4, 0, 32836)).getMethod("Ι", new Class[]{Context.class, Integer.TYPE}).invoke((Object) null, objArr)).intValue() != nextInt) {
                    lA.f2728.m3369("Dexguard", "AAA: Tampered!");
                }
                try {
                    Object invoke2 = ((Class) C3166.m16013(4, 4, 0)).getMethod("Ι", new Class[]{(Class) C3166.m16013(4, 4, 0)}).invoke((Object) null, new Object[]{this.f2878$781c806b});
                    try {
                        Object[] objArr2 = new Object[2];
                        objArr2[1] = Integer.valueOf(nextInt);
                        objArr2[0] = invoke2;
                        if (((Integer) ((Class) C1806.m9994(0, 3, 0)).getMethod("ı", new Class[]{Context.class, Integer.TYPE}).invoke((Object) null, objArr2)).intValue() != nextInt) {
                            lA.f2728.m3369("Dexguard", "AAA: Cert!");
                        }
                        try {
                            try {
                                Object newInstance = ((Class) C1806.m9994(18, 3, 11452)).getDeclaredConstructor(new Class[]{Context.class}).newInstance(new Object[]{((Class) C3166.m16013(4, 4, 0)).getMethod("Ι", new Class[]{(Class) C3166.m16013(4, 4, 0)}).invoke((Object) null, new Object[]{this.f2878$781c806b})});
                                try {
                                    Object[] objArr3 = new Object[2];
                                    objArr3[1] = Integer.valueOf(nextInt);
                                    objArr3[0] = "classes.dex";
                                    if (((Integer) ((Class) C1806.m9994(18, 3, 11452)).getMethod("Ι", new Class[]{String.class, Integer.TYPE}).invoke(newInstance, objArr3)).intValue() != nextInt) {
                                        lA.f2728.m3369("Dexguard", "AAA: File!");
                                    }
                                    try {
                                        if (((Integer) ((Class) C1806.m9994(6, 4, 17936)).getMethod("Ι", new Class[]{Integer.TYPE}).invoke((Object) null, new Object[]{Integer.valueOf(nextInt)})).intValue() != nextInt) {
                                            lA.f2728.m3369("Dexguard", "AAA: DebuggerConnected!");
                                        }
                                        try {
                                            Object invoke3 = ((Class) C3166.m16013(4, 4, 0)).getMethod("Ι", new Class[]{(Class) C3166.m16013(4, 4, 0)}).invoke((Object) null, new Object[]{this.f2878$781c806b});
                                            try {
                                                Object[] objArr4 = new Object[2];
                                                objArr4[1] = Integer.valueOf(nextInt);
                                                objArr4[0] = invoke3;
                                                if (((Integer) ((Class) C1806.m9994(6, 4, 17936)).getMethod("Ι", new Class[]{Context.class, Integer.TYPE}).invoke((Object) null, objArr4)).intValue() != nextInt) {
                                                    lA.f2728.m3369("Dexguard", "AAA: Debuggable!");
                                                }
                                                try {
                                                    Object invoke4 = ((Class) C3166.m16013(4, 4, 0)).getMethod("Ι", new Class[]{(Class) C3166.m16013(4, 4, 0)}).invoke((Object) null, new Object[]{this.f2878$781c806b});
                                                    try {
                                                        Object[] objArr5 = new Object[2];
                                                        objArr5[1] = Integer.valueOf(nextInt);
                                                        objArr5[0] = invoke4;
                                                        if (((Integer) ((Class) C1806.m9994(6, 4, 17936)).getMethod("ɩ", new Class[]{Context.class, Integer.TYPE}).invoke((Object) null, objArr5)).intValue() != nextInt) {
                                                            lA.f2728.m3369("Dexguard", "AAA: debug key!");
                                                        }
                                                        try {
                                                            Object invoke5 = ((Class) C3166.m16013(4, 4, 0)).getMethod("Ι", new Class[]{(Class) C3166.m16013(4, 4, 0)}).invoke((Object) null, new Object[]{this.f2878$781c806b});
                                                            try {
                                                                Object[] objArr6 = new Object[2];
                                                                objArr6[1] = Integer.valueOf(nextInt);
                                                                objArr6[0] = invoke5;
                                                                if (((Integer) ((Class) C1806.m9994(10, 3, 0)).getMethod("Ι", new Class[]{Context.class, Integer.TYPE}).invoke((Object) null, objArr6)).intValue() != nextInt) {
                                                                    lA.f2728.m3369("Dexguard", "AAA: simulator!");
                                                                }
                                                                try {
                                                                    Object invoke6 = ((Class) C3166.m16013(4, 4, 0)).getMethod("Ι", new Class[]{(Class) C3166.m16013(4, 4, 0)}).invoke((Object) null, new Object[]{this.f2878$781c806b});
                                                                    try {
                                                                        Object[] objArr7 = new Object[2];
                                                                        objArr7[1] = Integer.valueOf(nextInt);
                                                                        objArr7[0] = invoke6;
                                                                        if (((Integer) ((Class) C1806.m9994(38, 4, 11228)).getMethod("ǃ", new Class[]{Context.class, Integer.TYPE}).invoke((Object) null, objArr7)).intValue() != nextInt) {
                                                                            lA.f2728.m3369("Dexguard", "AAA: rooted!");
                                                                        }
                                                                        try {
                                                                            Object invoke7 = ((Class) C3166.m16013(4, 4, 0)).getMethod("Ι", new Class[]{(Class) C3166.m16013(4, 4, 0)}).invoke((Object) null, new Object[]{this.f2878$781c806b});
                                                                            try {
                                                                                Object[] objArr8 = new Object[2];
                                                                                objArr8[1] = Integer.valueOf(nextInt);
                                                                                objArr8[0] = invoke7;
                                                                                if (((Integer) ((Class) C1806.m9994(21, 4, 6471)).getMethod("ɩ", new Class[]{Context.class, Integer.TYPE}).invoke((Object) null, objArr8)).intValue() != nextInt) {
                                                                                    lA.f2728.m3369("Dexguard", "AAA: Hooked!");
                                                                                    System.exit(1);
                                                                                }
                                                                            } catch (Throwable th) {
                                                                                if (cause != null) {
                                                                                    throw cause;
                                                                                }
                                                                                throw th;
                                                                            }
                                                                        } finally {
                                                                            cause = th.getCause();
                                                                            if (cause != null) {
                                                                                throw cause;
                                                                            }
                                                                        }
                                                                    } finally {
                                                                        Throwable cause2 = th.getCause();
                                                                        if (cause2 != null) {
                                                                            throw cause2;
                                                                        }
                                                                    }
                                                                } finally {
                                                                    Throwable cause3 = th.getCause();
                                                                    if (cause3 != null) {
                                                                        throw cause3;
                                                                    }
                                                                }
                                                            } finally {
                                                                Throwable cause4 = th.getCause();
                                                                if (cause4 != null) {
                                                                    throw cause4;
                                                                }
                                                            }
                                                        } finally {
                                                            Throwable cause5 = th.getCause();
                                                            if (cause5 != null) {
                                                                throw cause5;
                                                            }
                                                        }
                                                    } finally {
                                                        Throwable cause6 = th.getCause();
                                                        if (cause6 != null) {
                                                            throw cause6;
                                                        }
                                                    }
                                                } finally {
                                                    Throwable cause7 = th.getCause();
                                                    if (cause7 != null) {
                                                        throw cause7;
                                                    }
                                                }
                                            } finally {
                                                Throwable cause8 = th.getCause();
                                                if (cause8 != null) {
                                                    throw cause8;
                                                }
                                            }
                                        } finally {
                                            Throwable cause9 = th.getCause();
                                            if (cause9 != null) {
                                                throw cause9;
                                            }
                                        }
                                    } finally {
                                        Throwable cause10 = th.getCause();
                                        if (cause10 != null) {
                                            throw cause10;
                                        }
                                    }
                                } finally {
                                    Throwable cause11 = th.getCause();
                                    if (cause11 != null) {
                                        throw cause11;
                                    }
                                }
                            } finally {
                                Throwable cause12 = th.getCause();
                                if (cause12 != null) {
                                    throw cause12;
                                }
                            }
                        } finally {
                            Throwable cause13 = th.getCause();
                            if (cause13 != null) {
                                throw cause13;
                            }
                        }
                    } finally {
                        Throwable cause14 = th.getCause();
                        if (cause14 != null) {
                            throw cause14;
                        }
                    }
                } finally {
                    Throwable cause15 = th.getCause();
                    if (cause15 != null) {
                        throw cause15;
                    }
                }
            } finally {
                Throwable cause16 = th.getCause();
                if (cause16 != null) {
                    throw cause16;
                }
            }
        } finally {
            Throwable cause17 = th.getCause();
            if (cause17 != null) {
                throw cause17;
            }
        }
    }
}
