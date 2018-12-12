package controller.scanner;

import java.net.InetSocketAddress;
import java.net.Socket;

public class ServerScanner {
	private int timeout;

	public ServerScanner(int timeout) {
		this.timeout = timeout;
	}
	
	public static void main(String[] args) {
		ServerScanner ss = new ServerScanner(50);
		System.out.println(ss.isServer("localhost", 442));
	}

	/**
	 * Checks if ip:port is hosting a server or not.
	 * @param ip ip to check.
	 * @param port port listening to the server.
	 * @return true if there is a server, false if not.
	 */
	public boolean isServer(String ip, int port) {
		boolean isServer = false;
		try {
			Socket s = new Socket();
			s.connect(new InetSocketAddress(ip, port), this.timeout);
			s.close();
			return true;
		} catch (Exception e) {
			// System.out.println("No server.");
			return false;
		}
	}
}
