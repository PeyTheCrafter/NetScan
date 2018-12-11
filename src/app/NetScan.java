package app;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class NetScan {
	private String subnet;
	private int timeout;

	public NetScan(String subnet, int timeout) {
		this.subnet = subnet;
		this.timeout = timeout;
	}

	/**
	 * Creates the desired number of threads.
	 * 
	 * @param threads
	 *            the number of threads to create.
	 */
	public void invokeThreads(int threads) {
		final int ips = 254;
		int ipt = ips / threads;
		System.out.println("Scanning network with " + threads + " threads. (" + ipt + " ip(s) per thread).");

		int current = 0;
		new Hilo(this, this.subnet, current, current + ipt, this.timeout).start();
		// System.out.println(current + " - " + (current + ipt));
		current += ipt;
		while (current < ips) {
			int start = current + 1;
			current += ipt;
			if (current >= ips) {
				current = ips;
			}
			int stop = current;
			new Hilo(this, this.subnet, start, stop, this.timeout).start();
			// System.out.println(start + " - " + stop);
		}
	}

	/**
	 * Scans from subnet.0 to subnet.255
	 * 
	 * @throws UnknownHostException
	 * @throws IOException
	 */
	public void scan() throws UnknownHostException, IOException {
		for (int i = 0; i < 255; i++) {
			String ip = this.subnet + "." + i;
			InetAddress address = InetAddress.getByName(ip);
			this.scanIp(ip);
		}
	}

	/**
	 * Scans subnet.start to subnet.stop.
	 * 
	 * @param start
	 *            first ip to scan.
	 * @param stop
	 *            last ip to scan.
	 * @throws UnknownHostException
	 * @throws IOException
	 */
	public void scan(int start, int stop) throws UnknownHostException, IOException {
		for (int i = start; i < stop; i++) {
			String ip = this.subnet + "." + i;
			InetAddress address = InetAddress.getByName(ip);
			this.scanIp(ip);
		}
	}

	/**
	 * Scans the ip.
	 * 
	 * @param ip
	 *            ip to scan.
	 * @throws UnknownHostException
	 * @throws IOException
	 */
	public void scanIp(String ip) throws UnknownHostException, IOException {
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

	public String getSubnet() {
		return subnet;
	}

	public int getTimeout() {
		return timeout;
	}

}