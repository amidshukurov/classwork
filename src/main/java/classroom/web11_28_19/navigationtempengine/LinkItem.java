package classroom.web11_28_19.navigationtempengine;

public class LinkItem {
  private final int age;
  private final String name;

  public LinkItem(int age, String name) {
    this.age = age;
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public String getName() {
    return name;
  }

  public String sound() {
    return "Bark!";
  }
}
