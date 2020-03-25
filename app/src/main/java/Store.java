import java.util.ArrayList;
import java.util.List;

public class Store {

    private List<Person> employees = new ArrayList<Person>();
    private String address;
    private String[] hours;

    public Store()
    {

    }

    void setEmployee(Person b)
    {
        employees.add(b);
    }

    void setAddress(String c)
    {
        address = c;
    }

    void setHours(String[] d)
    {
        hours = d;
    }

    public List<Person> getEmployees()
    {
        return employees;
    }

    public String getAddress()
    {
        return address;
    }

    public String[] getHours()
    {
        return hours;
    }

}
