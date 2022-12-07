import java.util.*;

public class Demonstration {
    public static void main(String[] args) {
        System.out.println("------------------");
        testingClearAndSize();
        System.out.println("------------------");
        testingRemoveAndContainsAndIsEmpty();
        System.out.println("------------------");
        testingToArrayAndAddAll();
        System.out.println("------------------");
        testingToArrayIntoGivenAndContainsAll();
    }
    public static void testingRemoveAndContainsAndIsEmpty(){
        System.out.println("DEMONSTRATING STACK.REMOVE AND STACK.CONTAINS AND STACK.ISEMPTY");

        UniqueResizableStack<String> stack = new UniqueResizableStack<String>(5, String.class);
        stack.add("cat");
        String check = "dog";
        stack.add("dog");
        stack.add("panda");
        try{
            stack.add("cat");
        } catch (IllegalArgumentException e){
            System.out.print(e.getMessage() + " (cat)\n");
        }
        try {
            stack.add(1);
        } catch (ClassCastException e){
            System.out.println(e.getMessage());
        }
        System.out.println(stack);
        System.out.println("Is " + check + " in stack? : " + stack.contains(check));
        System.out.println("Is stack empty? : " + stack.isEmpty());
        stack.remove("smth");
        stack.remove("");
        System.out.println(stack);
        System.out.println("Is " + check + " in stack? : " + stack.contains(check));
        System.out.println("Is cat in stack? : " + stack.contains("cat"));
        System.out.println("Is stack empty? : " + stack.isEmpty());
        stack.remove("smth");
        System.out.println("Is stack empty? : " + stack.isEmpty());
    }
    public static void testingClearAndSize(){
        UniqueResizableStack<String> stack = new UniqueResizableStack<String>(5, String.class);
        stack.add("cat");
        stack.add("dog");
        stack.add("panda");
        System.out.println("DEMONSTRATING STACK.CLEAR AND STACK.SIZE");
        System.out.println(stack);
        System.out.println("Stack size: " + stack.size());
        stack.clear();
        System.out.println(stack);
        System.out.println("Stack size: " + stack.size());
    }
    public static void testingToArrayAndAddAll(){
        System.out.println("DEMONSTRATING STACK.TOARRAY AND STACK.ADDALL");

        UniqueResizableStack<String> stack = new UniqueResizableStack<String>(5, String.class);
        stack.add("cat");
        stack.add("dog");
        stack.add("panda");
        List<String> list = new ArrayList<>();
        list.add("4");
        list.add("5");
        list.add("6");
        list.add("7");
        stack.addAll(list);
        System.out.println("Size: " + stack.size());
        Object[] array = stack.toArray();
        for(Object s : array){
            String str = (String) s;
            System.out.print(str + " ");
        }
        System.out.print("\n");
    }
    public static void testingToArrayIntoGivenAndContainsAll() {
        System.out.println("DEMONSTRATING STACK.TOARRAY AND STACK.CONTAINSALL");
        UniqueResizableStack<String> stack = new UniqueResizableStack<String>(5, String.class);
        stack.add("cat");
        stack.add("dog");
        stack.add("panda");
        Object[] array = new Object[1];
        array = stack.toArray(array);
        for (Object s : array){
            System.out.print(s + " ");
        }
        System.out.print("\n");
        stack.add("donkey");
        List<Object> list = Arrays.asList(array);
        System.out.println("List: " + list);
        System.out.println(stack);
        System.out.println("Contains all? : " + stack.containsAll(list));
        stack.remove("");
        stack.remove(new Object());
        System.out.println("List: " + list);
        System.out.println(stack);
        System.out.println("Contains all? : " + stack.containsAll(list));
    }
}
