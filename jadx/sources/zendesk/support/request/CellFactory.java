package zendesk.support.request;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import o.C3616p;
import o.O;
import o.P;
import o.mW;
import o.nk;
import zendesk.support.RequestStatus;
import zendesk.support.ZendeskDeepLinkHelper;
import zendesk.support.request.CellSystemMessages;
import zendesk.support.request.CellType;
import zendesk.support.request.DocumentRenderer;

class CellFactory {
    private final DocumentRenderer documentRenderer;
    private final DocumentRenderer.HtmlParser htmlParser = new DocumentRenderer.HtmlParser();
    private final CellBindHelper utils;

    CellFactory(Context context, C3616p pVar, ActionFactory actionFactory, nk nkVar, ZendeskDeepLinkHelper zendeskDeepLinkHelper, mW mWVar) {
        this.utils = new CellBindHelper(context, pVar, actionFactory, nkVar);
        this.documentRenderer = new DocumentRenderer(context, zendeskDeepLinkHelper, mWVar);
    }

    public List<CellType.Base> generateCells(List<StateMessage> list, List<StateRequestUser> list2, RequestStatus requestStatus, String str) {
        ArrayList arrayList = new ArrayList();
        StateMessage findFirstDelivered = findFirstDelivered(list);
        for (StateMessage next : list) {
            StateRequestUser findUserForId = findUserForId(list2, next.getUserId());
            arrayList.addAll(insertSystemMessage(findFirstDelivered, next, getViewModelsForMessage(next, isUserAgent(findUserForId), findUserForId), str));
        }
        return calculatePositionTypes(markAgentCells(insertRequestStatus(insertDateCells(markLastDeliveredCell(markCellsErrored(arrayList))), requestStatus)));
    }

    /* access modifiers changed from: package-private */
    public List<CellType.Base> markAgentCells(List<CellType.Base> list) {
        long j = Long.MIN_VALUE;
        for (int size = list.size() - 1; size >= 0; size--) {
            if (list.get(size) instanceof CellType.Agent) {
                CellType.Agent agent = (CellType.Agent) list.get(size);
                if (j != agent.getAgent().getId()) {
                    agent.showAgentName(true);
                    j = agent.getAgent().getId();
                } else {
                    agent.showAgentName(false);
                }
            } else {
                j = Long.MIN_VALUE;
            }
        }
        return list;
    }

    /* access modifiers changed from: package-private */
    public List<CellType.Base> markCellsErrored(List<CellType.Base> list) {
        ArrayList arrayList = new ArrayList();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList2 = new ArrayList();
        for (CellType.Base next : list) {
            if (next instanceof CellType.Stateful) {
                CellType.Stateful stateful = (CellType.Stateful) next;
                if (stateful.getStateMessage().getState().getStatus() == 1) {
                    arrayList.add(stateful);
                    linkedHashSet.add(stateful.getStateMessage());
                } else {
                    arrayList2.addAll(markMessagesAsErrored(arrayList, linkedHashSet));
                    arrayList2.add(next);
                    arrayList.clear();
                    linkedHashSet.clear();
                }
            } else {
                arrayList2.addAll(markMessagesAsErrored(arrayList, linkedHashSet));
                arrayList2.add(next);
                arrayList.clear();
                linkedHashSet.clear();
            }
        }
        arrayList2.addAll(markMessagesAsErrored(arrayList, linkedHashSet));
        return arrayList2;
    }

