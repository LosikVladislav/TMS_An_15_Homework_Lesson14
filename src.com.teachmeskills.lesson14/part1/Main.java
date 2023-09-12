package part1;

import part1.model.Breakfast;
import part1.model.Coffee;
import part1.model.News;

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
