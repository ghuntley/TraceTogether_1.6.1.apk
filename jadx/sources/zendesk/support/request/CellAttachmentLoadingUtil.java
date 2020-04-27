package zendesk.support.request;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o.C;
import o.C3289b;
import o.C3616p;
import o.C3619s;
import o.C3620t;
import o.F;
import o.G;
import o.P;
import o.R;
import zendesk.support.PicassoTransformations;

class CellAttachmentLoadingUtil {
    /* access modifiers changed from: private */
    public final ImageLoadingLogic imageLoadingLogic;
    private final ImageSizingLogic imageSizingLogic;

    CellAttachmentLoadingUtil(C3616p pVar, Context context) {
        this.imageSizingLogic = new ImageSizingLogic(pVar, context);
        this.imageLoadingLogic = new ImageLoadingLogic(pVar);
    }

    /* access modifiers changed from: package-private */
    public void bindImage(final ImageView imageView, final StateRequestAttachment stateRequestAttachment) {
        if (!this.imageLoadingLogic.isImageLoading(imageView, stateRequestAttachment)) {
            this.imageLoadingLogic.setImageViewLoading(imageView, stateRequestAttachment);
            adjustImageViewDimensions(imageView, this.imageSizingLogic.getMaxSize());
            this.imageLoadingLogic.initImageView(imageView);
            this.imageSizingLogic.loadDimensionsForAttachment(stateRequestAttachment, new G<ImageSizingLogic.ImageDimensions>() {
                public void onError(C c) {
                }

                public void onSuccess(ImageSizingLogic.ImageDimensions imageDimensions) {
                    if (imageDimensions.areKnown()) {
                        CellAttachmentLoadingUtil.this.adjustImageViewDimensions(imageView, imageDimensions);
                        CellAttachmentLoadingUtil.this.imageLoadingLogic.loadAttachment(imageView, stateRequestAttachment, imageDimensions);
                        return;
                    }
                    new Object[1][0] = Long.valueOf(stateRequestAttachment.getId());
                    F.m1359();
                }
            });
        }
    }

    /* access modifiers changed from: private */
    public void adjustImageViewDimensions(ImageView imageView, ImageSizingLogic.ImageDimensions imageDimensions) {
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        layoutParams.width = imageDimensions.getImageWidth();
        layoutParams.height = imageDimensions.getImageHeight();
        imageView.setLayoutParams(layoutParams);
    }

    static class ImageLoadingLogic {
        private final C3616p picasso;

        interface LoadingStrategy {
            void load(ImageView imageView, ImageSizingLogic.ImageDimensions imageDimensions);
        }

        ImageLoadingLogic(C3616p pVar) {
            this.picasso = pVar;
        }

        /* access modifiers changed from: package-private */
        public boolean isImageLoading(ImageView imageView, StateRequestAttachment stateRequestAttachment) {
            Object tag = imageView.getTag();
            return (tag instanceof StateRequestAttachment) && ((StateRequestAttachment) tag).getId() == stateRequestAttachment.getId();
        }

        /* access modifiers changed from: package-private */
        public void setImageViewLoading(ImageView imageView, StateRequestAttachment stateRequestAttachment) {
            imageView.setTag(stateRequestAttachment);
        }

        /* access modifiers changed from: package-private */
        public void initImageView(ImageView imageView) {
            this.picasso.m4044((Object) imageView);
            imageView.setImageResource(R.color.f157302131099927);
        }

        /* access modifiers changed from: package-private */
        public void loadAttachment(ImageView imageView, StateRequestAttachment stateRequestAttachment, ImageSizingLogic.ImageDimensions imageDimensions) {
            getLoadingStrategy(stateRequestAttachment).load(imageView, imageDimensions);
        }

