package com.company;



public class Employee {
    private int age;
    private int baseSalary;

    public Employee()
    {
        setBaseSalary(1000);
        setAge(18);
    }

public Employee(int age)
{
    setAge(age);
    baseSalary=3000;
}

    public Employee(int baseSalary,int age) {
        setAge(age);
        setBaseSalary(baseSalary);
    }

    private void setAge(int age) throws IllegalArgumentException {
        if (age<=0) {
            throw new IllegalArgumentException("age should be more than 40!!");
        }
        this.age=age;
    }

    private int getAge()
    {
        return age;
    }


    private int getBaseSalary() {
        return baseSalary;
    }

    private void setBaseSalary(int baseSalary) {
        if (baseSalary<=0) {
            throw new IllegalArgumentException("baseSalary cannot be 0 or less !!");
        }
        this.baseSalary = baseSalary;
    }


    public int calculateBenifits()
    {
        return baseSalary*age;
    }
}
