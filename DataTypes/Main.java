package DataTypes;

import javax.xml.namespace.QName;

public class Main {
    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.Givenname = "Valera";
        persona.Lastname = "Smith";
        persona.Age = 13;
        persona.setSex("m");
        persona.setWeight(68);

        System.out.println("Hey, here is a bit of information about you ");
        System.out.println(persona.Givenname);
        System.out.println(persona.Lastname);
        System.out.println(persona.Age.toString());
        System.out.println(persona.getSex());
        System.out.println(persona.getWeight().toString());



    }
}
