package controller;

import java.awt.EventQueue;
import java.util.Scanner;

import controller.scanner.LANScanner;
import gui.GUI;

public class NetScan {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public static void main2(String[] args) {
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
