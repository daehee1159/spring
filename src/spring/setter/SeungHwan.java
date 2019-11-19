package spring.setter;

import org.springframework.stereotype.Component;

@Component
public class SeungHwan {

    public SeungHwan() {
        System.out.println("SeungHwan 객체 >>>>> SpringContainer");
        System.out.println("=====================================================");

    }

    public void print() {
        System.out.println("SeungHwan 객체의 print 메서드 호출");
        System.out.println("=====================================================");
    }
}
