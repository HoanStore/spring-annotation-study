package com.hoan.annotationstudy.custom.simple;

public class MyService {

    @LogExecutionTime("회원 조회")
    public void getUser() {
        System.out.println("사용자 정보를 조회합니다...");

        try  {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    @LogExecutionTime("주문 처리")
    public void processOrder() {
        System.out.println("주문을 처리합니다...");

        try  {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
