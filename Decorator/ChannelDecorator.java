public abstract class ChannelDecorator implements Channel {
	private Channel channel;
	public ChannelDecorator(Channel ch){
		channel = ch;
	}
	public void send(){
		channel.send();
	}
	public void recv(){
		channel.recv();
	}
}