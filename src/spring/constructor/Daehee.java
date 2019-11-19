package spring.constructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Daehee {

    private SeungHwan seungHwan;

    @Autowired
    public Daehee(SeungHwan seungHwan) {
        System.out.println("Daehee 객체에 SeungHwan 객체 의존성 주입");
        System.out.println("Daehee 객체 >>>>> SpringContainer");
        System.out.println("SeungHwn 객체의 seungHwanMethod 메서드를 호출합니다.");
        System.out.println("=====================================================");
        this.seungHwan = seungHwan;
        seungHwan.seungHwanMethod();

    }


    public void print() {
        System.out.println("Daehee 객체의 print 함수 호출");
    }
}