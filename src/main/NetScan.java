package main;

import java.util.Scanner;

import scanner.LANScanner;

public class NetScan {
	public static void main(String[] args) {
		System.out.println("Subnet: ");
		String subnet = new Scanner(System.in).nextLine();
		System.out.println("Timeout: ");
		int timeout = new Scanner(System.in).nextInt();
		System.out.println("Threads: ");
		int threads = new Scanner(System.in).nextInt();
		LANScanner ns = new LANScanner(subnet, timeout);
		ns.scan(threads);
	}
}
