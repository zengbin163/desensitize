package com.tzbank.desensitize;

import com.github.houbb.sensitive.core.api.SensitiveUtil;

/**
 * 
* @desc    自定义脱敏策略生效的场景（比如密码为123456不进行脱敏）
* @author  台州银行:曾斌 
* @version 创建时间：Jun 26, 2019 2:22:17 PM
 */
public class CustomerPasswordConditionTest {

    public static void main(String[] args) {

        Cust cust1 = new Cust();
        cust1.setPassword("123456");
        Cust cust2 = new Cust();
        cust2.setPassword("1234567");

        Cust sensitiveCust1 = SensitiveUtil.desCopy(cust1);
        Cust sensitiveCust2 = SensitiveUtil.desCopy(cust2);
        System.out.println(sensitiveCust1);
        System.out.println(sensitiveCust2);

    }

}
