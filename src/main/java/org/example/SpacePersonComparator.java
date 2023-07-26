package org.example;

import java.util.Comparator;

public class SpacePersonComparator implements Comparator<Person> {
    private int amountS;

    @Override
    public int compare(Person o1, Person o2) {
        if(Integer.compare(o1.getExperience(), o2.getExperience()) > 0) {
            return -1;
        } else if (Integer.compare(o1.getExperience(), o2.getExperience()) < 0) {
            return 1;
        }
        else if(Integer.compare(amountCharS(o1.getName()), amountCharS(o2.getName())) > 0) {
            return -1;
        } else if (Integer.compare(amountCharS(o1.getName()), amountCharS(o2.getName())) < 0){
            return 1;
        } else if(Integer.compare(o1.getName().length(), o1.getName().length()) < 0) {
            return -1;
        } else if(Integer.compare(o1.getName().length(), o1.getName().length()) > 0) {
            return 1;
        }
        else return 0;
    }

    public int amountCharS(String name) {
        amountS = 0;
        System.out.println(name);
        char[] characters = name.toCharArray();
        for (char character : characters) {
            if(character == 's' || character == 'S') {
                amountS++;
                System.out.println(amountS);
            }
        }
        return amountS;
    }
}

