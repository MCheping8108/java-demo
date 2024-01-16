package top.peacefuly.objectoriented.encapsulation;

public class Encapsulation01 {
    public static void main(String[] args) {
        Person person = new Person();
//        person.name = "张三";
//        person.age = 18;
        person.setName("aaaaaaaaaaaaa");
        person.setAge(20);
        person.setSalary(10000);
        System.out.println(person.info());
    }
}

class Person {
    public String name;
    private int age;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 2 && name.length() <= 6) {
            this.name = name;
        } else {
            System.out.println("姓名不合法");
            this.name = "张三";
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 16 && age < 120) {
            this.age = age;
        } else {
            System.out.println("年龄不合法");
            this.age = 18;
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String info(){
        return "姓名:"+name+",年龄:"+age+",薪水:"+salary;
    }
}