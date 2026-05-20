import java.util.ArrayList;

public class Theatre {
    public static void main(String[] args) {

        Actor actor1 = new Actor("Иван", "Петров", Gender.MALE, 180);
        Actor actor2 = new Actor("Анна", "Смирнова", Gender.FEMALE, 165);
        Actor actor3 = new Actor("Дмитрий", "Ковалёв", Gender.MALE, 175);

        Director director1 = new Director("Сергей", "Пашинин", Gender.MALE, 10);
        Director director2 = new Director("Ольга", "Иванова", Gender.FEMALE, 5);

        String musicAuthor = "Игорь Стравинский";
        String choreographer = "Михаил Фокин";

        ArrayList<Actor> actorsForShow = new ArrayList<>();
        actorsForShow.add(actor1);
        actorsForShow.add(actor2);

        Show show = new Show("Гамлет", 120, director1, new ArrayList<>(actorsForShow));

        MusicalShow opera = new Opera("Кармен", 150, director2, new ArrayList<>(actorsForShow), musicAuthor, "Либретто оперы Кармен", 20);

        MusicalShow ballet = new Ballet("Лебединое озеро", 140, director1, new ArrayList<>(actorsForShow), musicAuthor, "Либретто балета Лебединое озеро", choreographer);

        opera.addActor(actor3);

        System.out.println("=== Гамлет ===");
        show.printActors();
        System.out.println("Режиссер: " + show.getDirector());

        System.out.println("=== Опера ===");
        opera.printActors();
        System.out.println("Режиссер: " + opera.getDirector());

        System.out.println("=== Балет ===");
        ballet.printActors();
        System.out.println("Режиссер: " + ballet.getDirector());

        show.replaceActor("Петров", actor3);

        System.out.println("=== Гамлет после замены ===");
        show.printActors();

        ballet.replaceActor("Несуществующий", actor1);

        System.out.println("=== Опера: либретто ===");
        opera.printLibretto();

        System.out.println("=== Балет: либретто ===");
        ballet.printLibretto();
    }
}