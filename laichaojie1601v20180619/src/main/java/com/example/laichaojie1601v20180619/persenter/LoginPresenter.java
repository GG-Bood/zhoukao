package com.example.laichaojie1601v20180619.persenter;


import android.os.Handler;
import android.os.Message;

import com.example.laichaojie1601v20180619.model.LoginModel;

/**
 * Created by 赖先生 on 2018/6/19.
 */

public class LoginPresenter {
    MainPresenter mainPresenter;
    private LoginModel loginModel;

    public LoginPresenter(MainPresenter mainPresenter){
        this.mainPresenter = mainPresenter;
        loginModel = new LoginModel();
    }

    public void loginClick(String wz,String phone,String password){
        loginModel.Login(wz,phone,password, new LoginModel.ModelCallPresenter() {
            @Override
            public void success(String msg) {
                mainPresenter.lClick(msg);
            }
        });
    }

    public void regClick(){
        mainPresenter.rClick();
    }


    public interface MainPresenter{
        void lClick(String msg);
        void rClick();
    }
}
