package part2.implement.model;

public class Breakfast implements Runnable{
    private String name;

    private Thread breakfast;
    public Breakfast(String name, Thread breakfast) {
        this.name = name;
        breakfast = new Thread(this, Thread.currentThread().getName());
        breakfast.setPriority(1);
        breakfast.start();
    }

    @Override
    public void run() {
        for(int i = 0; i < 3; i++){
            System.out.println(Thread.currentThread().getName() + " : prepare " + getName() + " and eat it");
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }



    @Override
    public String toString() {
        return "Breakfast{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }
}
