package com.example.appbandaquy.presenter.signin;

import com.example.appbandaquy.view.signin.SignInView;

public class SignInPresenter implements SignInPresenterInterface {
    SignInView signInView;

    public SignInPresenter(SignInView signInView){
        this.signInView = signInView;
    }
    @Override
    public void SignIn(String email, String password) {
        if(email.equals("") && password.equals("")){
            signInView.OnFailed();
        }else {
            signInView.OnSucess();
        }
    }
}
