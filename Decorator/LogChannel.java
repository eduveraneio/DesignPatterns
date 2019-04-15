public class LogChannel extends ChannelDecorator {
	public LogChannel(Channel ch){
		super(ch);
	}
	public void send(){
		super.send();
		System.out.println("Compactando dados para envio");
	}
	public void recv(){
		super.recv();
		System.out.println("Descompactando dados para recebimento");
	}
}