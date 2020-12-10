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
public class Cat extends Animal
{

    int tail_length;
    String hairType;

    public Cat(String t, int a, String o, int tailL, String hair)
    {
        super(t, a, o);
        tail_length = tailL;
        hairType = hair;

    }

    public void meow()
    {
        System.out.println("meow");
    }

    public String getHairType()
    {
        return hairType;
    }

    public int getTail_length()
    {
        return tail_length;
    }

    public void setHairType(String hairType)
    {
        this.hairType = hairType;
    }

    public void setTail_length(int tail_length)
    {
        this.tail_length = tail_length;
    }

}
