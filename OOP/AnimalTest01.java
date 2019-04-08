class AnimalTest01{
    public static void main(String[] args) {
        Animal a = new Animal();
        a.name = "원숭이";
        a.age =26;
        System.out.print(a.name);
        System.out.print("," + a.age);
    }
}

class Animal{
    String name;
    int age;
}