package stringsInJava;

public class ToStringMethod {
    int rollno ;
    String name ;
    String city ;

    public ToStringMethod(int rollno, String name, String city) {

this.rollno=rollno;
this.name=name;
this.city=city;

    }


    @Override
    public String toString() {
        return "ToStringMethod{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    public static void main(String args[]) {
        ToStringMethod obj1 = new  ToStringMethod(1,"shrikant","nagpur");
        ToStringMethod obj2 = new  ToStringMethod(2,"Gajju","nagpur");

        System.out.println(obj1);
        System.out.println(obj2);








    }
}

