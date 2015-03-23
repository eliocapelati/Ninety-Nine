package org.ninetynineproblems.lists;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * <h1>(*) Find the K�th element of a list</h1>
 *
 * <p>The first element in the list is number 1.</p>
 *
 *	<p>[1 2 3 7 5] 4 -> 7</p>
 * 
 * @author Elio Capelati
 *
 */
@RunWith(Parameterized.class)
public class ListOneDotZeroThreeTest {
	 
	
	@Rule
	public ExpectedException expected = ExpectedException.none();
	
	
	@Parameters
	public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {     
                 { Arrays.asList(1, 2, 3, 4, 5, 6, 7), 3, 3, null},
                 { Arrays.asList(10, 90, 50, 79), 90 ,2, null},
                 { Arrays.asList("a", "b", "c"), "b", 2 , null},
                 { Arrays.asList(1L, 2L, 3L, 4L, 5L), 4L, 4 , null},
                 { null, null, null, null},
                 { null, null, 1, null},
                 { Arrays.asList(9, 15, 97, 15, 97, 115), 97 ,3, null},
                 { Arrays.asList(1), 1, 1, null},
                 { Arrays.asList(1L, 2L, 3L, 4L, 5L), 4L, 4 , null},
                 { Arrays.asList(1), 1, 2, IndexOutOfBoundsException.class}
           });
    }
	
	private List<?> list;
	private Object kthElement;
	private Integer posElement;
	
	public ListOneDotZeroThreeTest(final List<? extends Object> list,
			final Object kthElement, final Integer posElement, final Class<? extends Throwable> exception) {
		this.list = list;
		this.kthElement = kthElement;
		this.posElement = posElement;
        if (exception != null) {
            expected.expect(exception);
        }
	}

	@Test(timeout = 5)
	public void testFindKthElementOfAList(){
		ListOneDotZeroThree find = new ListOneDotZeroThree();
		assertEquals(kthElement, find.findKthElementOfAList(list, posElement));
	}
	
}
