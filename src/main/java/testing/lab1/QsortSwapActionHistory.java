package testing.lab1;

import java.util.ArrayList;
import java.util.List;

public class QsortSwapActionHistory {

    private List<QsortSwapAction> history;

    public QsortSwapActionHistory() {
        history = new ArrayList<>();
    }

    public void addToHistory(QsortSwapAction action) {
        history.add(action);
    }

    public int actionIndex(QsortSwapAction action) {
        return history.indexOf(action);
    }

    public void printHistory() {
        for (QsortSwapAction action : history) {
            System.out.println(action.toString());
        }
    }

    public int size() {
        return history.size();
    }

}
