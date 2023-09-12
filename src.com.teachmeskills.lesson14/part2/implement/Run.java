package part2.implement;

import part2.implement.model.Breakfast;
import part2.implement.model.Coffee;
import part2.implement.model.News;

public class Run {
    public static void main(String[] args) {
        new Coffee("espresso", new Thread());
        new News("Onliner", new Thread());
        new Breakfast("fried eggs", new Thread());
    }
}
