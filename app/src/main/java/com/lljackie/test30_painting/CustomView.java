package com.lljackie.test30_painting;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;

public class CustomView extends View {
    public CustomView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvas.drawColor(Color.WHITE);

        Paint paint = new Paint();

        paint.setAntiAlias(true);
        paint.setColor(Color.RED);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(3);

        Path path = new Path();
        path.addCircle(120, 120, 100, Path.Direction.CCW);
        path.moveTo(120, 20);
        path.lineTo((float)(120 - Math.sqrt(3) * 50), 170);
        path.lineTo((float)(120 + Math.sqrt(3) * 50), 170);
        path.close();
        canvas.drawPath(path, paint);
    }
}
