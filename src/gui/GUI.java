package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.CardLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLayeredPane;
import javax.swing.JTabbedPane;

public class GUI extends JFrame {

	private JPanel contentPane;
	private JTextField txtSubnet;
	private JTextField txtTimeout;
	private JTextField txtThreads;

	/**
	 * Create the frame.
	 */
	public GUI() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnScan = new JMenu("Scan");
		menuBar.add(mnScan);
		
		JMenuItem mntmIp = new JMenuItem("IP");
		mnScan.add(mntmIp);
		
		JMenuItem mntmSubnet = new JMenuItem("Subnet");
		mnScan.add(mntmSubnet);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		JPanel panelScanIp = new JPanel();
		contentPane.add(panelScanIp, "name_84788535770144");
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, "name_85459553479003");
		
		JPanel panelScanSubnet = new JPanel();
		tabbedPane.addTab("New tab", null, panelScanSubnet, null);
		GridBagLayout gbl_panelScanSubnet = new GridBagLayout();
		gbl_panelScanSubnet.columnWidths = new int[] {0, 0, 30, 0, 0, 0, 0};
		gbl_panelScanSubnet.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_panelScanSubnet.columnWeights = new double[]{1.0, 0.0, 1.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panelScanSubnet.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panelScanSubnet.setLayout(gbl_panelScanSubnet);
		
		JLabel lblSubnet = new JLabel("Subnet");
		GridBagConstraints gbc_lblSubnet = new GridBagConstraints();
		gbc_lblSubnet.anchor = GridBagConstraints.EAST;
		gbc_lblSubnet.insets = new Insets(0, 0, 5, 5);
		gbc_lblSubnet.gridx = 1;
		gbc_lblSubnet.gridy = 0;
		panelScanSubnet.add(lblSubnet, gbc_lblSubnet);
		
		txtSubnet = new JTextField();
		GridBagConstraints gbc_txtSubnet = new GridBagConstraints();
		gbc_txtSubnet.gridwidth = 2;
		gbc_txtSubnet.insets = new Insets(0, 0, 5, 5);
		gbc_txtSubnet.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtSubnet.gridx = 2;
		gbc_txtSubnet.gridy = 0;
		panelScanSubnet.add(txtSubnet, gbc_txtSubnet);
		txtSubnet.setColumns(10);
		
		JLabel lblTimeout = new JLabel("Timeout");
		GridBagConstraints gbc_lblTimeout = new GridBagConstraints();
		gbc_lblTimeout.anchor = GridBagConstraints.EAST;
		gbc_lblTimeout.insets = new Insets(0, 0, 5, 5);
		gbc_lblTimeout.gridx = 1;
		gbc_lblTimeout.gridy = 1;
		panelScanSubnet.add(lblTimeout, gbc_lblTimeout);
		
		txtTimeout = new JTextField();
		GridBagConstraints gbc_txtTimeout = new GridBagConstraints();
		gbc_txtTimeout.gridwidth = 2;
		gbc_txtTimeout.insets = new Insets(0, 0, 5, 5);
		gbc_txtTimeout.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtTimeout.gridx = 2;
		gbc_txtTimeout.gridy = 1;
		panelScanSubnet.add(txtTimeout, gbc_txtTimeout);
		txtTimeout.setColumns(10);
		
		JLabel lblThreads = new JLabel("Threads");
		GridBagConstraints gbc_lblThreads = new GridBagConstraints();
		gbc_lblThreads.anchor = GridBagConstraints.EAST;
		gbc_lblThreads.insets = new Insets(0, 0, 5, 5);
		gbc_lblThreads.gridx = 1;
		gbc_lblThreads.gridy = 2;
		panelScanSubnet.add(lblThreads, gbc_lblThreads);
		
		txtThreads = new JTextField();
		GridBagConstraints gbc_txtThreads = new GridBagConstraints();
		gbc_txtThreads.gridwidth = 2;
		gbc_txtThreads.insets = new Insets(0, 0, 5, 5);
		gbc_txtThreads.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtThreads.gridx = 2;
		gbc_txtThreads.gridy = 2;
		panelScanSubnet.add(txtThreads, gbc_txtThreads);
		txtThreads.setColumns(10);
		
		JButton btnScanSubnet = new JButton("Scan");
		GridBagConstraints gbc_btnScanSubnet = new GridBagConstraints();
		gbc_btnScanSubnet.fill = GridBagConstraints.BOTH;
		gbc_btnScanSubnet.gridwidth = 2;
		gbc_btnScanSubnet.insets = new Insets(0, 0, 0, 5);
		gbc_btnScanSubnet.gridx = 2;
		gbc_btnScanSubnet.gridy = 4;
		panelScanSubnet.add(btnScanSubnet, gbc_btnScanSubnet);
	}

}
