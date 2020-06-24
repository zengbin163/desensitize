package com.famiao.desensitize;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.github.houbb.sensitive.core.api.SensitiveUtil;

/**
 * 
* @desc    属性为集合或者对象进行脱敏测试
* @author  famiao:曾斌 
* @version 创建时间：Jun 26, 2019 2:21:58 PM
 */
public class CustomerEntryTest {

    public static void main(String[] args) {

        CustomerEntry custEntry = new CustomerEntry();

        List<String> chineseNameList = Arrays.asList("盘古", "女娲", "伏羲");
        String[] chineseNameArray = new String[] { "盘古", "女娲", "伏羲" };
        Customer cust1 = new Customer("张三", "349878909765152", "12345678", "zengbin163@163.com", "18867102687");
        Customer cust2 = new Customer("李四", "341878909765153", "87654321", "zengbin164@163.com", "18867102688");
        List<Customer> custList = new ArrayList<>();
        custList.add(cust2);

        custEntry.setChineseNameList(chineseNameList);
        custEntry.setChineseNameArray(chineseNameArray);
        custEntry.setCustomer(cust1);
        custEntry.setCustomerList(custList);

        System.out.println("脱敏前原始： " + custEntry);
        CustomerEntry sensitiveCustomerEntry = SensitiveUtil.desCopy(custEntry);
        System.out.println("脱敏后原始： " + sensitiveCustomerEntry);
    }

}
