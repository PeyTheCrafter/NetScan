package app;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("Subnet: ");
		String subnet = new Scanner(System.in).nextLine();
		System.out.println("Timeout: ");
		int timeout = new Scanner(System.in).nextInt();
		System.out.println("Threads: ");
		int threads = new Scanner(System.in).nextInt();
		NetScan ns = new NetScan(subnet, timeout);
		ns.invokeThreads(threads);
	}
}
