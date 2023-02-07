package com.rakesh.app;

public class App {
    public static void main( String[] args )
    {
        OptionsApp optionsApp=new OptionsApp();


        optionsApp.getCat("c3").ifPresent(cat-> System.out.println(cat.getName()));

        StreamApp streamApp=new StreamApp();
        System.out.println("employee Array");
        streamApp.getEmployeeArray().forEach(employee -> System.out.println(employee.toString()));
        System.out.println("employee List");
        streamApp.getEmployeeList().forEach(employee -> System.out.println(employee.toString()));
        System.out.println("employee Data");
        streamApp.getEmployeeData().forEach(employee -> System.out.println(employee.toString()));
        System.out.println("employee builder");
        streamApp.getEmployeeStreamBulider().forEach(employee -> System.out.println(employee.toString()));
        streamApp.getEmployeeList().forEach(e -> e.salaryIncrement(10.0));
        streamApp.getEmployeeStreamBulider().forEach(employee -> System.out.println(employee.toString()));

    }
}
