package com.jhhc.baseframework.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author yecq
 */
@Service
@Transactional
public class Service1 {

    public Sret getInfo(String id, String key) {
        Sret sr = new Sret();
        if (id.equals("1")) {
            sr.setOk();
            sr.setData("叶小怜");
        } else {
            sr.setFail("错误");
        }
        return sr;
    }

    public Sret exception1() {
        throw new IllegalStateException("状态错误");
    }

    public Sret exception2() {
        throw new IllegalArgumentException("参数错误");
    }

    public Sret exception3() {
        throw new UnsupportedOperationException("操作错误");
    }
}
