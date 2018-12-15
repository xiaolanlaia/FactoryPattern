package com.example.factorypattern;

/**
 * Created by W on 2018/12/15.
 */

public abstract class IOHandler {
    /**
     * 增加一条个人信息
     * @param id
     * @param name
     */
    public abstract void add(String id,String name);

    /**
     * 删除一条个人信息
     * @param id
     */
    public abstract void remove(String id);

    /**
     * 更新一条个人信息
     * @param id
     * @param name
     */
    public abstract void update(String id,String name);

    /**
     * 查询一条个人信息
     * @param id
     */
    public abstract String query(String id);

}
