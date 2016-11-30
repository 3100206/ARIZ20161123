package com.rensisi.ariz.ariz.View;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.widget.TextView;

import com.rensisi.ariz.ariz.R;

/**
 * Created by kellen_home on 2016/11/30.
 */

public class ImageText extends TextView {

    private Context mContext;
    private Bitmap mBitmap;

    public ImageText(Context context) {
        super(context);
        mContext = context;
        mBitmap = BitmapFactory.decodeResource(mContext.getResources(), R.mipmap.ic_launcher);
        setTextSize(36);//控制使图像完全显示
    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawBitmap(mBitmap, 0, 0, getPaint());
        super.onDraw(canvas);
    }
}
