package com.star.action;

import com.star.interfaces.Hello;

/**
 * Created by hp on 2017/1/6.
 */
//实现类2
public class EnHello implements Hello {
    public String msg=null;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String sayHello() {
        return "Hello "+msg;
    }
}
