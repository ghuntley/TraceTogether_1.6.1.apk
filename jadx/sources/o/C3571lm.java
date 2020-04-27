package o;

import android.os.Bundle;
import android.util.Log;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import sg.gov.tech.bluetrace.status.persistence.StatusRecord;
import sg.gov.tech.bluetrace.streetpass.persistence.StreetPassRecord;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\u0018\u00002\u00020\fB\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00018\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/lm;", "", "ι", "Ljava/lang/String;", "ǃ", "Landroid/os/Bundle;", "p0", "", "onCreate", "(Landroid/os/Bundle;)V", "<init>", "()V", "Lo/ɹ;"}, k = 1, mv = {1, 1, 16})
/* renamed from: o.lm  reason: case insensitive filesystem */
public final class C3571lm extends C1459 {
    /* access modifiers changed from: private */

    /* renamed from: ι  reason: contains not printable characters */
    public String f2914 = "PlotActivity";

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f168892131558430);
        final WebView webView = (WebView) findViewById(R.id.f168252131362451);
        fM.m2252((Object) webView, "");
        webView.setWebViewClient(new WebViewClient());
        WebSettings settings = webView.getSettings();
        fM.m2252((Object) settings, "");
        settings.setJavaScriptEnabled(true);
        final int intExtra = getIntent().getIntExtra("time_period", 1);
        bZ r2 = bZ.m1737(new C3323cd<T>(this) {

            /* renamed from: ǃ  reason: contains not printable characters */
            final /* synthetic */ C3571lm f2915;

            {
                this.f2915 = r1;
            }

            /* renamed from: ı  reason: contains not printable characters */
            public final void m3616(C3325cf<List<StreetPassRecord>> cfVar) {
                fM.m2254(cfVar, "");
                cfVar.m1734(new C3596mi(this.f2915).m3882());
            }
        });
        fM.m2252((Object) r2, "");
        bZ r3 = bZ.m1737(new C3323cd<T>(this) {

            /* renamed from: ı  reason: contains not printable characters */
            final /* synthetic */ C3571lm f2916;

            {
                this.f2916 = r1;
            }

            /* renamed from: ı  reason: contains not printable characters */
            public final void m3617(C3325cf<List<StatusRecord>> cfVar) {
                fM.m2254(cfVar, "");
                cfVar.m1734(new lV(this.f2916).m3526());
            }
        });
        fM.m2252((Object) r3, "");
        C3326cg r0 = bZ.m1736(r2, r3, new C0225()).m1740(C3330ck.m1971()).m1738(cV.m1934()).m1741(new C3338cq<C3583lz>(this) {

            /* renamed from: ǃ  reason: contains not printable characters */
            final /* synthetic */ C3571lm f2919;

            {
                this.f2919 = r1;
            }

            /* renamed from: ι  reason: contains not printable characters */
            public final void m3618(C3583lz lzVar) {
                String str;
                String str2;
                String str3;
                String str4;
                List list;
                Set set;
                String str5;
                String str6;
                String str7;
                String str8;
                Map map;
                String str9;
                String str10;
                String str11;
                String str12;
                String str13;
                if (!lzVar.m3718().isEmpty()) {
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                    long j = (long) 1000;
                    long timestamp = (((StreetPassRecord) dN.m2195(lzVar.m3718(), new Comparator<T>() {
                        public final int compare(T t, T t2) {
                            return C3389eq.m2212(Long.valueOf(((StreetPassRecord) t2).getTimestamp()), Long.valueOf(((StreetPassRecord) t).getTimestamp()));
                        }
                    }).get(0)).getTimestamp() / j) + ((long) 60);
                    String format = simpleDateFormat.format(new Date(timestamp * j));
                    long j2 = timestamp - ((long) (intExtra * 3600));
                    String format2 = simpleDateFormat.format(new Date(j2 * j));
                    Collection arrayList = new ArrayList();
                    Iterator it = lzVar.m3718().iterator();
                    while (true) {
                        boolean z = true;
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        StreetPassRecord streetPassRecord = (StreetPassRecord) next;
                        if (streetPassRecord.getTimestamp() / j < j2 || streetPassRecord.getTimestamp() / j > timestamp) {
                            z = false;
                        }
                        if (z) {
                            arrayList.add(next);
                        }
                    }
                    List list2 = (List) arrayList;
                    String str14 = "UTF-8";
                    String str15 = "text/html";
                    if (!list2.isEmpty()) {
                        Iterable iterable = list2;
                        final Map linkedHashMap = new LinkedHashMap();
                        for (Object next2 : iterable) {
                            String modelC = ((StreetPassRecord) next2).getModelC();
                            Object obj = linkedHashMap.get(modelC);
                            if (obj == null) {
                                obj = new ArrayList();
                                linkedHashMap.put(modelC, obj);
                            }
                            ((List) obj).add(next2);
                        }
                        final Map linkedHashMap2 = new LinkedHashMap();
                        for (Object next3 : iterable) {
                            String modelP = ((StreetPassRecord) next3).getModelP();
                            Object obj2 = linkedHashMap2.get(modelP);
                            if (obj2 == null) {
                                obj2 = new ArrayList();
                                linkedHashMap2.put(modelP, obj2);
                            }
                            ((List) obj2).add(next3);
                        }
                        Set r7 = dN.m2189(linkedHashMap.keySet(), (Set) dN.m2188(linkedHashMap2.keySet()));
                        Log.d(this.f2919.f2914, "allModels: " + r7);
                        List r8 = dN.m2195(r7, new Comparator<String>() {
                            /* renamed from: ɩ  reason: contains not printable characters */
                            public final int compare(String str, String str2) {
                                fM.m2254(str, "");
                                fM.m2254(str2, "");
                                List list = (List) linkedHashMap.get(str);
                                int i = 0;
                                int size = list != null ? list.size() : 0;
                                List list2 = (List) linkedHashMap2.get(str);
                                int size2 = size + (list2 != null ? list2.size() : 0);
                                List list3 = (List) linkedHashMap.get(str2);
                                int size3 = list3 != null ? list3.size() : 0;
                                List list4 = (List) linkedHashMap2.get(str2);
                                if (list4 != null) {
                                    i = list4.size();
                                }
                                return (size3 + i) - size2;
                            }
                        });
                        Iterable<String> iterable2 = r8;
                        Collection arrayList2 = new ArrayList(dN.m2074(iterable2, 10));
                        Iterator it2 = iterable2.iterator();
                        while (it2.hasNext()) {
                            String str16 = (String) it2.next();
                            Iterator it3 = it2;
                            int indexOf = r8.indexOf(str16) + 1;
                            boolean containsKey = linkedHashMap.containsKey(str16);
                            boolean containsKey2 = linkedHashMap2.containsKey(str16);
                            List list3 = (List) linkedHashMap.get(str16);
                            String str17 = null;
                            if (list3 != null) {
                                Iterable<StreetPassRecord> iterable3 = list3;
                                str6 = str14;
                                str5 = str15;
                                set = r7;
                                Collection arrayList3 = new ArrayList(dN.m2074(iterable3, 10));
                                for (StreetPassRecord timestamp2 : iterable3) {
                                    arrayList3.add(simpleDateFormat.format(new Date(timestamp2.getTimestamp())));
                                    r8 = r8;
                                }
                                list = r8;
                                str7 = dN.m2193$default((List) arrayList3, "\", \"", "[\"", "\"]", 0, (CharSequence) null, (C3413fo) null, 56, (Object) null);
                            } else {
                                str6 = str14;
                                str5 = str15;
                                set = r7;
                                list = r8;
                                str7 = null;
                            }
                            List list4 = (List) linkedHashMap.get(str16);
                            if (list4 != null) {
                                Iterable<StreetPassRecord> iterable4 = list4;
                                map = linkedHashMap;
                                str8 = "";
                                Collection arrayList4 = new ArrayList(dN.m2074(iterable4, 10));
                                for (StreetPassRecord rssi : iterable4) {
                                    arrayList4.add(Integer.valueOf(rssi.getRssi()));
                                }
                                str9 = dN.m2193$default((List) arrayList4, ", ", "[", "]", 0, (CharSequence) null, (C3413fo) null, 56, (Object) null);
                            } else {
                                map = linkedHashMap;
                                str8 = "";
                                str9 = null;
                            }
                            List list5 = (List) linkedHashMap2.get(str16);
                            if (list5 != null) {
                                Iterable iterable5 = list5;
                                str10 = format;
                                Collection arrayList5 = new ArrayList(dN.m2074(iterable5, 10));
                                for (Iterator it4 = iterable5.iterator(); it4.hasNext(); it4 = it4) {
                                    arrayList5.add(simpleDateFormat.format(new Date(((StreetPassRecord) it4.next()).getTimestamp())));
                                }
                                str11 = dN.m2193$default((List) arrayList5, "\", \"", "[\"", "\"]", 0, (CharSequence) null, (C3413fo) null, 56, (Object) null);
                            } else {
                                str10 = format;
                                str11 = null;
                            }
                            List list6 = (List) linkedHashMap2.get(str16);
                            if (list6 != null) {
                                Iterable<StreetPassRecord> iterable6 = list6;
                                Collection arrayList6 = new ArrayList(dN.m2074(iterable6, 10));
                                for (StreetPassRecord rssi2 : iterable6) {
                                    arrayList6.add(Integer.valueOf(rssi2.getRssi()));
                                }
                                str17 = dN.m2193$default((List) arrayList6, ", ", "[", "]", 0, (CharSequence) null, (C3413fo) null, 56, (Object) null);
                            }
                            String str18 = str17;
                            String str19 = "var data" + indexOf + " = [];";
                            if (!containsKey) {
                                str12 = str8;
                            } else {
                                str12 = gK.m2332("\n                            var data" + indexOf + "a = {\n                              name: 'central',\n                              x: " + str7 + ",\n                              y: " + str9 + ",\n                              xaxis: 'x" + indexOf + "',\n                              yaxis: 'y" + indexOf + "',\n                              mode: 'markers',\n                              type: 'scatter',\n                              line: {color: 'blue'}\n                            };\n                            data" + indexOf + " = data" + indexOf + ".concat(data" + indexOf + "a);\n                        ");
                            }
                            if (!containsKey2) {
                                str13 = str8;
                            } else {
                                str13 = gK.m2332("\n                            var data" + indexOf + "b = {\n                              name: 'peripheral',\n                              x: " + str11 + ",\n                              y: " + str18 + ",\n                              xaxis: 'x" + indexOf + "',\n                              yaxis: 'y" + indexOf + "',\n                              mode: 'markers',\n                              type: 'scatter',\n                              line: {color: 'red'}\n                            };\n                            data" + indexOf + " = data" + indexOf + ".concat(data" + indexOf + "b);\n                        ");
                            }
                            arrayList2.add(str19 + str12 + str13);
                            it2 = it3;
                            str14 = str6;
                            str15 = str5;
                            r7 = set;
                            r8 = list;
                            linkedHashMap = map;
                            format = str10;
                        }
                        String str20 = format;
                        String str21 = str14;
                        String str22 = str15;
                        Set set2 = r7;
                        List list7 = r8;
                        String str23 = "";
                        String r0 = dN.m2193$default((List) arrayList2, "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C3413fo) null, 62, (Object) null);
                        Collection arrayList7 = new ArrayList(dN.m2074(iterable2, 10));
                        for (String indexOf2 : iterable2) {
                            List list8 = list7;
                            int indexOf3 = list8.indexOf(indexOf2) + 1;
                            if (indexOf3 < 20) {
                                str4 = gK.m2332("\n                            data = data.concat(data" + indexOf3 + ");\n                        ");
                            } else {
                                str4 = str23;
                            }
                            arrayList7.add(str4);
                            list7 = list8;
                        }
                        List list9 = list7;
                        String r2 = dN.m2193$default((List) arrayList7, "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C3413fo) null, 62, (Object) null);
                        Collection arrayList8 = new ArrayList(dN.m2074(iterable2, 10));
                        for (String indexOf4 : iterable2) {
                            int indexOf5 = list9.indexOf(indexOf4) + 1;
                            if (indexOf5 < 20) {
                                StringBuilder sb = new StringBuilder();
                                sb.append("\n                                  xaxis");
                                sb.append(indexOf5);
                                sb.append(": {\n                                    type: 'date',\n                                    tickformat: '%H:%M:%S',\n                                    range: ['");
                                sb.append(format2);
                                sb.append("', '");
                                str3 = str20;
                                sb.append(str3);
                                sb.append("'],\n                                    dtick: ");
                                sb.append(intExtra * 5);
                                sb.append(" * 60 * 1000\n                                  }\n                        ");
                                str2 = gK.m2332(sb.toString());
                            } else {
                                str3 = str20;
                                str2 = str23;
                            }
                            arrayList8.add(str2);
                            str20 = str3;
                        }
                        String str24 = str20;
                        String r4 = dN.m2193$default((List) arrayList8, ",\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C3413fo) null, 62, (Object) null);
                        Collection arrayList9 = new ArrayList(dN.m2074(iterable2, 10));
                        for (String str25 : iterable2) {
                            int indexOf6 = list9.indexOf(str25) + 1;
                            if (indexOf6 < 20) {
                                str = gK.m2332("\n                                  yaxis" + indexOf6 + ": {\n                                    range: [-100, -30],\n                                    ticks: 'outside',\n                                    dtick: 10,\n                                    title: {\n                                      text: \"" + str25 + "\"\n                                    }\n                                  }\n                        ");
                            } else {
                                str = str23;
                            }
                            arrayList9.add(str);
                        }
                        String r1 = dN.m2193$default((List) arrayList9, ",\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C3413fo) null, 62, (Object) null);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("\n                        <head>\n                            <script src='https://cdn.plot.ly/plotly-latest.min.js'></script>\n                        </head>\n                        <body>\n                            <div id='myDiv'></div>\n                            <script>\n                                ");
                        sb2.append(r0);
                        sb2.append("\n                                \n                                var data = [];\n                                ");
                        sb2.append(r2);
                        sb2.append("\n                                \n                                var layout = {\n                                  title: 'Activities from <b>");
                        String str26 = str23;
                        fM.m2252((Object) format2, str26);
                        sb2.append(gK.m2368(format2, new C3431gf(11, 15)));
                        sb2.append("</b> to <b>");
                        fM.m2252((Object) str24, str26);
                        sb2.append(gK.m2368(str24, new C3431gf(11, 15)));
                        sb2.append("</b>   <span style=\"color:blue\">central</span> <span style=\"color:red\">peripheral</span>',\n                                  height: 135 * ");
                        sb2.append(set2.size());
                        sb2.append(",\n                                  showlegend: false,\n                                  grid: {rows: ");
                        sb2.append(set2.size());
                        sb2.append(", columns: 1, pattern: 'independent'},\n                                  margin: {\n                                    t: 30,\n                                    r: 30,\n                                    b: 20,\n                                    l: 50,\n                                    pad: 0\n                                  },\n                                  ");
                        sb2.append(r4);
                        sb2.append(",\n                                  ");
                        sb2.append(r1);
                        sb2.append("\n                                };\n                                \n                                var config = {\n                                    responsive: true, \n                                    displayModeBar: false, \n                                    displaylogo: false, \n                                    modeBarButtonsToRemove: ['toImage', 'sendDataToCloud', 'editInChartStudio', 'zoom2d', 'select2d', 'pan2d', 'lasso2d', 'autoScale2d', 'resetScale2d', 'zoomIn2d', 'zoomOut2d', 'hoverClosestCartesian', 'hoverCompareCartesian', 'toggleHover', 'toggleSpikelines']\n                                }\n                                \n                                Plotly.newPlot('myDiv', data, layout, config);\n                            </script>\n                        </body>\n                    ");
                        String r02 = gK.m2332(sb2.toString());
                        Log.d(this.f2919.f2914, "customHtml: " + r02);
                        webView.loadData(r02, str22, str21);
                        return;
                    }
                    webView.loadData("No data received in the last " + intExtra + " hour(s) or more.", str15, str14);
                }
            }
        });
        String str = this.f2914;
        Log.d(str, "zipResult: " + r0);
        webView.loadData("Loading...", "text/html", "UTF-8");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\b\n\u0018\u00002 \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0001\u0012\u0004\u0012\u00020\u00060\tJ+\u0010\u0007\u001a\u00020\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001H\u0016¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/lm$ı;", "", "Lsg/gov/tech/bluetrace/streetpass/persistence/StreetPassRecord;", "p0", "Lsg/gov/tech/bluetrace/status/persistence/StatusRecord;", "p1", "Lo/lz;", "ǃ", "(Ljava/util/List;Ljava/util/List;)Lo/lz;", "Lo/cr;"}, k = 1, mv = {1, 1, 16})
    /* renamed from: o.lm$ı  reason: contains not printable characters */
    public static final class C0225 implements C3339cr<List<? extends StreetPassRecord>, List<? extends StatusRecord>, C3583lz> {
        C0225() {
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final C3583lz m3621(List<StreetPassRecord> list, List<StatusRecord> list2) {
            fM.m2254(list, "");
            fM.m2254(list2, "");
            return new C3583lz(list, list2);
        }
    }
}
