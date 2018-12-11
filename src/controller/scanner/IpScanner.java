package controller.scanner;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class IpScanner {
	private int timeout;
	public IpScanner(int timeout) {
		this.timeout = timeout;
	}
	
	/**
	 * Scans the ip.
	 * 
	 * @param ip
	 *            ip to scan.
	 * @throws UnknownHostException
	 * @throws IOException
	 */
	public void scan(String ip) throws UnknownHostException, IOException {
		InetAddress address = InetAddress.getByName(ip);
		if (address.isReachable(this.timeout)) {
			System.out.println(ip + " --> " + address.getHostName());
		}

		//TEST: SEARCHING FOR SERVERS AT PORT 9858
		try {
			Socket s = new Socket();
			s.connect(new InetSocketAddress(ip, 9858), timeout);
			s.close();
			System.out.println("Server");
		} catch (Exception e) {
			//System.out.println("No server.");
		}
	}
}
