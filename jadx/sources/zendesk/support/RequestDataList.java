package zendesk.support;

import java.util.ArrayList;
import java.util.List;
import o.O;

final class RequestDataList {
    final List<RequestData> requestDataList = new ArrayList(0);

    RequestDataList(List<RequestData> list) {
        if (O.m1394(list)) {
            this.requestDataList.addAll(list);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.requestDataList.equals(((RequestDataList) obj).requestDataList);
    }

    public final int hashCode() {
        return this.requestDataList.hashCode();
    }
}
