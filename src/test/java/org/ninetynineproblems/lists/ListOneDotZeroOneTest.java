package org.ninetynineproblems.lists;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.assertEquals;


/**
 * 
 * <h1>1.01 (*) Find the last element of a list.</h1>
 *
 *	<p>Example:</p>
 *	
 *	<code>
 *  ?- my_last(X,[a,b,c,d]).
 *  X = d
 *  </code>
 *  
 *  <p>[1 2 3 7 5] -> 5</p>
 * 
 * @author Elio Capelati
 *
 */
@RunWith(Parameterized.class)
public class ListOneDotZeroOneTest {

	@Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {     
                 { Arrays.asList(1,2,3,4,5,6,7), 7 },
                 { Arrays.asList(10, 90, 50, 79), 79 },
                 { Arrays.asList("a", "b", "c"), "c" },
                 { Arrays.asList(1L, 2L, 3L, 4L, 5L), 5L },
                 { null, null },  
                 { Arrays.asList(9,15,97,15,97,115), 115 },
                 { Arrays.asList(1), 1}
           });
    }
    
    private List<?> list;
    private Object lastElement;

    public ListOneDotZeroOneTest(List<? extends Object> list, Object lasElement) {
    	this.list = list;
    	this.lastElement = lasElement;
    }
	
	@Test(timeout = 5)
	public void testFindLastElementOfAList() {
		ListOneDotZeroOne find = new ListOneDotZeroOne();
		assertEquals("Implementar a classe ListOneDotZeroOne", lastElement, find.findLastElementOfAList(list));
	}
}