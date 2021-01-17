import java.util.Iterator;
import java.util.Vector;
class Toy {
    public static void main(String[] args) {
        Vector<String> animals = new Vector<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Horse");
        String element = animals.get(2);
        System.out.println(element);
        Iterator<String> iterate = animals.iterator();
        while(iterate.hasNext()){
            System.out.println(iterate.next());
            
        }
    }
}