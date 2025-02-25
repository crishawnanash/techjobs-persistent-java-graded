//package org.launchcode.techjobs.persistent.models;
//
//import javax.persistence.*;
//
//@Entity
//public class Job extends AbstractEntity{
//
//    @ManyToOne
//    private Employer employer;
//
//    private String skills;
//
//    public Job() {
//    }
//
//    public Job(String anEmployer, String someSkills) {
//        super();
//        this.employer = anEmployer;
//        this.skills = someSkills;
//    }
//
//    // Getters and setters.
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getEmployer() {
//        return employer;
//    }
//
//    public void setEmployer(String employer) {
//        this.employer = employer;
//    }
//
//    public String getSkills() {
//        return skills;
//    }
//
//    public void setSkills(String skills) {
//        this.skills = skills;
//    }
//}


package org.launchcode.techjobs.persistent.models;


import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.util.ArrayList;
import java.util.List;



@Entity

public class Job extends AbstractEntity{



    @ManyToOne

//    @NotNull(message = "Employer is required")

    private Employer employer;





    @ManyToMany

    private List<Skill> skills = new ArrayList<>();





    public List<Skill> getSkills() {

        return skills;

    }



    public void setSkills(List<Skill> skills) {

        this.skills = skills;

    }







    public Job() {

    }



    public Job(Employer anEmployer, List<Skill> skills) {

        super();

        this.employer = anEmployer;

        this.skills = skills;

    }



    // Getters and setters.



//    public String getName() {

//        return name;

//    }

//

//    public void setName(String name) {

//        this.name = name;

//    }



    public Employer getEmployer() {

        return employer;

    }



    public void setEmployer(Employer employer) {

        this.employer = employer;

    }



    public void addSkill(Skill skill){

        this.skills.add(skill);

    }



}
