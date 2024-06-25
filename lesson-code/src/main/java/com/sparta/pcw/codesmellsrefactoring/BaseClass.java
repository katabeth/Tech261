package com.sparta.pcw.codesmellsrefactoring;

// Class to represent a Person -- Then call it that
public class BaseClass
{
    private final String fn; //please make consistent names
    private final String lastName; //Why are these finals but the others arent?
    private int age;
    private String hobbies; //If not used why declared?
    private int houseNo = 0; //The address could be ... Address?
    private String street = "";
    private String town = "";

    public BaseClass(String fName, String lName)
    {
        this.fn = fName;
        this.lastName = lName;
    }
    //
    public BaseClass(String fName, String lName, int hNo, String street, String town) {
        this(fName, lName); //What does this mean?
        this.houseNo = hNo;
        this.street = street;
        this.town = town;
        //Add the hobbies constructor?
    }

    public int getAge() {
        return age;
    } //Why are we setting and getting age but nothing else

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }

    public String getFullName() {
        return fn + " " + lastName;
    }

    public String move() {
        return "Walking along";
  //      System.out.println("Can't get here");
    }

    @Override
    public  String toString() { //Inconsistent spacing -- ah yes my favourite name of 'String'
        var addressString = "Address: " + houseNo + " " + street + ", "  + town;

        if (addressString.equals("Address: 0 , ")) {
            addressString = "Address: <no address set>";
        }

        return String.format("%s Name: %s  %s Age: %s. %s",
                             super.toString(),
                             fn,
                             lastName,
                             age,
                             addressString);
}

//    public int stupidMethod()
//    {
//        return 3;
//    }
}