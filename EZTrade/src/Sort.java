import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Sort {
    public static void quickSort(List<String> stockNames) {
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
    
    public static String buildTextBlock(List<String> stockNames) {
        StringBuilder textBlock = new StringBuilder();
        for (String stockName : stockNames) {
            textBlock.append(stockName).append("\n");
        }
        return textBlock.toString();
    }
}
