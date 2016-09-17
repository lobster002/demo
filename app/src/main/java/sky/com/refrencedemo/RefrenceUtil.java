package sky.com.refrencedemo;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

/**
 * Created by Sky on 2016/9/17.
 */
public class RefrenceUtil {
    public static Reference<Bitmap> decode(Resources res, int id) {
        Bitmap bmp = BitmapFactory.decodeResource(res, id);
        Reference<Bitmap> reference = new SoftReference<Bitmap>(bmp);
        return reference;
    }
}
