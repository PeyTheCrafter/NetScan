package controller.thread;

import java.io.IOException;
import java.net.UnknownHostException;

import controller.scanner.LANScanner;

public class ScanThread extends Thread {
	private int start;
	private int stop;
	private LANScanner ns;

	public ScanThread(LANScanner ns, String subnet, int start, int stop, int timeout) {
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
