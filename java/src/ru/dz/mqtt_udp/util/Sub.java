package ru.dz.mqtt_udp.util;

import java.io.IOException;
import java.net.SocketException;

import ru.dz.mqtt_udp.IPacket;
import ru.dz.mqtt_udp.MqttProtocolException;
import ru.dz.mqtt_udp.PublishPacket;
import ru.dz.mqtt_udp.SubServer;

public class Sub extends SubServer 
{

	public static void main(String[] args) throws SocketException, IOException, MqttProtocolException 
	{
		Sub srv = new Sub();
		
		if( args.length == 1 && args[0].equalsIgnoreCase("-f"))
		{
			srv.loop();
			System.exit(0);
		}
		
		IPacket p = GenericPacket.recv();
		srv.processPacket(p);
	}

	@Override
	protected void processPacket(IPacket p) {
		System.out.println(p);
		
		if (p instanceof PublishPacket) {
			PublishPacket pp = (PublishPacket) p;
			
			// now use pp.getTopic() and pp.getValueString() or pp.getValueRaw()
		}
		
	}

}
