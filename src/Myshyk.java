public class Myshyk {
    private String name;
    private int age;
    private double weight;
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    String umeet(String name,int age){
        if (name==getName()&&age==getAge()){
            System.out.println(name+" в " + age+"  года умеет рыбу ловить");
        }return name;
    }
}
