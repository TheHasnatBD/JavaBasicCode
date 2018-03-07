package ThreadTwo;

public class CustomRunableObject implements Runnable {

    private String name;
    private int counter;

    //Constructor

    public CustomRunableObject(String name, int counter) {
        this.name = name;
        this.counter = counter;
    }

    //GETTER + SETTER
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }


    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()){
            counter++;

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                //e.printStackTrace();
                break;
            }
        }
    }

}
