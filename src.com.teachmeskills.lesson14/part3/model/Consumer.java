package part3.model;

import part3.UTIL.Util;

public class Consumer implements Runnable{
    private Station station;

    public Consumer(Station station) {
        this.station = station;
    }

    @Override
    public void run() {
        for(int i = 1; i < Util.MAX_AVAILABLE_SEAT; i++){
            station.put();
        }
    }
}
