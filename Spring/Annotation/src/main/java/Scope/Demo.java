package Scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("d")
//@Scope("singleton") // it will create only one instance
@Scope("prototype") // it will create more than one instance
public class Demo {

}
