import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Bag<T> implements Iterable<T>{
    private List<T> elements;

    //Constructor
    public Bag(){
        elements = new LinkedList<>();
    }

    //Adds specified item to list
    public void add(T item){
        elements.add(item);
    }

    //Removes specified item from list
    public void remove(T item){
        elements.remove(item);
    }

    //Returns true if bag contains the specified item
    public boolean contains(T item){
        return elements.contains(item);
    }

    //Returns the number of specified items in the bag
    public int count(T item){
        int i = 0;
        for(T element : elements){
            if(element.equals(item)){
                i++;
            }
        }
        return i;
    }

    @Override
    public Iterator<T> iterator() {
        return this.elements.iterator();
    }

}
