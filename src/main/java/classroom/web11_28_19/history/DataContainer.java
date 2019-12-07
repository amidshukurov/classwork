package classroom.web11_28_19.history;

import java.util.ArrayList;
import java.util.List;

public class DataContainer {
  private List<String> name = new ArrayList<>();

  public List<String> getName() {
    return name;
  }

  public void add(String name) {
    this.name.add(name);
  }

}
