package spring.field;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Daehee {

//    Field 주입 , Field -> 클래스 안에 선언되는 멤버변수
    @Autowired
    private SeungHwan seungHwan;

    public Daehee(SeungHwan seungHwan) {
        System.out.println("Daehee 객체 >>>>> SpringContainer");
        System.out.println("SeungHwan 객체의 seungHwanMethod 메서드를 실행시킵니다.");
        System.out.println("=====================================================");
        
        seungHwan.seungHwanMethod();

    }
}