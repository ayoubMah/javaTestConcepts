public class IncremenrTask implements Runnable{

    Counter counter ;

    public IncremenrTask(Counter counter){
        this.counter = counter ;
    }

    @Override
    public void run(){
        for(int i = 0 ; i < 10000 ; i++){
            counter.increment();
        }
    }
}