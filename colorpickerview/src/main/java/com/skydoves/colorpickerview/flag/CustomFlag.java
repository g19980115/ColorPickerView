package com.skydoves.colorpickerview.flag;

import android.annotation.SuppressLint;
import android.content.Context;
import android.widget.TextView;

import com.skydoves.colorpickerview.AlphaTileView;
import com.skydoves.colorpickerview.ColorEnvelope;
import com.skydoves.colorpickerview.R;

public class CustomFlag extends FlagView {

    private final TextView textView;
    private final AlphaTileView alphaTileView;

    public CustomFlag(Context context) {
        super(context, R.layout.layout_flag);
        textView = findViewById(R.id.flag_color_code);
        alphaTileView = findViewById(R.id.flag_color_layout);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onRefresh(ColorEnvelope colorEnvelope) {
        textView.setText("#" + colorEnvelope.getHexCode());
        alphaTileView.setPaintColor(colorEnvelope.getColor());
    }
}