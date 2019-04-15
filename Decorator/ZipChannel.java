public class ZipChannel extends ChannelDecorator {
	public ZipChannel(Channel ch){
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