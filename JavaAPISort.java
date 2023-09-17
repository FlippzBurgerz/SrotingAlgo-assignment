package algo.sorting;

import com.sun.source.tree.Tree;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

/**
 * Sort a List of SpeciesId. The list will be sorted according to oId descending. If species have the
 * same oId they will be sorted according to vId ascending.
 */
public class JavaAPISort {




	/**
	 * Sort a List of SpeciesId. The list will be sorted according to oId descending. If species have the
	 * same oId they will be sorted according to vId ascending.
	 * @param s the original list
	 * @return sorted list
	 */
	//tids komplexitet för metoden är O(n*log n)
	public List<SpeciesId> sort(List<SpeciesId> s) {

		// sorterar med sort() som använder sig av quicksort och timsort och är O(log n) samt antalet element i listan är n, vilket gör comparing till O(n)
		s.sort(Comparator.comparing(SpeciesId::getOId).reversed().thenComparing(SpeciesId::getVId));

		//TODO: Add implementation
		return s;
	}
}