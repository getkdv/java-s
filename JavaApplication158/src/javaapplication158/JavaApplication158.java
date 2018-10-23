
package javaapplication158;


public class JavaApplication158 {


    public static void main(String[] args) {
     import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Client extends JFrame {
    private JTextField textField;
    private JTextArea textArea;
    private Socket socket;
    private PrintWriter out;
    private BufferedReader in;

    public Client() {
        textField = new JTextField(40);
        getContentPane().add(textField, BorderLayout.SOUTH);
        textField.setEditable(false);

        textArea = new JTextArea();
        getContentPane().add(textArea, BorderLayout.NORTH);
        textArea.setEditable(false);
        getContentPane().add(new JScrollPane(textArea), BorderLayout.CENTER);

        textField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                out.println(textField.getText());
                textField.setText("");
            }
        });

        setPreferredSize(new Dimension(800, 600));
        pack();
        setSize(getPreferredSize());
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void initVars() throws IOException {
        this.out = new PrintWriter(socket.getOutputStream(), true);
        this.in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
    }

    public void connect(String address) {
        try {
            this.socket = new Socket(address, ServerConstants.PORT);
            initVars();
            this.textField.setEditable(true);
            Server.log("Connected to " + address);
            this.setVisible(true);
            while (true) {
                new ServerListener(out, in).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void connect(Server server) {
        try {
            String address = server.getListener().getInetAddress().getHostAddress();
            this.socket = new Socket(address, ServerConstants.PORT);
            initVars();
            this.textField.setEditable(true);
            Server.log("Connected to " + address);
            this.setVisible(true);
            while (true) {
                new ServerListener(out, in).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Object[] options = new Object[] { "Start", "Join", "Cancel" };
        int input = JOptionPane.showOptionDialog(null, "Would you like to create or join a server?",
                "Chat Room Selection", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options,
                options[1]);
        Client client = new Client();
        switch (input) {
            case 0:
                try {
                    Server server = Server.createServer(ServerConstants.PORT);
                    server.start();
                    client.connect(server);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case 1:
                String address = JOptionPane.showInputDialog("Please enter server IP");
                if (address != null) {
                    client.connect(address);
                }
                break;
            case 2:
                System.exit(0);
                break;
        }
        s.close();
    }

    private class ServerListener extends Thread {
        private PrintWriter out;
        private BufferedReader in;

        public ServerListener(PrintWriter out, BufferedReader in) {
            this.out = out;
            this.in = in;
        }

        @Override
        public void run() {
            while (true) {
                try {
                    handle(in.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        public void handle(String message) throws IOException {
            System.out.println("handling " + message);
            if (message == null) {
                return;
            }
            System.out.println(message);
            if (message.startsWith("MESSAGE")) {
                message = message.substring(7);
                textArea.append(message + "\n");
            } else if (message.startsWith("ENTERNAME")) {
                while (true) {
                    String name = JOptionPane.showInputDialog("Please enter a username");
                    out.println(name);
                    String response = in.readLine();
                    if (response.equals("INVALIDNAME")) {
                        JOptionPane.showMessageDialog(null, "Name does not pass Name Filter", "Invalid Name",
                                JOptionPane.ERROR_MESSAGE);
                    } else {
                        break;
                    }
                }
            } else if (message.startsWith("NEWMEM")) {
                String name = message.substring(6);
                textArea.append(name + " has joined the server.\n");
            }
        }
    }

    
    

