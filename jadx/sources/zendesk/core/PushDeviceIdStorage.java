package zendesk.core;

interface PushDeviceIdStorage {
    String getPushDeviceId();

    void removePushDeviceId();

    void storePushDeviceId(String str);
}
