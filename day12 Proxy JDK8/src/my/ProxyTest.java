package my;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author 孟享广
 * @create 2020-06-18 9:25 上午
 */

interface Human{
    String getBelief();
    void eat (String food);
}
//被代理类
class SuperMan implements Human{

    @Override
    public String getBelief() {
        return "I believe I can fly!";
    }

    @Override
    public void eat(String food) {
        System.out.println("我喜欢吃" + food);
    }
}

class HumanUtil{
    public void method1(){

        System.out.println("111111111111");
    }
    public void method2(){
        System.out.println("222222222222");
    }
}

class ProxyFactory{
    public static Object getProxyInstance(Object obj){
        MyInvocationHandler myInvocationHandler = new MyInvocationHandler();
        myInvocationHandler.bind(obj);
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), myInvocationHandler);
    }
}
class MyInvocationHandler implements InvocationHandler{
    private Object obj;
    public void bind(Object obj){
        this.obj = obj;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        HumanUtil humanUtil = new HumanUtil();
        humanUtil.method1();
        Object returnValue = method.invoke(obj, args);

        humanUtil.method2();
        return returnValue;
    }

}

public class ProxyTest {
    public static void main(String[] args) {

        Human proxyInstance = (Human) ProxyFactory.getProxyInstance(new SuperMan());
        String belief = proxyInstance.getBelief();
        System.out.println(belief);
        proxyInstance.eat("麻辣烫!");

    }
}
