package beans;

import java.lang.reflect.Method;
import org.springframework.beans.factory.support.MethodReplacer;

public class NewCalInt implements MethodReplacer{

    @Override
    public Object reimplement(Object o, Method method, Object[] os) throws Throwable {
        System.out.println("NewCalculate Method from NewCalInt.");
        return null;
    }
}
