package com.example.sus.mvptext.model;

import com.example.sus.mvptext.presenter.OnLoginFinishedListener;

/**
 * 项目名称：MVPText
 * 项目创建人：caijiannan
 * 项目创建时间:2017/5/16 20:16
 */
    //创建登录时验证账号密码的接口
//Class Note:模拟登陆的操作的接口，实现类为LoginModelImpl.相当于MVP模式中的Model层
public interface LoginModel {
    void login(String username, String pass, OnLoginFinishedListener onfinised);
}
