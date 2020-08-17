import org.junit.*;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import java.util.LinkedList;

public class MyTest {

    Calculate m_Cal;
    @Test
    public void test(){

        //You can mock concrete classes, not just interfaces
        CalculateDAO mockedDao = mock(CalculateDAO.class);
        m_Cal = new Calculate();

        m_Cal.setDAO(mockedDao);

        when(mockedDao.GetNum()).thenReturn(4);
        int result = m_Cal.Square();

        assertEquals(result,16);
    }
}