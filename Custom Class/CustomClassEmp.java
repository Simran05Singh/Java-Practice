class Emp {
    int id;
    String name;
    public void disp() {
        System.out.println(name +"\n"+ id);
    }
}
public class CustomClassEmp {
    public static void main(String[] args) {
        Emp e = new Emp();
        e.id = 23;
        e.name = "simran singh";
        e.disp();
    }
}
