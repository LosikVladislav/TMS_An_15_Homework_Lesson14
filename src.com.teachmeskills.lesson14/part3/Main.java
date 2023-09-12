package part3;

import part3.model.Consumer;
import part3.model.Producer;
import part3.model.Station;

public class Main {
    public static void main(String[] args) {
        Station station = new Station();
        Consumer consumer = new Consumer(station);
        Producer producer = new Producer(station);

        new Thread(producer).start();
        new Thread(consumer).start();
    }
}
