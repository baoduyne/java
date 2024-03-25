package gitjava.java.src.main.java.com.mycompany.app.Mycompany;

public class Staff {

    private String name = "";
    private int ID = 0;
    private String rank = "";
    private double salary = 0.0;

    public void set_name(String name){
        this.name = name;
    }

    public void set_id(int ID){
        this.ID = ID;
    }

    public void set_rank(String rank){
        this.rank = rank;
    }

    public String get_name(){
        return name;
    }

    public int get_id(){
        return ID;
    }

    public String get_rank(){
        return rank;
    }

    public double get_salary(){
        return salary;
    }

    
}
