package com.sda.git;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

//        List<String> lista = new ArrayList<>();
//
//        lista.add("Jan");
//        lista.add("Maciej");
//        lista.add("Tadeusz");
//
//        System.out.println("Rozmiar " + lista.size());
//
//
//        lista.add("Matuesz");
//        lista.add("Karol");
//
//        System.out.println("Rozmiar " + lista.size());
//
//
//        for (String imie: lista)
//        {
//            System.out.println("Imie " + imie);
//        }
//
//        for(int i = 0; i < lista.size(); i++)
//        {
//            System.out.println("Imie to " + lista.get(i));
//        }
//
//
//        lista.remove("Jan"); // usunięcie z listy pozycji o nazwie
//        lista.remove(0); // usuniecie z listy pozycji o indexie
//
//        String imie1;
//
//        try         {
//            imie1 = lista.get(72);
//            System.out.println("Element o indeksie 72: " + imie1);
//         }
//         catch (IndexOutOfBoundsException e)
//         {
//             System.out.println("za daleko");
//             e.printStackTrace();
//         }
//
//
//
//        String  imie = lista.get(2);
//        System.out.println("Element o indeksie 2: " + imie );
//
//        lista.clear();
//
//        System.out.println(lista.size());


        User user = new User("Mateusz", "Marczak",30);
        User user1 = new User("Tomasz", "Lachawczak", 29);
        User user2 = new User("Wojciech", "NIerob", 44);

        List<User> lista = new ArrayList<>();

        lista.add(user);
        lista.add(user1);
        lista.add(user2);


        

        for(int i = 0; i < lista.size(); i++)
        {
            System.out.println(lista.get(i).getName() + " " + lista.get(i).getLastName() + " " +lista.get(i).getAge());
        }

    }
}
