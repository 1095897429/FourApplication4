package com.ngbj.browser4.event;

import com.ngbj.browser4.bean.LoginBean;

public class UpdateEvent {
    public LoginBean loginBean;
    public UpdateEvent(LoginBean loginBean){
        this.loginBean = loginBean;
    }

    public LoginBean getLoginBean() {
        return loginBean;
    }
}
