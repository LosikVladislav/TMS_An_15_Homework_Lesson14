package part2.model;

public class News implements Runnable{
    private String name;
    private Thread news;

    public News(String name, Thread news) {
        this.name = name;
        news = new Thread(this, Thread.currentThread().getName());
        news.setPriority(5);
        news.start();
    }

    @Override
    public void run() {
        for(int i = 0; i < 3; i++){
            System.out.println(Thread.currentThread().getName() + " : reading " + getName() );
            try {
                Thread.sleep(3500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "News{" +
                "name='" + name + '\'' +
                '}';
    }
}
