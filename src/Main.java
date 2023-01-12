public class Main {
    public static void main(String[] args) {
  Myshyk myshyk=new Myshyk();
  myshyk.setName("mishka");
  myshyk.setAge(2);
  myshyk.setColor("white-black");
  myshyk.setWeight(2.5);
  System.out.println(myshyk.getName());
  System.out.println(myshyk.getAge());
  System.out.println(myshyk.getColor());
  System.out.println(myshyk.getWeight());
  myshyk.umeet("mishka",2);



  Papugai papugai=new Papugai();
  papugai.setName("Вася");
  papugai.setAge(1);
  papugai.setColor("красный-желтый-синий");
  papugai.setWeight(0.400);
  System.out.println(papugai.getName());
  System.out.println(papugai.getAge());
  System.out.println(papugai.getColor());
  System.out.println(papugai.getWeight());
  papugai.suiloit("Вася");


  It it=new It();
  it.setName("Овчарка");
  it.setAge(3);
  it.setColor("черно-кортичневый");
  it.setWeight(15.700);
  System.out.println(it.getName());
  System.out.println(it.getAge());
  System.out.println(it.getColor());
  System.out.println(it.getWeight());
  it.rabota("Овчарка",2);

    }
}