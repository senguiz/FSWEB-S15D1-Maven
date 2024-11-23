package org.example.models;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Grocery {

    public static List<String> groceryList = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);

    public void startGrocery(){
        int choice;

        do{
            System.out.println("Yapılmak istenen operasyonu seçin. Ekleme : 1 , Çıkarma : 2, Çıkış : 0 ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice){
                case 1:
                    System.out.println("Eklenmesini istediğiniz elemanları giriniz.");
                    String userInput = scanner.nextLine();
                    addItems(userInput);
                    printSort();
                    break;
                case 2:
                    System.out.println("Eklenmesini istediğiniz elemanları giriniz.");
                    userInput = scanner.nextLine();
                    removeItems(userInput);
                    printSort();
                    break;

            }
        }
        while(choice != 0);
        scanner.close();
    }

    public void addItems(String userInput){
        String[] splitInputs = userInput.split(",");
        for ( String splitInput: splitInputs) {
            String item = splitInput.trim();
            if (checkItemIsInList(item)) {
                System.out.println("Eleman listede mevcut");
            } else {
                groceryList.add(item);
            }
        }
        sortProducts();
    }
    public void removeItems(String userInput) {
        String[] splitInputs = userInput.split(",");
        for ( String splitInput: splitInputs) {
            String item = splitInput.trim();
            if(checkItemIsInList(item)){
                groceryList.remove(item);
            }else{
                System.out.println("Eleman listede mevcut değil.");
            }
        }
        sortProducts();
    }

    public boolean checkItemIsInList(String product){
        return groceryList.contains(product);
    }
    public static void sortProducts(){
        Collections.sort(groceryList);
    }
    public static void printSort(){
        sortProducts();
        for(String item: groceryList){
            System.out.println(item);
        }
    }
}

