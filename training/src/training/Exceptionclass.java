package training;
import training.Exceptionss;

public class Exceptionclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Exceptionss es=new Exceptionss();
			es.M();

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception is handeled ");
		}

		 System.out.println("Normal flow");
	}

}
