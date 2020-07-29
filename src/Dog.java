public class Dog extends Animal implements Services {


    public Dog(String name, int years) {
        super (name, years);
    }

    void need() {

    }

    @Override
    public void listOfServices() {
        System.out.println ("стоимость дополнительных услуг 150$");

    }

    @Override
    public void costPerDay(){
        System.out.println ("ПЁС");
        System.out.println ("Cтоимость в сутки 50$");
        listOfServices ();
    }
}