    private List<CellType.Base> markMessagesAsErrored(Collection<CellType.Stateful> collection, Collection<StateMessage> collection2) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator<CellType.Stateful> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().markAsErrored(new ArrayList(collection2), !it.hasNext()));
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public List<CellType.Base> insertRequestStatus(List<CellType.Base> list, RequestStatus requestStatus) {
        if (requestStatus == RequestStatus.Closed && list.size() > 0) {
            list.add(new CellSystemMessages.CellRequestStatus(this.utils, requestStatus));
        }
        return list;
    }

    /* access modifiers changed from: package-private */
    public List<CellType.Base> calculatePositionTypes(List<CellType.Base> list) {
        if (O.m1399(list)) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list.size());
        long j = -1;
        for (int i = 0; i < list.size(); i++) {
            CellType.Base base = list.get(i);
            if (i == 0 || base.getGroupId() != j) {
                base.setPositionType(2);
            }
            if (base instanceof CellType.Stateful) {
                CellType.Stateful stateful = (CellType.Stateful) base;
                if (stateful.isMarkedAsDelivered() || stateful.isLastErrorCellOfBlock()) {
                    base.setPositionType(8);
                }
            }
            j = base.getGroupId();
            arrayList.add(base);
        }
        ((CellType.Base) arrayList.get(arrayList.size() - 1)).setPositionType(16);
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public List<CellType.Base> insertSystemMessage(StateMessage stateMessage, StateMessage stateMessage2, List<CellType.Base> list, String str) {
        if (stateMessage2 == stateMessage && P.m1406(str)) {
            list.add(new CellSystemMessages.CellSystemMessage(stateMessage2.getDate(), str));
        }
        return list;
    }

    /* access modifiers changed from: package-private */
    public StateMessage findFirstDelivered(List<StateMessage> list) {
        for (StateMessage next : list) {
            if (next.getState().getStatus() == 2) {
                return next;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public List<CellType.Base> insertDateCells(List<CellType.Base> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Date date = new Date(0);
        for (CellType.Base next : list) {
            if (!UtilsDate.isSameDay(date, next.getTimeStamp())) {
                date = next.getTimeStamp();
                arrayList.add(new CellSystemMessages.CellDateMessage(this.utils, UtilsDate.getBeginOfDay(date).getTime(), date));
            }
            arrayList.add(next);
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public List<CellType.Base> markLastDeliveredCell(List<CellType.Base> list) {
        boolean z;
        boolean z2;
        Iterator<CellType.Base> it = list.iterator();
        while (true) {
            z = false;
            if (!it.hasNext()) {
                z2 = false;
                break;
            }
            CellType.Base next = it.next();
            if ((next instanceof CellType.Stateful) && ((CellType.Stateful) next).getStateMessage().getState().getStatus() == 3) {
                z2 = true;
                break;
            }
        }
        ArrayList arrayList = new ArrayList(list.size());
        if (!z2) {
            for (int size = list.size() - 1; size >= 0; size--) {
                Object obj = list.get(size);
                if ((obj instanceof CellType.Stateful) && !z) {
                    CellType.Stateful stateful = (CellType.Stateful) obj;
                    if (stateful.getStateMessage().getState().getStatus() == 2) {
                        obj = stateful.markAsDelivered();
                    }
                    z = true;
                }
                arrayList.add(obj);
            }
            Collections.reverse(arrayList);
        } else {
            arrayList.addAll(list);
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public List<CellType.Base> getViewModelsForMessage(StateMessage stateMessage, boolean z, StateRequestUser stateRequestUser) {
        List<StateRequestAttachment> attachments = stateMessage.getAttachments();
        ArrayList arrayList = new ArrayList();
        if (z) {
            arrayList.add(getAgentMessage(stateMessage, stateRequestUser));
        } else {
            arrayList.addAll(getUserMessage(stateMessage));
        }
        int size = attachments.size();
        for (int i = 0; i < size; i++) {
            StateRequestAttachment stateRequestAttachment = attachments.get(i);
            if (z) {
                arrayList.add(getAgentAttachment(stateRequestAttachment, stateRequestUser, stateMessage.getDate()));
            } else {
                arrayList.add(getUserAttachment(stateMessage, stateRequestAttachment, stateMessage.getDate()));
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public CellType.Base getAgentAttachment(StateRequestAttachment stateRequestAttachment, StateRequestUser stateRequestUser, Date date) {
        if (UtilsAttachment.isImageAttachment(stateRequestAttachment)) {
            return new CellAgentAttachmentImage(this.utils, stateRequestAttachment, stateRequestUser, date);
        }
        return new CellAgentAttachmentGeneric(this.utils, stateRequestAttachment, stateRequestUser, date);
    }

    /* access modifiers changed from: package-private */
    public CellType.Base getAgentMessage(StateMessage stateMessage, StateRequestUser stateRequestUser) {
        return new CellAgentMessage(this.utils, stateMessage, generateRichText(stateMessage.getHtmlBody(), stateMessage.getPlainBody()), stateRequestUser);
    }

    /* access modifiers changed from: package-private */
    public CellType.Base getUserAttachment(StateMessage stateMessage, StateRequestAttachment stateRequestAttachment, Date date) {
        if (!UtilsAttachment.isImageAttachment(stateRequestAttachment)) {
            return new CellUserAttachmentGeneric(this.utils, stateMessage, stateRequestAttachment, date, false, false, new ArrayList(0), false);
        }
        return new CellUserAttachmentImage(this.utils, stateMessage, stateRequestAttachment, date, false, false, new ArrayList(0), false);
    }

    /* access modifiers changed from: package-private */
    public List<CellType.Base> getUserMessage(StateMessage stateMessage) {
        if (UtilsAttachment.hasAttachmentBody(stateMessage)) {
            return new ArrayList();
        }
        return Collections.singletonList(new CellUserMessage(this.utils, stateMessage, false, false, generateRichText(stateMessage.getHtmlBody(), stateMessage.getPlainBody()), new ArrayList(0), false));
    }

    /* access modifiers changed from: package-private */
    public boolean isUserAgent(StateRequestUser stateRequestUser) {
        return stateRequestUser != null && stateRequestUser.isAgent();
    }

    /* access modifiers changed from: package-private */
    public StateRequestUser findUserForId(List<StateRequestUser> list, long j) {
        for (StateRequestUser next : list) {
            if (next.getId() == j) {
                return next;
            }
        }
        return null;
    }

    private CharSequence generateRichText(String str, String str2) {
        return this.documentRenderer.render(this.htmlParser.parse(str, str2));
    }
}
