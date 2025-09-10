package networking;

import java.util.ArrayList;
import java.util.List;

public class IPAddressing {

	public boolean isValidIP(String ipAddress) {
		String[] octets = ipAddress.split("\\.");
		int octetOne = Integer.parseInt(octets[0]);
		int octetTwo = Integer.parseInt(octets[1]);
		int octetThree = Integer.parseInt(octets[2]);
		int octetFour = Integer.parseInt(octets[3]);
		if ((octetOne >= 1 && octetOne <= 255) && (octetTwo >= 1 && octetTwo <= 255)
				&& (octetThree >= 1 && octetThree <= 255) && (octetFour >= 1 && octetFour <= 255)) {
			return true;
		}
		return false;
	}

	public boolean isValidSubnetMask(int MASK) {
		return false;
	}

	// Perform Sub-netting based on masks provided
	public List<String> generateSubnets(int MASK) {
		List<String> subnets = new ArrayList<String>();
		return subnets;
	}

	// Return the Sub-net IP Addresses

	// Return the IP Addresses of the hosts within the Sub-net

	public static void main(String[] args) {
		IPAddressing addressing = new IPAddressing();
		System.out.println("Is Valid IP : " + addressing.isValidIP("192.168.1.255"));
	}
}
