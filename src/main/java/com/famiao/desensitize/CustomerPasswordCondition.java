package com.famiao.desensitize;

import java.lang.reflect.Field;

import com.github.houbb.sensitive.annotation.Sensitive;
import com.github.houbb.sensitive.api.ICondition;
import com.github.houbb.sensitive.api.IContext;
import com.github.houbb.sensitive.core.api.strategory.StrategyPassword;

/**
 * @desc 自定义脱敏策略生效的场景（比如密码为123456不进行脱敏）
 * @author famiao:曾斌
 * @version 创建时间：Jun 26, 2019 2:21:26 PM
 */
public class CustomerPasswordCondition implements ICondition {
    @Override
    public boolean valid(IContext context) {
        try {
            Field field = context.getCurrentField();
            final Object currentObj = context.getCurrentObject();
            final String password = (String) field.get(currentObj);
            return !password.equals("123456");
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}

class Cust {

    @Sensitive(condition = CustomerPasswordCondition.class, strategy = StrategyPassword.class)
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "password:" + password;
    }
}
