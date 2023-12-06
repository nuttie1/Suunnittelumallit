package Assignments.Strategy;

import java.util.Iterator;
import java.util.List;

public class StrategyThree implements ListConverter {
    public String listToString(List<String> list) {
        StringBuilder sb = new StringBuilder();
        Iterator<String> iterator = list.iterator();
        int i = 0;
        while (iterator.hasNext()) {
            sb.append(iterator.next());
            if (i % 3 == 2) {
                sb.append("\n");
            }
            i++;
        }
        return sb.toString();
    }
}
