package day19_taskSubmissionArtitJaikwang;

public class Task_M1 {

	public static void main(String[] args) {
		
//		### Task - M1
//
//		Given a string, does "xyz" appear in the middle of the string? To define middle, we'll say that the
//		number of chars to the left and right of the "xyz" must differ by at most one. This problem is
//		harder than it looks.
//
//		```text
//		xyzMiddle("AAxyzBB") → true 
//		xyzMiddle("AxyzBB") → true 
//		xyzMiddle("AxyzBBB") → false
//		```
		
		String str = "AxyzBB";
		String xyz = "xyz";
		int mid = str.length() / 2;
		
		if(str.length() < 3) {
			System.out.println(false);
		}
		if(str.length() % 2 != 0) {
			if(xyz.equals(str.substring(mid-1,mid+2))) {
				System.out.println(true);
			}
			else {
				System.out.println(false);
			}
		}
		else if(xyz.equals(str.substring(mid-1,mid+2)) || xyz.equals(str.substring(mid-2,mid+1))) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}

	}

}
