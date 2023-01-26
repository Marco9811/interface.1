package it.develhope;

public class student extends CollegePerson implements LearningPerson{

    public int academicYear;

    public void studyAtHome(){
        System.out.println("Lo studente" + " " +name + " " + "studia a casa");
    }
    public student( String name, String surname, int id, int year){
        /*
        i costruttori hanno QUASI sempre il this. etc
         */

        this.name = name;
        this.surname = surname;
        this.collegeId = id;
        this.academicYear = year;
    }
    }

