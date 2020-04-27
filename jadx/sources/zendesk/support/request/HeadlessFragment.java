package zendesk.support.request;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import o.C1265;
import o.C1277;
import o.C1550;

public class HeadlessFragment<E> extends C1277 {
    private E data;

    static <E> E getData(C1550 r1) {
        C1277 findFragmentByTag = r1.findFragmentByTag("ZendeskHeadlessFragment");
        if (findFragmentByTag instanceof HeadlessFragment) {
            return ((HeadlessFragment) findFragmentByTag).getData();
        }
        return null;
    }

    static <E> void install(C1550 r3, E e) {
        HeadlessFragment headlessFragment = new HeadlessFragment();
        headlessFragment.setData(e);
        C1265 r4 = new C1265(r3);
        r4.m9968(0, headlessFragment, "ZendeskHeadlessFragment", 1);
        r4.m9966();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        setRetainInstance(true);
        return null;
    }

    private void setData(E e) {
        this.data = e;
    }

    private E getData() {
        return this.data;
    }
}
