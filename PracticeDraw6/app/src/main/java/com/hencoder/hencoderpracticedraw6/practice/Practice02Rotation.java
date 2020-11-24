package com.hencoder.hencoderpracticedraw6.practice;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.hencoder.hencoderpracticedraw6.R;

public class Practice02Rotation extends RelativeLayout {
    Button animateBt;
    ImageView imageView;
    int count = 0;

    public Practice02Rotation(Context context) {
        super(context);
    }

    public Practice02Rotation(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice02Rotation(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();

        animateBt = (Button) findViewById(R.id.animateBt);
        imageView = (ImageView) findViewById(R.id.imageView);

        animateBt.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(final View v) {
                // // TODO 在这里处理点击事件，通过 View.animate().rotation/X/Y() 来让 View 旋转
                if (count == 0) {
                    imageView.animate().rotationBy(180F);
                } else if (count == 1) {
                    imageView.animate().rotationBy(-180F);
                } else if (count == 2) {
                    imageView.animate().rotationXBy(180F);
                } else if (count == 3) {
                    imageView.animate().rotationXBy(-180F);
                } else if (count == 4) {
                    imageView.animate().rotationYBy(180F);
                } else if (count == 5) {
                    imageView.animate().rotationYBy(-180F);
                }

                if (++count == 6) {
                    count = 0;
                }
            }
        });
    }
}