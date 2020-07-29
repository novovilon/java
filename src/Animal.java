public abstract class Animal {

    private String name;
    private int years;

    public Animal(String name, int years) {
        this.name = name;
        this.years = years;
    }

    abstract void need();

    public void costPerDay() {
        System.out.println ("50$");
    }

}
