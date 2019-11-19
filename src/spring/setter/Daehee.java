package spring.setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Daehee {

    private SeungHwan seungHwan;

    public Daehee() {
        System.out.println("Daehee 객체 >>>>> SpringContainer");
        System.out.println("=====================================================");

    }

    @Autowired
    public void setSeungHwan(SeungHwan seungHwan) {
        System.out.println("Daehee 객체 Seunghwan 객체를 불러와 setter() 주입완료");
        this.seungHwan = seungHwan;
        System.out.println("Daehee 객체의 daeheeMethod 메서드를 실행시킵니다.");
        System.out.println("=====================================================");
        daeheeMethod();
    }

    public void daeheeMethod() {
        System.out.println("Daehee 객체의 daeheeMethod 메서드를 실행했습니다.");
        System.out.println("SeungHwan 객체의 print 메서드를 실행합니다.");
        System.out.println("=====================================================");
        seungHwan.print();
    }

}