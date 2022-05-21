import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class a1_real {
	
	public static int silence(int[] positions) {
		int min_num_students = 0; // minimum number of seats separating 2 students who speak the same language
		Hashtable classroom = new Hashtable();
		
		for(int i = 0; i < positions.length; i++) {
			if(classroom.get(positions[i]) == null) {
				classroom.put(positions[i], i);
			} else {
				if(min_num_students != 0) {
					if((i-(int)classroom.get(positions[i])) < min_num_students) {
						min_num_students = i-(int)classroom.get(positions[i]); 
						classroom.remove(positions[i]);
						classroom.put(positions[i], i);
						
					} else {
						classroom.remove(positions[i]);
						classroom.put(positions[i], i);
					}
				} else {
					min_num_students = i-(int)classroom.get(positions[i]);
					classroom.remove(positions[i]);
					classroom.put(positions[i], i);
				}
			}
			
		}
		
		if(min_num_students == 0) {
			min_num_students = positions.length;
		}
		
		return min_num_students;

	}

	public static void main(String[] args) {
		try {
			String path = args[0];
      		File myFile = new File(path);
      		Scanner sc = new Scanner(myFile);
      		int num_students = sc.nextInt();
      		int[] positions = new int[num_students];
      		for (int student = 0; student<num_students; student++){
				positions[student] =sc.nextInt();
      		}
      		sc.close();
      		int answer = silence(positions);
      		System.out.println(answer);
    	} catch (FileNotFoundException e) {
      		System.out.println("An error occurred.");
      		e.printStackTrace();
    	}
  	}		
}
