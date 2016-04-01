package com.guppy.game2014;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.TextView;

/**
 * Created by
 * share00 on 2016/4/1.
 */
public class Card extends FrameLayout {
    public Card(Context context) {
        super(context);
        label = new TextView(getContext());
        label.setTextSize(32);

        LayoutParams lp = new LayoutParams(-1, -1);
        addView(label, lp);
        setNum(0);
    }

    private int num = 0;
    private TextView label;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
        label.setText(num+"");
    }

    public boolean equals(Card c) {
        return getNum() == c.getNum();
    }
}
