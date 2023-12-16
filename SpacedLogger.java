package ProjectsBackEnd;

public class SpacedLogger implements Logger {

	@Override
	public void log(String log) {
		// TODO Auto-generated method stub
		for (int i = 0; i < log.length(); i++) {
			System.out.print(log.charAt(i) + " ");
		}
	}

	@Override
	public void error(String error) {
		// TODO Auto-generated method stub
		System.out.print("ERROR: ");
		for (int i = 0; i < error.length(); i++) {
			System.out.print(error.charAt(i) + " ");
		}
	}

}
