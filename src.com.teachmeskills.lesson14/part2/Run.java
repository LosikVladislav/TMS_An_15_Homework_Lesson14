package part2;

import part2.model.Breakfast;
import part2.model.Coffee;
import part2.model.News;

public class Run {
    public static void main(String[] args) {
        new Coffee("espresso", new Thread());
        new News("Onliner", new Thread());
        new Breakfast("fried eggs", new Thread());
    }
}
