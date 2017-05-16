package com.example.sus.mvptext.model;

import android.os.Handler;
import android.text.TextUtils;

import com.example.sus.mvptext.presenter.OnLoginFinishedListener;

/**
 * 项目名称：MVPText
 * 项目创建人：caijiannan
 * 项目创建时间:2017/5/16 20:17
 */
/**
 * Created by Anthony on 2016/2/15.
 * Class Note:延时模拟登陆（2s），如果名字或者密码为空则登陆失败，否则登陆成功
 */
public class LoginModeImpl implements LoginModel{
    /**
     * 做一个耗时操作防止在俩秒之内恶意点击
     */
   private boolean bo;
    @Override
    public void login(final String username, final String pass, final OnLoginFinishedListener onfinised){
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
              if(TextUtils.isEmpty(username)){
                  onfinised.onUsernameError();
                  bo=true;//判断如果账号为空就返回错误为true
              } if(TextUtils.isEmpty(pass)){
                  onfinised.onpasswordError();
                  bo=true;//判断如果密码为空就返回错误为true
              } if(!bo){
                    onfinised.onChenggong();
                }
            }
        },2000);

    }
}
