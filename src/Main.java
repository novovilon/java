
class Main extends Base {



    public static void main(String[] args) {

        System.out.println ("Здравствуйте, как вас зовут ?");
        String name = sc.nextLine ();
        System.out.println (name + " Внимательно в ознакомьтесь с нашими ценами!!!");

        cat.costPerDay ();
        System.out.println ();
        dog.costPerDay ();
        System.out.println ();

        System.out.println ();

        System.out.println ("можете оставить впечатления от центра " + name);

        arrayList.add (sc.nextLine ());

        System.out.println ( arrayList.size ());

        sc.close ();


    }

}
