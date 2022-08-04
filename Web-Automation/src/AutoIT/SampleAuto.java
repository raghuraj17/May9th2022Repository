package AutoIT;

public class SampleAuto {

	public static void main(String[] args) {
		executeFile();

	}
	private static void executeFile()
	{
		try
		{
			
			String fileName="G:\\AutoIT\\Sample.exe";
			Runtime.getRuntime().exec(fileName);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
