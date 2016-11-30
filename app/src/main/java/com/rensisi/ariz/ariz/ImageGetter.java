package com.rensisi.ariz.ariz;

import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Environment;
import android.text.Html;
import android.text.Spanned;
import android.util.Log;
import android.widget.TextView;

/**
 * Created by kellen_home on 2016/11/30.
 */

public class ImageGetter implements Html.ImageGetter {

    private TextView _mHtmlText;
    private String mImgPath;
    private Drawable mDefaultDrawable;
    private String TAG = "HtmlImageGetter";
    //参考这两个网站
    //http://blog.sina.com.cn/s/blog_7cdaf8b60102vrl1.html
//    http://blog.csdn.net/yanzi1225627/article/details/24590029
//    http://www.jb51.net/article/88523.htm
/*  实现的思路大致如此：
    1.将文章Html化，就是sp。
    Spanned sp = Html.fromHtml(string, new ImageGetter( ), null);
    2.设置textview。
    textview.setText(sp);

         */
    /**
     * 重写这个方法，返回一个drawable，要定义好drawable的bounds。
     * @param source
     * @return
     */
    @Override
    public Drawable getDrawable(String source) {
//        String imgKey = String.valueOf(source.hashCode());
//        String path = Environment.getExternalStorageDirectory() + mImgPath;
//
//        //FileUtil.createPath(path);
//        String[] ss = source.split("\\.");
//        String imgX = ss[ss.length - 1];
//        imgKey = path + "/" + imgKey + "." + imgX;
//        if (FileUtil.exists(imgKey)) {
//            Drawable drawable = FileUtil.getImageDrawable(imgKey);
//            if (drawable != null) {
//                drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
//                return drawable;
//            } else {
//                Log.v(TAG, "load img:" + imgKey + ":null");
//            }
//        }
//        URLDrawable urlDrawable = new URLDrawable(mDefaultDrawable);
//        new AsyncThread(urlDrawable).execute(imgKey, source);
//        MyDrawable drawable =


        return null;
    }

    class MyDrawable extends BitmapDrawable {

        private Drawable drawable;

        public MyDrawable(Drawable defaultDraw) {
            setDrawable(defaultDraw);

        }

        private void setDrawable(Drawable ndrawable) {
            drawable = ndrawable;
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }

        @Override
        public void draw(Canvas canvas) {
            drawable.draw(canvas);
         }

    }
}
