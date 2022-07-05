package desing.pattern.structure.facade;

import java.text.MessageFormat;

public class Memory {
	public void load(long position, byte[] data) {
		System.out.println(MessageFormat.format("memory load position={0}, data={1}", position, data));
	}
}
