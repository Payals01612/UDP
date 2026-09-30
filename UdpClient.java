import java.io.*;
import java.net.*;

class UdpClient
{
 public static void main(String s1[])throws Exception
{
  DatagramSocket ds=new   DatagramSocket();
String s="India is a good country";
byte b[]=s.getBytes();  
DatagramPacket dp=new  DatagramPacket(b,b.length,InetAddress.getLocalHost(),8);
 ds.send(dp);
}
}