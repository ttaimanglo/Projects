package ProjectsBackEnd;

public class AsteriskLogger implements Logger {

	@Override
	public void log(String log) {
		// TODO Auto-generated method stub
		System.out.println("***" + log + "***");
	}

	@Override
	public void error(String error) {
		// TODO Auto-generated method stub
		for (int i = 0; i < error.length()+6; i++) {
			System.out.print("*");
		}
		System.out.println();
		System.out.println("***"+error+"***");
		for (int i = 0; i < error.length()+6; i++) {
			System.out.print("*");
		}
	}

}
