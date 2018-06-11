package com.example.laichaojie1601v20180611;


import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.zhy.view.flowlayout.FlowLayout;


public class MainActivity extends Activity {

    private String mNames[] = {
            "welcome","android","TextView",
            "apple","jamy","kobe bryant",
            "jordan","layout","viewgroup",
            "margin","padding","text",
            "name","type","search","logcat"
    };
    private FlowLayout mFlowLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

        initFlowView();

        }

    private void initFlowView() {
            mFlowLayout =  findViewById(R.id.id_flowlayout);
            ViewGroup.MarginLayoutParams lp = new ViewGroup.MarginLayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            lp.leftMargin = 5;
            lp.rightMargin = 5;
            lp.topMargin = 5;
            lp.bottomMargin = 5;
            for(int i = 0; i < mNames.length; i ++){
                TextView view = new TextView(this);
                view.setText(mNames[i]);
                view.setTextColor(Color.WHITE);
                view.setBackgroundDrawable(getResources().getDrawable(R.drawable.text_yangshi));
                mFlowLayout.addView(view,lp);
            }
    }

}
