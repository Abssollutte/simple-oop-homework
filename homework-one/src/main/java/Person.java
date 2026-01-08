import lombok.*;

@Setter
@Getter
@ToString
@EqualsAndHashCode
public class Person {
    private String name;
    private int age;

    public Person(String name, int age, boolean married) {
        this.name = name;
        this.age = age;
        this.married = married;
    }

    private boolean married;

    public void display() {
        System.out.println(this);
    }
}
