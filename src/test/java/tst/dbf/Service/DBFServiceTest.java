package tst.dbf.Service;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import com.dbf.Service.DBFService;

@RunWith(MockitoJUnitRunner.class)
public class DBFServiceTest {
	
	@InjectMocks
	private DBFService service = new DBFService();
	
	@Test
	public void testService() throws Exception {
		String returned = service.testMethod();
		
		assertThat(returned, is("test"));

	}
}
