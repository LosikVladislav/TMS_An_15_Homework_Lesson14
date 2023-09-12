package part2.implement.model;

public class Coffee implements Runnable{
    private String name;
    private Thread coffee;
    public Coffee(String name, Thread coffee) {
        this.name = name;
        coffee = new Thread(this, Thread.currentThread().getName());
        coffee.setPriority(10);
        coffee.start();
    }
    @Override
    public void run() {
        for(int i = 0; i < 3; i++){
            System.out.println(Thread.currentThread().getName() + " : prepare " + getName() + " and drink it");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }



    @Override
    public String toString() {
        return "Coffee{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }
}
