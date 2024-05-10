package com.ohgiraffers.view;

import java.util.Scanner;

public class EmployeeView {
    private static boolean state = true;

    public static void run(){
        while (state){
            System.out.print("화면 번호를 입력해주세요 : ");
            System.out.println("1. 화면 전체보기");
            Scanner sc = new Scanner(System.in);
            int index = Integer.parseInt(sc.nextLine());

            switch (index){
                case 1 :
                    employeeViewAll();
                    break;
            }
            System.out.print("종료를 하시겠습니까? 말해 (yes Or no) 오타x 소문자만 : ");
            String result = sc.nextLine();

            if(result.equals("yes")){
                state = false;
            }
        }

    }


    public static void employeeViewAll() {
        System.out.println("사원 정보 전체 조회");

    }



}
