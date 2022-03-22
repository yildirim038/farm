package hicoders.farm.controller.model;

public class WorkerViewModel {
    private String firstName;
    private String lastName;
    private String type;

    public WorkerViewModel(){}

    public WorkerViewModel(String firstName, String lastName,String type) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.type = type;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", type='" + type + '\'' +'}';
    }


}
