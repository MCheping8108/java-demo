package top.peacefuly.modifier.demo;

public class Alpha {
    public String n1 = "访问权限：public";
    protected String n2 = "访问权限：protected";
    private String n3 = "访问权限：private";
    String n4 = "访问权限:默认";
    public void m1() {
        System.out.println("n1=" + n1 + ",n2=" + n2 + ",n3=" + n3 + ",n4=" + n4);
    }

}
