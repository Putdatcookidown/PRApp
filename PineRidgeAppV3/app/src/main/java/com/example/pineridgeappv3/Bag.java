package com.example.pineridgeappv3;

public class Bag {

    private class Club{
        String name;
        int distance;

        String[] names = new String[] {"Putter", "64° Wedge", "62° Wedge", "60° Wedge", "58° Wedge", "56° Wedge",
                "54° Wedge", "52° Wedge", "50° Wedge", "48° Wedge", "Lob Wedge", "Sand Wedge", "Gap Wedge", "Pitching Wedge",
                "9 Iron", "8 Iron", "7 Iron", "6 Iron", "5 Iron", "4 Iron", "3 Iron", "2 Iron", "1 Iron",
                "9 Hybrid", "8 Hybrid", "7 Hybrid", "6 Hybrid", "5 Hybrid", "4 Hybrid", "3 Hybrid", "2 Hybrid",
                "11 Wood", "9 Wood", "7 Wood", "5 Wood", "3 Wood", "Driver"};

        private Club(int distance, String name){
            this.name = name;
            this.distance = distance;
        }

        private Club(String name){
            this.name = name;
            distance = 0;
        }

        private Club(int nameLoc){
            this.name = getNames(nameLoc);
            distance = 0;
        }

        public String getNames(int loc){
            return names[loc];
        }

        public void setDistance(int dist){
            distance = dist;
        }
    }

    Club[] bag = new Club[14];

    public Bag(){

    }

    public void addToBag(int loc, int namedLoc){
        bag[loc] = new Club(namedLoc);
    }

    public void setDistance(int loc, int dist){
        bag[loc].setDistance(dist);
    }
}