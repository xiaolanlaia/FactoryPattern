package com.example.factorypattern;

/**
 * Created by W on 2018/12/15.
 */

public class DBHander extends IOHandler {
    @Override
    public void add(String id,String name){
        //业务处理
    }
    @Override
    public void remove(String id){
        //业务处理
    }
    @Override
    public void update(String id,String name){
        //业务处理
    }

    @Override
    public String query(String id){
        //业务处理
        return "AigeStudio";
    }
}
