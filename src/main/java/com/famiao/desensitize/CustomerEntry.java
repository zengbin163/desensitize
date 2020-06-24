package com.famiao.desensitize;

import java.io.Serializable;
import java.util.List;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.ArrayUtils;

import com.github.houbb.sensitive.annotation.Sensitive;
import com.github.houbb.sensitive.annotation.SensitiveEntry;
import com.github.houbb.sensitive.core.api.strategory.StrategyChineseName;

/**
 * @desc 属性为集合或者对象进行脱敏
 * @author famiao:曾斌
 * @version 创建时间：Jun 26, 2019 2:21:09 PM
 */
public class CustomerEntry implements Serializable {

    private static final long serialVersionUID = -3701283493741419813L;

    @SensitiveEntry
    @Sensitive(strategy = StrategyChineseName.class)
    private List<String> chineseNameList;

    @SensitiveEntry
    @Sensitive(strategy = StrategyChineseName.class)
    private String[] chineseNameArray;

    @SensitiveEntry
    private Customer customer;

    @SensitiveEntry
    private List<Customer> customerList;

    public List<String> getChineseNameList() {
        return chineseNameList;
    }

    public void setChineseNameList(List<String> chineseNameList) {
        this.chineseNameList = chineseNameList;
    }

    public String[] getChineseNameArray() {
        return chineseNameArray;
    }

    public void setChineseNameArray(String[] chineseNameArray) {
        this.chineseNameArray = chineseNameArray;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(List<Customer> customerList) {
        this.customerList = customerList;
    }

    @Override
    public String toString() {
        String str = null;
        if (!CollectionUtils.isEmpty(chineseNameList)) {
            for (String s : chineseNameList) {
                str = str + "," + s;
            }
        }
        if (ArrayUtils.isNotEmpty(chineseNameArray)) {
            for (String s : chineseNameArray) {
                str = str + "," + s;
            }
        }
        str = str + ",Customer:{username=" + customer.getUsername() + ",idCard=" + customer.getIdCard() + ",password="
                + customer.getPassword() + ",email=" + customer.getEmail() + ",phone=" + customer.getPhone() + "}";
        for (Customer cust : customerList) {
            Customer customer = cust;
            str = str + "-List-" + ",Customer:{username=" + customer.getUsername() + ",idCard=" + customer.getIdCard()
                    + ",password=" + customer.getPassword() + ",email=" + customer.getEmail() + ",phone="
                    + customer.getPhone() + "}";
        }
        return str;
    }
}
