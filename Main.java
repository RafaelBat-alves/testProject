package org.example;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> Name = List.of("RIAN","RIAN","RIAN","Rafael","Rafael","mateus","mateus grande","renan","janaina","armenio","luma");
        Name.stream()
                .map(N-> N.toUpperCase())
                .filter(N->N.startsWith("R"))
                .sorted()
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        System.out.println(Name);
//Filter: permite filtrar os elementos da stream com base em uma condição
//Map: permite transformar cada elemento da stream em outro tipo de dado
//ForEach: permite executar uma ação em cada elemento da stream
//Collect: permite coletar os elementos da stream em uma coleção ou em outro tipo de dado

    }
}