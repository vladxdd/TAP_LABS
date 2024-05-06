public class Lucratori extends InfoLucrator {
  private String name, function;
  private int age;

  public Lucratori() {
    super();
  }

  public Lucratori(String name, String function, int age) {
    this.name = name;
    this.function = function;
    this.age = age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setFunction(String function) {
    this.function = function;
  }

  public int getAge() {
    return age;
  }

  public String getFunction() {
    return function;
  }

  public String getName() {
    return name;
  }

}
