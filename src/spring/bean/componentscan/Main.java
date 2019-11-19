package spring.bean.componentscan;//import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext aaa = new AnnotationConfigApplicationContext(Config.class);
        Cats catsInfo = aaa.getBean("catsInfo", Cats.class);
        catsInfo.getMyCatsInfo();

        MyCats cat2 = aaa.getBean("cats", MyCats.class);
        catsInfo.setMyCatsInfo(cat2);
        catsInfo.getMyCatsInfo();

        aaa.close();
    }
}



//
//public class Main {
//
//    public static void main(String[] args) {
//        System.out.println("Config에 등록된 Bean 설정을 불러옵니다.");
//        System.out.println("=============================================");
////      Bean의 설정을 불러옴
//        AnnotationConfigApplicationContext ctx =
//                new AnnotationConfigApplicationContext(Config.class);
//
//
//        MyCats catsInfo = ctx.getBean("myCats",MyCats.class);
//        catsInfo.getMyCatsInfo();
//
//
//        Cats cat2 = ctx.getBean("cats",Cats.class);
//        catsInfo.setMyCatsInfo(cat2);
//        catsInfo.getMyCatsInfo();
//        ctx.close();
//    }
//
//}


