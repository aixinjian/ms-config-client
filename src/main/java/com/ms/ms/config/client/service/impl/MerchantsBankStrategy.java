package com.ms.ms.config.client.service.impl;

import com.ms.ms.config.client.service.IBankStrategy;

import java.math.BigDecimal;

/**
 * @author xinjian.ai
 * @desc 招商银行策略实现类
 * @date 2021-05-23 15:22:45
 */
public class MerchantsBankStrategy implements IBankStrategy {

    @Override
    public void bankOut(BigDecimal amount) {
        System.out.println("招行总共利率："+amount.multiply(new BigDecimal(0.03)));
        System.out.println("招行送出二个礼包");
    }
}
