package spring.field;

import org.springframework.stereotype.Component;

@Component
public class SeungHwan {

//    @Autowired
//    private Daehee daehee;
//
    public SeungHwan() {
        System.out.println("SeungHwan 객체 >>>>> SpringContainer");
    }

    public void seungHwanMethod() {
        System.out.println("SeoungHwan 객체의 seungHwanMethod 메서드 실행완료");
    }
//
//    public void bMethod() {
//        daehee.print();
//    }
//
//    public void print() {
//        System.out.println("SeungHwan 객체의 print 함수 호출");
//    }
}
