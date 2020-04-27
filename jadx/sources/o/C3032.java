package o;

import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.FirebaseAuth;

/* renamed from: o.Լǃ  reason: contains not printable characters */
public final class C3032 {

    /* renamed from: ɩ  reason: contains not printable characters */
    private static final SparseArray<Pair<String, String>> f13929;

    /* renamed from: ı  reason: contains not printable characters */
    public static C1984 m15494(FirebaseAuth firebaseAuth, C1220 r4, C2164 r5) {
        C0672.m5540(firebaseAuth);
        C0672.m5540(r4);
        Pair pair = f13929.get(17078);
        C1458.m8724(r4, firebaseAuth, r5);
        return new C1984((String) pair.first, (String) pair.second);
    }

    static {
        SparseArray<Pair<String, String>> sparseArray = new SparseArray<>();
        f13929 = sparseArray;
        sparseArray.put(17000, new Pair("ERROR_INVALID_CUSTOM_TOKEN", "The custom token format is incorrect. Please check the documentation."));
        f13929.put(17002, new Pair("ERROR_CUSTOM_TOKEN_MISMATCH", "The custom token corresponds to a different audience."));
        f13929.put(17004, new Pair("ERROR_INVALID_CREDENTIAL", "The supplied auth credential is malformed or has expired."));
        f13929.put(17008, new Pair("ERROR_INVALID_EMAIL", "The email address is badly formatted."));
        f13929.put(17009, new Pair("ERROR_WRONG_PASSWORD", "The password is invalid or the user does not have a password."));
        f13929.put(17024, new Pair("ERROR_USER_MISMATCH", "The supplied credentials do not correspond to the previously signed in user."));
        f13929.put(17014, new Pair("ERROR_REQUIRES_RECENT_LOGIN", "This operation is sensitive and requires recent authentication. Log in again before retrying this request."));
        f13929.put(17012, new Pair("ERROR_ACCOUNT_EXISTS_WITH_DIFFERENT_CREDENTIAL", "An account already exists with the same email address but different sign-in credentials. Sign in using a provider associated with this email address."));
        f13929.put(17007, new Pair("ERROR_EMAIL_ALREADY_IN_USE", "The email address is already in use by another account."));
        f13929.put(17025, new Pair("ERROR_CREDENTIAL_ALREADY_IN_USE", "This credential is already associated with a different user account."));
        f13929.put(17005, new Pair("ERROR_USER_DISABLED", "The user account has been disabled by an administrator."));
        f13929.put(17021, new Pair("ERROR_USER_TOKEN_EXPIRED", "The user's credential is no longer valid. The user must sign in again."));
        f13929.put(17011, new Pair("ERROR_USER_NOT_FOUND", "There is no user record corresponding to this identifier. The user may have been deleted."));
        f13929.put(17017, new Pair("ERROR_INVALID_USER_TOKEN", "This user's credential isn't valid for this project. This can happen if the user's token has been tampered with, or if the user isn't for the project associated with this API key."));
        f13929.put(17006, new Pair("ERROR_OPERATION_NOT_ALLOWED", "The given sign-in provider is disabled for this Firebase project. Enable it in the Firebase console, under the sign-in method tab of the Auth section."));
        f13929.put(17026, new Pair("ERROR_WEAK_PASSWORD", "The given password is invalid."));
        f13929.put(17029, new Pair("ERROR_EXPIRED_ACTION_CODE", "The out of band code has expired."));
        f13929.put(17030, new Pair("ERROR_INVALID_ACTION_CODE", "The out of band code is invalid. This can happen if the code is malformed, expired, or has already been used."));
        f13929.put(17031, new Pair("ERROR_INVALID_MESSAGE_PAYLOAD", "The email template corresponding to this action contains invalid characters in its message. Please fix by going to the Auth email templates section in the Firebase Console."));
        f13929.put(17033, new Pair("ERROR_INVALID_RECIPIENT_EMAIL", "The email corresponding to this action failed to send as the provided recipient email address is invalid."));
        f13929.put(17032, new Pair("ERROR_INVALID_SENDER", "The email template corresponding to this action contains an invalid sender email or name. Please fix by going to the Auth email templates section in the Firebase Console."));
        f13929.put(17034, new Pair("ERROR_MISSING_EMAIL", "An email address must be provided."));
        f13929.put(17035, new Pair("ERROR_MISSING_PASSWORD", "A password must be provided."));
        f13929.put(17041, new Pair("ERROR_MISSING_PHONE_NUMBER", "To send verification codes, provide a phone number for the recipient."));
        f13929.put(17042, new Pair("ERROR_INVALID_PHONE_NUMBER", "The format of the phone number provided is incorrect. Please enter the phone number in a format that can be parsed into E.164 format. E.164 phone numbers are written in the format [+][country code][subscriber number including area code]."));
        f13929.put(17043, new Pair("ERROR_MISSING_VERIFICATION_CODE", "The Phone Auth Credential was created with an empty sms verification Code"));
        f13929.put(17044, new Pair("ERROR_INVALID_VERIFICATION_CODE", "The sms verification code used to create the phone auth credential is invalid. Please resend the verification code sms and be sure use the verification code provided by the user."));
        f13929.put(17045, new Pair("ERROR_MISSING_VERIFICATION_ID", "The Phone Auth Credential was created with an empty verification ID"));
        f13929.put(17046, new Pair("ERROR_INVALID_VERIFICATION_ID", "The verification ID used to create the phone auth credential is invalid."));
        f13929.put(17049, new Pair("ERROR_RETRY_PHONE_AUTH", "An error occurred during authentication using the PhoneAuthCredential. Please retry authentication."));
        f13929.put(17051, new Pair("ERROR_SESSION_EXPIRED", "The sms code has expired. Please re-send the verification code to try again."));
        f13929.put(17052, new Pair("ERROR_QUOTA_EXCEEDED", "The sms quota for this project has been exceeded."));
        f13929.put(17028, new Pair("ERROR_APP_NOT_AUTHORIZED", "This app is not authorized to use Firebase Authentication. Please verify that the correct package name and SHA-1 are configured in the Firebase Console."));
        f13929.put(17063, new Pair("ERROR_API_NOT_AVAILABLE_WITHOUT_GOOGLE_PLAY", "The API that you are calling is not available on devices without Google Play services."));
        f13929.put(17062, new Pair("ERROR_WEB_INTERNAL_ERROR", "There was an internal error in the web widget."));
        f13929.put(17064, new Pair("ERROR_INVALID_CERT_HASH", "There was an error while trying to get your package certificate hash."));
        f13929.put(17065, new Pair("ERROR_WEB_STORAGE_UNSUPPORTED", "This browser is not supported or 3rd party cookies and data may be disabled."));
        f13929.put(17040, new Pair("ERROR_MISSING_CONTINUE_URI", "A continue URL must be provided in the request."));
        f13929.put(17068, new Pair("ERROR_DYNAMIC_LINK_NOT_ACTIVATED", "Please activate Dynamic Links in the Firebase Console and agree to the terms and conditions."));
        f13929.put(17071, new Pair("ERROR_INVALID_PROVIDER_ID", "The provider ID provided for the attempted web operation is invalid."));
        f13929.put(17057, new Pair("ERROR_WEB_CONTEXT_ALREADY_PRESENTED", "A headful operation is already in progress. Please wait for that to finish."));
        f13929.put(17058, new Pair("ERROR_WEB_CONTEXT_CANCELED", "The web operation was canceled by the user."));
        f13929.put(17072, new Pair("ERROR_TENANT_ID_MISMATCH", "The provided tenant ID does not match the Auth instance's tenant ID."));
        f13929.put(17073, new Pair("ERROR_UNSUPPORTED_TENANT_OPERATION", "This operation is not supported in a multi-tenant context."));
        f13929.put(17074, new Pair("ERROR_INVALID_DYNAMIC_LINK_DOMAIN", "The provided dynamic link domain is not configured or authorized for the current project."));
        f13929.put(17075, new Pair("ERROR_REJECTED_CREDENTIAL", "The request contains malformed or mismatching credentials"));
        f13929.put(17077, new Pair("ERROR_PHONE_NUMBER_NOT_FOUND", "The provided phone number does not match any of the second factor phone numbers associated with this user."));
        f13929.put(17079, new Pair("ERROR_INVALID_TENANT_ID", "The Auth instance's tenant ID is invalid."));
        f13929.put(17078, new Pair("ERROR_SECOND_FACTOR_REQUIRED", "Please complete a second factor challenge to finish signing into this account."));
        f13929.put(17080, new Pair("ERROR_API_NOT_AVAILABLE", "The API that you are calling is not available."));
        f13929.put(17081, new Pair("ERROR_MISSING_MULTI_FACTOR_SESSION", "The request is missing proof of first factor successful sign-in."));
        f13929.put(17082, new Pair("ERROR_MISSING_MULTI_FACTOR_INFO", "No second factor identifier is provided."));
        f13929.put(17083, new Pair("ERROR_INVALID_MULTI_FACTOR_SESSION", "The request does not contain a valid proof of first factor successful sign-in."));
        f13929.put(17084, new Pair("ERROR_MULTI_FACTOR_INFO_NOT_FOUND", "The user does not have a second factor matching the identifier provided."));
        f13929.put(17085, new Pair("ERROR_ADMIN_RESTRICTED_OPERATION", "This operation is restricted to administrators only."));
        f13929.put(17086, new Pair("ERROR_UNVERIFIED_EMAIL", "This operation requires a verified email."));
        f13929.put(17087, new Pair("ERROR_SECOND_FACTOR_ALREADY_ENROLLED", "The second factor is already enrolled on this account."));
        f13929.put(17088, new Pair("ERROR_MAXIMUM_SECOND_FACTOR_COUNT_EXCEEDED", "The maximum allowed number of second factors on a user has been exceeded."));
        f13929.put(17089, new Pair("ERROR_UNSUPPORTED_FIRST_FACTOR", "Enrolling a second factor or signing in with a multi-factor account requires sign-in with a supported first factor."));
        f13929.put(17090, new Pair("ERROR_EMAIL_CHANGE_NEEDS_VERIFICATION", "Multi-factor users must always have a verified email."));
        f13929.put(17091, new Pair("ERROR_INTERNAL_SUCCESS_SIGN_OUT", "This is an internal error code indicating that the operation was successful but the user needs to be signed out."));
        f13929.put(17093, new Pair("ERROR_MISSING_CLIENT_IDENTIFIER", "This request is missing a reCAPTCHA token."));
        f13929.put(17094, new Pair("ERROR_MISSING_OR_INVALID_NONCE", "The request does not contain a valid nonce. This can occur if the SHA-256 hash of the provided raw nonce does not match the hashed nonce in the ID token payload."));
        f13929.put(18001, new Pair("ERROR_USER_CANCELLED", "The user did not grant your application the permissions it requested."));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v25, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v17, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v32, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v20, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v35, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v23, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v38, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v26, resolved type: java.lang.String} */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00e0, code lost:
        return new o.C3034(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00ed, code lost:
        r0 = f13929.get(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00f7, code lost:
        if (r0 == null) goto L_0x00fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00f9, code lost:
        r4 = r0.first;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0101, code lost:
        return new o.C2133(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0102, code lost:
        r0 = f13929.get(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x010c, code lost:
        if (r0 == null) goto L_0x0113;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x010e, code lost:
        r4 = r0.first;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0116, code lost:
        return new o.C1590(r4, r1);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: ɩ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static o.C1590 m15497(com.google.android.gms.common.api.Status r5) {
        /*
            int r0 = r5.f536
            android.util.SparseArray<android.util.Pair<java.lang.String, java.lang.String>> r1 = f13929
            java.lang.Object r1 = r1.get(r0)
            android.util.Pair r1 = (android.util.Pair) r1
            java.lang.String r2 = "An internal error has occurred."
            if (r1 == 0) goto L_0x0013
            java.lang.Object r1 = r1.second
            java.lang.String r1 = (java.lang.String) r1
            goto L_0x0014
        L_0x0013:
            r1 = r2
        L_0x0014:
            java.lang.String r1 = m15495(r1, r5)
            r3 = 17020(0x427c, float:2.385E-41)
            if (r0 == r3) goto L_0x015c
            r3 = 17021(0x427d, float:2.3852E-41)
            java.lang.String r4 = "INTERNAL_ERROR"
            if (r0 == r3) goto L_0x0147
            r3 = 17051(0x429b, float:2.3894E-41)
            if (r0 == r3) goto L_0x0132
            r3 = 17052(0x429c, float:2.3895E-41)
            if (r0 == r3) goto L_0x012c
            r3 = 17057(0x42a1, float:2.3902E-41)
            if (r0 == r3) goto L_0x0117
            r3 = 17058(0x42a2, float:2.3903E-41)
            if (r0 == r3) goto L_0x0117
            switch(r0) {
                case 17000: goto L_0x0132;
                case 17002: goto L_0x0132;
                case 17004: goto L_0x0132;
                case 17005: goto L_0x0147;
                case 17006: goto L_0x0102;
                case 17007: goto L_0x00ed;
                case 17008: goto L_0x0132;
                case 17009: goto L_0x0132;
                case 17010: goto L_0x00e1;
                case 17011: goto L_0x0147;
                case 17012: goto L_0x00ed;
                case 17049: goto L_0x0132;
                case 17068: goto L_0x0102;
                case 17077: goto L_0x0132;
                case 17079: goto L_0x0102;
                case 17080: goto L_0x00db;
                case 17081: goto L_0x0132;
                case 17082: goto L_0x0132;
                case 17083: goto L_0x0132;
                case 17084: goto L_0x0132;
                case 17085: goto L_0x0102;
                case 17086: goto L_0x0102;
                case 17087: goto L_0x0102;
                case 17088: goto L_0x0102;
                case 17089: goto L_0x0102;
                case 17090: goto L_0x0102;
                case 17091: goto L_0x0102;
                case 17093: goto L_0x0102;
                case 17094: goto L_0x0132;
                case 17495: goto L_0x00cf;
                case 17499: goto L_0x00c5;
                case 18001: goto L_0x0102;
                default: goto L_0x0035;
            }
        L_0x0035:
            switch(r0) {
                case 17014: goto L_0x00b0;
                case 17015: goto L_0x00a4;
                case 17016: goto L_0x0098;
                case 17017: goto L_0x0147;
                default: goto L_0x0038;
            }
        L_0x0038:
            switch(r0) {
                case 17024: goto L_0x0132;
                case 17025: goto L_0x00ed;
                case 17026: goto L_0x0083;
                default: goto L_0x003b;
            }
        L_0x003b:
            switch(r0) {
                case 17028: goto L_0x0102;
                case 17029: goto L_0x006e;
                case 17030: goto L_0x006e;
                case 17031: goto L_0x0059;
                case 17032: goto L_0x0059;
                case 17033: goto L_0x0059;
                case 17034: goto L_0x0132;
                case 17035: goto L_0x0132;
                default: goto L_0x003e;
            }
        L_0x003e:
            switch(r0) {
                case 17040: goto L_0x0102;
                case 17041: goto L_0x0132;
                case 17042: goto L_0x0132;
                case 17043: goto L_0x0132;
                case 17044: goto L_0x0132;
                case 17045: goto L_0x0132;
                case 17046: goto L_0x0132;
                default: goto L_0x0041;
            }
        L_0x0041:
            switch(r0) {
                case 17061: goto L_0x004d;
                case 17062: goto L_0x0117;
                case 17063: goto L_0x00db;
                case 17064: goto L_0x0102;
                case 17065: goto L_0x0117;
                default: goto L_0x0044;
            }
        L_0x0044:
            switch(r0) {
                case 17071: goto L_0x0102;
                case 17072: goto L_0x0102;
                case 17073: goto L_0x0102;
                case 17074: goto L_0x0102;
                case 17075: goto L_0x0132;
                default: goto L_0x0047;
            }
        L_0x0047:
            o.ʀι r5 = new o.ʀι
            r5.<init>(r2)
            return r5
        L_0x004d:
            java.lang.String r0 = "There was a failure in the connection between the web widget and the Firebase Auth backend."
            java.lang.String r5 = m15495(r0, r5)
            o.ʁι r0 = new o.ʁι
            r0.<init>(r5)
            return r0
        L_0x0059:
            o.ԼІ r5 = new o.ԼІ
            android.util.SparseArray<android.util.Pair<java.lang.String, java.lang.String>> r2 = f13929
            java.lang.Object r0 = r2.get(r0)
            android.util.Pair r0 = (android.util.Pair) r0
            if (r0 == 0) goto L_0x006a
            java.lang.Object r0 = r0.first
            r4 = r0
            java.lang.String r4 = (java.lang.String) r4
        L_0x006a:
            r5.<init>(r4, r1)
            return r5
        L_0x006e:
            o.ıȣ r5 = new o.ıȣ
            android.util.SparseArray<android.util.Pair<java.lang.String, java.lang.String>> r2 = f13929
            java.lang.Object r0 = r2.get(r0)
            android.util.Pair r0 = (android.util.Pair) r0
            if (r0 == 0) goto L_0x007f
            java.lang.Object r0 = r0.first
            r4 = r0
            java.lang.String r4 = (java.lang.String) r4
        L_0x007f:
            r5.<init>((java.lang.String) r4, (java.lang.String) r1)
            return r5
        L_0x0083:
            o.ϗ r5 = new o.ϗ
            android.util.SparseArray<android.util.Pair<java.lang.String, java.lang.String>> r2 = f13929
            java.lang.Object r0 = r2.get(r0)
            android.util.Pair r0 = (android.util.Pair) r0
            if (r0 == 0) goto L_0x0094
            java.lang.Object r0 = r0.first
            r4 = r0
            java.lang.String r4 = (java.lang.String) r4
        L_0x0094:
            r5.<init>(r4, r1)
            return r5
        L_0x0098:
            java.lang.String r0 = "User was not linked to an account with the given provider."
            java.lang.String r5 = m15495(r0, r5)
            o.ʀι r0 = new o.ʀι
            r0.<init>(r5)
            return r0
        L_0x00a4:
            java.lang.String r0 = "User has already been linked to the given provider."
            java.lang.String r5 = m15495(r0, r5)
            o.ʀι r0 = new o.ʀι
            r0.<init>(r5)
            return r0
        L_0x00b0:
            o.ιʁ r5 = new o.ιʁ
            android.util.SparseArray<android.util.Pair<java.lang.String, java.lang.String>> r2 = f13929
            java.lang.Object r0 = r2.get(r0)
            android.util.Pair r0 = (android.util.Pair) r0
            if (r0 == 0) goto L_0x00c1
            java.lang.Object r0 = r0.first
            r4 = r0
            java.lang.String r4 = (java.lang.String) r4
        L_0x00c1:
            r5.<init>(r4, r1)
            return r5
        L_0x00c5:
            java.lang.String r5 = m15495(r2, r5)
            o.ʀι r0 = new o.ʀι
            r0.<init>(r5)
            return r0
        L_0x00cf:
            java.lang.String r0 = "Please sign in before trying to get a token."
            java.lang.String r5 = m15495(r0, r5)
            o.ıҽ r0 = new o.ıҽ
            r0.<init>(r5)
            return r0
        L_0x00db:
            o.ԼІ r5 = new o.ԼІ
            r5.<init>(r1)
            return r5
        L_0x00e1:
            java.lang.String r0 = "We have blocked all requests from this device due to unusual activity. Try again later."
            java.lang.String r5 = m15495(r0, r5)
            o.Ιƶ r0 = new o.Ιƶ
            r0.<init>(r5)
            return r0
        L_0x00ed:
            o.φ r5 = new o.φ
            android.util.SparseArray<android.util.Pair<java.lang.String, java.lang.String>> r2 = f13929
            java.lang.Object r0 = r2.get(r0)
            android.util.Pair r0 = (android.util.Pair) r0
            if (r0 == 0) goto L_0x00fe
            java.lang.Object r0 = r0.first
            r4 = r0
            java.lang.String r4 = (java.lang.String) r4
        L_0x00fe:
            r5.<init>(r4, r1)
            return r5
        L_0x0102:
            o.ʀι r5 = new o.ʀι
            android.util.SparseArray<android.util.Pair<java.lang.String, java.lang.String>> r2 = f13929
            java.lang.Object r0 = r2.get(r0)
            android.util.Pair r0 = (android.util.Pair) r0
            if (r0 == 0) goto L_0x0113
            java.lang.Object r0 = r0.first
            r4 = r0
            java.lang.String r4 = (java.lang.String) r4
        L_0x0113:
            r5.<init>((java.lang.String) r4, (java.lang.String) r1)
            return r5
        L_0x0117:
            o.ιө r5 = new o.ιө
            android.util.SparseArray<android.util.Pair<java.lang.String, java.lang.String>> r2 = f13929
            java.lang.Object r0 = r2.get(r0)
            android.util.Pair r0 = (android.util.Pair) r0
            if (r0 == 0) goto L_0x0128
            java.lang.Object r0 = r0.first
            r4 = r0
            java.lang.String r4 = (java.lang.String) r4
        L_0x0128:
            r5.<init>(r4, r1)
            return r5
        L_0x012c:
            o.Ιƶ r5 = new o.Ιƶ
            r5.<init>(r1)
            return r5
        L_0x0132:
            o.ιѳ r5 = new o.ιѳ
            android.util.SparseArray<android.util.Pair<java.lang.String, java.lang.String>> r2 = f13929
            java.lang.Object r0 = r2.get(r0)
            android.util.Pair r0 = (android.util.Pair) r0
            if (r0 == 0) goto L_0x0143
            java.lang.Object r0 = r0.first
            r4 = r0
            java.lang.String r4 = (java.lang.String) r4
        L_0x0143:
            r5.<init>(r4, r1)
            return r5
        L_0x0147:
            o.ιа r5 = new o.ιа
            android.util.SparseArray<android.util.Pair<java.lang.String, java.lang.String>> r2 = f13929
            java.lang.Object r0 = r2.get(r0)
            android.util.Pair r0 = (android.util.Pair) r0
            if (r0 == 0) goto L_0x0158
            java.lang.Object r0 = r0.first
            r4 = r0
            java.lang.String r4 = (java.lang.String) r4
        L_0x0158:
            r5.<init>(r4, r1)
            return r5
        L_0x015c:
            java.lang.String r0 = "A network error (such as timeout, interrupted connection or unreachable host) has occurred."
            java.lang.String r5 = m15495(r0, r5)
            o.ʁι r0 = new o.ʁι
            r0.<init>(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C3032.m15497(com.google.android.gms.common.api.Status):o.ʀι");
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static C2133 m15496(Status status) {
        int i = status.f536;
        Pair pair = f13929.get(i);
        String r3 = m15495(pair != null ? (String) pair.second : "An internal error has occurred.", status);
        Pair pair2 = f13929.get(i);
        return new C2133(pair2 != null ? (String) pair2.first : "INTERNAL_ERROR", r3);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private static String m15495(String str, Status status) {
        if (TextUtils.isEmpty(status.f537)) {
            return str;
        }
        return String.format(String.valueOf(str).concat(" [ %s ]"), new Object[]{status.f537});
    }
}
