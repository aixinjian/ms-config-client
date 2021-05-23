package com.ms.ms.config.client.service;

import java.math.BigDecimal;

/**
 * @author xinjian.ai
 * @desc 银行策略抽象方法类
 * @date 2021-05-23 15:20:54
 */
public interface IBankStrategy {

    public void bankOut(BigDecimal amount);

}
