public class Principal {
	public static void main(String[] args) {
		Channel ch1 = new ZipChannel (new TCPChannel());
		Channel ch2 = new BufferChannel (new TCPChannel());
		Channel ch3 = new LogChannel (new UDPChannel());
		Channel ch4 = new BufferChannel (new ZipChannel (new TCPChannel()));
		Channel ch5 = new ZipChannel (new BufferChannel (new UDPChannel()));
	}
}