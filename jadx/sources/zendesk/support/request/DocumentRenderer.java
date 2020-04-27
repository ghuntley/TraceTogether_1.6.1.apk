package zendesk.support.request;

import android.content.Context;
import android.content.res.Resources;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import android.util.Xml;
import android.view.View;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o.F;
import o.P;
import o.mW;
import okhttp3.HttpUrl;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import zendesk.support.ZendeskDeepLinkHelper;

class DocumentRenderer {
    private final ZendeskDeepLinkHelper deepLinkHelper;
    private final Style.Factory styleFactory;
    private final mW uiConfig;

    DocumentRenderer(Context context, ZendeskDeepLinkHelper zendeskDeepLinkHelper, mW mWVar) {
        this.styleFactory = new Style.Factory(context);
        this.deepLinkHelper = zendeskDeepLinkHelper;
        this.uiConfig = mWVar;
    }

    /* access modifiers changed from: package-private */
    public CharSequence render(RichRenderingDocument richRenderingDocument) {
        if (richRenderingDocument.isValid()) {
            return render(richRenderingDocument.getNodeTree());
        }
        return installClickableLinks(new SpannableString(richRenderingDocument.getFallbackText()));
    }

    private CharSequence render(Node node) {
        return Style.SpannableHelper.trimSpannable(installClickableLinks(reduce(node)));
    }

    private Spannable installClickableLinks(Spannable spannable) {
        return replaceUrlSpans(linkifyAll(spannable));
    }

    /* access modifiers changed from: package-private */
    public Spannable reduce(Node node) {
        Node.Type type = node.getType();
        List<Node> children = node.getChildren();
        if (type == Node.Type.Text) {
            return this.styleFactory.getStyledText(node.getText());
        }
        ArrayList arrayList = new ArrayList(children.size());
        for (Node reduce : children) {
            arrayList.add(reduce(reduce));
        }
        return this.styleFactory.getStyleForType(type).applyStyle(arrayList, node.getAttributes());
    }

    private Spannable replaceUrlSpans(Spannable spannable) {
        SpannableString spannableString = new SpannableString(spannable);
        for (URLSpan uRLSpan : (URLSpan[]) spannableString.getSpans(0, spannableString.length(), URLSpan.class)) {
            String url = uRLSpan.getURL();
            int spanStart = spannableString.getSpanStart(uRLSpan);
            int spanEnd = spannableString.getSpanEnd(uRLSpan);
            spannableString.removeSpan(uRLSpan);
            spannableString.setSpan(new ZendeskUrlSpan(url, this.deepLinkHelper, this.uiConfig), spanStart, spanEnd, 33);
        }
        return spannableString;
    }

    private static Spannable linkifyAll(Spannable spannable) {
        SpannableString spannableString = new SpannableString(spannable);
        if (Linkify.addLinks(spannableString, 15)) {
            for (URLSpan uRLSpan : (URLSpan[]) spannableString.getSpans(0, spannableString.length(), URLSpan.class)) {
                spannable.setSpan(uRLSpan, spannableString.getSpanStart(uRLSpan), spannableString.getSpanEnd(uRLSpan), 33);
            }
        }
        return spannable;
    }

    interface Style {
        Spannable applyStyle(List<CharSequence> list, Map<String, String> map);

        public static class Factory {
            private final Context context;

            Factory(Context context2) {
                this.context = context2;
            }

            /* access modifiers changed from: package-private */
            public Style getStyleForType(Node.Type type) {
                switch (AnonymousClass1.$SwitchMap$zendesk$support$request$DocumentRenderer$Node$Type[type.ordinal()]) {
                    case 1:
                        return new Bold();
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        return new Header();
                    case 8:
                        return new Italic();
                    case 9:
                        return new CodeSpan();
                    case 10:
                        return new Link();
                    case 11:
                    case 12:
                    case 13:
                        return new Br();
                    case 14:
                        return new Image(this.context.getResources());
                    case 15:
                        return new Li();
                    default:
                        return new Unknown();
                }
            }

