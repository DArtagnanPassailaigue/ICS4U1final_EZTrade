import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Sort {
    // Method to perform quicksort on a list of stock names
    public static void quickSort(List<String> stockNames) {
        // Check if the list is empty or null, and return if true
        if (stockNames == null || stockNames.isEmpty()) {
            return;
        }

        // Convert the list to an array for sorting
        String[] stockArray = stockNames.toArray(new String[0]);

        // Use Arrays.sort() with a custom comparator
        Arrays.sort(stockArray, Comparator.naturalOrder());

        // Copy the sorted array back to the list
        stockNames.clear();
        stockNames.addAll(Arrays.asList(stockArray));
    }
    
    // Method to perform quicksort on a list of stock names
    public static void altQuickSort(List<String[]> stockNames) {
        // Check if the list is empty or null, and return if true
        if (stockNames == null || stockNames.isEmpty()) {
            return;
        }

        // Convert the list to an array for sorting
        String[][] stockArray = stockNames.toArray(new String[0][]);

        // Use Arrays.sort() with a custom comparator
        Arrays.sort(stockArray, Comparator.comparing(arr -> arr[0]));

        // Copy the sorted array back to the list
        stockNames.clear();
        stockNames.addAll(Arrays.asList(stockArray));
    }
    
    // Method to build a text block from a list of stock names
    public static String buildTextBlock(List<String> stockNames) {
        // StringBuilder to efficiently build a string with multiple append operations
        StringBuilder textBlock = new StringBuilder();
        // Iterate through the sorted list of stock names
        for (String stockName : stockNames) {
            // Append each stock name to the StringBuilder followed by a newline character
            textBlock.append(stockName).append("\n");
        }
        // Convert the StringBuilder to a string and return
        return textBlock.toString();
    }
}
