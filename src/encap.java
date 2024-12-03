

class Human{

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    private int age;
 private String name;

 public Human(){
     System.out.println("in constructor");
 }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class encap {

    public static void main(String[] args) {

        Human h1 = new Human(36,"Sujitha");

      //  h1.setAge(36);
   //    h1.setName("Sujitha");

        System.out.println(h1.getAge() + ":" +h1.getName());
    }
}
