import java.util.Set;
import java.util.Map;

public class MySysEnv{
	public static void main(String[] argv){
		for( String envName : System.getenv().keySet()){
			System.out.println(envName+ ":" + System.getenv().get(envName)); 
		}
	}
}
