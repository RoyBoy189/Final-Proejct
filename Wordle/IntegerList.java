public interface IntegerList {
    public void add(String x);

    // If x is not in the list, do nothing.
    // If x appears more than once on the list, delete first
    public void remove(String x);
    
    public Integer get(int i);
    public boolean contains(String x);

    public void clear();

    public Integer length();
}