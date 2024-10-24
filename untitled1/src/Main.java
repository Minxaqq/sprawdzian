class Person {

    private String name;
    private String surname;
    private String sex;
    private int age;

    public Person(String name, String surname, String sex, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

}

class Employee extends Person {

        private String stanowisko;
       private int salary;
       private int numerID;
       private boolean active;

       public Employee(String name, String surname, int age,String sex, String stanowisko, int salary, boolean active) {

           super(name,surname,sex,age);
            this.stanowisko = stanowisko;
            this.salary = salary;
            this.active = active;
            this.numerID = numerID;

        }
        public String getStanowisko() {
            return stanowisko;
        }

        public int getSalary() {
            return salary;
        }

        public int getNumerID() {
            return numerID;
        }

        public boolean isActive() {
            return active;
        }

    }


    public class Main {
        public static void main(String[] args) {

        Employee Adam = new Employee("Adam", "jajkko",12,"male","kaczkozbior",55,true);
            System.out.println(Adam.getName());
            System.out.println(Adam.getSurname());
            System.out.println(Adam.getAge());
            System.out.println(Adam.getSex());
            System.out.println(Adam.getStanowisko());
            System.out.println(Adam.getSalary());
            System.out.println(Adam.getNumerID());
            System.out.println(Adam.isActive());



        }
    }
