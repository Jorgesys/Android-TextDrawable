package com.jorgesys.textdrawable;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PixelFormat;
import android.graphics.drawable.Drawable;

/**
 * Created by Jorgesys on 10/02/2015.
 */


public class TextDrawable extends Drawable {

    private final String text;
    private final Paint paint;
    private float positionx = 0;
    private float positiony = 0;
    private Context ctx;
    private static final float FONT_SIZE = 24.0f;

    public TextDrawable(Context ctx, String text, int positionx, int positiony) {
        this.ctx = ctx;
        this.text = text;
        this.positionx = positionx;
        this.positiony = positiony;
        this.paint = new Paint();
        paint.setColor(Color.WHITE);

        paint.setTextSize(getPxfromDP(FONT_SIZE));

        paint.setAntiAlias(true);
        paint.setFakeBoldText(true);
        paint.setShadowLayer(8f, 0, 0, Color.BLACK);
        paint.setStyle(Paint.Style.FILL);
        paint.setTextAlign(Paint.Align.CENTER);//align center
    }

    //Convert Pixels to Dp
    private float getPxfromDP(float dpValue) {
        float density = ctx.getResources().getDisplayMetrics().density;
        return dpValue * density + 0.5f;
    }

    @Override
    public void draw(Canvas canvas) {
        canvas.drawText(text, getPxfromDP(positionx), getPxfromDP(positiony), paint);
    }

    @Override
    public void setAlpha(int alpha) {
        paint.setAlpha(alpha);
    }

    @Override
    public void setColorFilter(ColorFilter cf) {
        paint.setColorFilter(cf);
    }

    @Override
    public int getOpacity() {
        return PixelFormat.TRANSLUCENT;
    }
}
