import java.io.*;
import java.util.*;

public class testing {
	
	public static void main(String[] args) {
		Chaining hash_chain = new Chaining(10,0,-1);
		Open_Addressing open_probe = new Open_Addressing(10,0,-1);
		System.out.println(hash_chain.m);
		System.out.println(open_probe.m);
		System.out.println(hash_chain.chain(4));
		System.out.println(open_probe.probe(1, 1));
	}

}
