package demo;

import java.net.DatagramPacket;
import java.net.InetAddress;

public class Dgram {
	public static DatagramPacket toDatagram(byte buf[], InetAddress destIA, int destPort) 
	  {
	    return new DatagramPacket(buf, buf.length,destIA, destPort);
	  }
	  public static String toString(DatagramPacket p)
	  {
	    return new String(p.getData(), 0, p.getLength());
	  }

}
