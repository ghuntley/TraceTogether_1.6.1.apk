package zendesk.support.request;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.format.DateUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import o.C1819;
import o.C1976;
import o.C2026;
import o.C2183;
import o.C2311;
import o.C3616p;
import o.O;
import o.P;
import o.R;
import o.nl;
import o.nq;
import o.nt;

class ComponentToolbar implements nl<ToolbarModel> {
    private final ViewToolbarAvatar avatarContainer;
    private final View container;
    private final Context context;
    private final C1819 fadeTransition = new C1819();
    private final C3616p picasso;
    private final ViewAlmostRealProgressBar progressBar;
    private final TextView subTitle;
    private final TextView title;
    private final C2026 toolbar;
    private ToolbarModel toolbarModel;
    private final ToolbarSelector toolbarSelector;

    ComponentToolbar(C3616p pVar, C2026 r3, ViewAlmostRealProgressBar viewAlmostRealProgressBar) {
        this.picasso = pVar;
        this.progressBar = viewAlmostRealProgressBar;
        this.toolbar = r3;
        this.context = r3.getContext();
        this.toolbarSelector = new ToolbarSelector();
        this.container = r3.findViewById(R.id.f164542131361931);
        this.title = (TextView) r3.findViewById(R.id.f164562131361933);
        this.subTitle = (TextView) r3.findViewById(R.id.f164552131361932);
        this.avatarContainer = (ViewToolbarAvatar) r3.findViewById(R.id.f164532131361930);
    }

    public void update(ToolbarModel toolbarModel2) {
        if (!toolbarModel2.equals(this.toolbarModel)) {
            this.toolbarModel = toolbarModel2;
            updateProgressBar(toolbarModel2.isProgressEnabled());
            updateToolbar(toolbarModel2);
        }
    }

    /* access modifiers changed from: package-private */
    public ToolbarSelector getToolbarSelector() {
        return this.toolbarSelector;
    }

    private void updateToolbar(ToolbarModel toolbarModel2) {
        if (toolbarModel2.getToolbarContentState() == ToolbarModel.STATE_LOADING) {
            this.container.setVisibility(8);
            this.toolbar.setTitle((CharSequence) "");
        } else if (toolbarModel2.getToolbarContentState() == ToolbarModel.STATE_AGENT_INFO) {
            this.title.setText(toolbarModel2.getNameOfFirstAgent());
            CharSequence relativeTimeSpanString = DateUtils.getRelativeTimeSpanString(this.context, toolbarModel2.getLastReply().getTime(), true);
            this.subTitle.setText(this.context.getString(R.string.f171352131886301, new Object[]{relativeTimeSpanString}));
            this.toolbar.setTitle((CharSequence) "");
            this.avatarContainer.setImageUrls(this.picasso, toolbarModel2.getAvatarUrls());
            C2183.m11566((ViewGroup) this.toolbar, (C1976) this.fadeTransition);
            this.container.setVisibility(0);
            this.container.setContentDescription(this.container.getContext().getString(R.string.f171922131886388, new Object[]{toolbarModel2.getNameOfFirstAgent(), relativeTimeSpanString}));
        } else if (toolbarModel2.getToolbarContentState() == ToolbarModel.STATE_TITLE) {
            this.container.setVisibility(8);
            this.toolbar.setTitle((int) R.string.f171062131886271);
        }
    }

    private void updateProgressBar(boolean z) {
        if (z) {
            this.progressBar.start(ViewAlmostRealProgressBar.DONT_STOP_MOVING);
        } else {
            this.progressBar.stop(300);
        }
    }

    static class ToolbarModel {
        static int STATE_AGENT_INFO = 3;
        static int STATE_LOADING = 1;
        static int STATE_TITLE = 2;
        private final List<StateRequestUser> agent;
        private final boolean isProgressEnabled;
        private final Date lastReply;
        private final int toolbarContentState;

        ToolbarModel(boolean z, int i, List<StateRequestUser> list, Date date) {
            this.isProgressEnabled = z;
            this.toolbarContentState = i;
            this.agent = list;
            this.lastReply = date;
        }

        /* access modifiers changed from: package-private */
        public Date getLastReply() {
            return this.lastReply;
        }

        /* access modifiers changed from: package-private */
        public boolean isProgressEnabled() {
            return this.isProgressEnabled;
        }

