public class It {
    private String name;
    private int age;
    private String color;
    private double weight;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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
    }String rabota(String name,int age){
        if (name==getName()&&age>=2&&age<5){
            System.out.println(name+"  в  "+age+" года принимаются работаь в полицию");
        }return name;
    }
}
