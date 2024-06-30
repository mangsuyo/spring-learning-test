package cholog;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    Person person;

    public Author(Person person) {
        this.person = person;
    }

    public Author() {
    }

    public Long getId() {
        return id;
    }

    public Person getPerson() {
        return person;
    }
}
