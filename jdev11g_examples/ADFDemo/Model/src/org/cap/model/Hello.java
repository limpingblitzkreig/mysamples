package org.cap.model;

public class Hello {
    public Hello() {
        super();
    }
    
    int id;
    String lastName;
    
    public String sayHi(String s){
      return  "Hi " + s;
    }


    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }
}
