package com.ohgiraffers.employee.service;

import com.ohgiraffers.employee.dao.EmployeeRepository;

import java.util.ArrayList;

public class EmployeeService {

    private EmployeeRepository employeeRepository;

    public EmployeeService() {
        this.employeeRepository = new EmployeeRepository();
    }

    // service
    // 비즈니스의 도메인과 관련된 역할을 수행한다.
    // 데이터베이스와 연결된 작업을 수행한다.
    public ArrayList employeeViewAll() throws Exception {
        ArrayList employees = employeeRepository.employeeViewAll();

        if(employees == null){
            throw new Exception("사원정보 조회실패");
        }

        return employees;
    }
}
