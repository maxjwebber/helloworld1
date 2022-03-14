package test;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest
{
    @Test
   public void testFirstName()
        {
            Person person = new Person();
            person.setFirstName("Max");
            assertEquals("Max",person.getFirstName());
        }
}