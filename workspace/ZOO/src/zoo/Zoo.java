package zoo;

public class Zoo {
    public static void main(String[] args){
        Animal a1 = new Animal("giraffe", 480); //name, weight
        Animal a2 = new Animal("lion", 300, "male"); //name, weight, gender
        
        a1.makeNoise();
        a2.makeNoise();
    }
}