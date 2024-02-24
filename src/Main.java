//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    class Car{
    public void Accelerate(){
        System.out.println("The Car Moves Front  ");

    };
    public void key() {
        System.out.println("The Car Turned On");
    }
    public void Key_Removed() {
        System.out.println("The Car Turned Off");
    }
    public void Brake(){
        System.out.println("Now The Car Stopped");

    };
    public void Steering_Right() {
        System.out.println("The Car Turned Right");
    }
    public void Steering_Left(){
        System.out.println("The Car Turned Left");

    }

    public void Move_forward() {
        System.out.println("The Car Goes Front");
    }
    public void Move_Backward(){
            System.out.println("The Car Goes Back");
        };

}
Car Audi=new Car();
Audi.key();
Audi.Accelerate();
Audi.Steering_Right();
Audi.Steering_Left();
Audi.Brake();
Audi.Key_Removed();


    }
}





