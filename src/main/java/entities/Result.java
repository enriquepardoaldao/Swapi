package entities;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public class Result {
	
	private Long count;
	private String next;
	private String previous;
	private List<People> results;

	@JsonIgnoreProperties(ignoreUnknown = true)
	public Result() {
		
	}

	public Result(Long count, String next, String previous, ArrayList<People> results) {
		super();
		this.count = count;
		this.next = next;
		this.previous = previous;
		this.results = results;
	}

	public Long getCount() {
		return count;
	}

	public String getNext() {
		return next;
	}

	public String getPrevious() {
		return previous;
	}

	public List<People> getResults() {
		return results;
	}

	public void setCount(Long count) {
		this.count = count;
	}

	public void setNext(String next) {
		this.next = next;
	}

	public void setPrevious(String previous) {
		this.previous = previous;
	}

	public void setResults(ArrayList<People> results) {
		this.results = results;
	}

	
	
	
	
	
	
}
