package classroom.web11_28_19.navi;

public class LinkItem {
  private final String href;
  private final String name;

  public LinkItem(String href, String name) {
    this.href = href;
    this.name = name;
  }

  public String getHref() {
    return href;
  }

  public String getName() {
    return name;
  }
}