            /* access modifiers changed from: package-private */
            public Spannable getStyledText(CharSequence charSequence) {
                return new SpannableString(charSequence);
            }
        }

        public static class Header extends Bold {
            public Spannable applyStyle(List<CharSequence> list, Map<String, String> map) {
                return SpannableHelper.foldStrings(Arrays.asList(new CharSequence[]{super.applyStyle(list, map), P.f1278}));
            }
        }

        public static class Bold implements Style {
            public Spannable applyStyle(List<CharSequence> list, Map<String, String> map) {
                return SpannableHelper.applySpan(SpannableHelper.foldStrings(list), new StyleSpan(1));
            }
        }

        public static class Italic implements Style {
            public Spannable applyStyle(List<CharSequence> list, Map<String, String> map) {
                return SpannableHelper.applySpan(SpannableHelper.foldStrings(list), new StyleSpan(2));
            }
        }

        public static class CodeSpan implements Style {
            public Spannable applyStyle(List<CharSequence> list, Map<String, String> map) {
                return SpannableHelper.applySpan(SpannableHelper.foldStrings(list), new TypefaceSpan("monospace"));
            }
        }

        public static class Unknown implements Style {
            public Spannable applyStyle(List<CharSequence> list, Map<String, String> map) {
                return SpannableHelper.foldStrings(list);
            }
        }

        public static class Link implements Style {
            public Spannable applyStyle(List<CharSequence> list, Map<String, String> map) {
                SpannableString foldStrings = SpannableHelper.foldStrings(list);
                String str = map.get("href");
                return P.m1406(str) ? SpannableHelper.applySpan(foldStrings, new URLSpan(str)) : foldStrings;
            }
        }

        public static class Br implements Style {
            public Spannable applyStyle(List<CharSequence> list, Map<String, String> map) {
                return SpannableHelper.foldStrings(Arrays.asList(new CharSequence[]{SpannableHelper.foldStrings(list), P.f1278}));
            }
        }

        public static class Image implements Style {
            private final Resources resources;

            Image(Resources resources2) {
                this.resources = resources2;
            }

            public Spannable applyStyle(List<CharSequence> list, Map<String, String> map) {
                String str = map.get("src");
                String queryParameter = HttpUrl.parse(str).queryParameter("name");
                Object[] objArr = new Object[1];
                if (queryParameter == null) {
                    queryParameter = "Image";
                }
                objArr[0] = queryParameter;
                return SpannableHelper.applySpan(new SpannableString(String.format("[%1$s]", objArr)), new URLSpan(str));
            }
        }

        public static class Li implements Style {
            public Spannable applyStyle(List<CharSequence> list, Map<String, String> map) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("");
                for (CharSequence append : list) {
                    spannableStringBuilder.append(P.f1278).append(append);
                }
                return new SpannableString(spannableStringBuilder);
            }
        }

        public static class SpannableHelper {
            static SpannableString foldStrings(List<CharSequence> list) {
                return new SpannableString(TextUtils.concat((CharSequence[]) list.toArray(new CharSequence[list.size()])));
            }

            static SpannableString applySpan(CharSequence charSequence, Object obj) {
                SpannableString spannableString = new SpannableString(charSequence);
                spannableString.setSpan(obj, 0, spannableString.length(), 33);
                return spannableString;
            }

            static SpannableString trimSpannable(Spannable spannable) {
                String obj = spannable.toString();
                int i = 0;
                while (obj.length() > 0 && obj.startsWith("\n")) {
                    obj = obj.substring(1);
                    i++;
                }
                int i2 = 0;
                while (obj.length() > 0 && obj.endsWith("\n")) {
                    obj = obj.substring(0, obj.length() - 1);
                    i2++;
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(spannable);
                if (spannableStringBuilder.length() > 0 && spannable.length() - i2 > 0 && spannable.length() - i2 != spannable.length()) {
                    spannableStringBuilder = spannableStringBuilder.delete(spannable.length() - i2, spannable.length());
                }
                if (i > 0 && i < spannable.length()) {
                    spannableStringBuilder = spannableStringBuilder.delete(0, i);
                }
                return new SpannableString(spannableStringBuilder);
            }
        }
    }

