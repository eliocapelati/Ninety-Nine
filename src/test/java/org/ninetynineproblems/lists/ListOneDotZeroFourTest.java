package org.ninetynineproblems.lists;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * 
 * <h1>(*) Find the number of elements of a list.</h1>
 *
 *  <p>[1 2 3 5 7] -> 5</p>
 *
 * 
 * @author Elio Capelati
 *
 */
@RunWith(Parameterized.class)
public class ListOneDotZeroFourTest {

	@Parameters
	public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {     
                 { Arrays.asList(1,2,3,4,5,6,7), 7 },
                 { Arrays.asList(10, 90, 50, 79), 4 },
                 { Arrays.asList("a", "b", "c"), 3 },
                 { Arrays.asList(1L, 2L, 3L, 4L, 5L), 5 },
                 { null, null },  
                 { Arrays.asList(9,15,97,15,97,115), 6 },
                 { Collections.emptyList(), 0 },
                 { Arrays.asList(1), 1}
           });
    }
	
	private List<?> list;
    private Object qtdElement;
    
    public ListOneDotZeroFourTest(List<? extends Object> list, Object qtdElement) {
		this.list = list;
		this.qtdElement = qtdElement;
	}
    
    @Test(timeout = 5)
	public void testNumElementOfAList() {
    	ListOneDotZeroFour find = new ListOneDotZeroFour();
		assertEquals(qtdElement, find.numElementOfAList(list));
	}
	
}
