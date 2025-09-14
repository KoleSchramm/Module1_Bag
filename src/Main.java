public class Main {
    public static void main(String[] args) {
        //Test Bag class
        Bag<String> bag = new Bag<>();
        Bag<String> otherBag = new Bag<>();

        bag.add("Tomato");
        bag.add("Pretzel");
        bag.add("Tomato");
        bag.add("Cucumber");

        otherBag.add("Tomato");
        otherBag.add("Tortilla");
        otherBag.add("Carrot");

        System.out.println("Bag size:");
        System.out.println(bag.size());
        System.out.println("Other bag size:");
        System.out.println(otherBag.size());

        bag.merge(otherBag);
        System.out.println("Merged bag contents:");
        printBag(bag);

        Bag<String> distinctBag = bag.distinct();
        System.out.println("Distinct bag contents:");
        printBag(distinctBag);

        distinctBag.Clear();
        System.out.println("Cleared bag contents");
        printBag(distinctBag);
    }

    public static void printBag(Bag bag){
        for(Object element : bag){
            System.out.println(element);
        }
        System.out.println();
    }
}