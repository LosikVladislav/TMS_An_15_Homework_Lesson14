package part1.extend;

import part1.extend.model.Breakfast;
import part1.extend.model.Coffee;
import part1.extend.model.News;

public class Main {
    public static void main(String[] args) {

            Coffee coffee = new Coffee("espresso");
            coffee.setPriority(10);
            coffee.start();

            News news = new News("Onliner");
            news.setPriority(5);
            news.start();

            Breakfast breakfast = new Breakfast("fried eggs");
            breakfast.setPriority(1);
            breakfast.start();
    }
}
