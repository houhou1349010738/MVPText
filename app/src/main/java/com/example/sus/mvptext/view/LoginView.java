package com.example.sus.mvptext.view;

/**
 * 项目名称：MVPText
 * 项目创建人：caijiannan
 * 项目创建时间:2017/5/16 20:14
 */
//创建一个验证密码账号成功或失败后回调的接口
public interface LoginView {
    void setUsernameError();//用户名验证错误回调的方法
    void setpasswordError();//密码验证错误是回调的方法
    void setChengGong();//验证成功时回调的方法
}
