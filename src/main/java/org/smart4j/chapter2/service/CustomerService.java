package org.smart4j.chapter2.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.smart4j.chapter2.helper.DatabaseHelper;
import org.smart4j.chapter2.model.Customer;

import java.util.List;
import java.util.Map;

/**
 * 提供客户数据服务
 */
public class CustomerService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerService.class);

    /**
     * 获取客户列表
     * @return
     */
    public List<Customer> getCustomerList() {
        String sql = "SELECT * FROM customer";
        return DatabaseHelper.queryEntityList(Customer.class, sql);
    }

    /**
     * 获取客户
     * @return
     */
    public Customer getCustomer (long id) {
        String sql = "SELECT * FROM customer WHERE id=" + id;
        return DatabaseHelper.queryEntity(Customer.class, sql);
    }

    /**
     * 创建客户
     * @return
     */
    public boolean createCustomer (Map<String, Object> fieldMap) {
        return DatabaseHelper.insertEntity(Customer.class, fieldMap);
    }

    /**
     * 更新客户
     * @return
     */
    public boolean updateCustomer (long id, Map<String, Object> fieldMap) {
        return DatabaseHelper.updateEntity(Customer.class, id, fieldMap);
    }

    /**
     * 删除客户
     * @return
     */
    public boolean deleteCustomer (long id) {
        return DatabaseHelper.deleteEntity(Customer.class, id);
    }

}