        private LoadingStrategy getLoadingStrategy(StateRequestAttachment stateRequestAttachment) {
            C3620t tVar;
            if (stateRequestAttachment.getLocalFile() != null && stateRequestAttachment.getLocalFile().exists() && stateRequestAttachment.getLocalFile().length() > 0) {
                C3616p pVar = this.picasso;
                File localFile = stateRequestAttachment.getLocalFile();
                if (localFile == null) {
                    tVar = new C3620t(pVar, (Uri) null);
                } else {
                    tVar = new C3620t(pVar, Uri.fromFile(localFile));
                }
                return new DisplayImageFromLocalSource(tVar);
            } else if (P.m1406(stateRequestAttachment.getLocalUri()) && Uri.parse(stateRequestAttachment.getLocalUri()) != null) {
                return new DisplayImageFromLocalSource(new C3620t(this.picasso, stateRequestAttachment.getParsedLocalUri()));
            } else {
                if (P.m1406(stateRequestAttachment.getUrl()) && P.m1406(stateRequestAttachment.getThumbnailUrl())) {
                    return new DisplayImageFromWeb(this.picasso, stateRequestAttachment.getUrl(), stateRequestAttachment.getThumbnailUrl());
                }
                new Object[1][0] = Long.valueOf(stateRequestAttachment.getId());
                F.m1359();
                return new DefaultDisplayStrategy();
            }
        }

        static class DisplayImageFromLocalSource implements LoadingStrategy {
            private final C3620t requestCreator;

            private DisplayImageFromLocalSource(C3620t tVar) {
                this.requestCreator = tVar;
            }

            public void load(ImageView imageView, ImageSizingLogic.ImageDimensions imageDimensions) {
                C3620t tVar = this.requestCreator;
                tVar.f3495 = false;
                tVar.f3497 = true;
                ImageLoadingLogic.loadImage(imageView, tVar, imageDimensions, (C3289b) null);
            }
        }

        static class DisplayImageFromWeb implements LoadingStrategy {
            final C3616p picasso;
            final String thumbnailUrl;
            final String url;

            private DisplayImageFromWeb(C3616p pVar, String str, String str2) {
                this.picasso = pVar;
                this.url = str;
                this.thumbnailUrl = str2;
            }

            public void load(final ImageView imageView, final ImageSizingLogic.ImageDimensions imageDimensions) {
                ImageLoadingLogic.loadImage(imageView, this.picasso.m4041(this.thumbnailUrl).m4074(PicassoTransformations.getBlurTransformation(imageView.getContext().getApplicationContext())), imageDimensions, new C3289b() {
                    public void onSuccess() {
                        ImageView imageView = imageView;
                        C3620t r1 = DisplayImageFromWeb.this.picasso.m4041(DisplayImageFromWeb.this.url);
                        r1.f3495 = false;
                        ImageLoadingLogic.loadImage(imageView, r1, imageDimensions, (C3289b) null);
                    }

                    public void onError() {
                        new Object[1][0] = DisplayImageFromWeb.this.thumbnailUrl;
                        F.m1359();
                        ImageView imageView = imageView;
                        C3620t r1 = DisplayImageFromWeb.this.picasso.m4041(DisplayImageFromWeb.this.url);
                        r1.f3495 = false;
                        ImageLoadingLogic.loadImage(imageView, r1, imageDimensions, (C3289b) null);
                    }
                });
            }
        }

        static class DefaultDisplayStrategy implements LoadingStrategy {
            public void load(ImageView imageView, ImageSizingLogic.ImageDimensions imageDimensions) {
            }

            private DefaultDisplayStrategy() {
            }
        }

        /* access modifiers changed from: private */
        public static void loadImage(ImageView imageView, C3620t tVar, ImageSizingLogic.ImageDimensions imageDimensions, C3289b bVar) {
            int imageWidth = imageDimensions.getImageWidth();
            int imageHeight = imageDimensions.getImageHeight();
            C3620t r4 = tVar.m4074(PicassoTransformations.getRoundedTransformation(imageView.getContext().getResources().getDimensionPixelOffset(R.dimen.f159792131165596) / 2));
            r4.f3496.m4066(imageWidth / 2, imageHeight / 2);
            r4.f3496.f3487 = true;
            r4.m4076(imageView, bVar);
        }
    }

    static class ImageSizingLogic {
        /* access modifiers changed from: private */
        public final Map<String, ImageDimensions> cachedDimensions = new HashMap();
        private final ImageDimensions maxSize;
        private final C3616p picasso;

