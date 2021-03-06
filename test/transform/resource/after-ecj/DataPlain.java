import lombok.Data;
@lombok.Data class Data1 {
  final int x;
  String name;
  public @java.beans.ConstructorProperties({"x"}) @java.lang.SuppressWarnings("all") Data1(final int x) {
    super();
    this.x = x;
  }
  public @java.lang.SuppressWarnings("all") int getX() {
    return this.x;
  }
  public @java.lang.SuppressWarnings("all") String getName() {
    return this.name;
  }
  public @java.lang.SuppressWarnings("all") void setName(final String name) {
    this.name = name;
  }
  public @java.lang.Override @java.lang.SuppressWarnings("all") boolean equals(final java.lang.Object o) {
    if ((o == this))
        return true;
    if ((o == null))
        return false;
    if ((o.getClass() != this.getClass()))
        return false;
    final Data1 other = (Data1) o;
    if ((this.getX() != other.getX()))
        return false;
    if (((this.getName() == null) ? (other.getName() != null) : (! this.getName().equals(other.getName()))))
        return false;
    return true;
  }
  public @java.lang.Override @java.lang.SuppressWarnings("all") int hashCode() {
    final int PRIME = 31;
    int result = 1;
    result = ((result * PRIME) + this.getX());
    result = ((result * PRIME) + ((this.getName() == null) ? 0 : this.getName().hashCode()));
    return result;
  }
  public @java.lang.Override @java.lang.SuppressWarnings("all") java.lang.String toString() {
    return (((("Data1(x=" + this.getX()) + ", name=") + this.getName()) + ")");
  }
}
@Data class Data2 {
  final int x;
  String name;
  public @java.beans.ConstructorProperties({"x"}) @java.lang.SuppressWarnings("all") Data2(final int x) {
    super();
    this.x = x;
  }
  public @java.lang.SuppressWarnings("all") int getX() {
    return this.x;
  }
  public @java.lang.SuppressWarnings("all") String getName() {
    return this.name;
  }
  public @java.lang.SuppressWarnings("all") void setName(final String name) {
    this.name = name;
  }
  public @java.lang.Override @java.lang.SuppressWarnings("all") boolean equals(final java.lang.Object o) {
    if ((o == this))
        return true;
    if ((o == null))
        return false;
    if ((o.getClass() != this.getClass()))
        return false;
    final Data2 other = (Data2) o;
    if ((this.getX() != other.getX()))
        return false;
    if (((this.getName() == null) ? (other.getName() != null) : (! this.getName().equals(other.getName()))))
        return false;
    return true;
  }
  public @java.lang.Override @java.lang.SuppressWarnings("all") int hashCode() {
    final int PRIME = 31;
    int result = 1;
    result = ((result * PRIME) + this.getX());
    result = ((result * PRIME) + ((this.getName() == null) ? 0 : this.getName().hashCode()));
    return result;
  }
  public @java.lang.Override @java.lang.SuppressWarnings("all") java.lang.String toString() {
    return (((("Data2(x=" + this.getX()) + ", name=") + this.getName()) + ")");
  }
}
