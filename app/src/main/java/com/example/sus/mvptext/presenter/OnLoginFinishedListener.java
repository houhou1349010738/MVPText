package com.example.sus.mvptext.presenter;

/**
 * 项目名称：MVPText
 * 项目创建人：caijiannan
 * 项目创建时间:2017/5/16 20:20
 */
    //创建一个登录监听事件的接口
public interface OnLoginFinishedListener {
    void  onUsernameError();//登录时用户名错误的方法
    //登录时密码错误的方法
    void onpasswordError();
    void onChenggong();
}
