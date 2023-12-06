package Assignments.Strategy;

import java.util.List;

public class StrategyOne implements ListConverter {
    public String listToString(List<String> list) {
        StringBuilder sb = new StringBuilder();
        String[] array = list.toArray(new String[0]);
        for (String item : array) {
            sb.append(item);
            sb.append("\n");
        }
        return sb.toString();
    }
}
