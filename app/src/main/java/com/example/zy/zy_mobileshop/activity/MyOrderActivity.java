package com.example.zy.zy_mobileshop.activity;import android.widget.TextView;import com.example.zy.zy_mobileshop.R;import com.example.zy.zy_mobileshop.common.BaseActivity;import butterknife.BindView;import butterknife.OnClick;public class MyOrderActivity extends BaseActivity {    @BindView(R.id.tv_title)    TextView tvTitle;    @Override    public int getContentViewId() {        return R.layout.activity_my_order;    }    @Override    protected void initView() {        super.initView();        tvTitle.setText("我的订单");    }    @OnClick(R.id.iv_back)    void close(){        finish();    }}