        /* access modifiers changed from: package-private */
        public int getToolbarContentState() {
            return this.toolbarContentState;
        }

        /* access modifiers changed from: package-private */
        public List<C2311<String, String>> getAvatarUrls() {
            ArrayList arrayList = new ArrayList();
            for (StateRequestUser next : this.agent) {
                arrayList.add(C2311.m12057(next.getAvatar(), next.getName()));
            }
            return arrayList;
        }

        /* access modifiers changed from: package-private */
        public String getNameOfFirstAgent() {
            return O.m1394(this.agent) ? this.agent.get(0).getName() : "";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                ToolbarModel toolbarModel = (ToolbarModel) obj;
                if (this.isProgressEnabled != toolbarModel.isProgressEnabled || this.toolbarContentState != toolbarModel.toolbarContentState) {
                    return false;
                }
                List<StateRequestUser> list = this.agent;
                if (list == null ? toolbarModel.agent != null : !list.equals(toolbarModel.agent)) {
                    return false;
                }
                Date date = this.lastReply;
                Date date2 = toolbarModel.lastReply;
                if (date != null) {
                    return date.equals(date2);
                }
                if (date2 == null) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int i = (((this.isProgressEnabled ? 1 : 0) * true) + this.toolbarContentState) * 31;
            List<StateRequestUser> list = this.agent;
            int i2 = 0;
            int hashCode = (i + (list != null ? list.hashCode() : 0)) * 31;
            Date date = this.lastReply;
            if (date != null) {
                i2 = date.hashCode();
            }
            return hashCode + i2;
        }
    }

    static class ToolbarSelector implements nq<ToolbarModel> {
        ToolbarSelector() {
        }

        public ToolbarModel selectData(nt ntVar) {
            int i;
            boolean isProgressEnabled = isProgressEnabled(ntVar);
            StateConversation fromState = StateConversation.fromState(ntVar);
            Map<Long, StateRequestUser> mapAgents = mapAgents(fromState.getUsers());
            ArrayList arrayList = new ArrayList();
            Date date = null;
            if (!P.m1406(fromState.getLocalId()) && !P.m1406(fromState.getRemoteId())) {
                i = ToolbarModel.STATE_LOADING;
            } else if (fromState.hasAgentReplies() && mapAgents.size() == 0) {
                i = ToolbarModel.STATE_LOADING;
            } else if (!fromState.hasAgentReplies() || mapAgents.size() <= 0) {
                i = ToolbarModel.STATE_TITLE;
            } else {
                int i2 = ToolbarModel.STATE_AGENT_INFO;
                StateMessage findLastAgentReply = findLastAgentReply(fromState.getMessages(), mapAgents);
                if (findLastAgentReply != null) {
                    date = findLastAgentReply.getDate();
                }
                arrayList.addAll(getInvolvedAgents(fromState.getMessages(), mapAgents));
                i = i2;
            }
            return new ToolbarModel(isProgressEnabled, i, arrayList, date);
        }

        private boolean isProgressEnabled(nt ntVar) {
            return StateProgress.fomState(ntVar).getRunningRequests() > 0;
        }

        private List<StateRequestUser> getInvolvedAgents(List<StateMessage> list, Map<Long, StateRequestUser> map) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (int size = list.size() - 1; size >= 0; size--) {
                StateMessage stateMessage = list.get(size);
                if (map.containsKey(Long.valueOf(stateMessage.getUserId()))) {
                    linkedHashSet.add(map.get(Long.valueOf(stateMessage.getUserId())));
                }
            }
            return new ArrayList(linkedHashSet);
        }

        private StateMessage findLastAgentReply(List<StateMessage> list, Map<Long, StateRequestUser> map) {
            for (int size = list.size() - 1; size >= 0; size--) {
                StateMessage stateMessage = list.get(size);
                if (map.containsKey(Long.valueOf(stateMessage.getUserId()))) {
                    return stateMessage;
                }
            }
            return null;
        }

        @SuppressLint({"UseSparseArrays"})
        private Map<Long, StateRequestUser> mapAgents(List<StateRequestUser> list) {
            HashMap hashMap = new HashMap();
            for (StateRequestUser next : list) {
                if (next.isAgent()) {
                    hashMap.put(Long.valueOf(next.getId()), next);
                }
            }
            return hashMap;
        }
    }
}
