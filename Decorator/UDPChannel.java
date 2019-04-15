public class UDPChannel implements Channel {
	public void send(){
		System.out.println("enviando dados via UDP");  
	}
	public void recv(){
		System.out.println("recebendo dados via UDP");  
	}
}