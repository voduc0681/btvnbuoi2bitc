class Person {
    int namsinh;
    public int PredictAge() {
        int currentYear = 2024; 
        int age = currentYear - namsinh; 
        return age; 
    }
}
public class Main {
    public static void main(String[] args) {
        Person person1 = new Person(); 
        person1.namsinh = 2000; 
        int age = person1.PredictAge(); 
        System.out.printf("Số tuổi là %d", age); 
    }
}