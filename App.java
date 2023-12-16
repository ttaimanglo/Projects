package ProjectsBackEnd;

public class App {
	
	public static void main(String[] args) {
		Logger asteriskLog = new AsteriskLogger();
		Logger spacedLog = new SpacedLogger();
		
		asteriskLog.log("Hello");
		
		System.out.println();
		asteriskLog.error("Hello");
		
		System.out.println("\n");
		spacedLog.log("Hello");
		
		System.out.println("\n");
		spacedLog.error("Hello");
	}
	
}
