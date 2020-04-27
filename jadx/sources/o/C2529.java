package o;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: o.эΙ  reason: contains not printable characters */
public final class C2529 {

    /* renamed from: ı  reason: contains not printable characters */
    public static C2019<String> f11496 = m13458("measurement.config.url_authority", "app-measurement.com", "app-measurement.com", C0636.f4624);

    /* renamed from: ıı  reason: contains not printable characters */
    public static C2019<Boolean> f11497 = m13458("measurement.client.sessions.start_session_before_view_screen", true, true, C0766.f5128);

    /* renamed from: ıǃ  reason: contains not printable characters */
    public static C2019<Boolean> f11498 = m13458("measurement.collection.firebase_global_collection_flag_enabled", true, true, C0795.f5260);

    /* renamed from: ıɩ  reason: contains not printable characters */
    public static C2019<Boolean> f11499 = m13458("measurement.collection.event_safelist", true, true, C1016.f6216);

    /* renamed from: ıΙ  reason: contains not printable characters */
    public static C2019<Boolean> f11500 = m13458("measurement.lifecycle.app_in_background_parameter", false, false, C1816.f9271);

    /* renamed from: ıι  reason: contains not printable characters */
    public static C2019<Boolean> f11501 = m13458("measurement.client.audience.scoped_engagement_removal_when_session_expired", true, true, C1139.f6665);

    /* renamed from: ıІ  reason: contains not printable characters */
    public static C2019<Boolean> f11502 = m13458("measurement.lifecycle.app_backgrounded_engagement", false, false, C1853.f9474);

    /* renamed from: ıі  reason: contains not printable characters */
    public static C2019<Boolean> f11503 = m13458("measurement.service.fix_gmp_version", false, false, C1815.f9270);

    /* renamed from: ıӀ  reason: contains not printable characters */
    public static C2019<Boolean> f11504 = m13458("measurement.service.disable_install_state_reporting", true, true, C1938.f9779);

    /* renamed from: ĸ  reason: contains not printable characters */
    public static C2019<Boolean> f11505 = m13458("measurement.service.audience.session_scoped_user_engagement", true, true, C1142.f6669);

    /* renamed from: Ŀ  reason: contains not printable characters */
    public static C2019<Boolean> f11506 = m13458("measurement.service.audience.session_scoped_event_aggregates", true, true, C1131.f6647);

    /* renamed from: ŀ  reason: contains not printable characters */
    public static C2019<String> f11507 = m13458("measurement.upload.url", "https://app-measurement.com/a", "https://app-measurement.com/a", C2939.f13646);

    /* renamed from: ł  reason: contains not printable characters */
    public static C2019<Long> f11508 = m13458("measurement.upload.realtime_upload_interval", 10000L, 10000L, C2820.f13242);

    /* renamed from: ſ  reason: contains not printable characters */
    public static C2019<Long> f11509 = m13458("measurement.alarm_manager.minimum_interval", 60000L, 60000L, C2977.f13744);

    /* renamed from: Ɩ  reason: contains not printable characters */
    public static C2019<Integer> f11510 = m13458("measurement.upload.max_events_per_day", 100000, 100000, C1896.f9614);

    /* renamed from: Ɨ  reason: contains not printable characters */
    public static C2019<Long> f11511 = m13458("measurement.upload.debug_upload_interval", 1000L, 1000L, C2949.f13675);

    /* renamed from: ƚ  reason: contains not printable characters */
    public static C2019<Long> f11512 = m13458("measurement.upload.stale_data_deletion_interval", 86400000L, 86400000L, C3038.f13949);

    /* renamed from: ǀ  reason: contains not printable characters */
    public static C2019<Long> f11513 = m13458("measurement.upload.max_queue_time", 2419200000L, 2419200000L, C3006.f13862);

    /* renamed from: ǃ  reason: contains not printable characters */
    public static C2019<Long> f11514 = m13458("measurement.monitoring.sample_period_millis", 86400000L, 86400000L, C2520.f11445);

