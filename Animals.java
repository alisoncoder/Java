import java.util.ArrayList;

class Animals {
    public static void main(String[] args){
        ArrayList<String> animals = new ArrayList<>();

        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Panda");
        System.out.println("===Printing current Array===");
        System.out.println(animals);
        animals.clear();
        System.out.println("==Printing cleared arrays==");
        System.out.println("Empty array :" +animals);
        if(animals.isEmpty()){
            System.out.println("Array is Empty");
        }
        else{
            System.out.println("Array is not empty");
        }
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Panda");
        System.out.println("The size of array :" +animals.size());
        System.out.println("Adding more elements " +animals.add("Cat"));
        System.out.println(animals);
        animals.remove(0);
        System.out.println(animals);
    } 
}