package spring.bean.configuration;//public class com.knet.cat.MyCats {

public class MyCats {

    private String name;
    private int age;

    // 생성자를 통해 name, age, hobbys를 받아와 각각의 필드의 값들을 초기화 시켜줌
    public MyCats(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

}


