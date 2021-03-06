package com.ngbj.browser4.mvp.contract.app;


import android.content.Context;

import com.ngbj.browser4.base.BaseContract;
import com.ngbj.browser4.bean.LoginResult;
import com.ngbj.browser4.bean.NewsBean;
import com.ngbj.browser4.bean.WeatherBean;

/**
 * Date:2018/7/18
 * author:zl
 * 备注：
 */
public interface HomeContract {

    interface View extends BaseContract.BaseView{
            void showNewsData(NewsBean newsBean);
            void showWeatherData(WeatherBean weatherBean);
    }


    interface Presenter<T> extends BaseContract.BasePresenter<T>{
            void getNewsData();
            void getWeatherData(Context context,String location);
    }
}
