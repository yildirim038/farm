package hicoders.farm.persistency.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class WorkerEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private String firstName;
    private String lastName;
    private String type;

    public WorkerEntity(String firstName, String lastName, String type) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.type = type;
    }

    public WorkerEntity() {

    }

    @Override
    public String toString() {
        return String.format(
                "Worker[id=%d, firstName='%s', lastName='%s', type='%s']",
                id, firstName, lastName,type);
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getType(){return type;}
}
