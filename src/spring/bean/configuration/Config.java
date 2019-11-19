package spring.bean.configuration;//import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // 스프링 설정에 사용되는 클래스임을 명시해주는 어노테이션
public class Config {

    @Bean // 객체를 생성하는 어노테이션
    public MyCats cat1(){

        MyCats myCats = new MyCats("첫번째 고양이",2); //생성자

        return myCats;
    }

    @Bean
    public MyCats cat2(){

        MyCats myCats = new MyCats("두번째 고양이",1);

        return myCats;
    }

    @Bean
    public Cats catsInfo(){

        Cats cats = new Cats(this.cat1());

        return cats;
    }
}


