package zendesk.core;

import android.content.Context;
import o.C3351dc;
import o.M;

public final class ZendeskApplicationModule_ProvideDeviceInfoFactory implements M<DeviceInfo> {
    private final C3351dc<Context> contextProvider;

    public ZendeskApplicationModule_ProvideDeviceInfoFactory(C3351dc<Context> dcVar) {
        this.contextProvider = dcVar;
    }

    public final DeviceInfo get() {
        DeviceInfo provideDeviceInfo = ZendeskApplicationModule.provideDeviceInfo(this.contextProvider.get());
        if (provideDeviceInfo != null) {
            return provideDeviceInfo;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static M<DeviceInfo> create(C3351dc<Context> dcVar) {
        return new ZendeskApplicationModule_ProvideDeviceInfoFactory(dcVar);
    }
}
