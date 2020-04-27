package zendesk.support.request;

import android.content.Context;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import o.C3349da;
import o.C3602mo;
import o.C3616p;
import o.mW;
import o.nd;
import o.nf;
import o.ng;
import o.ni;
import o.nj;
import o.nk;
import o.nn;
import o.np;
import o.nr;
import o.ns;
import o.nt;
import o.nu;
import okhttp3.OkHttpClient;
import zendesk.core.ActionHandlerRegistry;
import zendesk.core.AuthenticationProvider;
import zendesk.core.Zendesk;
import zendesk.support.RequestProvider;
import zendesk.support.SupportBlipsProvider;
import zendesk.support.SupportSettingsProvider;
import zendesk.support.SupportUiStorage;
import zendesk.support.UploadProvider;
import zendesk.support.ZendeskDeepLinkHelper;
import zendesk.support.request.AsyncMiddleware;
import zendesk.support.request.AttachmentDownloaderComponent;
import zendesk.support.request.ComponentPersistence;
import zendesk.support.requestlist.RequestInfoDataSource;

public class RequestModule {
    private final mW uiConfig;

    static nk providesDispatcher(nu nuVar) {
        return nuVar;
    }

    RequestModule(mW mWVar) {
        this.uiConfig = mWVar;
    }

    static C3602mo providesBelvedere(Context context) {
        return C3602mo.m3911(context);
    }

    static ActionFactory providesActionFactory(RequestProvider requestProvider, SupportSettingsProvider supportSettingsProvider, UploadProvider uploadProvider, C3602mo moVar, SupportUiStorage supportUiStorage, ExecutorService executorService, @C3349da(m2095 = "SUPPORT_MAIN_THREAD_EXECUTOR") Executor executor, AuthenticationProvider authenticationProvider, SupportBlipsProvider supportBlipsProvider) {
        return new ActionFactory(requestProvider, uploadProvider, supportSettingsProvider, moVar, supportUiStorage, executorService, "2.2.1", authenticationProvider, Zendesk.INSTANCE, supportBlipsProvider, executor);
    }

    static List<np> providesReducer() {
        return Arrays.asList(new np[]{new ReducerProgress(), new ReducerConfiguration(), new ReducerConversation(), new ReducerAttachments(), new ReducerAndroidLifecycle(), new ReducerUiState(), new ReducerError()});
    }

    static AsyncMiddleware providesAsyncMiddleware() {
        return new AsyncMiddleware(new AsyncMiddleware.Queue());
    }

    static nu providesStore(List<np> list, AsyncMiddleware asyncMiddleware) {
        Executor executor;
        ns.C0269 r6 = ns.m4025(list);
        r6.f3430 = Arrays.asList(new nn[]{asyncMiddleware});
        ng<Object> ngVar = ni.f3400;
        if (ngVar != null) {
            r6.f3429 = ngVar;
            nd ndVar = new nd(r6.f3431);
            nf nfVar = new nf(r6.f3430);
            nt r1 = nt.m4027(ndVar.m3981(), (nt) null);
            if (ns.f3428) {
                executor = new nj.C0265();
            } else {
                executor = new nj.C0264();
            }
            return new nr(r1, ndVar, nfVar, r6.f3429, executor);
        }
        throw new IllegalArgumentException("Notifier must not be null");
    }

    static AttachmentDownloadService providesAttachmentToDiskService(OkHttpClient okHttpClient, ExecutorService executorService) {
        return new AttachmentDownloadService(okHttpClient, executorService);
    }

    static AttachmentDownloaderComponent.AttachmentDownloader providesAttachmentDownloader(C3602mo moVar, AttachmentDownloadService attachmentDownloadService) {
        return new AttachmentDownloaderComponent.AttachmentDownloader(moVar, attachmentDownloadService);
    }

    static AttachmentDownloaderComponent providesAttachmentDownloaderComponent(nk nkVar, ActionFactory actionFactory, AttachmentDownloaderComponent.AttachmentDownloader attachmentDownloader) {
        return new AttachmentDownloaderComponent(nkVar, actionFactory, attachmentDownloader);
    }

    static ComponentPersistence.PersistenceQueue providesDiskQueue(ExecutorService executorService) {
        return new ComponentPersistence.PersistenceQueue(executorService);
    }

    static ComponentPersistence providesPersistenceComponent(SupportUiStorage supportUiStorage, ComponentPersistence.PersistenceQueue persistenceQueue, ExecutorService executorService) {
        return new ComponentPersistence(supportUiStorage, persistenceQueue, executorService);
    }

    static HeadlessComponentListener providesHeadlessComponentListener(ComponentPersistence componentPersistence, AttachmentDownloaderComponent attachmentDownloaderComponent, ComponentUpdateActionHandlers componentUpdateActionHandlers) {
        return new HeadlessComponentListener(componentPersistence, attachmentDownloaderComponent, componentUpdateActionHandlers);
    }

    static ComponentUpdateActionHandlers providesConversationsUpdatesComponent(Context context, ActionHandlerRegistry actionHandlerRegistry, RequestInfoDataSource.LocalDataSource localDataSource) {
        return new ComponentUpdateActionHandlers(context, actionHandlerRegistry, localDataSource);
    }

    /* access modifiers changed from: package-private */
    public CellFactory providesMessageFactory(Context context, C3616p pVar, ActionFactory actionFactory, nk nkVar, ZendeskDeepLinkHelper zendeskDeepLinkHelper) {
        return new CellFactory(context.getApplicationContext(), pVar, actionFactory, nkVar, zendeskDeepLinkHelper, this.uiConfig);
    }
}
