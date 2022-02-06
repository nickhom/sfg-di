package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Component;

//Spring will default to using Singleton beans. No additional annotation required.
@Component
public class SingletonBean {

    public SingletonBean() {
        System.out.println("Creating a Singleton Bean!!!");
    }

    public String getMyScope() {
        return "I'm a Singleton";
    }
}
