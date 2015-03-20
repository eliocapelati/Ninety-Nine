package org.ninetynineproblems.lists;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * @
 * <h1>1.02 (*) Find the last but one element of a list.</h1>
 * 
 * <p>[1 2 3 7 5] -> 7</p>
 * 
 * @author Elio Capelati
 *
 */
@RunWith(Parameterized.class)
public class ListOneDotZeroTwoTest {

	@Parameters
	public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {     
                 { new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7)), 6 },  
                 { new ArrayList<Integer>(Arrays.asList(10, 90, 50, 79)), 50 },  
                 { new ArrayList<String>(Arrays.asList("a", "b", "c")), "b" },  
                 { new ArrayList<Long>(Arrays.asList(1L, 2L, 3L, 4L, 5L)), 4L },  
                 { null, null },  
                 { new ArrayList<Integer>(Arrays.asList(9,15,97,15,97,115)), 97 }, 
                 { new ArrayList<Integer>(Arrays.asList(1)), 1}  
           });
    }
	
    private List<?> list;
    private Object lastElementButOne;
    
    public ListOneDotZeroTwoTest(List<? extends Object> list, Object lasElementButOne) {
		this.list = list;
		this.lastElementButOne = lasElementButOne;
	}
    
	@Test(timeout = 5)
	public void testFindLastButOneElementOfAList() {
		ListOneDotZeroTwo find = new ListOneDotZeroTwo();
		assertEquals(lastElementButOne, find.findLastButOneElementOfAList(list));
	}

}
