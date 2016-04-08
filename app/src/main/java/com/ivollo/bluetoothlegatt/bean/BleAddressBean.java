package com.ivollo.bluetoothlegatt.bean;

/**
 * Created by huangbing on 2016/3/31.
 */
public class BleAddressBean {
    //蓝牙名称
    private String bleName;

    //蓝牙地址
    private String bleAddr;


    public BleAddressBean(String bleName,String bleAddr){
        this.bleName = bleName;
        this.bleAddr = bleAddr;
    }

    public String getBleName() {
        return bleName;
    }


    public String getBleAddr() {
        return bleAddr;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true ;
        }
        if (!(obj instanceof BleAddressBean)) {
            return false ;
        }
        BleAddressBean other = (BleAddressBean) obj;
        return this.bleName.equals(other.getBleName()) && this.bleAddr.equals(other.getBleAddr());
    }

    //确保equal的对象，是有相同hashcode的
    @Override
    public int hashCode() {
        return (bleName + bleAddr).hashCode();
    }

}
