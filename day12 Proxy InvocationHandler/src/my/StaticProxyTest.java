package my;

/**
 * @author 孟享广
 * @create 2020-06-18 9:12 上午
 */
interface ClothFactory{
    void produceCloth();
}
//*************************************************************************
class ProxyClothFactory implements ClothFactory{

    private ClothFactory factory;

    public ProxyClothFactory(ClothFactory factory) {
        this.factory = factory;
    }

    @Override
    public void produceCloth() {
        System.out.println("\"代理工厂做一些准备工作\"");

        factory.produceCloth();

        System.out.println("代理工厂做一些后续的收尾工作");
    }
}
//*************************************************************************
class NikeClothFactory implements ClothFactory{

    @Override
    public void produceCloth() {
        System.out.println("nike 生产1··············");
    }
}

public class StaticProxyTest {
    public static void main(String[] args) {
        ClothFactory nike = new NikeClothFactory();

        ClothFactory proxyClothFactory = new ProxyClothFactory(nike);

        proxyClothFactory.produceCloth();

    }
}


