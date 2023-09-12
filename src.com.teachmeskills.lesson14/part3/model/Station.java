package part3.model;

import part3.UTIL.Util;

public class Station {
    private int car = 0;

    public synchronized void put(){
        while(car >= (Util.MAX_AVAILABLE_SEAT/2)){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        car++;
        System.out.println("Consumer add 1 car");
        System.out.println("Cars on station " + car);
        notify();
    }

    public synchronized void get(){
        while(car < 1){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        car--;
        System.out.println("Producer get 1 car");
        System.out.println("Car on station " + car);
        notify();
    }
}
