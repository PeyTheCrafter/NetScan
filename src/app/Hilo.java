package app;

import java.io.IOException;
import java.net.UnknownHostException;

public class Hilo extends Thread {
	private int start;
	private int stop;
	private NetScan ns;

	public Hilo(NetScan ns, String subnet, int start, int stop, int timeout) {
		this.ns = ns;
		this.ns.getSubnet();
		this.start = start;
		this.stop = stop;
		this.ns.getTimeout();
	}

	public void run() {
		try {
			this.ns.scan(this.start, this.stop);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
