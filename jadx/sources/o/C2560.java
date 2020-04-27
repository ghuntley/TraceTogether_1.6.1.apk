package o;

import android.view.Choreographer;

/* renamed from: o.іŀ  reason: contains not printable characters */
public final class C2560 extends C2375 implements Choreographer.FrameCallback {

    /* renamed from: ı  reason: contains not printable characters */
    public float f11670 = -2.14748365E9f;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private boolean f11671 = false;

    /* renamed from: ǃ  reason: contains not printable characters */
    public float f11672 = 1.0f;

    /* renamed from: ɩ  reason: contains not printable characters */
    public float f11673 = 0.0f;

    /* renamed from: ɹ  reason: contains not printable characters */
    private long f11674 = 0;

    /* renamed from: Ι  reason: contains not printable characters */
    public C0343 f11675;

    /* renamed from: ι  reason: contains not printable characters */
    public float f11676 = 2.14748365E9f;

    /* renamed from: і  reason: contains not printable characters */
    public boolean f11677 = false;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private int f11678 = 0;

    public final Object getAnimatedValue() {
        return Float.valueOf(m13639());
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final float m13639() {
        C0343 r0 = this.f11675;
        if (r0 == null) {
            return 0.0f;
        }
        return (this.f11673 - r0.f3725) / (this.f11675.f3730 - this.f11675.f3725);
    }

    public final float getAnimatedFraction() {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6 = 0.0f;
        if (this.f11675 == null) {
            return 0.0f;
        }
        if (this.f11672 < 0.0f) {
            C0343 r0 = this.f11675;
            if (r0 == null) {
                f5 = 0.0f;
            } else {
                float f7 = this.f11676;
                if (f7 == 2.14748365E9f) {
                    f5 = r0.f3730;
                } else {
                    f5 = f7;
                }
            }
            f2 = f5 - this.f11673;
            C0343 r4 = this.f11675;
            if (r4 == null) {
                f3 = 0.0f;
            } else {
                float f8 = this.f11676;
                if (f8 == 2.14748365E9f) {
                    f3 = r4.f3730;
                } else {
                    f3 = f8;
                }
            }
            C0343 r42 = this.f11675;
            if (r42 != null) {
                f6 = this.f11670;
                if (f6 == -2.14748365E9f) {
                    f6 = r42.f3725;
                }
            }
        } else {
            float f9 = this.f11673;
            C0343 r43 = this.f11675;
            if (r43 == null) {
                f = 0.0f;
            } else {
                float f10 = this.f11670;
                if (f10 == -2.14748365E9f) {
                    f = r43.f3725;
                } else {
                    f = f10;
                }
            }
            f2 = f9 - f;
            C0343 r44 = this.f11675;
            if (r44 == null) {
                f4 = 0.0f;
            } else {
                float f11 = this.f11676;
                if (f11 == 2.14748365E9f) {
                    f4 = r44.f3730;
                } else {
                    f4 = f11;
                }
            }
            C0343 r45 = this.f11675;
            if (r45 != null) {
                f6 = this.f11670;
                if (f6 == -2.14748365E9f) {
                    f6 = r45.f3725;
                }
            }
        }
        return f2 / (f3 - f6);
    }

    public final long getDuration() {
        C0343 r0 = this.f11675;
        if (r0 == null) {
            return 0;
        }
        return (long) ((float) ((long) (((r0.f3730 - r0.f3725) / r0.f3726) * 1000.0f)));
    }

    public final boolean isRunning() {
        return this.f11677;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m13640(float f) {
        float f2;
        if (this.f11673 != f) {
            C0343 r0 = this.f11675;
            float f3 = 0.0f;
            if (r0 == null) {
                f2 = 0.0f;
            } else {
                float f4 = this.f11670;
                if (f4 == -2.14748365E9f) {
                    f2 = r0.f3725;
                } else {
                    f2 = f4;
                }
            }
            C0343 r2 = this.f11675;
            if (r2 != null) {
                f3 = this.f11676;
                if (f3 == 2.14748365E9f) {
                    f3 = r2.f3730;
                }
            }
            this.f11673 = C2493.m13245(f, f2, f3);
            this.f11674 = 0;
            m12364();
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m13641(float f, float f2) {
        if (f <= f2) {
            C0343 r0 = this.f11675;
            float f3 = r0 == null ? -3.4028235E38f : r0.f3725;
            C0343 r1 = this.f11675;
            float f4 = r1 == null ? Float.MAX_VALUE : r1.f3730;
            this.f11670 = C2493.m13245(f, f3, f4);
            this.f11676 = C2493.m13245(f2, f3, f4);
            m13640((float) ((int) C2493.m13245(this.f11673, f, f2)));
            return;
        }
        throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", new Object[]{Float.valueOf(f), Float.valueOf(f2)}));
    }

    public final void setRepeatMode(int i) {
        super.setRepeatMode(i);
        if (i != 2 && this.f11671) {
            this.f11671 = false;
            this.f11672 = -this.f11672;
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m13638() {
        boolean z = true;
        this.f11677 = true;
        float f = 0.0f;
        m12366(this.f11672 < 0.0f);
        if (this.f11672 >= 0.0f) {
            z = false;
        }
        if (z) {
            C0343 r0 = this.f11675;
            if (r0 != null) {
                f = this.f11676;
                if (f == 2.14748365E9f) {
                    f = r0.f3730;
                }
            }
        } else {
            C0343 r02 = this.f11675;
            if (r02 != null) {
                f = this.f11670;
                if (f == -2.14748365E9f) {
                    f = r02.f3725;
                }
            }
        }
        m13640((float) ((int) f));
        this.f11674 = 0;
        this.f11678 = 0;
        if (isRunning()) {
            Choreographer.getInstance().removeFrameCallback(this);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    /* renamed from: і  reason: contains not printable characters */
    public final void m13642() {
        float f;
        float f2;
        boolean z = true;
        this.f11677 = true;
        if (isRunning()) {
            Choreographer.getInstance().removeFrameCallback(this);
            Choreographer.getInstance().postFrameCallback(this);
        }
        this.f11674 = 0;
        float f3 = 0.0f;
        if (this.f11672 < 0.0f) {
            float f4 = this.f11673;
            C0343 r6 = this.f11675;
            if (r6 == null) {
                f2 = 0.0f;
            } else {
                float f5 = this.f11670;
                if (f5 == -2.14748365E9f) {
                    f2 = r6.f3725;
                } else {
                    f2 = f5;
                }
            }
            if (f4 == f2) {
                C0343 r0 = this.f11675;
                if (r0 != null) {
                    f3 = this.f11676;
                    if (f3 == 2.14748365E9f) {
                        f3 = r0.f3730;
                    }
                }
                this.f11673 = f3;
                return;
            }
        }
        if (this.f11672 >= 0.0f) {
            z = false;
        }
        if (!z) {
            float f6 = this.f11673;
            C0343 r1 = this.f11675;
            if (r1 == null) {
                f = 0.0f;
            } else {
                float f7 = this.f11676;
                if (f7 == 2.14748365E9f) {
                    f = r1.f3730;
                } else {
                    f = f7;
                }
            }
            if (f6 == f) {
                C0343 r02 = this.f11675;
                if (r02 != null) {
                    f3 = this.f11670;
                    if (f3 == -2.14748365E9f) {
                        f3 = r02.f3725;
                    }
                }
                this.f11673 = f3;
            }
        }
    }

    public final void cancel() {
        m12367();
        Choreographer.getInstance().removeFrameCallback(this);
        this.f11677 = false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:70:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00fb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void doFrame(long r12) {
        /*
            r11 = this;
            boolean r0 = r11.isRunning()
            if (r0 == 0) goto L_0x0014
            android.view.Choreographer r0 = android.view.Choreographer.getInstance()
            r0.removeFrameCallback(r11)
            android.view.Choreographer r0 = android.view.Choreographer.getInstance()
            r0.postFrameCallback(r11)
        L_0x0014:
            o.ıɭ r0 = r11.f11675
            if (r0 == 0) goto L_0x0180
            boolean r0 = r11.isRunning()
            if (r0 != 0) goto L_0x0020
            goto L_0x0180
        L_0x0020:
            o.C2921.m15081()
            long r0 = r11.f11674
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x002c
            goto L_0x002e
        L_0x002c:
            long r2 = r12 - r0
        L_0x002e:
            o.ıɭ r0 = r11.f11675
            if (r0 != 0) goto L_0x0036
            r0 = 2139095039(0x7f7fffff, float:3.4028235E38)
            goto L_0x0044
        L_0x0036:
            r1 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r0 = r0.f3726
            float r1 = r1 / r0
            float r0 = r11.f11672
            float r0 = java.lang.Math.abs(r0)
            float r0 = r1 / r0
        L_0x0044:
            float r1 = (float) r2
            float r1 = r1 / r0
            float r0 = r11.f11673
            float r2 = r11.f11672
            r3 = 0
            r4 = 1
            r5 = 0
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 >= 0) goto L_0x0053
            r2 = 1
            goto L_0x0054
        L_0x0053:
            r2 = 0
        L_0x0054:
            if (r2 == 0) goto L_0x0057
            float r1 = -r1
        L_0x0057:
            float r0 = r0 + r1
            r11.f11673 = r0
            float r0 = r11.f11673
            o.ıɭ r1 = r11.f11675
            r2 = -822083584(0xffffffffcf000000, float:-2.14748365E9)
            if (r1 != 0) goto L_0x0064
            r1 = 0
            goto L_0x006e
        L_0x0064:
            float r6 = r11.f11670
            int r7 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r7 != 0) goto L_0x006d
            float r1 = r1.f3725
            goto L_0x006e
        L_0x006d:
            r1 = r6
        L_0x006e:
            o.ıɭ r6 = r11.f11675
            r7 = 1325400064(0x4f000000, float:2.14748365E9)
            if (r6 != 0) goto L_0x0076
            r6 = 0
            goto L_0x0080
        L_0x0076:
            float r8 = r11.f11676
            int r9 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r9 != 0) goto L_0x007f
            float r6 = r6.f3730
            goto L_0x0080
        L_0x007f:
            r6 = r8
        L_0x0080:
            boolean r0 = o.C2493.m13243((float) r0, (float) r1, (float) r6)
            r0 = r0 ^ r4
            float r1 = r11.f11673
            o.ıɭ r6 = r11.f11675
            if (r6 != 0) goto L_0x008d
            r6 = 0
            goto L_0x0097
        L_0x008d:
            float r8 = r11.f11670
            int r9 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r9 != 0) goto L_0x0096
            float r6 = r6.f3725
            goto L_0x0097
        L_0x0096:
            r6 = r8
        L_0x0097:
            o.ıɭ r8 = r11.f11675
            if (r8 != 0) goto L_0x009d
            r8 = 0
            goto L_0x00a7
        L_0x009d:
            float r9 = r11.f11676
            int r10 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r10 != 0) goto L_0x00a6
            float r8 = r8.f3730
            goto L_0x00a7
        L_0x00a6:
            r8 = r9
        L_0x00a7:
            float r1 = o.C2493.m13245((float) r1, (float) r6, (float) r8)
            r11.f11673 = r1
            r11.f11674 = r12
            r11.m12364()
            r1 = 2
            if (r0 == 0) goto L_0x0143
            int r0 = r11.getRepeatCount()
            r6 = -1
            if (r0 == r6) goto L_0x0100
            int r0 = r11.f11678
            int r6 = r11.getRepeatCount()
            if (r0 < r6) goto L_0x0100
            float r12 = r11.f11672
            int r12 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r12 >= 0) goto L_0x00d8
            o.ıɭ r12 = r11.f11675
            if (r12 != 0) goto L_0x00cf
            goto L_0x00dc
        L_0x00cf:
            float r13 = r11.f11670
            int r0 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x00e7
            float r12 = r12.f3725
            goto L_0x00e8
        L_0x00d8:
            o.ıɭ r12 = r11.f11675
            if (r12 != 0) goto L_0x00de
        L_0x00dc:
            r12 = 0
            goto L_0x00e8
        L_0x00de:
            float r13 = r11.f11676
            int r0 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x00e7
            float r12 = r12.f3730
            goto L_0x00e8
        L_0x00e7:
            r12 = r13
        L_0x00e8:
            r11.f11673 = r12
            android.view.Choreographer r12 = android.view.Choreographer.getInstance()
            r12.removeFrameCallback(r11)
            r11.f11677 = r3
            float r12 = r11.f11672
            int r12 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r12 >= 0) goto L_0x00fb
            r12 = 1
            goto L_0x00fc
        L_0x00fb:
            r12 = 0
        L_0x00fc:
            r11.m12365(r12)
            goto L_0x0143
        L_0x0100:
            r11.m12368()
            int r0 = r11.f11678
            int r0 = r0 + r4
            r11.f11678 = r0
            int r0 = r11.getRepeatMode()
            if (r0 != r1) goto L_0x0119
            boolean r0 = r11.f11671
            r0 = r0 ^ r4
            r11.f11671 = r0
            float r0 = r11.f11672
            float r0 = -r0
            r11.f11672 = r0
            goto L_0x0141
        L_0x0119:
            float r0 = r11.f11672
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0121
            r0 = 1
            goto L_0x0122
        L_0x0121:
            r0 = 0
        L_0x0122:
            if (r0 == 0) goto L_0x0132
            o.ıɭ r0 = r11.f11675
            if (r0 != 0) goto L_0x0129
            goto L_0x013f
        L_0x0129:
            float r5 = r11.f11676
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 != 0) goto L_0x013f
            float r5 = r0.f3730
            goto L_0x013f
        L_0x0132:
            o.ıɭ r0 = r11.f11675
            if (r0 != 0) goto L_0x0137
            goto L_0x013f
        L_0x0137:
            float r5 = r11.f11670
            int r2 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r2 != 0) goto L_0x013f
            float r5 = r0.f3725
        L_0x013f:
            r11.f11673 = r5
        L_0x0141:
            r11.f11674 = r12
        L_0x0143:
            o.ıɭ r12 = r11.f11675
            if (r12 == 0) goto L_0x017d
            float r12 = r11.f11673
            float r13 = r11.f11670
            int r13 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r13 < 0) goto L_0x0156
            float r13 = r11.f11676
            int r12 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r12 > 0) goto L_0x0156
            goto L_0x017d
        L_0x0156:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            r13 = 3
            java.lang.Object[] r13 = new java.lang.Object[r13]
            float r0 = r11.f11670
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r13[r3] = r0
            float r0 = r11.f11676
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r13[r4] = r0
            float r0 = r11.f11673
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r13[r1] = r0
            java.lang.String r0 = "Frame must be [%f,%f]. It is %f"
            java.lang.String r13 = java.lang.String.format(r0, r13)
            r12.<init>(r13)
            throw r12
        L_0x017d:
            o.C2921.m15080()
        L_0x0180:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C2560.doFrame(long):void");
    }

    /* renamed from: Ɩ  reason: contains not printable characters */
    public final void m13637() {
        Choreographer.getInstance().removeFrameCallback(this);
        boolean z = false;
        this.f11677 = false;
        if (this.f11672 < 0.0f) {
            z = true;
        }
        m12365(z);
    }
}
