package com.ms.ms.config.client.vo;

import com.ms.ms.config.client.service.IBankStrategy;
import com.ms.ms.config.client.service.impl.HSBCBankStrategy;
import com.ms.ms.config.client.service.impl.MerchantsBankStrategy;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @author xinjian.ai
 * @desc 人员银行存储实现类
 * @date 2021-05-23 15:38:09
 */
@Data
public class Person {
    private String name;
    private BigDecimal amount;
    private IBankStrategy bankStrategy;

    public Person(String name, BigDecimal amount) {
        this.name = name;
        this.amount = amount;
        this.bankStrategy = amount.compareTo(new BigDecimal(10000)) > 0 ? new HSBCBankStrategy() : new MerchantsBankStrategy();
    }
}