        interface DimensionStrategy {
            void findDimensions(G<ImageDimensions> g);
        }

        ImageSizingLogic(C3616p pVar, Context context) {
            this.picasso = pVar;
            this.maxSize = getMaxSize(context);
        }

        /* access modifiers changed from: package-private */
        public void loadDimensionsForAttachment(final StateRequestAttachment stateRequestAttachment, final G<ImageDimensions> g) {
            getDimensionStrategy(stateRequestAttachment, this.maxSize).findDimensions(new G<ImageDimensions>() {
                public void onError(C c) {
                }

                public void onSuccess(ImageDimensions imageDimensions) {
                    if (P.m1406(stateRequestAttachment.getLocalUri()) && imageDimensions.areKnown()) {
                        ImageSizingLogic.this.cachedDimensions.put(stateRequestAttachment.getLocalUri(), imageDimensions);
                    }
                    g.onSuccess(imageDimensions);
                }
            });
        }

        /* access modifiers changed from: package-private */
        public ImageDimensions getMaxSize() {
            return this.maxSize;
        }

        private DimensionStrategy getDimensionStrategy(StateRequestAttachment stateRequestAttachment, ImageDimensions imageDimensions) {
            if (stateRequestAttachment.getHeight() > 0 && stateRequestAttachment.getWidth() > 0) {
                return new ExistingDimensions(stateRequestAttachment.getWidth(), stateRequestAttachment.getHeight(), imageDimensions);
            }
            if (P.m1406(stateRequestAttachment.getLocalUri()) && this.cachedDimensions.containsKey(stateRequestAttachment.getLocalUri())) {
                ImageDimensions imageDimensions2 = this.cachedDimensions.get(stateRequestAttachment.getLocalUri());
                return new ExistingDimensions(imageDimensions2.getImageWidth(), imageDimensions2.getImageHeight(), imageDimensions);
            } else if (stateRequestAttachment.getLocalFile() != null && stateRequestAttachment.getLocalFile().exists() && stateRequestAttachment.getLocalFile().length() > 0) {
                return new ReadFromBitmap(stateRequestAttachment.getLocalFile(), imageDimensions);
            } else {
                if (P.m1406(stateRequestAttachment.getLocalUri()) && Uri.parse(stateRequestAttachment.getLocalUri()) != null) {
                    return new ReadFromPicasso(new C3620t(this.picasso, Uri.parse(stateRequestAttachment.getLocalUri())), imageDimensions);
                } else if (P.m1406(stateRequestAttachment.getUrl())) {
                    return new ReadFromPicasso(this.picasso.m4041(stateRequestAttachment.getUrl()), imageDimensions);
                } else {
                    new Object[1][0] = Long.valueOf(stateRequestAttachment.getId());
                    F.m1359();
                    return new DefaultStrategy();
                }
            }
        }

        static ImageDimensions determineTargetDimensions(int i, int i2, int i3, int i4) {
            ImageDimensions imageDimensions = new ImageDimensions();
            int i5 = (int) (((double) i3) / ((((double) i) * 1.0d) / ((double) i2)));
            if (i > i2) {
                if (i > i3) {
                    i = i3;
                    imageDimensions.setDimensions(i, Math.max(Math.min(i4, i5), 0));
                    return imageDimensions;
                }
            } else if (i2 > i5) {
                i = Math.min(i3, i);
                imageDimensions.setDimensions(i, Math.max(Math.min(i4, i5), 0));
                return imageDimensions;
            }
            i5 = i2;
            imageDimensions.setDimensions(i, Math.max(Math.min(i4, i5), 0));
            return imageDimensions;
        }

        private ImageDimensions getMaxSize(Context context) {
            int calculateMaxWidth = calculateMaxWidth(context);
            return new ImageDimensions(calculateMaxWidth, (int) (((double) calculateMaxWidth) / 1.7777777777777777d));
        }

        private int calculateMaxWidth(Context context) {
            Resources resources = context.getResources();
            return (resources.getDisplayMetrics().widthPixels - resources.getDimensionPixelSize(R.dimen.f159892131165619)) - resources.getDimensionPixelSize(R.dimen.f159962131165627);
        }

