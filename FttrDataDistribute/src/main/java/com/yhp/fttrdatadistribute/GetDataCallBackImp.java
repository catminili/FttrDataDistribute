package com.yhp.fttrdatadistribute;


public class GetDataCallBackImp implements IGetDataCallBack {
    @Override
    public void registerGetDataCallBack(String cmdType, GetDataCallBack callBack) {
        InterFaceManager.getInstance().registerInterface(cmdType,callBack);
    }
}
