import java.util.Objects;

public class Actor extends Person {
    private double height;

    public Actor(String name, String surname, Gender gender, double height) {
        super(name, surname, gender);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Actor actor = (Actor) o;

        return Double.compare(height, actor.height) == 0 && getName().equals(actor.getName()) && getSurname().equals(actor.getSurname());
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(getName(), getSurname(), height);
    }
}