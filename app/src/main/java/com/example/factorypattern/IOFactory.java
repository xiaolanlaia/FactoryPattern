package com.example.factorypattern;

/**
 * Created by W on 2018/12/15.
 */

public class IOFactory {
    /**
     * 获取IO处理者
     * @param clz  IOHander的类类型
     * @param <T> IOHander对象
     * @return
     */

    public static <T extends IOHandler> T getIOHander(Class<T>clz){
        IOHandler handler = null;
        try{
            handler = (IOHandler)Class.forName(clz.getName()).newInstance();
        }catch (Exception e){
            e.printStackTrace();
        }
        return (T)handler;
    }
}
