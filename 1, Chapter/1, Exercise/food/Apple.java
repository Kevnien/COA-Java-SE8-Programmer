package food;

import food.Fruit;

class Apple extends Fruit {
    private String name = "apple";
    private boolean fresh = true;
    private int sweetness = 7;
    private int tartness = 5;

    public void goRotten() {
        fresh = false;
    }

    public void getOlder() {
        if (sweetness == 10) {
            goRotten();
        }
        if (fresh) {
            sweetness++;
        } else {
            sweetness--;
        }
        tartness--;
    }

    public String getName() {
        return name;
    }

    public boolean getFreshness() {
        return fresh;
    }

    public int getSweetness() {
        return sweetness;
    }

    public int getTartness() {
        return tartness;
    }

    public static void main(String[] args) {
        Apple apple = new Apple();
        System.out.println("Name: " + apple.getName());
        System.out.println("Sweetness: " + apple.getSweetness());
        System.out.println("Getting older.");
        apple.getOlder();
        System.out.println("Sweetness: " + apple.getSweetness());
    }
}