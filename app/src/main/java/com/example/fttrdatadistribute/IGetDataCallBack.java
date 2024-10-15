package com.example.fttrdatadistribute;


public interface IGetDataCallBack {

    void registerGetDataCallBack(String cmdType,GetDataCallBack callBack);
    interface GetDataCallBack {
        void getDataCallBack(FTTRData data);

        void getSessionToken(String sessionToken);

    }
}
