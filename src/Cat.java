public class Cat extends Animal implements Services {


    public Cat(String name, int years) {
        super (name, years);
    }

    void need() {


    }

    @Override
    public void listOfServices() {
        System.out.println ("стоимость дополнительных услуг 100$");
    }

    @Override
    public void costPerDay(){
        System.out.println ("КОТ");
        System.out.println ("Cтоимость в сутки 50$");
        listOfServices ();
    }
}
