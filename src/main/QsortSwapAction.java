package main;

public class QsortSwapAction {
    private int pivot;
    private int pivotIndex;

    private int leftValue;
    private int leftIndex;

    private int rightValue;
    private int rightIndex;

    public QsortSwapAction(int pivot, int pivotIndex, int leftValue, int leftIndex, int rightValue, int rightIndex) {
        this.pivot = pivot;
        this.pivotIndex = pivotIndex;
        this.leftValue = leftValue;
        this.leftIndex = leftIndex;
        this.rightValue = rightValue;
        this.rightIndex = rightIndex;
    }

    @Override
    public String toString() {
        return "QsortSwapAction{" +
                "pivot=" + pivot +
                ", pivotIndex=" + pivotIndex +
                ", leftValue=" + leftValue +
                ", leftIndex=" + leftIndex +
                ", rightValue=" + rightValue +
                ", rightIndex=" + rightIndex +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        QsortSwapAction that = (QsortSwapAction) o;

        if (pivot != that.pivot) return false;
        if (pivotIndex != that.pivotIndex) return false;
        if (leftValue != that.leftValue) return false;
        if (leftIndex != that.leftIndex) return false;
        if (rightValue != that.rightValue) return false;
        return rightIndex == that.rightIndex;
    }

    @Override
    public int hashCode() {
        int result = pivot;
        result = 31 * result + pivotIndex;
        result = 31 * result + leftValue;
        result = 31 * result + leftIndex;
        result = 31 * result + rightValue;
        result = 31 * result + rightIndex;
        return result;
    }

    public int getPivot() {
        return pivot;
    }

    public void setPivot(int pivot) {
        this.pivot = pivot;
    }

    public int getPivotIndex() {
        return pivotIndex;
    }

    public void setPivotIndex(int pivotIndex) {
        this.pivotIndex = pivotIndex;
    }

    public int getLeftValue() {
        return leftValue;
    }

    public void setLeftValue(int leftValue) {
        this.leftValue = leftValue;
    }

    public int getLeftIndex() {
        return leftIndex;
    }

    public void setLeftIndex(int leftIndex) {
        this.leftIndex = leftIndex;
    }

    public int getRightValue() {
        return rightValue;
    }

    public void setRightValue(int rightValue) {
        this.rightValue = rightValue;
    }

    public int getRightIndex() {
        return rightIndex;
    }

    public void setRightIndex(int rightIndex) {
        this.rightIndex = rightIndex;
    }
}
