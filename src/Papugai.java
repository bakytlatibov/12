public class Papugai {
    private String name;
    private String color;
    private int age;
    private double weight;

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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    String suiloit(String at){
      if (at==getName()){
          System.out.println(at+ "    суйлой алат");
      }return at;
    }
}
