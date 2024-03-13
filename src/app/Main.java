package app;

public class Main {
    public static void main(String[] args) {
        DataRepository repos = new DataRepository();
        DataHandler handler = new DataHandler();
        UIOperator uiOperator = new UIOperator();
        uiOperator.getOutput(handler.handleData(repos.getData()));
    }
}
