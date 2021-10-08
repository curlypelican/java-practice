package com.company;

public class Human {

    String color;
    int height;
    String gender;

    public Human(String color, int height, String gender) {
        this.color = color;
        this.height = height;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Human{" +
                "color='" + color + '\'' +
                ", height=" + height +
                ", gender='" + gender + '\'' +
                '}';
    }

    public static void main(String[] args) {

        Human human1 = new Human("white", 189, "woman");

        Head head1 = new Head("blue", "blond", "short");
        head1.setHairColor("ginger");

        Leg leg1 = new Leg(38);
        leg1.setSize(36);

        Hand hand1 = new Hand("pink", "middle");
        hand1.setNailsColor("beige");

        System.out.println(human1);
        System.out.println(head1);
        System.out.println(leg1);
        System.out.println(hand1);

    }

}
