package com.star.action;

import com.star.interfaces.Hello;

/**
 * Created by hp on 2017/1/6.
 */
//实现类1
public class ChHello implements Hello {
    public String msg=null;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String sayHello() {
        return "你好 "+msg;
    }
}
