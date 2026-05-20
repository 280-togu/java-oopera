import java.util.ArrayList;

public class Show {
    private String title;
    private int duration;
    private Director director;
    private ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }
    public String getTitle() {
        return title;
    }
    public int getDuration() {
        return duration;
    }
    public Director getDirector() {
        return director;
    }
    public ArrayList<Actor> getListOfActors() {
        return listOfActors;
    }

    public void printDirector() {
        System.out.println("Режиссер:" + director);
    }

    public void printActors() {
        for (Actor actor : listOfActors) {
            System.out.println(actor);
        }
    }
    public void addActor(Actor actor) {
        if (listOfActors.contains(actor)) {
            System.out.println("Такой актёр уже есть в спектакле!");
            return;
        }
        listOfActors.add(actor);
    }
    public void replaceActor(String surname, Actor newActor) {
        for (int i = 0; i < listOfActors.size(); i++) {
            if (listOfActors.get(i).getSurname().equals(surname)) {
                listOfActors.set(i, newActor);
                return;
            }
        }

        System.out.println("Актёр с такой фамилией не найден!");
    }
}