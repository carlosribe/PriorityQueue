import java.util.Iterator;

public interface PositionalList<E> extends Iterable<E> {

    int size();

    boolean isEmpty();

    Position<E> first();

    Position<E> after(Position<E> p) throws IllegalArgumentException;

    Position<E> addLast(E e);

    E remove(Position<E> p) throws IllegalArgumentException;

    Iterator<E> iterator();

    Iterable<Position<E>> positions();
}