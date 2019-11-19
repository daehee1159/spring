package spring.constructor;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
@Repository
public class SeungHwan {

    public SeungHwan() {
        System.out.println("SeungHwan 객체 >>>>> SpringContainer");
        System.out.println("=====================================================");

    }

    public void seungHwanMethod() {
        System.out.println("SeungHwanMethod 메서드 호출 완료");
        System.out.println("SeungHwan 객체의 print 메서드를 호출합니다.");
        System.out.println("=====================================================");
        print();


    }

    public void print() {
        System.out.println("SeungHwan 객체의 print 메서드 호출완료");
        System.out.println("=====================================================");
    }
}