        static class ReadFromPicasso implements DimensionStrategy {
            /* access modifiers changed from: private */
            public static final List<C3619s> TARGET_REFERENCE_TRAP = new ArrayList();
            /* access modifiers changed from: private */
            public final ImageDimensions maxSize;
            private final C3620t requestCreator;

            private ReadFromPicasso(C3620t tVar, ImageDimensions imageDimensions) {
                this.requestCreator = tVar;
                this.maxSize = imageDimensions;
            }

            public void findDimensions(final G<ImageDimensions> g) {
                AnonymousClass1 r0 = new C3619s() {
                    public void onPrepareLoad(Drawable drawable) {
                    }

                    public void onBitmapLoaded(Bitmap bitmap, C3616p.C0272 r5) {
                        g.onSuccess(ImageSizingLogic.determineTargetDimensions(bitmap.getWidth(), bitmap.getHeight(), ReadFromPicasso.this.maxSize.getImageWidth(), ReadFromPicasso.this.maxSize.getImageHeight()));
                        ReadFromPicasso.TARGET_REFERENCE_TRAP.remove(this);
                    }

                    public void onBitmapFailed(Drawable drawable) {
                        F.m1359();
                        g.onSuccess(new ImageDimensions());
                        ReadFromPicasso.TARGET_REFERENCE_TRAP.remove(this);
                    }
                };
                TARGET_REFERENCE_TRAP.add(r0);
                this.requestCreator.m4075((C3619s) r0);
            }
        }

        static class ReadFromBitmap implements DimensionStrategy {
            final File file;
            private final ImageDimensions maxSize;

            ReadFromBitmap(File file2, ImageDimensions imageDimensions) {
                this.maxSize = imageDimensions;
                this.file = file2;
            }

            public void findDimensions(G<ImageDimensions> g) {
                ImageDimensions loadImageDimensions = loadImageDimensions(this.file);
                g.onSuccess(ImageSizingLogic.determineTargetDimensions(loadImageDimensions.getImageWidth(), loadImageDimensions.getImageHeight(), this.maxSize.getImageWidth(), this.maxSize.getImageHeight()));
            }

            private ImageDimensions loadImageDimensions(File file2) {
                ImageDimensions imageDimensions = new ImageDimensions();
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(file2.getAbsolutePath(), options);
                imageDimensions.setDimensions(options.outWidth, options.outHeight);
                return imageDimensions;
            }
        }

        static class ExistingDimensions implements DimensionStrategy {
            private final int height;
            private final ImageDimensions maxSize;
            private final int width;

            ExistingDimensions(int i, int i2, ImageDimensions imageDimensions) {
                this.width = i;
                this.height = i2;
                this.maxSize = imageDimensions;
            }

            public void findDimensions(G<ImageDimensions> g) {
                g.onSuccess(ImageSizingLogic.determineTargetDimensions(this.width, this.height, this.maxSize.getImageWidth(), this.maxSize.getImageHeight()));
            }
        }

        static class DefaultStrategy implements DimensionStrategy {
            private DefaultStrategy() {
            }

            public void findDimensions(G<ImageDimensions> g) {
                g.onSuccess(new ImageDimensions());
            }
        }

        static class ImageDimensions {
            private int imageHeight = -1;
            private int imageWidth = -1;

            ImageDimensions(int i, int i2) {
                this.imageWidth = i;
                this.imageHeight = i2;
            }

            ImageDimensions() {
            }

            /* access modifiers changed from: package-private */
            public boolean areKnown() {
                return (this.imageWidth == -1 || this.imageHeight == -1) ? false : true;
            }

            /* access modifiers changed from: package-private */
            public int getImageWidth() {
                return this.imageWidth;
            }

            /* access modifiers changed from: package-private */
            public int getImageHeight() {
                return this.imageHeight;
            }

            /* access modifiers changed from: package-private */
            public void setDimensions(int i, int i2) {
                this.imageWidth = i;
                this.imageHeight = i2;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder("ImageDimensions{width=");
                sb.append(this.imageWidth);
                sb.append(", height=");
                sb.append(this.imageHeight);
                sb.append('}');
                return sb.toString();
            }
        }
    }
}
