package modle;

import java.io.Serializable;

public class StudentTest implements Serializable {
    private String name;
    private int id;
    public StudentTest(){

    }
    public StudentTest(int id , String name){
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}