package com.example.sus.mvptext.view;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.sus.mvptext.R;
import com.example.sus.mvptext.presenter.LoginPresenterImpl;

/**
 * 项目名称：MVPText
 * 项目创建人：caijiannan
 * 项目创建时间:2017/5/16 0:15
 */

public class LoginActivity extends Activity implements LoginView,View.OnClickListener {
    private EditText name;
    private EditText pwss;
    private Button bnt;
    private LinearLayout activity_main;
    private LoginPresenterImpl loginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();//找ID
    }

    @Override//用户名错误
    public void setUsernameError() {
        Toast.makeText(this,"用户名错误",Toast.LENGTH_LONG).show();
    }

    @Override//用户密码错误
    public void setpasswordError() {
        Toast.makeText(this,"密码错误",Toast.LENGTH_SHORT).show();
    }

    @Override//成功
    public void setChengGong() {
        Toast.makeText(this,"登录成功",Toast.LENGTH_SHORT).show();
    }
    private void initView() {
        name = (EditText) findViewById(R.id.name);//获取账号
        pwss = (EditText) findViewById(R.id.pwss);//获取密码
        bnt = (Button) findViewById(R.id.bnt);//登录
        activity_main = (LinearLayout) findViewById(R.id.activity_main);
        bnt.setOnClickListener(this);
        loginPresenter = new LoginPresenterImpl(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bnt:
            loginPresenter.Loginyanzeng(name.getText().toString(),pwss.getText().toString());
                break;
        }
    }

}
