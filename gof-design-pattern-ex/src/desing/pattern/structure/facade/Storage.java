package desing.pattern.structure.facade;

import java.text.MessageFormat;

public class Storage {
	public byte[] read(long lba, int size) {
		System.out.println(MessageFormat.format("storage read lba={0}, size={1}", lba, size));
		return new byte[size];
	}
}
