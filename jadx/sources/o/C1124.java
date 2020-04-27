package o;

import java.io.IOException;

/* renamed from: o.ɛı  reason: contains not printable characters */
public class C1124 extends IOException {

    /* renamed from: ı  reason: contains not printable characters */
    private C1637 f6639 = null;

    public C1124(String str) {
        super(str);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    static C1124 m7558() {
        return new C1124("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    static C1124 m7559() {
        return new C1124("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* renamed from: ι  reason: contains not printable characters */
    static C1124 m7562() {
        return new C1124("CodedInputStream encountered a malformed varint.");
    }

    /* renamed from: Ι  reason: contains not printable characters */
    static C1124 m7561() {
        return new C1124("Protocol message contained an invalid tag (zero).");
    }

    /* renamed from: ı  reason: contains not printable characters */
    static C1124 m7557() {
        return new C1124("Protocol message end-group tag did not match expected tag.");
    }

    /* renamed from: ɹ  reason: contains not printable characters */
    static C1071 m7560() {
        return new C1071("Protocol message tag had invalid wire type.");
    }

    /* renamed from: І  reason: contains not printable characters */
    static C1124 m7563() {
        return new C1124("Failed to parse the message.");
    }

    /* renamed from: Ӏ  reason: contains not printable characters */
    static C1124 m7564() {
        return new C1124("Protocol message had invalid UTF-8.");
    }
}
