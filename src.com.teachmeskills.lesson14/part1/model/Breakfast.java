package part1.model;

public class Breakfast extends Thread{
    private String name;
    public Breakfast(String name){
        this.name = name;
    }
    public void run(){
        for(int i = 0; i < 3; i++){
            System.out.println(Thread.currentThread().getName() + " : prepare breakfast and eat it");
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
}
