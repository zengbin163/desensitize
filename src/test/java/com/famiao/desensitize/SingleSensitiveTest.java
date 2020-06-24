package com.famiao.desensitize;

import com.github.houbb.sensitive.api.IStrategy;
import com.github.houbb.sensitive.core.api.strategory.StrategyEmail;

/**
 * 
 * @desc 针对单个字段
 * @author famiao:曾斌
 * @version 创建时间：Jun 26, 2019 2:22:41 PM
 */
public class SingleSensitiveTest {

    public static void main(String[] args) {
        final String email = "123456@qq.com";
        IStrategy strategy = new StrategyEmail();
        final String emailSensitive = (String) strategy.des(email, null);
        System.out.println("脱敏后的邮箱：" + emailSensitive);
    }

}
