package gitjava.java.src.main.java.com.mycompany.app.Mycompany;

public class Rank {
    private String rank = "";
    private double salary = 0.00;

    public void set_rank(String rank){
        this.rank = rank;
    }
    public void set_salary(double salary){
        this.salary = salary;
    }
    public String get_rank(){
        return rank;
    }
    public double salary(){
        return salary;
    }
}
