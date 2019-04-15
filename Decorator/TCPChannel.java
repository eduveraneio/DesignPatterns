public class TCPChannel implements Channel {
	public void send(){
		System.out.println("enviando dados via TCP");  
	}
	public void recv(){
		System.out.println("recebendo dados via TCP");  
	}
}