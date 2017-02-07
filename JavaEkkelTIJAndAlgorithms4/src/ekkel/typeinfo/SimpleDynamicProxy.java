package ekkel.typeinfo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by nugusbayevkk on 2/5/17.
 */
class DynamicProxyHandler implements InvocationHandler {
    private Object proxied;
    public DynamicProxyHandler(Object proxied) {
        this.proxied = proxied;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable {
        System.out.println ("**** proxy. " + proxy.getClass()
                + ", method- " + method + ", args " + args);
        if(args != null)
            for(Object arg : args)
                System.out.println(" " + arg);

        return method.invoke(proxied, args);
    }
}

class SimpleDynamicProxy {

    public static void consumer(Interface іface) {
        іface.doSomething();
        іface.somethingElse("bonobo");
    }
    public static void main(String[] args) {
        RealObject real = new RealObject();
        consumer(real);
        // Вставляєм посредника и вызываем снова:
        Interface proxy = (Interface) Proxy.newProxyInstance(
                Interface.class.getClassLoader(),
                new Class[]{Interface.class},
                new DynamicProxyHandler(real));
        consumer(proxy);
    }
}
