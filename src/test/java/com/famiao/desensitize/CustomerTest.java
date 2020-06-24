package com.famiao.desensitize;

import java.util.ArrayList;
import java.util.List;

import com.github.houbb.sensitive.core.api.SensitiveUtil;

/**
 * 
* @desc    针对对象或者对象集合的属性脱敏
* @author  famiao:曾斌 
* @version 创建时间：Jun 26, 2019 2:22:30 PM
 */
public class CustomerTest {

    public static void main(String[] args) {
        Customer cust1 = new Customer("张三", "349878909765152", "12345678", "zengbin163@163.com", "18867102687");
        Customer cust2 = new Customer("李四", "341878909765153", "87654321", "zengbin164@163.com", "18867102688");
        Customer cust3 = new Customer("王五", "342878909765154", "12348765", "zengbin165@163.com", "18867102689");
        Customer cust4 = new Customer("赵六", "343878909765155", "43215678", "zengbin166@163.com", "18867102690");
        Customer cust5 = new Customer("钱七", "344878909765156", "12783456", "zengbin167@163.com", "18867102691");
        
        List<Customer> custList = new ArrayList<>();
        custList.add(cust1);
        custList.add(cust2);
        custList.add(cust3);
        custList.add(cust4);
        custList.add(cust5);
        
        for(Customer cust : custList) {
            System.out.println("脱敏前原始： " + cust);
            Customer sensitiveCust = SensitiveUtil.desCopy(cust);
            System.out.println("脱敏后原始： " + sensitiveCust);
        }
    }

}
