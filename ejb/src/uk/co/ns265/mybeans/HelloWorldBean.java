package uk.co.ns265.mybeans;

import javax.ejb.Stateless;

/**
 * Created by neils on 21/05/2015.
 */
@Stateless(name = "HelloWorldEJB")
public class HelloWorldBean {
    public HelloWorldBean() {
    }
    public String sayHello(){
        return "Hello World!";
    }
}