    /* renamed from: ǃı  reason: contains not printable characters */
    public static C2019<Boolean> f11515 = m13458("measurement.client.sessions.check_on_startup", true, true, C0773.f5179);

    /* renamed from: ǃǃ  reason: contains not printable characters */
    public static C2019<Boolean> f11516 = m13458("measurement.collection.efficient_engagement_reporting_enabled_2", false, false, C0794.f5259);

    /* renamed from: ǃɩ  reason: contains not printable characters */
    public static C2019<Boolean> f11517 = m13458("measurement.service.audience.remove_disabled_session_scoped_user_engagement", false, false, C1181.f6789);

    /* renamed from: ǃΙ  reason: contains not printable characters */
    public static C2019<Boolean> f11518 = m13458("measurement.collection.service.update_with_analytics_fix", false, false, C1879.f9567);

    /* renamed from: ǃι  reason: contains not printable characters */
    public static C2019<Boolean> f11519 = m13458("measurement.service.audience.scoped_engagement_removal_when_session_expired", true, true, C1141.f6668);

    /* renamed from: ǃІ  reason: contains not printable characters */
    public static C2019<Boolean> f11520 = m13458("measurement.client.firebase_feature_rollout.v1.enable", true, true, C1940.f9780);

    /* renamed from: ǃі  reason: contains not printable characters */
    public static C2019<Boolean> f11521 = m13458("measurement.service.use_appinfo_modified", false, false, C1894.f9611);

    /* renamed from: ǃӀ  reason: contains not printable characters */
    public static C2019<Boolean> f11522 = m13458("measurement.config.string.always_update_disk_on_set", false, false, C1959.f9849);

    /* renamed from: ȷ  reason: contains not printable characters */
    public static C2019<Integer> f11523 = m13458("measurement.upload.max_realtime_events_per_day", 10, 10, C2793.f13212);

    /* renamed from: Ƚ  reason: contains not printable characters */
    public static C2019<Boolean> f11524 = m13458("measurement.service.audience.use_bundle_timestamp_for_property_filters", true, true, C1246.f7060);

    /* renamed from: ɂ  reason: contains not printable characters */
    public static C2019<Boolean> f11525 = m13458("measurement.collection.redundant_engagement_removal_enabled", false, false, C0816.f5321);

    /* renamed from: Ɉ  reason: contains not printable characters */
    public static C2019<Boolean> f11526 = m13458("measurement.personalized_ads_signals_collection_enabled", true, true, C0793.f5258);

    /* renamed from: ɉ  reason: contains not printable characters */
    public static C2019<Boolean> f11527 = m13458("measurement.collection.log_event_and_bundle_v2", true, true, C1003.f6065);

    /* renamed from: ɍ  reason: contains not printable characters */
    public static C2019<Long> f11528 = m13458("measurement.upload.refresh_blacklisted_config_interval", 604800000L, 604800000L, C3175.f14430);

    /* renamed from: ɔ  reason: contains not printable characters */
    public static C2019<Integer> f11529 = m13458("measurement.lifetimevalue.max_currency_tracked", 4, 4, C0403.f3961);

    /* renamed from: ɟ  reason: contains not printable characters */
    public static C2019<Long> f11530 = m13458("measurement.upload.initial_upload_delay_time", 15000L, 15000L, C3200.f14543);

    /* renamed from: ɤ  reason: contains not printable characters */
    public static C2019<Boolean> f11531 = m13458("measurement.client.sessions.check_on_reset_and_enable", false, false, C1901.f9625);

    /* renamed from: ɨ  reason: contains not printable characters */
    public static C2019<Integer> f11532 = m13458("measurement.upload.max_error_events_per_day", 1000, 1000, C2542.f11627);

    /* renamed from: ɩ  reason: contains not printable characters */
    public static C2019<Long> f11533 = m13458("measurement.config.cache_time", 86400000L, 3600000L, C2953.f13685);

    /* renamed from: ɩı  reason: contains not printable characters */
    public static C2019<Boolean> f11534 = m13458("measurement.audience.refresh_event_count_filters_timestamp", false, false, C1523.f8129);

