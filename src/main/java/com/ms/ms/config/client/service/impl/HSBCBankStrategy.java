package com.ms.ms.config.client.service.impl;

import com.ms.ms.config.client.service.IBankStrategy;

import java.math.BigDecimal;

/**
 * @author xinjian.ai
 * @desc 汇丰银行策略实现类
 * @date 2021-05-23 15:25:58
 */
public class HSBCBankStrategy implements IBankStrategy {
    @Override
    public void bankOut(BigDecimal amount) {
        System.out.println("汇丰银行总共利率："+amount.multiply(new BigDecimal(0.04)));
        System.out.println("汇丰银行送出一个礼包");
    }
}
