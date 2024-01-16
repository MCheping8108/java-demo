package top.peacefuly.modifier.pkg;
import top.peacefuly.modifier.demo.*;

public class Test {
    public static void main(String[] args) {
        Alpha alpha = new Alpha();
        alpha.m1();
        Beta beta = new Beta();
        beta.say();
        System.out.println("n1=" + alpha.n1);
//        System.out.println("n1=" + alpha.n1 + ",n2=" + alpha.n2 + ",n3=" + alpha.n3 + ",n4=" + alpha.n4);
    }
}
