package akvelontask.entity;


import javax.persistence.*;

@Entity
@Table(name = "pupils")
public class Pupil {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "birthday")
    private java.sql.Date birthday;

    @Column(name = "class_group")
    private char classGroup;

    @Column(name = "class_phase")
    private int classPhase;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public java.sql.Date getBirthday() {
        return birthday;
    }

    public void setBirthday(java.sql.Date birthday) {
        this.birthday = birthday;
    }

    public char getClassGroup() {
        return classGroup;
    }

    public void setClassGroup(char classGroup) {
        this.classGroup = classGroup;
    }

    public int getClassPhase() {
        return classPhase;
    }

    public void setClassPhase(int classPhase) {
        this.classPhase = classPhase;
    }
}
