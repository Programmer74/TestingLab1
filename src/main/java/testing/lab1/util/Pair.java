package testing.lab1.util;

public class Pair<KeyT, ValueT> {
  private KeyT key;
  private ValueT value;

  public Pair(KeyT key, ValueT value) {
    this.key = key;
    this.value = value;
  }

  public KeyT getKey() {
    return key;
  }

  public void setKey(KeyT key) {
    this.key = key;
  }

  public ValueT getValue() {
    return value;
  }

  public void setValue(ValueT value) {
    this.value = value;
  }
}
