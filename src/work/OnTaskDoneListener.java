package work;

@FunctionalInterface
public interface OnTaskDoneListener {
    void onDone(String result);
}
