package part1.extend.model;

public class Coffee extends Thread {
    private  String name;

    public Coffee(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "name='" + name + '\'' +
                '}';
    }
    public void run(){
        for(int i = 0; i < 3; i++){
            System.out.println(Thread.currentThread().getName() + " : prepare strong coffee and drink it");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