    /* renamed from: zendesk.support.request.DocumentRenderer$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$zendesk$support$request$DocumentRenderer$Node$Type = new int[Node.Type.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(30:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|(3:29|30|32)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(32:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|32) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0056 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0062 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x007a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0086 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0092 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00aa */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                zendesk.support.request.DocumentRenderer$Node$Type[] r0 = zendesk.support.request.DocumentRenderer.Node.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$zendesk$support$request$DocumentRenderer$Node$Type = r0
                int[] r0 = $SwitchMap$zendesk$support$request$DocumentRenderer$Node$Type     // Catch:{ NoSuchFieldError -> 0x0014 }
                zendesk.support.request.DocumentRenderer$Node$Type r1 = zendesk.support.request.DocumentRenderer.Node.Type.B     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = $SwitchMap$zendesk$support$request$DocumentRenderer$Node$Type     // Catch:{ NoSuchFieldError -> 0x001f }
                zendesk.support.request.DocumentRenderer$Node$Type r1 = zendesk.support.request.DocumentRenderer.Node.Type.H1     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = $SwitchMap$zendesk$support$request$DocumentRenderer$Node$Type     // Catch:{ NoSuchFieldError -> 0x002a }
                zendesk.support.request.DocumentRenderer$Node$Type r1 = zendesk.support.request.DocumentRenderer.Node.Type.H2     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = $SwitchMap$zendesk$support$request$DocumentRenderer$Node$Type     // Catch:{ NoSuchFieldError -> 0x0035 }
                zendesk.support.request.DocumentRenderer$Node$Type r1 = zendesk.support.request.DocumentRenderer.Node.Type.H3     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = $SwitchMap$zendesk$support$request$DocumentRenderer$Node$Type     // Catch:{ NoSuchFieldError -> 0x0040 }
                zendesk.support.request.DocumentRenderer$Node$Type r1 = zendesk.support.request.DocumentRenderer.Node.Type.H4     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r0 = $SwitchMap$zendesk$support$request$DocumentRenderer$Node$Type     // Catch:{ NoSuchFieldError -> 0x004b }
                zendesk.support.request.DocumentRenderer$Node$Type r1 = zendesk.support.request.DocumentRenderer.Node.Type.H5     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                int[] r0 = $SwitchMap$zendesk$support$request$DocumentRenderer$Node$Type     // Catch:{ NoSuchFieldError -> 0x0056 }
                zendesk.support.request.DocumentRenderer$Node$Type r1 = zendesk.support.request.DocumentRenderer.Node.Type.H6     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                int[] r0 = $SwitchMap$zendesk$support$request$DocumentRenderer$Node$Type     // Catch:{ NoSuchFieldError -> 0x0062 }
                zendesk.support.request.DocumentRenderer$Node$Type r1 = zendesk.support.request.DocumentRenderer.Node.Type.I     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                int[] r0 = $SwitchMap$zendesk$support$request$DocumentRenderer$Node$Type     // Catch:{ NoSuchFieldError -> 0x006e }
                zendesk.support.request.DocumentRenderer$Node$Type r1 = zendesk.support.request.DocumentRenderer.Node.Type.Code     // Catch:{ NoSuchFieldError -> 0x006e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                int[] r0 = $SwitchMap$zendesk$support$request$DocumentRenderer$Node$Type     // Catch:{ NoSuchFieldError -> 0x007a }
                zendesk.support.request.DocumentRenderer$Node$Type r1 = zendesk.support.request.DocumentRenderer.Node.Type.A     // Catch:{ NoSuchFieldError -> 0x007a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x007a }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x007a }
            L_0x007a:
                int[] r0 = $SwitchMap$zendesk$support$request$DocumentRenderer$Node$Type     // Catch:{ NoSuchFieldError -> 0x0086 }
                zendesk.support.request.DocumentRenderer$Node$Type r1 = zendesk.support.request.DocumentRenderer.Node.Type.P     // Catch:{ NoSuchFieldError -> 0x0086 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0086 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0086 }
            L_0x0086:
                int[] r0 = $SwitchMap$zendesk$support$request$DocumentRenderer$Node$Type     // Catch:{ NoSuchFieldError -> 0x0092 }
                zendesk.support.request.DocumentRenderer$Node$Type r1 = zendesk.support.request.DocumentRenderer.Node.Type.Div     // Catch:{ NoSuchFieldError -> 0x0092 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0092 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0092 }
            L_0x0092:
                int[] r0 = $SwitchMap$zendesk$support$request$DocumentRenderer$Node$Type     // Catch:{ NoSuchFieldError -> 0x009e }
                zendesk.support.request.DocumentRenderer$Node$Type r1 = zendesk.support.request.DocumentRenderer.Node.Type.Br     // Catch:{ NoSuchFieldError -> 0x009e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009e }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009e }
            L_0x009e:
                int[] r0 = $SwitchMap$zendesk$support$request$DocumentRenderer$Node$Type     // Catch:{ NoSuchFieldError -> 0x00aa }
                zendesk.support.request.DocumentRenderer$Node$Type r1 = zendesk.support.request.DocumentRenderer.Node.Type.Img     // Catch:{ NoSuchFieldError -> 0x00aa }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00aa }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00aa }
            L_0x00aa:
                int[] r0 = $SwitchMap$zendesk$support$request$DocumentRenderer$Node$Type     // Catch:{ NoSuchFieldError -> 0x00b6 }
                zendesk.support.request.DocumentRenderer$Node$Type r1 = zendesk.support.request.DocumentRenderer.Node.Type.Li     // Catch:{ NoSuchFieldError -> 0x00b6 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b6 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b6 }
            L_0x00b6:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: zendesk.support.request.DocumentRenderer.AnonymousClass1.<clinit>():void");
        }
    }

    static class Node {
        private final Map<String, String> attributes;
        private final List<Node> children;
        private final Node parent;
        private final String text;
        private final Type type;

        static Node withTag(String str, Node node, Map<String, String> map) {
            return new Node(Type.forTag(str), (String) null, new ArrayList(), node, map);
        }

        static Node withContent(Node node, String str, Map<String, String> map) {
            return new Node(Type.Text, str, new ArrayList(), node, map);
        }

        private Node(Type type2, String str, List<Node> list, Node node, Map<String, String> map) {
            this.type = type2;
            this.text = str;
            this.children = list;
            this.parent = node;
            this.attributes = map;
        }

        /* access modifiers changed from: package-private */
        public void addChild(Node node) {
            this.children.add(node);
        }

        public Type getType() {
            return this.type;
        }

        public CharSequence getText() {
            return this.text;
        }

        /* access modifiers changed from: package-private */
        public List<Node> getChildren() {
            return this.children;
        }

        public Node getParent() {
            return this.parent;
        }

        /* access modifiers changed from: package-private */
        public Map<String, String> getAttributes() {
            return this.attributes;
        }

        enum Type {
            B("b"),
            I("i"),
            Code("code"),
            H1("h1"),
            H2("h2"),
            H3("h3"),
            H4("h4"),
            H5("h5"),
            H6("h6"),
            Strong("strong"),
            U("u"),
            Em("em"),
            Br("br"),
            Hr("hr"),
            Div("div"),
            P("p"),
            Li("li"),
            A("a"),
            Ol("ol"),
            Ul("ul"),
            Img("img"),
            Text("$text"),
            Document("$document"),
            Unknown("$unknown");
            
            private final String tag;

            private Type(String str) {
                this.tag = str;
            }

            public final String getTag() {
                return this.tag;
            }

            static Type forTag(String str) {
                for (Type type : values()) {
                    if (type.getTag().equalsIgnoreCase(str)) {
                        return type;
                    }
                }
                return Unknown;
            }
        }
    }

    static class HtmlParser {
        private static final Set<String> UNCLOSED_TAGS = new HashSet(Arrays.asList(new String[]{"br", "hr", "img"}));
        private final XmlPullParser xpp;

        HtmlParser() {
            XmlPullParser xmlPullParser = null;
            try {
                XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
                newInstance.setValidating(false);
                newInstance.setFeature(Xml.FEATURE_RELAXED, true);
                xmlPullParser = newInstance.newPullParser();
            } catch (XmlPullParserException e) {
                new Object[1][0] = e.getLocalizedMessage();
                F.m1361();
            } finally {
                this.xpp = xmlPullParser;
            }
        }

        /* access modifiers changed from: package-private */
        public RichRenderingDocument parse(String str, String str2) {
            Node endTag;
            try {
                this.xpp.setInput(new StringReader(str));
                int eventType = this.xpp.getEventType();
                Node node = null;
                Node node2 = null;
                while (eventType != 1) {
                    if (eventType == 0) {
                        node = startDocument();
                        node2 = node;
                    } else {
                        if (eventType == 2) {
                            endTag = startTag(node2);
                        } else if (eventType == 3) {
                            endTag = endTag(node2);
                        } else if (eventType == 4) {
                            text(node2);
                        }
                        node2 = endTag;
                    }
                    eventType = this.xpp.next();
                }
                if (node == node2) {
                    return new RichRenderingDocument(node, str2);
                }
            } catch (Exception e) {
                Object[] objArr = {e.getLocalizedMessage(), str};
                F.m1361();
            }
            return new RichRenderingDocument((Node) null, str2);
        }

        private Node startDocument() {
            return Node.withTag(Node.Type.Document.getTag(), (Node) null, getAttributes());
        }

        private Node startTag(Node node) {
            String name = this.xpp.getName();
            Node withTag = Node.withTag(name, node, getAttributes());
            node.addChild(withTag);
            return UNCLOSED_TAGS.contains(name) ? node : withTag;
        }

        private Node endTag(Node node) {
            return node.getParent();
        }

        private void text(Node node) {
            String trim = this.xpp.getText().trim();
            if (P.m1406(trim)) {
                node.addChild(Node.withContent(node, trim, getAttributes()));
            }
        }

        private Map<String, String> getAttributes() {
            int attributeCount = this.xpp.getAttributeCount();
            HashMap hashMap = new HashMap(Math.max(0, attributeCount));
            if (attributeCount > 0) {
                for (int i = 0; i < attributeCount; i++) {
                    hashMap.put(this.xpp.getAttributeName(i), this.xpp.getAttributeValue(i));
                }
            }
            return hashMap;
        }
    }

    static class ZendeskUrlSpan extends URLSpan {
        private final ZendeskDeepLinkHelper deepLinkHelper;
        private final mW uiConfig;

        ZendeskUrlSpan(String str, ZendeskDeepLinkHelper zendeskDeepLinkHelper, mW mWVar) {
            super(str);
            this.deepLinkHelper = zendeskDeepLinkHelper;
            this.uiConfig = mWVar;
        }

        public void onClick(View view) {
            if (!this.deepLinkHelper.launch(getURL(), this.uiConfig, view.getContext())) {
                super.onClick(view);
            }
        }
    }

    static class RichRenderingDocument {
        private final String fallbackText;
        private final Node tree;

        RichRenderingDocument(Node node, String str) {
            this.tree = node;
            this.fallbackText = str;
        }

        /* access modifiers changed from: package-private */
        public boolean isValid() {
            Node node = this.tree;
            return node != null && !node.getChildren().isEmpty();
        }

        /* access modifiers changed from: package-private */
        public Node getNodeTree() {
            return this.tree;
        }

        /* access modifiers changed from: package-private */
        public String getFallbackText() {
            return this.fallbackText;
        }
    }
}
