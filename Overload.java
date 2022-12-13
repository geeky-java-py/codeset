public class Overload {

    Overload(int acc){

        System.out.println("ID: " +acc);
    }
    Overload(String name){

        System.out.println("Name:- " +name);

    }
    Overload(double perc){

        System.out.println("Percentage:- " +perc);

    }
    Overload(char grade){

        System.out.println("Grade:- " +grade);


    }
    public class display{

        public static void main(String args[]){

            Overload o1 = new Overload("Rishikesh");
            Overload o2 = new Overload(121200);
            Overload o3 = new Overload('A');
            Overload o4 = new Overload(55.65);
        }
    }
    
}
