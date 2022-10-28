import org.junit.Test;
import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

class DocSearchTest {
    
    public void testServer() throws IOException {
        String[] port = {"4001"};
        DocSearchServer.main(port);
    }

}
