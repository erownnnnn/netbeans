/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.person;

/**
 *
 * @author JARVIS
 */
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Person {

    private String Name;
    private String Address;
    private int Day;
    private int Month;
    private int Year;
    private int Age;
    
    public String getName()
    {
        return Name;
    }
    public void setName(String name)
    {
        Name = name;
    }
    public String getAddress()
    {
        return Address;
    }
    public void setAddress(String address)
    {
        Address = address;
    }
    public int getDay()
    {
        return Day;
    }
    public void setDay(int day)
    {
        Day = day;
    }
    public int getMonth()
    {
        return Month;
    }
    public void setMonth(int month)
    {
        Month = month;
    }
    public int getYear()
    {
        return Year;
    }
    public void setYear(int year)
    {
        Year = year;
    }
    public int getAge()
    {
        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(Year, Month, Day);
        return Period.between(birthday, today).getYears();
    }

}
