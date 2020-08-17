
/**
 * @author SZ1916069杨博涵
 */
public class Calculate {
    CalculateDAO m_CalDAO;
    public int add(int a, int b) {
        return a + b;
    }
    public int substract(int a, int b) {
        return a - b;
    }
    public int multiply(int a, int b) {
        return a * b;
    }
    public int Square()
    {
        int a = m_CalDAO.GetNum();
        return a * a;
    }
    public void setDAO(CalculateDAO DAO)
    {
        this.m_CalDAO = DAO;
    }
}
