package com.genspark.task1;

import static com.genspark.task1.utils.TestUtils.businessTestFile;
import static com.genspark.task1.utils.TestUtils.currentTest;
import static com.genspark.task1.utils.TestUtils.yakshaAssert;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MainTest {

    

    @Test
    public void testGetBookByIdWithoutInit_ShouldHandleGracefully() throws Exception{
        Main main = new Main();

        // If learner implements a fix for uninitialized cache (e.g., lazy init),
        // this test will pass. If not, it will fail — which is expected.
        try {
	        Main.Book book = main.getBookById(1);
	        yakshaAssert(currentTest(), book != null, businessTestFile);
        }catch(Exception ex) {
        	yakshaAssert(currentTest(), false, businessTestFile);
        }
        
    }
}
