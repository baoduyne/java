package gitjava.java.src.main.java.com.mycompany.app.Mycompany;
import java.util.*;

public class StaffXML {
    private ArrayList<Staff> staffxml;

        public StaffXML(){
            staffxml = new ArrayList<>();
        }

            public void set_staffxml(Staff staff){
                staffxml.add(staff);

            }
}
