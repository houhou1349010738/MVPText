package com.example.sus.mvptext.presenter;

import com.example.sus.mvptext.model.LoginModeImpl;
import com.example.sus.mvptext.model.LoginModel;
import com.example.sus.mvptext.view.LoginView;

/**
 * 项目名称：MVPText
 * 项目创建人：caijiannan
 * 项目创建时间:2017/5/16 20:17
 */
/**最终验证账目密码的信息
 *由于MVP model和View不直接交互
 * 所以由loginModel里判断密码为不为空的方法和loginView拿回来的V账号密码的值验证
 */

public class LoginPresenterImpl implements LoginPresenter,OnLoginFinishedListener{
    private LoginModel loginModel;
    private LoginView loginView;
    public LoginPresenterImpl(LoginView loginView){
        this.loginModel= new LoginModeImpl();
        this.loginView=loginView;
    }
    @Override
    public void Loginyanzeng(String username, String pass) {
        if(loginView!=null){//如果拿回来的值不为空就把账号密码告诉MOdel让它去验证
            loginModel.login(username,pass,this);
        }
    }

    @Override
    public void onDestroy() {
        loginView=null;//销毁释放资源防止内存泄漏
    }

    @Override
    public void onUsernameError() {
        if(loginView!=null){//如果返回的不为空是账户的错就告诉登录的视图用户名错误
            loginView.setUsernameError();
        }
    }

    @Override
    public void onpasswordError() {
        if(loginView!=null){
            loginView.setpasswordError();
        }
    }

    @Override
    public void onChenggong() {
        if(loginView!=null){
            loginView.setChengGong();//如果成功就告诉登录的页面成功啦
        }
    }
}
