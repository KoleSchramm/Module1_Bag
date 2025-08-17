public class Main {
    public static void main(String[] args) {
        //Test Bag class
        Bag<String> bag = new Bag<>();

        bag.add("Zucchini");
        bag.add("Tomato");
        bag.add("Potato");
        bag.add("Tomato");
        bag.add("Cucumber");
        bag.add("Lettuce");

        System.out.println("Initial bag:");
        printBag(bag);

        System.out.println("Testing contains method:");
        System.out.println(bag.contains("Zucchini"));
        System.out.println(bag.contains("Carrot"));
        System.out.println(bag.contains("Tomato"));
        System.out.println();

        System.out.println("Testing count method:");
        System.out.println(bag.count("Zucchini"));
        System.out.println(bag.count("Tomato"));
        System.out.println(bag.count("Carrot"));
        System.out.println();

        bag.remove("Zucchini");

        System.out.println("Bag with Zucchini removed:");
        printBag(bag);

        System.out.println("Testing contains for removed Zucchini:");
        System.out.println(bag.contains("Zucchini"));
        System.out.println();

        System.out.println("Testing count for removed Zucchini:");
        System.out.println(bag.count("Zucchini"));


    }

    public static void printBag(Bag bag){
        for(Object element : bag){
            System.out.println(element);
        }
        System.out.println();
    }
}