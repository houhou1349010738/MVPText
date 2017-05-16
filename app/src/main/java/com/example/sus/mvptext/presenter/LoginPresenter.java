package com.example.sus.mvptext.presenter;

/**
 * 项目名称：MVPText
 * 项目创建人：caijiannan
 * 项目创建时间:2017/5/16 20:18
 */
//Class Note:登陆的Presenter 的接口，实现类为LoginPresenterImpl，完成登陆的验证，以及销毁当前view
//点击验证通过表示器完成登录
public interface LoginPresenter {
    void Loginyanzeng(String username,String pass);

     void onDestroy();
}
