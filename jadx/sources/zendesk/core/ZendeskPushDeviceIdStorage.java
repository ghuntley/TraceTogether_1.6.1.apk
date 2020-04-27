package zendesk.core;

class ZendeskPushDeviceIdStorage implements PushDeviceIdStorage {
    private final BaseStorage deviceIdStorage;

    ZendeskPushDeviceIdStorage(BaseStorage baseStorage) {
        this.deviceIdStorage = baseStorage;
    }

    public void storePushDeviceId(String str) {
        if (str != null) {
            this.deviceIdStorage.put("pushDeviceIdentifier", str);
        }
    }

    public String getPushDeviceId() {
        return this.deviceIdStorage.get("pushDeviceIdentifier");
    }

    public void removePushDeviceId() {
        this.deviceIdStorage.remove("pushDeviceIdentifier");
    }
}
