package Assignments.Strategy;

import java.util.List;

public class StrategyTwo implements ListConverter {
    public String listToString(List<String> list) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i));
            if (i % 2 == 1) {
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}
