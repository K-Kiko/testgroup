package test.kiko.com.dagger2;

import javax.inject.Inject;

public class User {
    private String sex;

    private String age;

    @Inject
    public User(String sex, String age) {
        this.sex = sex;
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
