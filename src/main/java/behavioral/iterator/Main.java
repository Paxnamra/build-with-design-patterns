package behavioral.iterator;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        BikeRepository bikeRepository = new BikeRepository();

        bikeRepository.addBike("Scott");
        bikeRepository.addBike("Giant");
        bikeRepository.addBike("Viktoria");

        Iterator<String> bikeIterator = bikeRepository.iterator();

        /*
        while (bikeIterator.hasNext()) {
            System.out.println(bikeIterator.next());
        }
        */

        for (String bike : bikeRepository) {
            System.out.println(bike);
        }
    }
}

//TODO missing remove method in BikeRepository


