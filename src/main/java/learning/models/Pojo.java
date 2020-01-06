package learning.models;

public class Pojo {

    public void setContext(int i) {
        this.context.set(i);
    }

    public int getContext() {

        return this.context.get();
    }

    public Pojo(){
        System.out.println("In Pojo construction this = " + this);
        context = new ThreadLocal<Integer>();
    }

    private ThreadLocal<Integer> context;

}
