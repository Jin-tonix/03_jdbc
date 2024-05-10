package com.ohgiraffers.employee.view;

import com.ohgiraffers.employee.dto.EmployeeDTO;
import com.ohgiraffers.employee.service.EmployeeService;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeView {
    private static boolean state = true;
    private static EmployeeService employeeService = new EmployeeService();

    public static void run(){
        while (state){
            System.out.println("화면 번호를 입력해주세요 : ");
            System.out.println("1. 화면 전체보기");
            System.out.println("2. 사원 이름으로 조회하기 ");
            Scanner sc = new Scanner(System.in);
            int index = Integer.parseInt(sc.nextLine());

            switch (index){
                case 1 :
                    employeeViewAll();
                    break;
                case 2 :
                    employeFindByName();
                    break;
            }
            System.out.print("종료를 하시겠습니까? 말해 (yes Or no) 오타x 소문자만 : ");
            String result = sc.nextLine();

            if(result.equals("yes")){
                state = false;
                sc.close();
            }
        }

    }

    // 현재 html의 화면을 암시하고 만든 것이다.
    // view는 사용자에게 데이터를 입력받고 서버에 전달하며, 결과를 사용자에게 보여주기 위한 용도로 사용된다.
    public static void employeeViewAll() {
        System.out.println("사원 정보 전체 조회");

        try {
            ArrayList emps =employeeService.employeeViewAll();
            System.out.println(emps);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void employeFindByName(){
        Scanner sc = new Scanner(System.in);
        System.out.print("조회할 사원의 이름을 입력하세요 : ");
        String name = sc.nextLine();
        EmployeeDTO emp = null;

        try {
            emp = employeeService.employeeFindByName(name);
            System.out.println(emp);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

}
