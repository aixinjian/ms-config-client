import com.ms.ms.config.client.service.IBankStrategy;
import com.ms.ms.config.client.vo.Person;
import lombok.val;
import org.aspectj.apache.bcel.classfile.InnerClass;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

/**
 * @author xinjian.ai
 * @desc 策略模式测试
 * @date 2021-05-23 15:18:32
 */
public class StrategyPatternTest {

    /**
     * 银行存储业务，招商和汇丰两个银行，招商3个点的利率，送二个礼包
     * 汇丰需要4个点的利率，送一个礼包
     * 如果在10000元以下，3个点的利率和二个礼包划算
     * 10000元以上，4个点的利率和一个礼包划算
     */
    @Test
    public void bankStrategyPattern() {
        Person person = new Person("aixinjian", new BigDecimal(2000));
        person.getBankStrategy().bankOut(person.getAmount());
    }


}
