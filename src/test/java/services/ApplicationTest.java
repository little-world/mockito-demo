package services;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;


@RunWith(MockitoJUnitRunner.class)
public class ApplicationTest {
    @InjectMocks
    RecordService recordService;

    @Mock
    DatabaseService databaseMock;
    
    @Test
    public void saveTest() {
        when(databaseMock.save("temp.txt")).thenReturn("db saved");

        String result = recordService.save("temp.txt");
        assertEquals("db saved", result);

        verify(databaseMock, times(1)).save("temp.txt");
    }
}
