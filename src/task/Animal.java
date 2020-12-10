/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task;

/**
 *
 * @author abdel
 */
abstract class Animal
{
    private String type;
    private int age;
    private String origin;
    Animal(String t , int a , String o)
    {
        type = t;
        age = a;
        origin = o;
    }
    Animal()
    {
        
    }

    public int getAge()
    {
        return age;
    }

    public String getType()
    {
        return type;
    }
    public String getOrigin()
    {
        return origin;
    }
    public void setOrigin(String origin)
    {
        this.origin = origin;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public void setType(String type)
    {
        this.type = type;
    }
    
    
    
}
