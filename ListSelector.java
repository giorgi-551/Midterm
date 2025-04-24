import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListSelector {
    /**
     * The main method that demonstrates selecting elements from `list2`
     * based on the indices provided in `list1`. The program processes
     * each index in `list1` and prints the corresponding element from `list2`.
     *
     * @param args command-line arguments (not used in this program)
     */
    public static void main(String[] args) {
        // list1
        List<Integer> list1 = Arrays.asList(6, 7, 2, 8, 10, 3, 5, 1, 9, 4);

        /**
         * list2 contains elements from which we will select based on indices in list1
         * (can be Strings, custom objects, etc.)
         * */
        List<String> list2 = Arrays.asList(
                "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven",
                "Eight", "Nine", "Ten", "Eleven", "Twelve"
        );

        /** List to store the selected items from list2
         */

        List<String> selectedItems = new ArrayList<>();

        /** Loop through each index in list1 and retrieve corresponding element from list2
         */

        for (Integer index : list1) {
            // This checks to ensure the index is within bounds
            if (index >= 0 && index < list2.size()) {
                selectedItems.add(list2.get(index));
            } else {
                System.out.println("Index out of bounds: " + index);
            }
        }

        // Output the selected elements
        System.out.println("Selected items from list2 based on list1 indices:");
        for (String item : selectedItems) {
            System.out.println(item); //prints selected items
        }
    }
}
