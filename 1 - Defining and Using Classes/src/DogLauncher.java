public class DogLauncher {
    public static void main(String[] args) {
        Dog a = new Dog(30);
        Dog b = new Dog(5);

        Dog larger = Dog.maxDog(a, b);
        larger.makeNoise();
    }
}