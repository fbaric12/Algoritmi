package pckg.gameSrch;

public class SearchResult {

	
	@Override
	public String toString() {
		return "SearchResult [index=" + indx + ", status=" + status + ", value=" + value + "]";
	}

	int indx = -1;
	boolean status = false;
	int value;
	
	public SearchResult(int indx, int val) {
		this.indx = indx;
		this.value = val;
		status = true;
	}
	
	public SearchResult(int val) {
		value = val;
	}

	public int getIndx() {
		return indx;
	}

	public boolean isStatus() {
		return status;
	}

	public int getValue() {
		return value;
	}
}
