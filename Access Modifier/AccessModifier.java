class Emp {
    private int id;
    private String name;
    public void setid(int i) {
        id = i;
    }
    public void setname(String n) {
        name = n;
    }
    public int getid() {
        return id;
    }
    public String getname() {
        return name;
    }
}
public class AccessModifier {
    public static void main(String[] args) {
        Emp e = new Emp();
        e.setid(23);
        e.setname("simran");
        System.out.println(e.getid());
        System.out.println(e.getname());
    }
}
