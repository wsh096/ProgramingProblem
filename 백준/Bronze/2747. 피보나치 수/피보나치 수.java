import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	private BufferedReader br;
	int n;
	int[] pibo;
	public static void main(String[] args) throws IOException{
		new Main().start();
	}
	private void start() throws IOException{
		br=new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(br.readLine());
		pibo=new int[n+1];
		pibo[0]=0;
		pibo[1]=1;
		for(int i=2;i<n+1;i++){
			pibo[i]=pibo[i-1]+pibo[i-2];
		}
		System.out.println(pibo[n]);
	}

}
