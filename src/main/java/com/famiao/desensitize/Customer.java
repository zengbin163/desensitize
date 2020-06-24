package com.famiao.desensitize;

import java.io.Serializable;

import com.github.houbb.sensitive.annotation.Sensitive;
import com.github.houbb.sensitive.core.api.strategory.StrategyCardId;
import com.github.houbb.sensitive.core.api.strategory.StrategyChineseName;
import com.github.houbb.sensitive.core.api.strategory.StrategyEmail;
import com.github.houbb.sensitive.core.api.strategory.StrategyPassword;
import com.github.houbb.sensitive.core.api.strategory.StrategyPhone;

/**
 * @desc 定义客户信息，字段属性进行脱敏
 * @author famiao:曾斌
 * @version 创建时间：Jun 26, 2019 2:20:39 PM
 */
public class Customer implements Serializable {

    private static final long serialVersionUID = 4419122083678875163L;

    public Customer() {

    }

    public Customer(String username, String idCard, String password, String email, String phone) {
        this.username = username;
        this.idCard = idCard;
        this.password = password;
        this.email = email;
        this.phone = phone;
    }

    @Sensitive(strategy = StrategyChineseName.class)
    private String username;

    @Sensitive(strategy = StrategyCardId.class)
    private String idCard;

    @Sensitive(strategy = StrategyPassword.class)
    private String password;

    @Sensitive(strategy = StrategyEmail.class)
    private String email;

    @Sensitive(strategy = StrategyPhone.class)
    private String phone;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Customer:{username=" + username + ",idCard=" + idCard + ",password=" + password + ",email=" + email
            + ",phone=" + phone + "}";
    }

}
