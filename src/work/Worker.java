package work;

public class Worker {
    private OnTaskDoneListener callback;
    private OnTaskErrorListener errorCallback;
    int taskError = 33;

    public Worker(OnTaskDoneListener callback, OnTaskErrorListener errorCallback) {
        this.callback = callback;
        this.errorCallback = errorCallback;
    }

    public void start() {
        for (int i = 1; i <= 100; i++) {
            if (i == taskError) {
                errorCallback.onError("Error: task " + i + " delayed");
            }
            callback.onDone("Task " + i + " is done");
        }
    }
}
