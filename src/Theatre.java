import java.util.ArrayList;

public class Theatre {
    public static void main(String[] args) {

        Actor actor1 = new Actor("Иван", "Петров", Gender.MALE, 180);
        Actor actor2 = new Actor("Анна", "Смирнова", Gender.FEMALE, 165);
        Actor actor3 = new Actor("Дмитрий", "Ковалёв", Gender.MALE, 175);

        Director director1 = new Director("Сергей", "Пашинин", Gender.MALE, 10);
        Director director2 = new Director("Ольга", "Иванова", Gender.FEMALE, 5);

        MusicAuthor musicAuthor = new MusicAuthor("Игорь", "Стравинский", Gender.MALE);
        Choreographer choreographer = new Choreographer("Михаил", "Фокин", Gender.MALE);



        Show show = new Show("Гамлет", 120, director1, new ArrayList<>());
        show.addActor(actor1);
        show.addActor(actor2);

        MusicalShow opera = new Opera("Кармен", 150, director2, new ArrayList<>(), musicAuthor, "Либретто оперы Кармен", 20);
        opera.addActor(actor1);
        opera.addActor(actor2);
        opera.addActor(actor3);

        MusicalShow ballet = new Ballet("Лебединое озеро", 140, director1, new ArrayList<>(), musicAuthor, "Либретто балета Лебединое озеро", choreographer);
        ballet.addActor(actor1);
        ballet.addActor(actor2);

        opera.addActor(actor3);

        System.out.println("=== Гамлет ===");
        show.printActors();
        show.printDirector();

        System.out.println("=== Опера ===");
        opera.printActors();
        opera.printDirector();

        System.out.println("=== Балет ===");
        ballet.printActors();
        ballet.printDirector();

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