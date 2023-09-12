package part1.model;

public class News extends Thread{
    private String name;

    public News(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "News{" +
                "name='" + name + '\'' +
                '}';
    }
    public void run(){
        for(int i = 0; i < 3; i++){
            System.out.println(Thread.currentThread().getName() + " : reading news");
            try {
                Thread.sleep(3500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
