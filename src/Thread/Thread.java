package Thread;

public class Thread extends java.lang.Thread {

    //  VARIABLES
    private String thread_name;
    private int starting_time;
    private int counter;
    private int adder;
    private int time_difference;

    private boolean thread_alive_flag;


    //CONSTRUCTOR
    public Thread(String thread_name, int starting_time, int adder, int time_difference, boolean thread_alive_flag) {
        this.thread_name = thread_name;
        this.starting_time = starting_time;
        this.adder = adder;
        this.time_difference = time_difference;
        this.thread_alive_flag = thread_alive_flag;
    }

    //run() METHOD
    @Override
    public void run() {
        counter = starting_time;

        while (thread_alive_flag){
            counter += adder;

            try {
                sleep(time_difference);
            }catch (Exception e){
                e.printStackTrace();
            }

        }
    }

    public void stopThread(){
        thread_alive_flag = false;
    }

    //     getters and setters
    public String getThread_name() {
        return thread_name;
    }

    public void setThread_name(String thread_name) {
        this.thread_name = thread_name;
    }

    public int getStarting_time() {
        return starting_time;
    }

    public void setStarting_time(int starting_time) {
        this.starting_time = starting_time;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int cpunter) {
        this.counter = cpunter;
    }

    public int getAdder() {
        return adder;
    }

    public void setAdder(int adder) {
        this.adder = adder;
    }

    public int getTime_difference() {
        return time_difference;
    }

    public void setTime_difference(int time_difference) {
        this.time_difference = time_difference;
    }

    public boolean isThread_alive_flag() {
        return thread_alive_flag;
    }

    public void setThread_alive_flag(boolean thread_alive_flag) {
        this.thread_alive_flag = thread_alive_flag;
    }


}
