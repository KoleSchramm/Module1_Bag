import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Bag<T> implements Iterable<T>{
    private List<T> elements = new LinkedList<>();

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

    //Returns the current number of elements in the bag
    public int size(){
        return elements.size();
    }

    //Merges the specified bag with the current bag
    public void merge(Bag<T> bag){
        for(T element : bag.elements){
            add(element);
        }
    }

    //Returns a bag containing the elements of the original bag without duplicates
    public Bag<T> distinct(){
        Bag<T> bag = new Bag<T>();
        for(T element : elements){
            if(!bag.contains(element)){
                bag.add(element);
            }
        }
        return bag;
    }

    public void Clear(){
        elements.clear();
    }

    @Override
    public Iterator<T> iterator() {
        return this.elements.iterator();
    }

}
