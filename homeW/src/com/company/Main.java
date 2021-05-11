package com.company;

public class Main {

    public static void main(String[] args) {
        Camp camp1=new Camp(1,"Java React","Engin Demirog" );
        Camp camp2=new Camp(2," C#","Engin Demirog");
        Camp[] camps={camp1,camp2};

        for(Camp camp: camps){
            System.out.println("Course Name: "+camp.name);
            System.out.println("Course Instructor: "+camp.instructor);
        }

        User user1=new User(5,"Buse","buse@mail.com");
        User[] users={user1};

        for(User user:users){
            System.out.println("Student: "+ user.name);
            System.out.println("Contact Information: "+user.email);
        }



    }
}
