package com.example.android.location.loc;

/**
 * Created by heqingbao on 2017/3/15.
 */
public abstract class AbsLocationManager {

    public abstract void requestLocationOnce(LocationListener listener);

    public abstract void stopLocation();
}
