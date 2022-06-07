package application;

import entities.Person;

import java.util.*;

    public class program {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Person person;
            List<Person> malePeople = new ArrayList<>();
            List<Person> femalePeple = new ArrayList<>();

            do {
                System.out.print("Digite o nome e o sexo separados por virgula ");
                String[] split = sc.next().split(",");
                person = new Person(split[0], split[1]);


                if (person.getSex().equalsIgnoreCase("M") || person.getSex().equalsIgnoreCase("Masculino")) {
                    malePeople.add(person);
                    Collections.sort(malePeople);
                    for (Person people : malePeople) {
                        System.out.println(people);
                    }
                } else if (person.getSex().equalsIgnoreCase("F") || person.getSex().equalsIgnoreCase("Feminino")) {
                    femalePeple.add(person);
                    for (Person people : femalePeple){
                        Collections.sort(femalePeple);
                        System.out.println(people);
                    }
                }
                System.out.print("Gostaria de adicionar mais pessoas a lista? ");

            } while (sc.next().equalsIgnoreCase("Sim"));

            System.out.println(malePeople);
            System.out.println(femalePeple);
            System.out.println("Obrigado");
            sc.close();
        }

    }

