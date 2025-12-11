import java.util.ArrayList;

public interface Iwagecomputation {
    public void addCompany(String name, int rate, int days, int hours);
    public void computeWages();
    public int getTotalWage(String companyName);

    ArrayList<Integer> getDailyWages(String companyName);
}

