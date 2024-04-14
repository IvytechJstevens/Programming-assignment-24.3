public interface MyList<E> {
    void add(E element);
    E remove(int index);
    E get(int index);
    int size();
    // Other methods...
}
