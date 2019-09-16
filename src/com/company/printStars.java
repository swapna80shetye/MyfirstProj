package com.company;

public class printStars {
    public static void main(String args[])
    {

        //creating an object of type employee
        Employee firstEmployee= new Employee(2000, 30);
                System.out.println("first employee salary is:"+firstEmployee.calculateBenifits());
        Employee secondEmp=new Employee();
        System.out.println("the second employee salary is: "+secondEmp.calculateBenifits());
        Employee thirdEmp= new Employee(50);
        System.out.println("the third employee salary is:"+thirdEmp.calculateBenifits());


        /*printing the stars in this program
        for (int i = 0; i <4 ; i++) {
            for (int j = 0; j <i ; j++) {
                System.out.print("* ");
                           }
            System.out.println();
        }*/
    }

}
