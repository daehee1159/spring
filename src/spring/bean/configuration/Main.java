package spring.bean.configuration;//import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {

    public static void main(String[] args) {
        System.out.println("Config에 등록된 Bean 설정을 불러옵니다.");
        System.out.println("=============================================");
//      Bean의 설정을 불러옴
        AnnotationConfigApplicationContext ctx =
                new AnnotationConfigApplicationContext(Config.class);

        System.out.println("Bean의 catsInfo를 호출하여 첫번째 고양이의 정보를 가져옵니다.");
//        Bean 의 catsInfo 를 불러옴
        Cats catsInfo = ctx.getBean("catsInfo", Cats.class);
        catsInfo.getMyCatsInfo();

//        Bean 의 cat2 를 불러옴
        MyCats cat2 = ctx.getBean("cat2", MyCats.class);
        catsInfo.setMyCatsInfo(cat2);
        catsInfo.getMyCatsInfo();
        ctx.close();
    }

}


