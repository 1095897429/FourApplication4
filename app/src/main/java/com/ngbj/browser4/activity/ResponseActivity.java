package com.ngbj.browser4.activity;

import android.widget.TextView;

import com.ngbj.browser4.R;
import com.ngbj.browser4.base.BaseActivity;

import butterknife.BindView;
import butterknife.OnClick;

public  class ResponseActivity extends CommonHeadActivity {



    @Override
    protected int getLayoutId() {
        return R.layout.activity_response;
    }

    @Override
    protected void initDatas() {
        center_title.setText("免责条款");
    }



}
