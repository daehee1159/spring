package spring.bean.componentscan;//import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//

@Configuration // 스프링 설정에 사용되는 클래스임을 명시해주는 어노테이션
@ComponentScan
public class Config {

    @Bean
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


