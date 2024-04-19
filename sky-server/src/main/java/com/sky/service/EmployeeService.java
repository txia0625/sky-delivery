package com.sky.service;

import com.sky.dto.EmployeeDTO;
import com.sky.dto.EmployeeLoginDTO;
import com.sky.dto.EmployeePageQueryDTO;
import com.sky.entity.Employee;
import com.sky.result.PageResult;

public interface EmployeeService {

    /**
     * 员工登录
     * @param employeeLoginDTO
     * @return
     */
    Employee login(EmployeeLoginDTO employeeLoginDTO);
    void save(EmployeeDTO employeeDTO);
    /**
     * 分页查询
     * @param employeePageQueryDTO
     * @return
     */
    PageResult pageQuery(EmployeePageQueryDTO employeePageQueryDTO);

    /**
     * Set Employee Status
     * @param status
     * @param id
     * @return
     */

    void setStatus(Integer status, Long id);

    /**
     * Get Employee By ID
     * @param id
     * @return Employee
     */
    Employee getById(Long id);

    /**
     * Update Employee
     * @param employeeDTO
     * @return
     */
    void update(EmployeeDTO employeeDTO);
}