    /* renamed from: ɩǃ  reason: contains not printable characters */
    public static C2019<Boolean> f11535 = m13458("measurement.service.audience.fix_prepending_previous_sequence_timestamp", true, true, C1281.f7220);

    /* renamed from: ɩɩ  reason: contains not printable characters */
    public static C2019<Boolean> f11536 = m13458("measurement.scheduler.task_thread.cleanup_on_exit", false, false, C1941.f9781);

    /* renamed from: ɩι  reason: contains not printable characters */
    public static C2019<Boolean> f11537 = m13458("measurement.upload.file_truncate_fix", false, false, C1953.f9842);

    /* renamed from: ɪ  reason: contains not printable characters */
    public static C2019<Integer> f11538 = m13458("measurement.upload.max_public_events_per_day", 50000, 50000, C2788.f13183);

    /* renamed from: ɫ  reason: contains not printable characters */
    public static C2019<Boolean> f11539 = m13458("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false, false, C1310.f7287);

    /* renamed from: ɬ  reason: contains not printable characters */
    public static C2019<Boolean> f11540 = m13458("measurement.lifecycle.app_background_timestamp_when_backgrounded", true, true, C1946.f9827);

    /* renamed from: ɭ  reason: contains not printable characters */
    public static C2019<String> f11541 = m13458("measurement.test.string_flag", "---", "---", C0462.f4079);

    /* renamed from: ɹ  reason: contains not printable characters */
    public static C2019<Integer> f11542 = m13458("measurement.upload.max_bundles", 100, 100, C0731.f4961);

    /* renamed from: ɺ  reason: contains not printable characters */
    public static C2019<Integer> f11543 = m13458("measurement.upload.retry_count", 6, 6, C0368.f3828);

    /* renamed from: ɻ  reason: contains not printable characters */
    public static C2019<Boolean> f11544 = m13458("measurement.validation.internal_limits_internal_event_params", false, false, C0536.f4369);

    /* renamed from: ɼ  reason: contains not printable characters */
    public static C2019<Long> f11545 = m13458("measurement.upload.retry_time", 1800000L, 1800000L, C3046.f13965);

    /* renamed from: ɽ  reason: contains not printable characters */
    public static C2019<Boolean> f11546 = m13458("measurement.service.audience.fix_skip_audience_with_failed_filters", true, true, C1403.f7666);

    /* renamed from: ɾ  reason: contains not printable characters */
    public static C2019<Integer> f11547 = m13458("measurement.store.max_stored_events_per_app", 100000, 100000, C2842.f13289);

    /* renamed from: ɿ  reason: contains not printable characters */
    public static C2019<Long> f11548 = m13458("measurement.upload.interval", 3600000L, 3600000L, C2962.f13692);

    /* renamed from: ʃ  reason: contains not printable characters */
    public static C2019<Boolean> f11549 = m13458("measurement.experiment.enable_experiment_reporting", true, true, C0853.f5568);

    /* renamed from: ʅ  reason: contains not printable characters */
    public static C2019<Long> f11550 = m13458("measurement.upload.minimum_delay", 500L, 500L, C2981.f13754);

    /* renamed from: ʇ  reason: contains not printable characters */
    public static C2019<Boolean> f11551 = m13458("measurement.sdk.collection.last_deep_link_referrer2", true, true, C1699.f8877);

    /* renamed from: ʋ  reason: contains not printable characters */
    public static C2019<Boolean> f11552 = m13458("measurement.app_launch.event_ordering_fix", false, false, C1434.f7768);

    /* renamed from: ʌ  reason: contains not printable characters */
    public static C2019<Boolean> f11553 = m13458("measurement.module.collection.conditionally_omit_admob_app_id", true, true, C1002.f6064);

    /* renamed from: ʏ  reason: contains not printable characters */
    public static C2019<Boolean> f11554 = m13458("measurement.service.sessions.session_number_enabled", true, true, C0630.f4617);

    /* renamed from: ʔ  reason: contains not printable characters */
    public static C2019<Boolean> f11555 = m13458("measurement.client.sessions.session_id_enabled", true, true, C0632.f4618);

    /* renamed from: ʕ  reason: contains not printable characters */
    public static C2019<Boolean> f11556 = m13458("measurement.referrer.enable_logging_install_referrer_cmp_from_apk", false, false, C0570.f4477);

    /* renamed from: ʖ  reason: contains not printable characters */
    public static C2019<Integer> f11557 = m13458("measurement.max_bundles_per_iteration", 1, 1, C0477.f4106);

    /* renamed from: ʟ  reason: contains not printable characters */
    public static C2019<Long> f11558 = m13458("measurement.upload.backoff_period", 43200000L, 43200000L, C2840.f13288);

    /* renamed from: ͻ  reason: contains not printable characters */
    public static C2019<Long> f11559 = m13458("measurement.service_client.idle_disconnect_millis", 5000L, 5000L, C0417.f3990);

    /* renamed from: ͼ  reason: contains not printable characters */
    public static C2019<Boolean> f11560 = m13458("measurement.personalized_ads_property_translation_enabled", true, true, C0792.f5257);

    /* renamed from: ͽ  reason: contains not printable characters */
    public static C2019<Boolean> f11561 = m13458("measurement.quality.checksum", false, false, (C2018) null);

    /* renamed from: Γ  reason: contains not printable characters */
    public static C2019<Boolean> f11562 = m13458("measurement.client.sessions.remove_expired_session_properties_enabled", true, true, C0634.f4619);

    /* renamed from: Ι  reason: contains not printable characters */
    public static C2019<String> f11563 = m13458("measurement.config.url_scheme", "https", "https", C3210.f14570);

    /* renamed from: Ιı  reason: contains not printable characters */
    public static C2019<Boolean> f11564 = m13458("measurement.engagement_time_main_thread", true, true, C2051.f10105);

    /* renamed from: Ιǃ  reason: contains not printable characters */
    public static C2019<Boolean> f11565 = m13458("measurement.gold.enhanced_ecommerce.format_logs", false, false, C2544.f11628);

    /* renamed from: Ξ  reason: contains not printable characters */
    public static C2019<Boolean> f11566 = m13458("measurement.sdk.collection.validate_param_names_alphabetical", false, false, C1129.f6646);

    /* renamed from: Τ  reason: contains not printable characters */
    public static C2019<Boolean> f11567 = m13458("measurement.logging.improved_messaging_q4_2019_service", true, true, C2532.f11613);

    /* renamed from: Υ  reason: contains not printable characters */
    public static C2019<Boolean> f11568 = m13458("measurement.audience.use_bundle_timestamp_for_event_count_filters", false, false, C1615.f8528);

    /* renamed from: ι  reason: contains not printable characters */
    public static C2019<Long> f11569 = m13458("measurement.ad_id_cache_time", 10000L, 10000L, C2450.f11111);

    /* renamed from: ιı  reason: contains not printable characters */
    public static C2019<Boolean> f11570 = m13458("measurement.sdk.collection.last_deep_link_referrer_campaign2", false, false, C1675.f8700);

    /* renamed from: ιǃ  reason: contains not printable characters */
    public static C2019<Boolean> f11571 = m13458("measurement.sdk.collection.retrieve_deeplink_from_bow_2", true, true, C1428.f7765);

    /* renamed from: ιɩ  reason: contains not printable characters */
    public static C2019<Boolean> f11572 = m13458("measurement.sdk.referrer.delayed_install_referrer_api", false, false, C2013.f9969);

    /* renamed from: ιι  reason: contains not printable characters */
    public static C2019<Boolean> f11573 = m13458("measurement.logging.improved_messaging_q4_2019_client", true, true, C2545.f11629);

    /* renamed from: ο  reason: contains not printable characters */
    public static C2019<Boolean> f11574 = m13458("measurement.gold.enhanced_ecommerce.updated_schema.client.dev", false, false, C2625.f11965);

    /* renamed from: ς  reason: contains not printable characters */
    public static C2019<Boolean> f11575 = m13458("measurement.sdk.dynamite.use_dynamite2", false, false, C0935.f5912);

    /* renamed from: τ  reason: contains not printable characters */
    public static C2019<Boolean> f11576 = m13458("measurement.service.sessions.remove_disabled_session_number", true, true, C0732.f4962);

    /* renamed from: υ  reason: contains not printable characters */
    public static C2019<Boolean> f11577 = m13458("measurement.gold.enhanced_ecommerce.upload_nested_complex_events", false, false, C2531.f11612);

    /* renamed from: ϛ  reason: contains not printable characters */
    public static C2019<Boolean> f11578 = m13458("measurement.sdk.dynamite.allow_remote_dynamite", false, false, C1004.f6066);

    /* renamed from: ϟ  reason: contains not printable characters */
    public static C2019<Boolean> f11579 = m13458("measurement.sdk.collection.enable_extend_user_property_size", true, true, C1715.f8903);

    /* renamed from: ϲ  reason: contains not printable characters */
    public static C2019<Integer> f11580 = m13458("measurement.upload.max_public_user_properties", 25, 25, (C2018) null);

    /* renamed from: ϳ  reason: contains not printable characters */
    public static C2019<Integer> f11581 = m13458("measurement.upload.max_event_name_cardinality", 500, 500, (C2018) null);

    /* renamed from: І  reason: contains not printable characters */
    public static C2019<Integer> f11582 = m13458("measurement.upload.max_batch_size", 65536, 65536, C1132.f6648);

    /* renamed from: Іı  reason: contains not printable characters */
    public static C2019<Boolean> f11583 = m13458("measurement.gold.enhanced_ecommerce.nested_param_daily_event_count", false, false, C2548.f11635);

    /* renamed from: Іǃ  reason: contains not printable characters */
    public static C2019<Boolean> f11584 = m13458("measurement.gold.enhanced_ecommerce.updated_schema.service", false, false, C2627.f11967);

    /* renamed from: Ј  reason: contains not printable characters */
    public static C2019<Boolean> f11585 = m13458("measurement.test.boolean_flag", false, false, C0467.f4085);

    /* renamed from: Г  reason: contains not printable characters */
    public static C2019<Boolean> f11586 = m13458("measurement.service.sessions.session_number_backfill_enabled", true, true, C0682.f4829);

    /* renamed from: Т  reason: contains not printable characters */
    public static C2019<Boolean> f11587 = m13458("measurement.gold.enhanced_ecommerce.log_nested_complex_events.dev", false, false, C2586.f11739);

    /* renamed from: г  reason: contains not printable characters */
    public static C2019<Long> f11588 = m13458("measurement.upload.window_interval", 3600000L, 3600000L, C2892.f13460);

    /* renamed from: о  reason: contains not printable characters */
    private static Set<C2019<?>> f11589 = Collections.synchronizedSet(new HashSet());

    /* renamed from: с  reason: contains not printable characters */
    public static C2019<Integer> f11590 = m13458("measurement.audience.filter_result_max_count", 200, 200, C0419.f3992);

    /* renamed from: т  reason: contains not printable characters */
    public static C2019<Integer> f11591 = m13458("measurement.experiment.max_ids", 50, 50, C0535.f4368);

    /* renamed from: у  reason: contains not printable characters */
    private static C2019<Boolean> f11592 = m13458("measurement.collection.synthetic_data_mitigation", false, false, C2619.f11953);

    /* renamed from: х  reason: contains not printable characters */
    public static C2019<Double> f11593;

    /* renamed from: ч  reason: contains not printable characters */
    public static C2019<Boolean> f11594 = m13458("measurement.service.audience.scoped_filters_v27", true, true, C1239.f7015);

    /* renamed from: э  reason: contains not printable characters */
    public static C2019<Boolean> f11595 = m13458("measurement.collection.configurable_service_limits.dev", false, false, C2661.f12246);

    /* renamed from: є  reason: contains not printable characters */
    private static C2019<Boolean> f11596 = m13458("measurement.service.audience.invalidate_config_cache_after_app_unisntall", true, true, C1364.f7551);

    /* renamed from: і  reason: contains not printable characters */
    public static C2019<Integer> f11597 = m13458("measurement.upload.max_bundle_size", 65536, 65536, C1365.f7552);
    /* access modifiers changed from: private */

    /* renamed from: іı  reason: contains not printable characters */
    public static List<C2019<?>> f11598 = Collections.synchronizedList(new ArrayList());

    /* renamed from: ј  reason: contains not printable characters */
    public static C2019<Long> f11599 = m13458("measurement.test.long_flag", -1L, -1L, C0438.f4024);

    /* renamed from: ҁ  reason: contains not printable characters */
    public static C2019<Boolean> f11600 = m13458("measurement.sdk.collection.last_gclid_from_referrer2", false, false, C1618.f8537);

    /* renamed from: Ґ  reason: contains not printable characters */
    public static C2019<Boolean> f11601 = m13458("measurement.sdk.collection.worker_thread_referrer", true, true, C1635.f8595);

    /* renamed from: ґ  reason: contains not printable characters */
    public static C2019<Integer> f11602 = m13458("measurement.test.int_flag", -2, -2, C0464.f4082);

    /* renamed from: ғ  reason: contains not printable characters */
    public static C2019<Boolean> f11603 = m13458("measurement.sampling.calculate_bundle_timestamp_before_sampling", true, true, C1724.f8935);

    /* renamed from: ҭ  reason: contains not printable characters */
    public static C2019<Boolean> f11604 = m13458("measurement.upload.file_lock_state_check", false, false, C1800.f9238);

    /* renamed from: Ү  reason: contains not printable characters */
    public static C2019<Boolean> f11605 = m13458("measurement.ga.ga_app_id", false, false, C1874.f9551);

    /* renamed from: Ӏ  reason: contains not printable characters */
    public static C2019<Integer> f11606 = m13458("measurement.upload.max_events_per_bundle", 1000, 1000, C1708.f8885);

    /* renamed from: ӏ  reason: contains not printable characters */
    public static C2019<Integer> f11607;

    /* renamed from: ӷ  reason: contains not printable characters */
    public static C2019<Boolean> f11608 = m13458("measurement.client.sessions.background_sessions_enabled", true, true, C0604.f4572);

    /* renamed from: ԇ  reason: contains not printable characters */
    public static C2019<Boolean> f11609 = m13458("measurement.integration.disable_firebase_instance_id", false, false, C1834.f9432);

    /* renamed from: ԧ  reason: contains not printable characters */
    public static C2019<Boolean> f11610 = m13458("measurement.lifecycle.app_backgrounded_tracking", true, true, C1728.f8941);

    /* renamed from: ı  reason: contains not printable characters */
    public static Map<String, String> m13420(Context context) {
        C2525 r1 = C2525.m13413(context.getContentResolver(), C2803.m14714("com.google.android.gms.measurement"));
        return r1 == null ? Collections.emptyMap() : r1.m13415();
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private static <V> C2019<V> m13458(String str, V v, V v2, C2018<V> r10) {
        C2019 r0 = new C2019(str, v, v2, r10);
        f11598.add(r0);
        return r0;
    }

    /* renamed from: υ  reason: contains not printable characters */
    static final /* synthetic */ Long m13502() {
        if (C2064.f10131 != null) {
            C2448 r0 = C2064.f10131;
        }
        return Long.valueOf(C2975.m15286());
    }

    static {
        Integer valueOf = Integer.valueOf(C3273am.f1527);
        f11607 = m13458("measurement.upload.max_conversions_per_day", valueOf, valueOf, C2629.f11969);
        Double valueOf2 = Double.valueOf(-3.0d);
        f11593 = m13458("measurement.test.double_flag", valueOf2, valueOf2, C0566.f4468);
    }
}
